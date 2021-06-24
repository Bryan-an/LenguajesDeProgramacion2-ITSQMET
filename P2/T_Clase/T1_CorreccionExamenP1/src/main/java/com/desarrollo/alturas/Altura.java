/*
 * Corrección del examen P1
 */
package com.desarrollo.alturas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bryan
 */
public class Altura {

    ArrayList<Double> alturas = new ArrayList<Double>();

    private double promedio;

    public void agregarAlturas(double altura) {
        alturas.add(altura);
    }

    public void promedioAlturas() {
        promedio = alturas.stream()
                .mapToDouble(altura -> altura)
                .average()
                .getAsDouble();

        System.out.println("Pormedio es: " + String.format("%.2f", promedio));
    }

    public void menorMayorIgualPromedio() {
        int contMayor = 0, contMenor = 0, contIgual = 0;

        for (Double altura : alturas) {
            if (altura > promedio) {
                contMayor++;
            } else if (altura < promedio) {
                contMenor++;
            } else {
                contIgual++;
            }
        }
        System.out.println("Cantidad de alturas mayores al promedio: "
                + contMayor);
        System.out.println("Cantidad de alturas menores al promedio: "
                + contMenor);
        System.out.println("Cantidad de alturas iguales al promedio: "
                + contIgual);
    }

    public void menorMayor() {
//        ArrayList<Double> alturasClonadas = alturas;
        ArrayList<Double> alturasClonadas = new ArrayList<Double>();
        alturasClonadas = (ArrayList<Double>) alturas.clone();

        System.out.println("Alturas ordenadas:");
        Collections.sort(alturasClonadas);

        alturasClonadas.forEach(System.out::println);
    }

    public void alturaMayorMenor() {

    }

    public void imprimirAlturas() {
        System.out.println("\nAlturas");
        alturas.forEach(System.out::println);
    }
}
