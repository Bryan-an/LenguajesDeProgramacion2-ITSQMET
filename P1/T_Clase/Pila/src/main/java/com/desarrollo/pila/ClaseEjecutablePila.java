/*
Pilas
 */
package com.desarrollo.pila;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public final class ClaseEjecutablePila {

    //Campos
    private Scanner sc = new Scanner(System.in);
    private Pila pila = new Pila();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ClaseEjecutablePila();
    }

    private ClaseEjecutablePila() {
        mostrarMenu();
    }

    public void mostrarMenu() {
        int numeroOpcion;
        do {
            System.out.println("\n-------------Pilas_Matutino-------------"
                    + "\n1. Agregar un elemento a la pila"
                    + "\n2. Remover el último elemento ingresado a la pila"
                    + "\n3. Mostrar el elemento en la cima de la pila"
                    + "\n4. Mostrar la dimensión de la pila"
                    + "\n5. Virificar si la pila está vacía"
                    + "\n6. Imprimir la pila"
                    + "\n7. Salir");
            numeroOpcion = sc.nextInt();
            sc.skip("\n");

            realizarOperaciones(numeroOpcion);

        } while (numeroOpcion != 7);
    }

    public void realizarOperaciones(int numeroOpcion) {

        switch (numeroOpcion) {
            case 1:
                int elementoAgregado;
                System.out.println("\nIngrese el elemento que desea agregar:");
                elementoAgregado = sc.nextInt();
                pila.agregarElemento(elementoAgregado);
                break;
            case 2:
                if (pila.verificarPilaVacia()) {
                    System.out.println("\nLa pila está vacía");
                } else {
                    pila.removerUttimoElemento();
                }
                break;
            case 3:
                if (pila.verificarPilaVacia()) {
                    System.out.println("\nLa pila está vacía");
                } else {
                    pila.cimaElemento();
                }
                break;
            case 4:
                if (pila.verificarPilaVacia()) {
                    System.out.println("\nLa pila está vacía");
                } else {
                    pila.dimensionPila();
                }
                break;
            case 5:
                if (pila.verificarPilaVacia()) {
                    System.out.println("\nLa pila está vacía");
                } else {
                    System.out.println("\nLa pila no está vacía");
                }
                break;
            case 6:
                if (pila.verificarPilaVacia()) {
                    System.out.println("\nLa pila está vacía");
                } else {
                    pila.imprimir();
                }
                break;
            case 7:
                System.out.println("\nGracias por utilizar nuestro programa");
                break;
            default:
                System.out.println("\nOpción inválida");
        }
    }

}
