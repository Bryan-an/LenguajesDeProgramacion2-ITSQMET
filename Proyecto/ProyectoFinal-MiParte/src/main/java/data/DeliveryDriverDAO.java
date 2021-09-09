/*
 * DeliveryDriver DAO
 */
package data;

import business.SignInController;
import domain.DeliveryDriver;
import java.sql.*;
import java.util.*;
import ui.components.Constants;

/**
 *
 * @author Bryan Andagoya
 */
public class DeliveryDriverDAO {

    //SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM delivery_drivers";

    private static final String SQL_INSERT
            = "INSERT INTO delivery_drivers (document, name, last_name, user, password, email, phone, address, license_plate) VALUES (?,?,?,?,SHA1(?),?,?,?,?)";

    //OJO----------MODIFICADO: YA NO ACTUALIZA USUARIO Y CONTRASEÑA----------------------------------
    private static final String SQL_UPDATE
            = "UPDATE delivery_drivers SET document=?, name=?, last_name=?, email=?, phone=?, address=?, license_plate=? WHERE id=?";

    private static final String SQL_DELETE = "DELETE FROM delivery_drivers WHERE id=?";

    //Connections
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor
    public DeliveryDriverDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    //SELECT
    public List<DeliveryDriver> select() throws SQLException {
        List<DeliveryDriver> deliveryDrivers = new ArrayList<DeliveryDriver>();

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
                String licensePlate = results.getString(10);

                DeliveryDriver deliveryDriver = new DeliveryDriver(id, document, name,
                        lastName, user, password, email, phone, address, licensePlate);

                deliveryDrivers.add(deliveryDriver);
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

        return deliveryDrivers;
    }

    public DeliveryDriver select(int deliveryDriverId) throws SQLException {
        DeliveryDriver deliveryDriver = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM delivery_drivers WHERE id=?");
            statement.setInt(1, deliveryDriverId);

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
                String licensePlate = results.getString(10);

                deliveryDriver = new DeliveryDriver(id, document, name,
                        lastName, user, password, email, phone, address, licensePlate);

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

        return deliveryDriver;
    }

    //OJO------------------------ES NUEVO---------------------
    public DeliveryDriver select(String deliveryDriverUser, String deliveryDriverPassword) throws SQLException {
        DeliveryDriver deliveryDriver = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM delivery_drivers WHERE user=? AND password=SHA1(?)");
            statement.setString(1, deliveryDriverUser);
            statement.setString(2, deliveryDriverPassword);

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
                String licensePlate = results.getString(10);

                deliveryDriver = new DeliveryDriver(id, document, name,
                        lastName, user, password, email, phone, address, licensePlate);
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

        return deliveryDriver;
    }

    //OJO--------------------ES NUEVO--------------------------
    public boolean select(String deliveryDriverField, int fieldName,
            String condition) throws SQLException {
        String query = "";

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            if (fieldName == Constants.USER) {
                query = "SELECT user FROM delivery_drivers WHERE user=? ";
            } else if (fieldName == Constants.DOCUMENT) {
                query = "SELECT document FROM delivery_drivers WHERE document=? ";
            }

            if (condition != null) {
                query += condition;
            }

            statement = connection.prepareStatement(query);

            statement.setString(1, deliveryDriverField);

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
    public int insert(DeliveryDriver deliveryDriver) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, deliveryDriver.getDocument());
            statement.setString(2, deliveryDriver.getName());
            statement.setString(3, deliveryDriver.getLastName());
            statement.setString(4, deliveryDriver.getUser());
            statement.setString(5, deliveryDriver.getPassword());
            statement.setString(6, deliveryDriver.getEmail());
            statement.setString(7, deliveryDriver.getPhone());
            statement.setString(8, deliveryDriver.getAddress());
            statement.setString(9, deliveryDriver.getLicensePlate());

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

    //OJO----------------------------YA NO ACTUALIZA USUARIO Y CONTRASEÑA-----------------------
    //UPDATE
    public int update(DeliveryDriver deliveryDriver) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_UPDATE);

            statement.setString(1, deliveryDriver.getDocument());
            statement.setString(2, deliveryDriver.getName());
            statement.setString(3, deliveryDriver.getLastName());
            statement.setString(4, deliveryDriver.getEmail());
            statement.setString(5, deliveryDriver.getPhone());
            statement.setString(6, deliveryDriver.getAddress());
            statement.setString(7, deliveryDriver.getLicensePlate());
            statement.setInt(8, deliveryDriver.getId());

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
    public int delete(DeliveryDriver deliveryDriver) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_DELETE);

            statement.setInt(1, deliveryDriver.getId());

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
