/*
 * Ejercicio 2
 */
package com.desarrollo.ejercicio2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Creada por Bryan
 *
 * @author bryan
 */
public final class Main2 {

    //Fields
    private Scanner sc = new Scanner(System.in);
    private Altura<Double> alturas = new Altura<Double>();
    DecimalFormat formateador = new DecimalFormat("0.00");

    //Constructor
    public Main2() {
        desplegarMenu();
    }

    /**
     * Método main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main2();
    }

    //Métodos
    public void desplegarMenu() {
        int numeroOpcion;

        System.out.println("\n-----------------Ejercicio 2--------------");
        do {
            System.out.println("\n1. Agregar altura"
                    + "\n2. Calcular promedio"
                    + "\n3. Cuántos alumnos tienen una altura mayor al promedio"
                    + "\n4. Cuántos alumnos tienen una altura menor al promedio"
                    + "\n5. Cuántos alumnos tienen una altura igual al promedio"
                    + "\n6. Imprimir las alturas ingresadas"
                    + "\n7. Imprimir las alturas de menor a mayor"
                    + "\n8. Imprimir la altura mayor"
                    + "\n9. Imprimir la altura menor"
                    + "\n10. Salir"
                    + "\n\nIngrese una opción:");
            numeroOpcion = sc.nextInt();
            sc.skip("\n");

            realizarOperaciones(numeroOpcion);
        } while (numeroOpcion != 10);
    }

    public void realizarOperaciones(int numeroOpcion) {
        switch (numeroOpcion) {
            case 1:
                pedirAltura();
                alturas.determinarAlturas();
                break;
            case 2:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\nEl promedio es: "
                            + formateador.format(alturas.getPromedio()) + " cm");
                }
                break;
            case 3:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\n" + alturas.getMayorPromedio()
                            + " estudiante/s tiene/n una altura mayor al promedio");
                }
                break;
            case 4:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\n" + alturas.getMenorPromedio()
                            + " estudiante/s tiene/n una altura menor al promedio");
                }
                break;
            case 5:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\n" + alturas.getIgualPromedio()
                            + " estudiante/s tiene/n una altura igual al promedio");
                }
                break;
            case 6:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\n" + alturas.toString());
                }
                break;
            case 7:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    ArrayList<Double> aux = new ArrayList<Double>();
                    aux.addAll(alturas);
                    Collections.sort(aux);
                    System.out.println("\n" + aux.toString());
                }
                break;
            case 8:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\nLa altura mayor es: "
                            + formateador.format(alturas.getAlturaMayor()) + " cm");
                }
                break;
            case 9:
                if (alturas.isEmpty()) {
                    System.out.println("\nAún no se ha ingresado ninguna altura");
                } else {
                    System.out.println("\nLa altura menor es: "
                            + formateador.format(alturas.getAlturaMenor()) + " cm");
                }
                break;
            case 10:
                System.out.println("\nGracias por utilizar nuestro programa");
                break;
            default:
                System.out.println("\nOpción inválida, intente de nuevo");
        }
    }

    public void pedirAltura() {
        boolean valido;

        do {
            valido = false;
            try {
                System.out.println("\nIngrese la altura (cm):");
                double altura = sc.nextDouble();
                sc.skip("\n");

                if (altura > 0) {
                    valido = true;
                    alturas.add(altura);
                } else {
                    System.out.println("\nAltura inválida");
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("\nDato inválido");
            }

        } while (!valido);

    }

}
