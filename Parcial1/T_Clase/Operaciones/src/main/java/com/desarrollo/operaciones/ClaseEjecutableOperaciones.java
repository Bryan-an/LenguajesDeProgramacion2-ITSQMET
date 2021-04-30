/**
 * creaated by Bryan on 29/04/2021
 */
package com.desarrollo.operaciones;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double resultado;
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        //Instanciar la clase
        Operaciones op = new Operaciones();

        System.out.println("INGRESAR DATOS");
        System.out.println("Número 1: ");
        num1 = sc.nextDouble();
        System.out.println("Número 2: ");
        num2 = sc.nextDouble();

        //Llamar método void
        op.sumaVoid(num1, num2);
        op.resta(num1, num2);
        op.potencia(num1, num2);

        //Llamar método return
        System.out.println("\n---------------------------------------------------");
        System.out.println("La suma es (return): " + op.sumaReturn(num1, num2));
        resultado = op.sumaReturn(num1, num2);
        //resultado = op.sumaReturn(op.sumaReturn(4, 5), 9);
        System.out.println("Resultado: " + (resultado + 30));

    }

}
