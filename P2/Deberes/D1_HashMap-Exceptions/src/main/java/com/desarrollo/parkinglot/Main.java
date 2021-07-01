/*
 * Deber 1: Ejercicio colección HashMap
 */
package com.desarrollo.parkinglot;

import java.util.Scanner;

/**
 * Executable class.
 *
 * @author bryan
 */
public final class Main {

    //Fields
    private final Scanner input = new Scanner(System.in);
    private final ParkingLot parkingLot = new ParkingLot();

    /**
     * Constructor of Main class.
     */
    public Main() {
        showMenu();
    }

    /**
     * Main Thread.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
     * Method that shows the menu.
     */
    public void showMenu() {
        System.out.println("----------------Parqueadero--------------");
        int optionNumber;

        do {
            System.out.println("\n1. Mostrar espacios vacios"
                    + "\n2. Agregar vehículo al parqueadero"
                    + "\n3. Retirar vehículo del parqueadero"
                    + "\n4. Salir"
                    + "\n\nEscoja una opción:");
            optionNumber = askForOptionNumber();
            performOperations(optionNumber);
        } while (optionNumber != 4);
    }

    /**
     * Method that perform the operations.
     *
     * @param optionNumber Option number.
     */
    public void performOperations(int optionNumber) {
        switch (optionNumber) {
            case 1 ->
                parkingLot.showAvailableSpaces();
            case 2 ->
                parkingLot.addCar();
            case 3 ->
                parkingLot.removeCar();
            case 4 ->
                System.out.println("\nGracias por utilizar nuestro programa");
            default ->
                System.out.println("\nOpción inválida");
        }
    }

    /**
     * Method that ask for the option number.
     *
     * @return A valid option number.
     */
    public int askForOptionNumber() {
        int optionNumber = 0;
        boolean isValid = false;

        do {

            try {
                optionNumber = input.nextInt();
                isValid = true;
            } catch (Exception e) {
                input.nextLine();
                System.out.println("\nDato inválido");
            }
        } while (!isValid);

        return optionNumber;
    }

}
