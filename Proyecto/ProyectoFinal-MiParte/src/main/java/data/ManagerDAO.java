/*
 * Manager DAO
 */
package data;

import business.SignInController;
import domain.Manager;
import java.sql.*;
import java.util.*;
import ui.components.*;

/**
 *
 * @author Bryan Andagoya
 */
public class ManagerDAO {

    //SQL Statements
    private static final String SQL_SELECT = "SELECT * FROM managers";

    private static final String SQL_INSERT
            = "INSERT INTO managers (document, name, last_name, user, password, email, phone, address, department) VALUES (?,?,?,?,SHA1(?),?,?,?,?)";

    private static final String SQL_UPDATE
            = "UPDATE managers SET document=?, name=?, last_name=?, user=?, password=SHA1(?), email=?, phone=?, address=?, department=? WHERE id=?";

    private static final String SQL_DELETE = "DELETE FROM managers WHERE id=?";

    //Connections
    private Connection transactionalConnection = null;
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet results = null;

    //Constructor
    public ManagerDAO(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }

    //Methods
    //SELECT
    public List<Manager> select() throws SQLException {
        List<Manager> managers = new ArrayList<Manager>();

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
                String department = results.getString(10);

                Manager manager = new Manager(id, document, name, lastName,
                        user, password, email, phone, address, department);

                managers.add(manager);
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

        return managers;
    }

    public Manager select(int managerId) throws SQLException {
        Manager manager = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM managers WHERE id=?");
            statement.setInt(1, managerId);

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
                String department = results.getString(10);

                manager = new Manager(id, document, name, lastName,
                        user, password, email, phone, address, department);
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

        return manager;
    }

    //OJO-------------------------------------ES NUEVO-------------------------------------
    public Manager select(String managerUser, String managerPassword) throws SQLException {
        Manager manager = null;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement("SELECT * FROM managers WHERE user=? AND password=SHA1(?)");
            statement.setString(1, managerUser);
            statement.setString(2, managerPassword);

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
                String department = results.getString(10);

                manager = new Manager(id, document, name, lastName,
                        user, password, email, phone, address, department);
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

        return manager;
    }

    //OJO--------------------------ES NUEVO----------------------------------------
    public boolean select(String managerField, int fieldName) throws SQLException {

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            if (fieldName == Constants.USER) {
                statement = connection.prepareStatement("SELECT user FROM managers WHERE user=?");
            } else if (fieldName == Constants.DOCUMENT) {
                statement = connection.prepareStatement("SELECT document FROM managers WHERE document=?");
            }

            statement.setString(1, managerField);

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
    public int insert(Manager manager) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_INSERT);

            statement.setString(1, manager.getDocument());
            statement.setString(2, manager.getName());
            statement.setString(3, manager.getLastName());
            statement.setString(4, manager.getUser());
            statement.setString(5, manager.getPassword());
            statement.setString(6, manager.getEmail());
            statement.setString(7, manager.getPhone());
            statement.setString(8, manager.getAddress());
            statement.setString(9, manager.getDepartment());

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
    public int update(Manager manager) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_UPDATE);

            statement.setString(1, manager.getDocument());
            statement.setString(2, manager.getName());
            statement.setString(3, manager.getLastName());
            statement.setString(4, manager.getUser());
            statement.setString(5, manager.getPassword());
            statement.setString(6, manager.getEmail());
            statement.setString(7, manager.getPhone());
            statement.setString(8, manager.getAddress());
            statement.setString(9, manager.getDepartment());
            statement.setInt(10, manager.getId());

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
    public int delete(Manager manager) throws SQLException {
        int records = 0;

        try {
            if (transactionalConnection != null) {
                connection = transactionalConnection;
            } else {
                connection = Connect.getConnection();
            }

            statement = connection.prepareStatement(SQL_DELETE);

            statement.setInt(1, manager.getId());

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
