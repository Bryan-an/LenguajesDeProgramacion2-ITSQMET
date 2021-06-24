/*
 * HaspMap
 */
package com.desarrollo.gestion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bryan
 */
public class GestionProductos {

    //Definir la colección
    HashMap<String, String> listaProductos = new HashMap<String, String>();

    public void guardarProducto(String codigo, String nombre) {
        if (listaProductos.containsKey(codigo)) {
            System.out.println("No se puede agregar el producto - El código ya existe");
        } else {
            System.out.println("Se agregó correctamente el producto");
            listaProductos.put(codigo, nombre); //agregando elementos en la colección
        }
    }

    public void modificarNombre(String codigo, String nombre) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.put(codigo, nombre);
            System.out.println("Se modificó correctamente el producto");
        } else {
            System.out.println("No existe ningún producto con ese código");
        }
    }

    public void buscarCodigo(String codigo) {
        if (listaProductos.containsKey(codigo)) {
            System.out.println("Existe el producto " + codigo);
        } else {
            System.out.println("No existe el producto");
        }
    }

    public void buscarNombre(String nombre) {
        if (listaProductos.containsValue(nombre)) {
            System.out.println("Existe el producto " + nombre);
        } else {
            System.out.println("No existe el producto");
        }
    }

    public void eliminar(String codigo) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
            System.out.println("Se ha eliminado el producto");
        } else {
            System.out.println("No existe ningún producto con ese código");
        }
    }

    public void mostrarProductos() {

        System.out.println("Claves");
//        for (String codigo : listaProductos.keySet()) {
//            System.out.println(codigo);
//        }
        listaProductos.keySet().forEach(System.out::println);

        System.out.println("\nValores");
//        for (String nombre : listaProductos.values()) {
//            System.out.println(nombre);
//        }
        listaProductos.values().forEach(System.out::println);

        System.out.println("\nCódigo\t    Nombre");
        for (Map.Entry<String, String> elemento : listaProductos.entrySet()) {
            System.out.println(elemento.getKey() + "\t    " + elemento.getValue());
        }

    }
}
