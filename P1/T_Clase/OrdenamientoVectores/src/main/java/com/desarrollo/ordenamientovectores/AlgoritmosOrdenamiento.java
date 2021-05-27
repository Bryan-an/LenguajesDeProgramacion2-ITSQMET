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
                //Verificamos si el valor del vector en la posición j es menor que el valor del vector en la posición i
                if (vector[j] < vector[i]) { //para ordenar de manera descente se de cambiar el signo '<' a '>'
                    int aux = vector[i]; //Se almacena el valor del vector en la posición i en una variable auxiliar
                    //Se intercambian los valores del vector en las pocisiones i y j
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    //Método shell (profe)
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
    //Método shell (mío)
//    public void metodoShell(int[] vector) {
//        if (vector.length != 1) {
//
//            int longitudVector = vector.length, n = 2, numeroSublistas = (longitudVector / n), longitudVector = 1, j, apuntador;
//            int[] vector = new int[longitudVector];
//
//            do {
//
//                for (apuntador = 0; apuntador < numeroSublistas; apuntador++) {
//                    longitudVector = 1;
//                    j = 0;
//                    for (int i = apuntador; i < longitudVector; i += numeroSublistas) {
//                        if (j == longitudVector) {
//                            int[] aux = new int[longitudVector];
//                            System.arraycopy(vector, 0, aux, 0, longitudVector++);
//                            vector = new int[longitudVector];
//                            System.arraycopy(aux, 0, vector, 0, longitudVector - 1);
//                        }
//                        vector[j++] = vector[i];
//                    }
//                    vector = ordenarSublista(vector);
//                    j = 0;
//                    for (int i = apuntador; i < longitudVector; i += numeroSublistas) {
//                        vector[i] = vector[j++];
//                    }
//                }
//
//                n *= 2;
//                numeroSublistas = (longitudVector / n);
//
//            } while (numeroSublistas >= 1);
//        }
//
//        System.out.println("\nVector ordenado");
//        for (int i : vector) {
//            System.out.println(i);
//        }
//
//    }

    //Método de ordenamiento por inserción
//    public int[] ordenarSublista(int[] vector) {
//
//        int j, clave, longitudVector = vector.length;
//
//        for (int i = 1; i < longitudVector; i++) {
//            clave = vector[i];
//            j = i - 1;
//
//            while ((j >= 0) && (clave < vector[j])) {
//                vector[j + 1] = vector[j--];
//            }
//
//            vector[j + 1] = clave;
//        }
//
//        return vector;
//    }
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

    //Imprimir el vector ordenado
    public void imprimir(int[] vector) {
        System.out.println("Los valores ordenados son:");
        for (int i : vector) {
            System.out.println(i);
        }
    }

}
