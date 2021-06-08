/*
 * Queues
 */
package com.desarrollo.ejercicio1;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Bryan on 3/6/2021
 *
 * @author bryan
 * @param <E> Data type.
 */
public class Person<E> extends LinkedList<E> {

    //Fields
    private double money5_10 = 0;
    private double money11_17 = 0;
    private double money18 = 0;
    private double total;

    /**
     * Method that inserts a person in the queue.
     *
     * @param e Data type.
     */
    public void enterPerson(E e) {
        super.add(e);
        System.out.println("\nLa persona ha ingresado existosamente");
    }

    /**
     * Method that charges the tickets.
     */
    public void chargeTickets() {
        Scanner sc = new Scanner(System.in);

        boolean valid;

        do {
            valid = true;

            System.out.println("\nIngrese la edad de " + super.peek() + ":");
            int age = sc.nextInt();

            if (age <= 0) {
                System.out.println("\nEdad inválida, intente de nuevo");
                valid = false;
            } else {
                if (age < 5) {
                    System.out.println("\nUsted no puede adquirir una entrada");
                } else if (age <= 10) {
                    money5_10 += 2.5;
                } else if (age <= 17) {
                    money11_17 += 3;
                } else if (age >= 18) {
                    money18 += 3.5;
                }
                super.remove();
            }

        } while (!valid || !super.isEmpty());

    }

    /**
     * Method that calculates the profit.
     */
    public void calculateProfit() {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\nEn el rango de edades de [5-10] años se han recolectado $ "
                + df.format(money5_10));
        System.out.println("En el rango de edades de [11-17] años se han recolectado $ "
                + df.format(money11_17));
        System.out.println("En el rango de edades de mayor o igual a 18 años se han recolectado $ "
                + df.format(money18));
        System.out.println("En total se han recaudado $ " + df.format(total));
    }

    /**
     * Method that shows the queue's size.
     */
    public void showQueueSize() {
        System.out.println("\nHay " + super.size()
                + " persona/s esperando en la cola");
    }

    /**
     * Method that checks for money.
     *
     * @return Returns true if there is money collected.
     *
     */
    public boolean isThereMoney() {
        total = money5_10 + money11_17 + money18;
        return total > 0;
    }

}
