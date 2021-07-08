/*
 * Corrección del deber 1: HashMap y Excepciones
 */
package com.desarrollo.parqueadero;

import java.util.Scanner;

/**
 *
 * @author Bryan Andagoya
 */
public class ClaseEjecutableParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        int espacio;
        String placa;
        Scanner sc = new Scanner(System.in);
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
            op = sc.nextInt();
            switch (op) {
                case 1:
                    parqueadero.mostrarEspacios();
                    break;
                case 2:
                    System.out.println("Espacio: ");
                    espacio = sc.nextInt();
                    System.out.println("Placa vehículo:");
                    placa = sc.next();
                    parqueadero.agregarVehiculo(espacio, placa);
                    break;
                case 3:
                    System.out.println("Espacio: ");
                    espacio = sc.nextInt();
                    parqueadero.removerVehiculo(espacio);
                    break;
                case 4:
                    System.out.println("Placa vehículo:");
                    placa = sc.next();
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
