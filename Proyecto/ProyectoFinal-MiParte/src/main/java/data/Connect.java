/*
 * Connection
 */
package data;

import java.sql.*;

/**
 *
 * @author Bryan Andagoya
 */
public class Connect {

    //Fields
    private static final String JDBC_URL
            = "jdbc:mysql://localhost:3306/db_itsqmet_burger?useSSL=false&serverTimezone=UTC";

    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "AyV5z@^9sE";

    //Methods
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
}
