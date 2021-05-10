/*
Constructor
 */
package com.desarrollo.constructor;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables e instancias
        String nombre, codigo;
        int horasT = 0;
        Scanner sc = new Scanner(System.in);

        //Pedir datos
        System.out.println("INFORMACIÓN EMPLEADO");
        System.out.println("Nombre: ");
        nombre = sc.next();
        System.out.println("Código: ");
        codigo = sc.next();
        do {
            System.out.println("Horas trabajadas: ");
            try {
                horasT = sc.nextInt();
                if (horasT <= 0) {
                    System.out.println("\nDato inválido, intente nuevamente");
                }
            } catch (Exception e) {
                sc.next();
                System.out.println("\nDato inválido, intente nuevamente");
            }
        } while (horasT <= 0);

        //Instanciar la clase Empleado
        Empleado empleado = new Empleado(nombre, codigo, horasT);

        //Llamar métodos
        System.out.println(empleado);
        empleado.calcularSueldo();
    }

}
