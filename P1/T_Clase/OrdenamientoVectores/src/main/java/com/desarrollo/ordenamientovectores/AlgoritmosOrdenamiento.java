/*
Ordenamiento de vectores
 */
package com.desarrollo.ordenamientovectores;

/**
 *
 * @author bryan
 */
public class AlgoritmosOrdenamiento {

    //Método Burbuja
    public void metodoBurbuja(int[] vector) {
        for (int i = 0; i < (vector.length) - 1; i++) { //Me va a permitir quedarme estático en una posición
            //Se le resta una posición porque es seguro que último valor va a ser el mayor
            for (int j = i + 1; j < vector.length; j++) { //Va a permitir recorrer todos los valores
                //Verificamos si el valor del sublista en la posición j es menor que el valor del sublista en la posición i
                if (vector[j] < vector[i]) { //para ordenar de manera descente se de cambiar el signo '<' a '>'
                    int aux = vector[i]; //Se almacena el valor del sublista en la posición i en una variable auxiliar
                    //Se intercambian los valores del sublista en las pocisiones i y j
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    //Método shell 
    public void metodoShell(int[] vector) {
        int temp;
        boolean bandera;

        for (int salto = (vector.length / 2); salto != 0; salto /= 2) { //controla el salto
            do {
                bandera = false; //cambio el estado de la bandera
                for (int i = salto; i < vector.length; i++) {
                    if (vector[i] < vector[i - salto]) {
                        temp = vector[i - salto];
                        vector[i - salto] = vector[i];
                        vector[i] = temp;
                        bandera = true;
                    }
                }
            } while (bandera == true);
        }
    }

    public void metodoInsercion(int[] vector) {

        int j, clave, longitudVector = vector.length;

        for (int i = 1; i < longitudVector; i++) {
            clave = vector[i];
            j = i - 1;

            while ((j >= 0) && (clave < vector[j])) {
                vector[j + 1] = vector[j--];
            }

            vector[j + 1] = clave;
        }
    }

    //método de selección
    public void metodoSeleccion(int vector[]) {
        int menor;
        int posicion = 0;
        for (int i = 0; i < vector.length - 1; i++) {
            menor = vector[i];
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < menor) {
                    menor = vector[j];
                    posicion = j;
                }
            }
            //intercambio
            vector[posicion] = vector[i];
            vector[i] = menor;
        }
    }

    //Imprimir el sublista ordenado
    public void imprimir(int[] vector) {
        System.out.println("Los valores ordenados son:");
        for (int i : vector) {
            System.out.println(i);
        }
    }

}
