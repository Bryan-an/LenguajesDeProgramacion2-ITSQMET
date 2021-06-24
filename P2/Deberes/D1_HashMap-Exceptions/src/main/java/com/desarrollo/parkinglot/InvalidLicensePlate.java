/*
 * Deber 1: Ejercicio colección HashMap
 */
package com.desarrollo.parkinglot;

/**
 * Invalid licence plate exception.
 *
 * @author bryan
 */
public class InvalidLicensePlate extends Exception {

    /**
     * Constructor that prints the error message.
     */
    public InvalidLicensePlate() {
        System.out.println("\nLa placa ingresada es inválida");
    }

    /**
     * Constructor that calls the superclass constructor.
     *
     * @param errorMessage The error message.
     */
    public InvalidLicensePlate(String errorMessage) {
        super(errorMessage);
    }
}
