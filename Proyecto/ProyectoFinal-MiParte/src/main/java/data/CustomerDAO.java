/*
 * Customer DAO
 */
package data;

import domain.Customer;
import java.util.*;
import java.sql.*;
import ui.components.*;

/**
 *
 * @author Bryan Andagoya
 */
public class CustomerDAO {

    //SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM customers";

    private static final String SQL_INSERT
            = "INSERT INTO customers (document, name, last_name, user, password, email, phone, address) VALUES (?,?,?,?,SHA1(?),?,?,?)";

    private static final String SQL_UPDATE
            = "UPDATE customers SET document=?, name=?, last_name=?, user=?, password=SHA1(?), email=?, phone=?, address=? WHERE id=?";

    private static final String SQL_DELETE = "DELETE FROM customers WHERE id=?";

    //Connections
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor
    public CustomerDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    //SELECT
    public List<Customer> select() throws SQLException {
        List<Customer> customers = new ArrayList<Customer>();

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
                String document = results.getString(2);
                String name = results.getString(3);
                String lastName = results.getString(4);
                String user = results.getString(5);
                String password = results.getString(6);
                String email = results.getString(7);
                String phone = results.getString(8);
                String address = results.getString(9);

                Customer customer = new Customer(id, document, name, lastName,
                        user, password, email, phone, address);

                customers.add(customer);
            }
        } finally {
            try {
                results.close();
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return customers;
    }

    public Customer select(int customerId) throws SQLException {
        Customer customer = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM customers WHERE id=?");
            statement.setInt(1, customerId);

            results = statement.executeQuery();

            if (results.next()) {
                int id = results.getInt(1);
                String document = results.getString(2);
                String name = results.getString(3);
                String lastName = results.getString(4);
                String user = results.getString(5);
                String password = results.getString(6);
                String email = results.getString(7);
                String phone = results.getString(8);
                String address = results.getString(9);

                customer = new Customer(id, document, name, lastName,
                        user, password, email, phone, address);
            }
        } finally {
            try {
                results.close();
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return customer;
    }

    //OJO-----------------ES NUEVO--------------------------------------------------------------
    public Customer select(String customerUser, String customerPassword) throws SQLException {
        Customer customer = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM customers WHERE user=? AND password=SHA1(?)");
            statement.setString(1, customerUser);
            statement.setString(2, customerPassword);

            results = statement.executeQuery();

            if (results.next()) {
                int id = results.getInt(1);
                String document = results.getString(2);
                String name = results.getString(3);
                String lastName = results.getString(4);
                String user = results.getString(5);
                String password = results.getString(6);
                String email = results.getString(7);
                String phone = results.getString(8);
                String address = results.getString(9);

                customer = new Customer(id, document, name, lastName,
                        user, password, email, phone, address);
            }
        } finally {
            try {
                results.close();
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return customer;
    }

    //OJO--------------------------------------ES NUEVO--------------------------
    public boolean select(String customerField, int fieldName) throws SQLException {

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            if (fieldName == Constants.USER) {
                statement = connection.prepareStatement("SELECT user FROM customers WHERE user=?");
            } else if (fieldName == Constants.DOCUMENT) {
                statement = connection.prepareStatement("SELECT document FROM customers WHERE document=?");
            }

            statement.setString(1, customerField);

            results = statement.executeQuery();

            return results.next();

        } finally {
            try {
                results.close();
                statement.close();

                if (transactionalConnection == null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }

    //INSERT
    public int insert(Customer customer) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, customer.getDocument());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getLastName());
            statement.setString(4, customer.getUser());
            statement.setString(5, customer.getPassword());
            statement.setString(6, customer.getEmail());
            statement.setString(7, customer.getPhone());
            statement.setString(8, customer.getAddress());

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

    //UPDATE
    public int update(Customer customer) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_UPDATE);

            statement.setString(1, customer.getDocument());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getLastName());
            statement.setString(4, customer.getUser());
            statement.setString(5, customer.getPassword());
            statement.setString(6, customer.getEmail());
            statement.setString(7, customer.getPhone());
            statement.setString(8, customer.getAddress());
            statement.setInt(9, customer.getId());

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

    //DELETE
    public int delete(Customer customer) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_DELETE);

            statement.setInt(1, customer.getId());

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
