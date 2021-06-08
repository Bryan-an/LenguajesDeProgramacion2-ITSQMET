/*
 * Cola
 */
package com.desarrollo.cola;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author bryan
 */
public class Cola {

    Queue<Integer> cola = new LinkedList();

    public void agregarElementos(int elemento) {
        cola.add(elemento);
    }

    public void primerElemento() {
        System.out.println("El primer elemento en la clas es: " + cola.peek());
    }

    public void dimensionCola() {
        System.out.println("Tamaño de la cola: " + cola.size());
    }
                                                                                
    public void vaciarCola() {
        cola.clear();
        System.out.println("Se han eliminado todos los elementos de la cola");
    }

    public void removerElemento() {
        System.out.println("El elemento que se ha removido es: " 
                + cola.remove());
    }

    public void imprimir() {
        int mayor = 0;

        System.out.println("Elementos en la cola");
        for (int elemento : cola) {
            if (elemento > mayor) {
                mayor = elemento;
            }
            System.out.println(elemento);
        }
        System.out.println("El elemento mayor es: " + mayor);
    }

    public void verificarCola() {
        System.out.println("Se encuentra vacía: " + cola.isEmpty());
    }

}
