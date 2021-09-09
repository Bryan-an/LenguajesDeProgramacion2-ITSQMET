/*
 * Clase entidad Estudiante
 */
package com.desarrollo.domain;

/**
 *
 * @author Bryan Andagoya
 */
public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String nivel;
    private int telefono;
    private String email;
    private String direccion;
    private byte[] imagen;
    private int idUsuarioLogin;

    //constructor -> operaciones insert
    public Estudiante(String nombre, String apellido, String nivel, int telefono, String email, String direccion, byte[] imagen, int idUsuarioLogin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.imagen = imagen;
        this.idUsuarioLogin = idUsuarioLogin;
    }

    //constructor -> operaciones select-update
    public Estudiante(int idEstudiante, String nombre, String apellido, String nivel, int telefono, String email, String direccion, byte[] imagen, int idUsuarioLogin) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.imagen = imagen;
        this.idUsuarioLogin = idUsuarioLogin;
    }

    //getters - setters

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public int getIdUsuarioLogin() {
        return idUsuarioLogin;
    }

    public void setIdUsuarioLogin(int idUsuarioLogin) {
        this.idUsuarioLogin = idUsuarioLogin;
    }

}
