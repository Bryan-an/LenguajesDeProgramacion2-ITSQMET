/*
 * Deber 1: Ejercicio colección HashMap
 */
package com.desarrollo.parkinglot;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Parking lot.
 *
 * @author bryan
 */
public class ParkingLot {

    //Fields
    private final HashMap<Integer, String> spaces;
    private final Scanner input = new Scanner(System.in);

    /**
     * Constructor of ParkingLot class.
     */
    public ParkingLot() {
        spaces = new HashMap<Integer, String>();

        for (int i = 1; i <= 10; i++) {
            spaces.put(i, null);
        }
    }

    /**
     * Methos that checks for available spaces.
     *
     * @return Return true if there are available places.
     */
    public boolean areThereAvailableSpaces() {
        return spaces.containsValue(null);
    }

    /**
     * Method that shows the available spaces.
     */
    public void showAvailableSpaces() {
        if (!areThereAvailableSpaces()) {
            System.out.println("\nNo hay espacios disponibles en el parqueadero");
        } else {
            System.out.println("\nEspacios vacíos:");
            spaces.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() == null)
                    .forEach(entry -> System.out.println(entry.getKey()));
        }
    }

    /**
     * Method that adds a car.
     */
    public void addCar() {
        if (areThereAvailableSpaces()) {
            int spaceNumber = askForSpaceNumber("\nIngrese el número de espacio en donde desea parquear su vehículo:");

            if (spaces.get(spaceNumber) == null) {
                String licensePlate = askForLicensePlate();
                spaces.put(spaceNumber, licensePlate);
            } else {
                System.out.println("\nDicho espacio ya se encuentra ocupado");
            }

        } else {
            System.out.println("\nNo hay espacios disponibles en el parqueadero");
        }

    }

    /**
     * Method that removes a car.
     */
    public void removeCar() {
        int spaceNumber = askForSpaceNumber("\nIngrese el número de espacio en donde parqueó su vehículo:");
        if (spaces.get(spaceNumber) == null) {
            System.out.println("\nDicho espacio está vació");
        } else {
            spaces.put(spaceNumber, null);
            System.out.println("\nSe ha retirado el vehículo correctamente");
        }
    }

    /**
     * Method that asks for the space number.
     *
     * @param request Ther order message.
     * @return A valid space number.
     */
    public int askForSpaceNumber(String request) {
        int spaceNumber = 0;
        boolean isValid = false;

        do {
            try {
                System.out.println(request);
                spaceNumber = input.nextInt();

                if (spaceNumber >= 1 && spaceNumber <= 10) {
                    isValid = true;
                } else {
                    System.out.println("\nEl espacio ingresado no existe");
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println("\nDato inválido");
            }
        } while (!isValid);

        return spaceNumber;
    }

    /**
     * Method that asks for the license plate.
     *
     * @return A valid license plate.
     */
    public String askForLicensePlate() {
        String licensePlate = null;
        char[] licensePlateArray;
        boolean isValid;

        do {

            try {
                System.out.println("\nIngrese el número de placa de su vehículo");
                licensePlate = input.next().toUpperCase();

                if (spaces.containsValue(licensePlate)) {
                    System.out.println("\nDicho vehículo ya se encuentra en el parquedero");
                    throw new InvalidLicensePlate();
                }

                if (licensePlate.length() == 6 || licensePlate.length() == 7) {
                    licensePlateArray = licensePlate.toLowerCase().toCharArray();

                    for (int i = 0; i <= 2; i++) {
                        if (!((licensePlateArray[i] >= 'a'
                                && licensePlateArray[i] <= 'z')
                                || licensePlateArray[i] == 'ñ')) {
                            throw new InvalidLicensePlate();
                        }
                    }

                    for (int i = 3; i < licensePlateArray.length; i++) {
                        if (!(licensePlateArray[i] >= '0'
                                && licensePlateArray[i] <= '9')) {
                            throw new InvalidLicensePlate();
                        }
                    }
                } else {
                    throw new InvalidLicensePlate();
                }

                isValid = true;
            } catch (InvalidLicensePlate e) {
                isValid = false;
            }
        } while (!isValid);

        return licensePlate;
    }

}
