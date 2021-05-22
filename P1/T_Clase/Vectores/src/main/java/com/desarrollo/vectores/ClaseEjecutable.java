/*
Vectores
 */
package com.desarrollo.vectores;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir v
        int[] numeros = new int[6];
        Scanner sc = new Scanner(System.in);
        Vectores v = new Vectores();

        //Llenar datos en el vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número:");
            numeros[i] = sc.nextInt();
        }

        //Desplegar lod datos del vector
        v.imprimirVector(numeros);

        //Copiar vector
        v.copiarVector(numeros);

        //Ordenar datos
        v.ordenarVector(numeros);

        //Desplegar lod datos del vector
        v.imprimirVector(numeros);

        //Copiar vector
        v.copiarVector(numeros);
    }
    
}
