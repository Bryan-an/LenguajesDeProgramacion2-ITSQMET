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
    private final Scanner sc = new Scanner(System.in);

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
            int space = askSpace("\nIngrese el número de espacio en donde desea parquear su vehículo:");

            if (spaces.get(space) == null) {
                String licensePlate = askLicensePlate();
                spaces.put(space, licensePlate);
            } else {
                System.out.println("\nDicho espacio ya se encuentra ocupado");
            }

        }

    }

    /**
     * Method that removes a car.
     */
    public void removeCar() {
        int space = askSpace("\nIngrese el número de espacio en donde parqueó su vehículo:");
        if (spaces.get(space) == null) {
            System.out.println("\nDicho espacio está vació");
        } else {
            spaces.put(space, null);
            System.out.println("\nSe ha retirado el vehículo correctamente");
        }
    }

    /**
     * Method that asks for the space number.
     *
     * @param order Ther order message.
     * @return A valid space number.
     */
    public int askSpace(String order) {
        int space = 0;
        boolean valid;

        do {
            valid = true;
            try {
                System.out.println(order);
                space = sc.nextInt();
                if (!(space >= 1 && space <= 10)) {
                    System.out.println("\nEl espacio ingresado no existe");
                    valid = false;
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("\nDato inválido");
                valid = false;
            }
        } while (!valid);

        return space;
    }

    /**
     * Method that asks for the license plate.
     *
     * @return A valid license plate.
     */
    public String askLicensePlate() {
        String licensePlate = null;
        char[] licensePlateArray;
        boolean valid;

        do {
            valid = true;

            try {
                System.out.println("\nIngrese el número de placa de su vehículo");
                licensePlate = sc.next().toUpperCase();

                if (!(licensePlate.length() == 6 || licensePlate.length() == 7)) {
                    throw new InvalidLicensePlate();
                } else {
                    licensePlateArray = licensePlate.toLowerCase().toCharArray();

                    for (int i = 0; i <= 2; i++) {
                        if (licensePlateArray[i] >= '0'
                                && licensePlateArray[i] <= '9') {
                            throw new InvalidLicensePlate();
                        }
                    }

                    for (int i = 3; i < licensePlateArray.length; i++) {
                        if ((licensePlateArray[i] >= 'a'
                                && licensePlateArray[i] <= 'z')
                                || licensePlateArray[i] == 'ñ') {
                            throw new InvalidLicensePlate();
                        }
                    }
                }
            } catch (InvalidLicensePlate e) {
                valid = false;
            }
        } while (!valid);

        return licensePlate;
    }

}
