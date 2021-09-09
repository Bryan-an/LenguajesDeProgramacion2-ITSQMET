/*
 * Clase DAO Estudiante
 */
package com.desarrollo.datos;

import com.desarrollo.domain.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Bryan Andagoya
 */
public class EstudianteDAO {

    Conexion conexion = new Conexion();

    //operacion insert
    public void insertarEstudiante(Estudiante estudiante) {
        Connection conn;
        try {
            conn = conexion.getConnection();
            PreparedStatement stmt
                    = conn.prepareStatement("INSERT INTO estudiantes (nombre, apellido, nivel, telefono, email, direccion, imagen, user_id) VALUES (?,?,?,?,?,?,?,?)");

            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellido());
            stmt.setString(3, estudiante.getNivel());
            stmt.setInt(4, estudiante.getTelefono());
            stmt.setString(5, estudiante.getEmail());
            stmt.setString(6, estudiante.getDireccion());
            stmt.setBytes(7, estudiante.getImagen());
            stmt.setInt(8, estudiante.getIdUsuarioLogin());

            if (stmt.executeUpdate() != 0) { //devuelve un valor de tipo entero -> 0 si no se insertó -> distinto de 0 si se insertó
                JOptionPane.showMessageDialog(null, "Registro con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar");
            }

            //cerrar objetos de conexión
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

    //método listar estudiantes 
    public ArrayList<Estudiante> listarEstudiantes(int idUsuarioAutentificado) {

        //Definir colección
        ArrayList<Estudiante> listaEstudiantes = new ArrayList();
        Connection conn;
        try {
            conn = conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM estudiantes WHERE user_id=" + idUsuarioAutentificado);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int idEstudiante = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String nivel = rs.getString(4);
                int telefono = rs.getInt(5);
                String email = rs.getString(6);
                String direccion = rs.getString(7);
                byte[] imagen = rs.getBytes(8);
                int idUsuarioLogin = idUsuarioAutentificado;

                //crear el objeto
                Estudiante estudiante = new Estudiante(idEstudiante, nombre,
                        apellido, nivel, telefono, email, direccion, imagen,
                        idUsuarioLogin);

                //añadir a la conlección de objetos Estudiante
                listaEstudiantes.add(estudiante);
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return listaEstudiantes;
    }

    //método actualizar
    public void actualizarEstudiante(Estudiante estudiante, boolean actualizarImg) {
        Connection conn;
        PreparedStatement stmt;
        String sqlUpdate = "";

        try {
            conn = conexion.getConnection();

            if (actualizarImg) {
                sqlUpdate = "UPDATE estudiantes SET nombre=?, apellido=?, nivel=?, telefono=?, email=?, direccion=?, imagen=? WHERE id_estudiantes=?";
                stmt = conn.prepareStatement(sqlUpdate);
                stmt.setBytes(7, estudiante.getImagen());
                stmt.setInt(8, estudiante.getIdEstudiante());
            } else {
                sqlUpdate = "UPDATE estudiantes SET nombre=?, apellido=?, nivel=?, telefono=?, email=?, direccion=? WHERE id_estudiantes=?";
                stmt = conn.prepareStatement(sqlUpdate);
                stmt.setInt(7, estudiante.getIdEstudiante());
            }

            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellido());
            stmt.setString(3, estudiante.getNivel());
            stmt.setInt(4, estudiante.getTelefono());
            stmt.setString(5, estudiante.getEmail());
            stmt.setString(6, estudiante.getDireccion());

            if (stmt.executeUpdate() != 0) { //devuelve un valor de tipo entero -> 0 si no se insertó -> distinto de 0 si se insertó
                JOptionPane.showMessageDialog(null, "Actualización exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }

            //cerrar objetos de conexión
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

    //método eliminar
    public void eliminarEstudiante(int idEstudiante) {
        Connection conn;

        try {
            conn = conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM estudiantes WHERE id_estudiantes=?");
            stmt.setInt(1, idEstudiante);

            if (stmt.executeUpdate() != 0) { //devuelve un valor de tipo entero -> 0 si no se insertó -> distinto de 0 si se insertó
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
