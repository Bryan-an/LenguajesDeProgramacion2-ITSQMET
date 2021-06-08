/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.arraylist;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        int posicion;
        String nombre;
        Scanner sc = new Scanner(System.in);
        Estudiantes est = new Estudiantes();

        do {
            System.out.println("Menú colecciones"
                    + "\n1. Agregar nombre"
                    + "\n2. Agregar por posición"
                    + "\n3. Buscar nombre"
                    + "\n4. Remover por posición"
                    + "\n5. Borrar nombres"
                    + "\n6. Dimensión colección"
                    + "\n7. Imprimir"
                    + "\n8. Invertir colección"
                    + "\n9. Salir"
                    + "\nEscoja la opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre:");
                    nombre = sc.next();
                    est.agregarNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese un nombre:");
                    nombre = sc.next();
                    System.out.println("Ingrese la posición del nuevo nombre:");
                    posicion = sc.nextInt();
                    est.agregarPorPosicion(posicion, nombre);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre a buscar:");
                    nombre = sc.next();
                    est.buscarNombre(nombre);
                    break;
                case 4:
                    System.out.println("Ingrese la posición del nombre a remover:");
                    posicion = sc.nextInt();
                    est.removerNombre(posicion);
                    break;
                case 5:
                    est.vaciarColeccion();
                    break;
                case 6:
                    est.dimensionColeccion();
                    break;
                case 7:
                    est.imprimir();
                    break;
                case 8:
                    est.invertir();
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 9);
    }

}
