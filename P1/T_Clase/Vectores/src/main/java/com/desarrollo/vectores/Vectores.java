/*
Vectores
 */
package com.desarrollo.vectores;

import java.util.Arrays;

/**
 *
 * @author bryan
 */
public class Vectores {

    public void copiarVector(int[] numeros) {
        int[] numerosCopy = new int[numeros.length];
        System.arraycopy(numeros, 0, numerosCopy, 2, numerosCopy.length - 3);
        System.out.println("Vector copia");
        for (int i : numerosCopy) {
            System.out.println(i);
        }
    }

    /**
     * Ordena el vector.
     *
     * @param numeros Vector de tipo int.
     */
    public void ordenarVector(int[] numeros) {
        Arrays.sort(numeros);
    }

    /**
     * Imprime el vector.
     *
     * @param numeros Vector de tipo int.
     */
    public void imprimirVector(int[] numeros) {
        System.out.println("Números");
        for (int i : numeros) {
            System.out.println(i);
        }
    }

    /**
     * Sacar el promedio de los valores de un vector.
     *
     * @param numeros Vector de tipo int.
     */
    public void promedio(int numeros[]) {
        int acum = 0;
        double prom;
        for (int i = 0; i < numeros.length; i++) {
            acum = acum + numeros[i];
        }
        prom = acum/numeros.length;
        System.out.println("Suma de números: " + acum);
        System.out.println("El promedi es: " + prom);
    }
}
