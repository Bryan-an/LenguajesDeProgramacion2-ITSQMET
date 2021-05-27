/*
Ordenamiento de vectores
 */
package com.desarrollo.ordenamientovectores;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableAlgoritmosOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        int[] vector = new int[6];
        Scanner sc = new Scanner(System.in);
        AlgoritmosOrdenamiento algoritmo = new AlgoritmosOrdenamiento();

        do {
            System.out.println("Menú de ordenamiento");
            System.out.println("1. Método Burbuja");
            System.out.println("2. Método Shell");
            System.out.println("3. Método Selección");
            System.out.println("4. Método Inserción");
            System.out.println("5. Salir");
            System.out.println("Escoja una opción:");
            op = sc.nextInt();

            if (op >= 1 && op <= 4) {
                for (int i = 0; i < vector.length; i++) {
                    System.out.println("ingrese el dato en la posición " + (i + 1) + ":");
                    vector[i] = sc.nextInt();
                }
            }

            switch (op) {
                case 1:
                    algoritmo.metodoBurbuja(vector);
                    algoritmo.imprimir(vector);
                    break;
                case 2:
                    algoritmo.metodoShell(vector);
                    algoritmo.imprimir(vector);
                    break;
                case 3:
                    algoritmo.metodoSeleccion(vector);
                    algoritmo.imprimir(vector);
                    break;
                case 4:
                    algoritmo.metodoInsercion(vector);
                    algoritmo.imprimir(vector);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 5);
//        int[] vectorPrueba = {15, 33, 27, 10, 35, 19, 42, 44};
//        algoritmo.metodoShell(vectorPrueba);
    }

}
