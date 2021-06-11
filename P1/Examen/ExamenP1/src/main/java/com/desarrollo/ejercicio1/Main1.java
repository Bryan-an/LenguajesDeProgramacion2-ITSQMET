/*
 * Ejercicio 1
 */
package com.desarrollo.ejercicio1;

import java.util.Scanner;

/**
 * Crada por Bryan en 10/6/2021
 *
 * @author bryan
 */
public final class Main1 {

    //Fields
    private Scanner sc = new Scanner(System.in);
    private Cola<String> tickets = new Cola<String>();

    //Constructor
    public Main1() {
        desplegarMenu();
    }

    /**
     * Método main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main1();
    }

    //Métodos
    public void desplegarMenu() {
        int numeroOpcion;

        System.out.println("----------------Ejercicio 1----------------");
        do {
            System.out.println("\n1. Agregar persona a la cola"
                    + "\n2. Desplegar cola con tickets válidos"
                    + "\n3. Desplegar cola con tickets inválidos"
                    + "\n4. Mostrar cuántas personas tienen tickets válidos"
                    + "\n5. Mostrar cuántas personas tienen tickets inválidos"
                    + "\n6. Salir"
                    + "\n\nIngrese una opción:");
            numeroOpcion = sc.nextInt();
            sc.skip("\n");

            realizarOperaciones(numeroOpcion);
        } while (numeroOpcion != 6);
    }

    public void realizarOperaciones(int numeroOpcion) {
        switch (numeroOpcion) {
            case 1:
                System.out.println("\nIngrese el código del ticket:");
                String ticket = sc.next();
                tickets.add(ticket);
                tickets.determinarInvalidos();
                break;
            case 2:
                if (tickets.isEmpty()) {
                    System.out.println("\nAún no hay ninguna persona con tickets válidos en la cola");
                } else {
                    System.out.println("\n" + tickets.toString());

                }
                break;
            case 3:
                if (tickets.getInvalidos().isEmpty()) {
                    System.out.println("\nAún no hay ninguna persona con tickets inválidos en la cola");
                } else {
                    System.out.println("\n" + tickets.getInvalidos().toString());
                }
                break;
            case 4:
                if (tickets.isEmpty()) {
                    System.out.println("\nAún no hay ninguna persona con tickets válidos en la cola");
                } else {
                    System.out.println("\n" + tickets.size()
                            + " persona/s tiene/n tickets válidos");
                }
                break;
            case 5:
                if (tickets.getInvalidos().isEmpty()) {
                    System.out.println("\nAún no hay ninguna persona con tickets inválidos en la cola");
                } else {
                    System.out.println("\n" + tickets.getInvalidos().size()
                            + " persona/s tiene/n tickets inválidos");
                }
                break;
            case 6:
                System.out.println("\nGracias por utilizar nuestro programa");
                break;
            default:
                System.out.println("\nOpción inválida, intente de nuevo");
        }
    }
}
