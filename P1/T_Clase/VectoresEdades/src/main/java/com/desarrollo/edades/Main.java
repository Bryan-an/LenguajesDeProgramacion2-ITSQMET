/*
Clase Ejecutable:

Se cree un vector, el cual almacene valores enteros --> edades (cualquier rango, de 1 año en adelante)
 */
package com.desarrollo.edades;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Main {

    /**
     * Constructor de la clase Main.
     */
    public Main() {
        pedirDatos();
    }

    /**
     * Método main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamar al constructor
        new Main();
    }

    /**
     * Pide los datos.
     */
    public void pedirDatos() {
        //Variables e instancias
        Scanner sc = new Scanner(System.in);
        int longitud;

        //Pedir longitud del vector
        System.out.println("Trabajo en clase");
        System.out.println("\nIngrese la longitud del vector:");
        longitud = sc.nextInt();
        int[] edades = new int[longitud];

        //Pedir las edades por consola
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese la edad " + (i + 1) + ":");
            edades[i] = sc.nextInt();
        }

        //Instanciar la clase Vectores
        Vectores vector = new Vectores(edades);
        imprimir(vector);
    }

    /**
     * Imprime los calculos.
     *
     * @param vector Instancia de la clase Vectores.
     */
    public void imprimir(Vectores vector) {
        System.out.println("El número de edades entre 30-50 es: " + vector.contabilizarEdades());
        System.out.println("El promedio de las edades es: " + vector.sacarPromedio());
        System.out.println("Las edades entre 30-50 es:");
        vector.copiarVector();
    }
}
