/*
 * Corrección del examen P1
 */
package com.desarrollo.tickets;

import java.io.*;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableTickets {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int op;
        Tickets tickets = new Tickets();
        BufferedReader input
                = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menú");
            System.out.println("1. Repartir Tickets");
            System.out.println("2. Tickets válidos");
            System.out.println("3. Tickets inválidos");
            System.out.println("4. Cantidad tickets válidos");
            System.out.println("5. Cantidad tickets inválidos");
            System.out.println("6. Salir");
            System.out.println("Escoja una opción:");
            op = Integer.parseInt(input.readLine());

            switch (op) {
                case 1:
                    tickets.repartirTickets();
//                tickets.imprimir();
                    tickets.clasificarTickets();
                    break;
                case 2:
                    tickets.ticketsValidos();
                    break;
                case 3:
                    tickets.ticketsInvalidos();
                    break;
                case 4:
                    System.out.println("Cantidad tickets válidos");
                    System.out.println(tickets.contTicketsValidos());
                    break;
                case 5:
                    System.out.println("Cantidad tickets inválidos");
                    System.out.println(tickets.contTicketsInvalidos());
                    break;
                case 6:
                    System.out.println("Gracias - fin del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 6);
    }

}
