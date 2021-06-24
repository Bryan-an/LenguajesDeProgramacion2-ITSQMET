/*
 * Excepciones
 */
package com.desarrollo.operaciones;

/**
 *
 * @author bryan
 */
public class Aritmetica {

    public double division(double numerador, double denominador) throws DivisionExcepcion {
        double resultado;

        if (denominador == 0) {
            throw new DivisionExcepcion("No existe división para cero");
        }

        resultado = numerador / denominador;
        return resultado;
    }
}
