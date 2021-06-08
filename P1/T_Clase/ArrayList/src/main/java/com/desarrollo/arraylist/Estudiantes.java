/*
 * ArrayList
 */
package com.desarrollo.arraylist;

import java.util.*;

/**
 *
 * @author bryan
 */
public class Estudiantes {

    //List nombres = new ArrayList();
    ArrayList<String> nombres = new ArrayList<String>();

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
        System.out.println("Se agregó correctamente el nombre");
    }

    public void agregarPorPosicion(int posicion, String nombre) {
        nombres.add(posicion, nombre);
    }

    public void buscarNombre(String nombre) {
        boolean contener = nombres.contains(nombre);

        if (contener) {
            System.out.println("Nombre encontrado");
        } else {
            System.out.println("Nombre no encontrado");
        }
    }

    public void removerNombre(int posicion) {
        System.out.println("El nombre eliminado es: " + nombres.remove(posicion));
    }

    public void vaciarColeccion() {
        nombres.clear();
    }

    public void dimensionColeccion() {
        System.out.println("Tamaño de la colección: " + nombres.size());
    }

    public void imprimir() {
        nombres.forEach(System.out::println);

//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//        }
    }

    //crear otro arrayList que contenga los elementos invertidos de la primera
    //colección
    public void invertir() {
        ArrayList<String> coleccionInvertida = new ArrayList<String>();

        coleccionInvertida.clear();

        for (int i = nombres.size() - 1; i >= 0; i--) {
            coleccionInvertida.add(nombres.get(i));
        }

        System.out.println("\nColección invertida:");
        coleccionInvertida.forEach(System.out::println);
    }

}
