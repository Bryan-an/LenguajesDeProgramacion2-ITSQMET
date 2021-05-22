/*
Trabajo en clase:


3 métodos: 
1. contabilizar las edades que se encuentren entre 30 a 50.
2. sacar un promedio de todas las edades ingresadas.
3. copie en otro vector las edades que se encuentran entre 30-50.

 */
package com.desarrollo.edades;

/**
 *
 * @author bryan
 */
public class Vectores {

    //Campos
    private int[] edades;
    private int contadorEdades;

    //Getter y Setters
    public int[] getEdades() {
        return edades;
    }

    public void setEdades(int[] edades) {
        this.edades = edades;
    }

    //Constructor
    /**
     * Constructor de la clase Vectores.
     *
     * @param edades
     */
    public Vectores(int[] edades) {
        this.edades = edades;
    }

    //Métodos
    /**
     * Contabiliza las edades que se encuentren entre 30 a 50.
     *
     * @return El número de edades entre 30-50.
     */
    public int contabilizarEdades() {
        for (int edad : edades) {
            if (edad >= 30 && edad <= 50) {
                contadorEdades++;
            }
        }
        return contadorEdades;
    }

    /**
     * Saca el promedio de todas las edades.
     *
     * @return El promedio de las edades.
     */
    public double sacarPromedio() {
        double suma = 0, promedio;
        for (int edad : edades) {
            suma = suma + edad;
        }

        promedio = suma / edades.length;
        return promedio;
    }

    /**
     * Hace una copia del vector original con las edades entre 30-50.
     */
//    public void copiarVector() {
//        int[] cv = new int[contadorEdades];
//        int j = 0;
//        for (int i = 0; i < edades.length; i++) {
//            if (edades[i] >= 30 && edades[i] <= 50) {
//                cv[j] = edades[i];
//                j++;
//                //cv[j++] = edades[i]; //esto es lo mismo que está arriba
//            }
//        }
//        //Imprimir copia del vector
//        for (int i : cv) {
//            System.out.println(i);
//        }
//    }
    public void copiarVector() {
        int j = 0, k = 1;
        int[] copiaVector = new int[k];

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 30 && edades[i] <= 50) {
                if (j == k) {
                    int[] aux = new int[k];
                    System.arraycopy(copiaVector, 0, aux, 0, k++);
                    copiaVector = new int[k];
                    System.arraycopy(aux, 0, copiaVector, 0, k - 1);
                }
                copiaVector[j++] = edades[i];
            }
        }

        //Imprimir copia del vector
        for (int i : copiaVector) {
            System.out.println(i);
        }
    }
}
