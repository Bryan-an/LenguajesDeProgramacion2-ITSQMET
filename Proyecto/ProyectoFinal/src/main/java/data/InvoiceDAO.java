/*
 * Invoice DAO
 */
package data;

import domain.Invoice;
import domain.Product;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.*;

/**
 *
 * @author Bryan Andagoya
 */
public class InvoiceDAO {

    //SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM invoices";

    private static final String SQL_INSERT
            = "INSERT INTO invoices (date, total, customer_id, delivery_driver_id) VALUES (?,?,?,?)";

    private static final String SQL_UPDATE
            = "UPDATE invoices SET date=?, total=?, customer_id=?, delivery_driver_id=? WHERE id=?";

    private static final String SQL_DELETE = "DELETE FROM invoices WHERE id=?";

    //Connections
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor
    public InvoiceDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    //SELECT
    public List<Invoice> select() throws SQLException {
        List<Invoice> invoices = new ArrayList<Invoice>();
        ResultSet productResults = null;
        ProductDAO productDAO = new ProductDAO(null);
        HashMap<Product, Integer> products;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_SELECT);
            results = statement.executeQuery();

            while (results.next()) {
                int id = results.getInt(1);
                Date date = results.getDate(2);
                double total = results.getDouble(3);
                int customerId = results.getInt(4);
                int deliveryDriverId = results.getInt(5);

                statement = connection.prepareStatement(
                        "SELECT product_id, quantity FROM products_invoices WHERE invoice_id=?");

                statement.setInt(1, id);
                productResults = statement.executeQuery();

                products = new HashMap<>();

                while (productResults.next()) {
                    Product product = productDAO.select(productResults.getInt(1));
                    int quantity = productResults.getInt(2);

                    products.put(product, quantity);
                }

                Invoice invoice = new Invoice(id, date, total, customerId, deliveryDriverId, products);
                invoices.add(invoice);
            }
        } finally {
            try {
                results.close();
                statement.close();
                if (productResults != null) {
                    productResults.close();
                }

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return invoices;
    }

    //OJO--------------------ES NUEVO: LISTAR PEDIDOS ASIGNADOS AL DELIVERY-----------
    public List<Object[]> selectOrders(int deliveryDriveryId) throws SQLException {
        List<Object[]> orders = new ArrayList<Object[]>();
        ResultSet productResults = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT i.id, i.date, i.total, concat(c.name, ' ', c.last_name), c.phone, c.address FROM invoices AS i INNER JOIN customers AS c ON c.id = i.customer_id WHERE i.delivery_driver_id=? ORDER BY i.id");
            statement.setInt(1, deliveryDriveryId);

            results = statement.executeQuery();

            while (results.next()) {
                int id = results.getInt(1);
                LocalDate date = LocalDate.parse(results.getString(2));
                double total = results.getDouble(3);
                String customerName = results.getString(4);
                String customerPhone = results.getString(5);
                String customerAddress = results.getString(6);

                Object[] order = new Object[]{id, date, total, customerName, customerPhone, customerAddress, false};
                orders.add(order);
            }
        } finally {
            try {
                results.close();
                statement.close();
                if (productResults != null) {
                    productResults.close();
                }

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return orders;
    }

    public Invoice select(int invoiceId) throws SQLException {
        Invoice invoice = null;
        ResultSet productResults = null;
        ProductDAO productDAO = new ProductDAO(null);
        HashMap<Product, Integer> products;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM invoices WHERE id=?");
            statement.setInt(1, invoiceId);

            results = statement.executeQuery();

            if (results.next()) {
                int id = results.getInt(1);
                Date date = results.getDate(2);
                double total = results.getDouble(3);
                int customerId = results.getInt(4);
                int deliveryDriverId = results.getInt(5);

                statement = connection.prepareStatement(
                        "SELECT product_id, quantity FROM products_invoices WHERE invoice_id=?");

                statement.setInt(1, id);
                productResults = statement.executeQuery();

                products = new HashMap<>();

                while (productResults.next()) {
                    Product product = productDAO.select(productResults.getInt(1));
                    int quantity = productResults.getInt(2);

                    products.put(product, quantity);
                }

                invoice = new Invoice(id, date, total, customerId, deliveryDriverId, products);
            }
        } finally {
            try {
                results.close();
                statement.close();
                if (productResults != null) {
                    productResults.close();
                }

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return invoice;
    }

    //INSERT
    public int insert(Invoice invoice) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, invoice.getDate().toString());
            statement.setDouble(2, invoice.getTotal());
            statement.setInt(3, invoice.getCustomerId());
            statement.setInt(4, invoice.getDeliveryDriverId());

            records = statement.executeUpdate();

            for (Map.Entry<Product, Integer> entry : invoice.getProducts().entrySet()) {
                statement = connection.prepareStatement("SELECT LAST_INSERT_ID()");
                results = statement.executeQuery();

                if (results.next()) {
                    int invoiceId = results.getInt(1);

                    statement = connection.prepareStatement(
                            "INSERT INTO products_invoices VALUES (?, ?, ?)");

                    statement.setInt(1, entry.getKey().getId());
                    statement.setInt(2, invoiceId);
                    statement.setInt(3, entry.getValue());

                    statement.executeUpdate();
                } else {
                    throw new SQLException();
                }
            }
        } finally {
            try {
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return records;
    }

    //UPDATE
    public int update(Invoice invoice) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_UPDATE);

            statement.setString(1, invoice.getDate().toString());
            statement.setDouble(2, invoice.getTotal());
            statement.setInt(3, invoice.getCustomerId());
            statement.setInt(4, invoice.getDeliveryDriverId());
            statement.setInt(5, invoice.getId());

            records = statement.executeUpdate();

            statement = connection.prepareStatement(
                    "DELETE FROM products_invoices WHERE invoice_id=?");

            statement.setInt(1, invoice.getId());
            statement.executeUpdate();

            for (Map.Entry<Product, Integer> entry : invoice.getProducts().entrySet()) {
                statement = connection.prepareStatement(
                        "INSERT INTO products_invoices VALUES (?,?,?)");

                statement.setInt(1, entry.getKey().getId());
                statement.setInt(2, invoice.getId());
                statement.setInt(3, entry.getValue());

                statement.executeUpdate();
            }

        } finally {
            try {
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return records;
    }

    //DELETE
    public int delete(Invoice invoice) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_DELETE);

            statement.setInt(1, invoice.getId());

            records = statement.executeUpdate();
        } finally {
            try {
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return records;
    }
}
