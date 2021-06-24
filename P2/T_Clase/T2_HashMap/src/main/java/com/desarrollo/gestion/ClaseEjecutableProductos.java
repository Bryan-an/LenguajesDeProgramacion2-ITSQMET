/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.gestion;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ClaseEjecutableProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        String codigo, nombre;

        System.out.println("Bienvenido a la tienda Marthita");
        GestionProductos productos = new GestionProductos();

        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Buscar por código");
            System.out.println("5. Buscar por nombre");
            System.out.println("6. Mostrar productos");
            System.out.println("7. Salir");
            System.out.println("Escoja una opción:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Información producto");
                    System.out.println("Código:");
                    codigo = sc.next();
                    System.out.println("Nombre:");
                    sc.skip("\n");
                    nombre = sc.nextLine();
                    productos.guardarProducto(codigo, nombre);
                    break;
                case 2:
                    System.out.println("Modificar producto");
                    System.out.println("Código del producto a modificar:");
                    codigo = sc.next();
                    System.out.println("Nuevo nombre del producto:");
                    sc.skip("\n");
                    nombre = sc.nextLine();
                    productos.modificarNombre(codigo, nombre);
                    break;
                case 3:
                    System.out.println("Eliminar producto");
                    System.out.println("Código del producto a eliminar:");
                    codigo = sc.next();
                    productos.eliminar(codigo);
                    break;
                case 4:
                    System.out.println("Buscar por código");
                    System.out.println("Código:");
                    codigo = sc.next();
                    productos.buscarCodigo(codigo);
                    break;
                case 5:
                    System.out.println("Buscar por nombre");
                    System.out.println("Nombre:");
                    sc.skip("\n");
                    nombre = sc.nextLine();
                    productos.buscarNombre(nombre);
                    break;
                case 6:
                    productos.mostrarProductos();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 7);
    }

}
