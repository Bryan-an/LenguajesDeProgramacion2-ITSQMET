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
        double num1 = 0, num2 = 0;
        int opc;
        Scanner sc = new Scanner(System.in);

        //Instanciar la clase
        Operaciones op = new Operaciones();

        do {

            System.out.println("\nMENÚ OPERACIONES");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");
            System.out.println("Escoja una opción: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 4) {
                System.out.println("INGRESAR DATOS");
                System.out.println("Número 1: ");
                num1 = sc.nextDouble();
                System.out.println("Número 2: ");
                num2 = sc.nextDouble();
            }

            switch (opc) {
                case 1:
                    op.sumaVoid(num1, num2);
                    break;
                case 2:
                    op.resta(num1, num2);
                    break;
                case 3:
                    op.multiplicacion(num1, num2);
                    break;
                case 4:
                    op.division(num1, num2);
                    break;
                case 5:
                    System.out.println("INGRESAR DATOS");
                    System.out.println("Base: ");
                    num1 = sc.nextDouble();
                    System.out.println("Exponente: ");
                    num2 = sc.nextDouble();
                    op.potencia(num1, num2);
                    break;
                case 6:
                    System.out.println("INGRESAR DATOS");
                    System.out.println("Radicando: ");
                    num1 = sc.nextDouble();
                    op.sqrt(num1);
                    break;
                case 7:
                    System.out.println("GRACIAS POR UTILIZAR NUESTRO PROGRAMA");
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }
        } while (opc != 7);

        //Llamar método void
        //Llamar método return
//        System.out.println("\n---------------------------------------------------");
//        System.out.println("La suma es (return): " + op.sumaReturn(num1, num2));
//        resultado = op.sumaReturn(num1, num2);
//        //resultado = op.sumaReturn(op.sumaReturn(4, 5), 9);
//        System.out.println("Resultado: " + (resultado + 30));
    }

}
