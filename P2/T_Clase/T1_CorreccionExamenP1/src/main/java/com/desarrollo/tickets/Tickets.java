/*
 * Corrección del examen P1
 */
package com.desarrollo.tickets;

import java.util.*;

/**
 * Created by Bryan on 17/6/2021
 *
 * @author bryan
 */
public class Tickets {

    //Campos
    LinkedList<String> colaTickets = new LinkedList<String>();
    LinkedList<String> colaTicketsInvalidos = new LinkedList<String>();

    public void repartirTickets() {
        for (int i = 0; i < 4; i++) {
            colaTickets.add("TconEcu" + Math.round((Math.random() * 100)));
        }
        for (int i = 0; i < 4; i++) {
            colaTickets.add("tconecu" + Math.round((Math.random() * 100)));
        }
    }

    public void clasificarTickets() {
        String subCadena;
        String acumTickets = "";

        for (int i = 0; i < colaTickets.size(); i++) {
            subCadena = colaTickets.get(i).substring(0, 7);
            if (!subCadena.equals("TconEcu")) {  //es diferente
                colaTicketsInvalidos.add(colaTickets.get(i));
//                colaTickets.remove(colaTickets.get(i--));
            } else {
                acumTickets = acumTickets + colaTickets.get(i) + ",";
                //System.out.println(acumTickets);
            }
        }

        colaTickets.clear();
        String[] tickets = acumTickets.split(",");
        colaTickets.addAll(Arrays.asList(tickets));
    }

    public void ticketsValidos() {
        System.out.println("");
        System.out.println("Tickets válidos");
//        for (int i = 0; i < colaTickets.size(); i++) {
//            System.out.println(colaTickets.get(i));
//        }
        colaTickets.forEach(System.out::println);
    }

    public void ticketsInvalidos() {
        System.out.println("");
        System.out.println("Tickets inválidos");
//        for (int i = 0; i < colaTicketsInvalidos.size(); i++) {
//            System.out.println(colaTicketsInvalidos.get(i));
//        }
        colaTicketsInvalidos.forEach(System.out::println);
    }

    public int contTicketsValidos() {
        return colaTickets.size();
    }

    public int contTicketsInvalidos() {
        return colaTicketsInvalidos.size();
    }

//    public void imprimir() {
//        colaTickets.forEach(System.out::println);
//    }
}
