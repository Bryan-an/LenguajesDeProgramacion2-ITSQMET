/*
 * Corrección del deber 1: HashMap y Excepciones
 */
package com.desarrollo.parqueadero;

import java.io.*;

/**
 *
 * @author Bryan Andagoya
 */
public class ClaseEjecutableParqueadero {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int op;
        int espacio;
        String placa;
        BufferedReader input
                = new BufferedReader(new InputStreamReader(System.in));

        Parqueadero parqueadero = new Parqueadero();

        System.out.println("");
        System.out.println("Parqueadero ITSQMET");

        do {
            System.out.println("1. Mostrar espacios disponibles");
            System.out.println("2. Agregar vehículo");
            System.out.println("3. Retirar Vehículo-Espacio");
            System.out.println("4. Retirar Vehícula-Placa");
            System.out.println("5. Salir");
            System.out.println("Escoja una opción:");
            op = Integer.parseInt(input.readLine());

            switch (op) {
                case 1:
                    parqueadero.mostrarEspacios();
                    break;
                case 2:
                    System.out.println("Espacio: ");
                    espacio = Integer.parseInt(input.readLine());
                    System.out.println("Placa vehículo:");
                    placa = input.readLine();
                    parqueadero.agregarVehiculo(espacio, placa);
                    break;
                case 3:
                    System.out.println("Espacio: ");
                    espacio = Integer.parseInt(input.readLine());
                    parqueadero.removerVehiculo(espacio);
                    break;
                case 4:
                    System.out.println("Placa vehículo:");
                    placa = input.readLine();
                    parqueadero.removerVehiculo(placa);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 5);
    }

}
