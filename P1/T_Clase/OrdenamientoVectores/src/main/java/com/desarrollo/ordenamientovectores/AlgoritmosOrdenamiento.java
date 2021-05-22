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

//    //Método sherll (profe)
//    public void metodoShell(int[] vector) {
//        int temp;
//        for (int salto = (vector.length / 2); salto != 0; salto /= 2) { //controla el salto
//            //salto = 3
//            for (int i = salto; i < vector.length; i++) {
//                if (vector[i] < vector[i - salto]) {
//                    temp = vector[i - salto];
//                    vector[i - salto] = vector[i];
//                    vector[i] = temp;
//                }
//            }
//        }
//    }
    //Método shell (mío)
    public void metodoShell(int[] vector) {
        if (vector.length != 1) {

            int longitudVector = vector.length, n = 2, numeroSublistas = (longitudVector / n), longitudSublista = 0, j, apuntador;
            int[] sublista;

            do {

                apuntador = 0;

                do {
                    longitudSublista = 0;
                    for (int i = apuntador; i < longitudVector; i += numeroSublistas) {
                        longitudSublista++;
                    }
                    sublista = new int[longitudSublista];

                    j = 0;
                    for (int i = apuntador; i < longitudVector; i += numeroSublistas) {
                        sublista[j++] = vector[i];
                    }
                    sublista = ordenarSublista(sublista);

                    j = 0;
                    for (int i = apuntador; i < longitudVector; i += numeroSublistas) {
                        vector[i] = sublista[j++];
                    }
                    apuntador++;

                } while (apuntador < numeroSublistas);

                n *= 2;
                numeroSublistas = (longitudVector / n);

            } while (numeroSublistas >= 1);
        }

        System.out.println("\nVector ordenado");
        for (int i : vector) {
            System.out.println(i);
        }

    }

    //Método de ordenamiento por inserción
    public int[] ordenarSublista(int[] sublista) {

        int j, clave, longitudSublista = sublista.length;

        for (int i = 1; i < longitudSublista; i++) {
            clave = sublista[i];
            j = i - 1;

            while ((j >= 0) && (clave < sublista[j])) {
                sublista[j + 1] = sublista[j];
                j--;
            }

            sublista[j + 1] = clave;
        }

        return sublista;
    }

    public void imprimir(int[] vector) {
        System.out.println("Los valores ordenados son:");
        for (int i : vector) {
            System.out.println(i);
        }
    }

}
