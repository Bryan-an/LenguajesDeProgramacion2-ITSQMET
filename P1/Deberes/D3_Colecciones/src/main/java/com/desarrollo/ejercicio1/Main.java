/*
 * Queues
 */
package com.desarrollo.ejercicio1;

import java.util.Scanner;

/**
 * Created by Bryan on 3/6/2021
 *
 * @author bryan
 */
public final class Main {

    //Fields
    private Scanner sc = new Scanner(System.in);
    private Person<String> people = new Person<String>();

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
     * Constructor of Main class.
     */
    public Main() {
        showMenu();
    }

    /**
     * Method that shows the menu.
     *
     */
    public void showMenu() {
        int optionNumber;

        System.out.println("\n---------------------Colas---------------------");
        do {
            System.out.println("\n1. Ingresar persona a la cola"
                    + "\n2. Cobrar entradas"
                    + "\n3. Calcular total de ingresos"
                    + "\n4. Mostrar el número de personas en la cola"
                    + "\n5. Salir"
                    + "\n\nDigite una opción:");

            optionNumber = sc.nextInt();
            sc.skip("\n");
            performOperations(optionNumber);
        } while (optionNumber != 5);
    }

    /**
     * Methot that performs the menu operations.
     *
     * @param optionNumber Menu's option number.
     *
     */
    public void performOperations(int optionNumber) {
        switch (optionNumber) {
            case 1:
                System.out.println("\nIngrese el nombre de la persona:");
                people.enterPerson(sc.nextLine());
                break;
            case 2:
                if (people.isEmpty()) {
                    System.out.println("\nNo hay ninguna persona en la cola");
                } else {
                    people.chargeTickets();
                }
                break;
            case 3:
                if (!people.isThereMoney()) {
                    System.out.println("\nNo se ha cobrado ninguna entrada");
                } else {
                    people.calculateProfit();
                }
                break;
            case 4:
                if (people.isEmpty()) {
                    System.out.println("\nNo hay ninguna persona en la cola");
                } else {
                    people.showQueueSize();
                }
                break;
            case 5:
                System.out.println("\nGracias por utilizar nuestro programa");
                break;
            default:
                System.out.println("\nOpción inválida, intente de nuevo");
        }
    }

}
