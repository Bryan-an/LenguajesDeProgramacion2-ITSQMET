/*
 * Cola
 */
package com.desarrollo.cola;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public final class ClaseEjecutableCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        int elemento;
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();

        do {
            System.out.println("Menú Cola"
                    + "\n1. Agregar elemento"
                    + "\n2. Primer elemento"
                    + "\n3. Dimensión de la cola"
                    + "\n4. Vaciar cola"
                    + "\n5. Remover elemento"
                    + "\n6. Imprimir"
                    + "\n7. Verificar cola"
                    + "\n8. Salir"
                    + "\nEscoja una opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el elemento en la cola:");
                    elemento = sc.nextInt();
                    cola.agregarElementos(elemento);
                    break;
                case 2:
                    cola.primerElemento();
                    break;
                case 3:
                    cola.dimensionCola();
                    break;
                case 4:
                    cola.vaciarCola();
                    break;
                case 5:
                    cola.removerElemento();
                    break;
                case 6:
                    cola.imprimir();
                    break;
                case 7:
                    cola.verificarCola();
                    break;
                case 8:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 8);
    }

}
