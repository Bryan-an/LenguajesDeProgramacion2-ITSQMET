/*
 * Ejercicio 1
 */
package com.desarrollo.ejercicio1;

import java.util.LinkedList;

/**
 * Creada por Bryan en 10/6/2021
 *
 * @author bryan
 * @param <E>
 */
public class Cola<E> extends LinkedList<E> {

    //Fields
    private LinkedList<String> invalidos = new LinkedList<String>();

    //Getters y setters
    public LinkedList<String> getInvalidos() {
        return invalidos;
    }

    public void setInvalidos(Cola<String> invalidos) {
        this.invalidos = invalidos;
    }

    //Métodos
    public void determinarInvalidos() {
        int posicion = 0;

        do {
            String aux = (String) super.get(posicion++);
            if (!aux.startsWith("TconEcu")) {
                invalidos.add(aux);
                super.remove(aux);
            }
        } while (posicion < super.size());
    }

}
