/*
 * Excepciones
 */
package com.desarrollo.operaciones;

/**
 *
 * @author bryan
 */
public class DivisionExcepcion extends Exception {

    //Constructor de la clase hija
    public DivisionExcepcion(String mensaje) {
        //Constructor de la clase padre
        super(mensaje);
    }
}
