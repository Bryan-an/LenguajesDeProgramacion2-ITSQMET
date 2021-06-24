/*
 * Corrección del examen P1
 */
package com.desarrollo.alturas;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableAltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        double altura;
        Scanner sc = new Scanner(System.in);
        Altura alturas = new Altura();
        do {
            System.out.println("Institución deportiva");
            System.out.println("1. Ingresar altura");
            System.out.println("2. Promedio alturas");
            System.out.println("3. Cantidad de alturas menores/mayores/iguales");
            System.out.println("4. Ordenar menor-mayor");
            System.out.println("5. Imprimir alturas");
            System.out.println("6. Salir");
            System.out.println("Escoja una opción:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese la altura:");
                    altura = sc.nextDouble();
                    alturas.agregarAlturas(altura);
                    break;
                case 2:
                    alturas.promedioAlturas();
                    break;
                case 3:
                    alturas.menorMayorIgualPromedio();
                    break;
                case 4:
                    alturas.menorMayor();
                    break;
                case 5:
                    alturas.imprimirAlturas();
                    break;
                case 6:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opción inválida");

            }
        } while (op != 6);
    }

}
