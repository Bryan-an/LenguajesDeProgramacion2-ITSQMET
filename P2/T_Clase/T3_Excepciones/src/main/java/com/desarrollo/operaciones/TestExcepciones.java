/*
 * Excepciones
 */
package com.desarrollo.operaciones;

/**
 * Created by Bryan on 24/6/2021
 *
 * @author bryan
 */
public class TestExcepciones {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        try {
            System.out.println(aritmetica.division(4, 0));
        } catch (DivisionExcepcion e) {
            e.printStackTrace(System.out);
        }

//        ejercicio de prueba
//        double resultado;
//
//        try {
//            resultado = 10 / 2;
//            System.out.println("La división es: " + resultado);
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
    }
}
