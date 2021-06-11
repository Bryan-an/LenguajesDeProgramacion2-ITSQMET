/*
 * Collections
 */
package com.desarrollo.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Created by Bryan on 3/6/2021
 *
 * @author bryan
 */
public final class Main {

    //Fields
    private ArrayList<Double> decimals = new ArrayList<Double>();

    /**
     * Main method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
     * Constructor of Main class.
     */
    public Main() {
        askDecimals();
        printDecimals();
        printSize();
        printAverage();
    }

    /**
     * Method that asks for a decimal number.
     */
    public void askDecimals() {
        Scanner sc = new Scanner(System.in);
        double decimal;

        do {
            System.out.println("\nIngrese un número decimal:");
            decimal = sc.nextDouble();
            if (decimal != 0) {
                decimals.add(decimal);
            }
        } while (decimal != 0);

    }

    /**
     * Method that prints the decimals.
     */
    public void printDecimals() {
        System.out.println("\nLos decimales ingresados son:");
        decimals.forEach(System.out::println);
    }

    /**
     * Method that prints the collection's size.
     */
    public void printSize() {
        System.out.println("\nLa cantidad de números ingresados es: "
                + decimals.size());
    }

    /**
     * Methot that prints the average.
     */
    public void printAverage() {
        double average = 0;

        average = decimals.stream().map(decimal -> decimal).reduce(average,
                (accumulator, _item) -> accumulator + _item);
        System.out.println("\nEl promedio es: " + average / decimals.size());
    }
}
