/*
 * Establecer al conexión con la base de datos.
 */
package com.desarrollo.datos;

import java.sql.*;

/**
 *
 * @author Bryan Andagoya
 */
public class Conexion {

    //API JDBC -> conexión de BDD
    //método para establecer la conexón
    public Connection getConnection() throws SQLException {
        //cadena de conexión
        String url = "jdbc:mysql://localhost:3306/registro_estudiantes?useSSL=false&serverTimezone=UTC";

        return DriverManager.getConnection(url, "root", "AyV5z@^9sE");
    }

}
