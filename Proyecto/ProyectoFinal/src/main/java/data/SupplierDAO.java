/*
 * Supplier
 */
package data;

import domain.Supplier;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Bryan Andagoya
 */
public class SupplierDAO {

    //SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM suppliers";

    private static final String SQL_INSERT
            = "INSERT INTO suppliers (name, phone, email, address) VALUES (?,?,?,?)";

    private static final String SQL_UPDATE
            = "UPDATE suppliers SET name=?, phone=?, email=?, address=? WHERE id=?";

    private static final String SQL_DELETE = "DELETE FROM suppliers WHERE id=?";

    //Connections 
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor
    public SupplierDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    public List<Supplier> select() throws SQLException {
        List<Supplier> suppliers = new ArrayList<Supplier>();

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
                String name = results.getString(2);
                String phone = results.getString(3);
                String email = results.getString(4);
                String address = results.getString(5);

                Supplier supplier = new Supplier(id, name, phone, email, address);

                suppliers.add(supplier);
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

        return suppliers;
    }

    public Supplier select(int supplierId) throws SQLException {
        Supplier supplier = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM suppliers WHERE id=?");
            statement.setInt(1, supplierId);

            results = statement.executeQuery();

            if (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String phone = results.getString(3);
                String email = results.getString(4);
                String address = results.getString(5);

                supplier = new Supplier(id, name, phone, email, address);
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

        return supplier;
    }

    //INSERT
    public int insert(Supplier supplier) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, supplier.getName());
            statement.setString(2, supplier.getPhone());
            statement.setString(3, supplier.getEmail());
            statement.setString(4, supplier.getAddress());

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
    public int update(Supplier supplier) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_UPDATE);

            statement.setString(1, supplier.getName());
            statement.setString(2, supplier.getPhone());
            statement.setString(3, supplier.getEmail());
            statement.setString(4, supplier.getAddress());
            statement.setInt(5, supplier.getId());

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
    public int delete(Supplier supplier) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_DELETE);

            statement.setInt(1, supplier.getId());

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
