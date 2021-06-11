/*
Pilas
 */
package com.desarrollo.pila;

import java.util.Stack;

/**
 *
 * @author bryan
 */
public class Pila {

    //Clase para pilas
    //Crear un objeto
    Stack<Integer> pila = new Stack();

    //métodos
    //int -> Integer
    //double -> Double
    //char -> Character
    //floar -> Float
    public void agregarElemento(int elemento) {
        pila.push(elemento);
        System.out.println("Se agregó correctamente el elemento");
    }

    public void removerUttimoElemento() {
        System.out.println("El elemento que se removió es: " + pila.pop());
    }

    public void cimaElemento() {
        System.out.println("La cima es: " + pila.peek());
    }

    public void dimensionPila() {
        System.out.println("La dimensión es: " + pila.size());
    }

    public boolean verificarPilaVacia() {
        return pila.empty();
    }

    public void imprimir() {
        //for each
//        for (int elemento : pila) {
//            System.out.println(elemento);
//        }
        System.out.println("Pila:");
        pila.forEach(System.out::println);
    }
}
