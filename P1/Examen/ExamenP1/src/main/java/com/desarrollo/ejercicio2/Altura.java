/*
 * 
 */
package com.desarrollo.ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Altura<E> extends ArrayList<E> {

    //Fields
    private double promedio;
    private int mayorPromedio;
    private int menorPromedio;
    private int igualPromedio;
    private double alturaMayor = 0;
    private double alturaMenor;

    //Getters y setters
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getMayorPromedio() {
        return mayorPromedio;
    }

    public void setMayorPromedio(int mayorPromedio) {
        this.mayorPromedio = mayorPromedio;
    }

    public int getMenorPromedio() {
        return menorPromedio;
    }

    public void setMenorPromedio(int menorPromedio) {
        this.menorPromedio = menorPromedio;
    }

    public int getIgualPromedio() {
        return igualPromedio;
    }

    public void setIgualPromedio(int igualPromedio) {
        this.igualPromedio = igualPromedio;
    }

    public double getAlturaMayor() {
        return alturaMayor;
    }

    public void setAlturaMayor(double alturaMayor) {
        this.alturaMayor = alturaMayor;
    }

    public double getAlturaMenor() {
        return alturaMenor;
    }

    public void setAlturaMenor(double alturaMenor) {
        this.alturaMenor = alturaMenor;
    }

    //Métodos 
    public void calcularPromedio() {
        double suma = 0;
        alturaMayor = (double) super.get(0);
        alturaMenor = (double) super.get(0);

        for (E altura : this) {
            suma += (double) altura;
            if ((double) altura > alturaMayor) {
                alturaMayor = (double) altura;
            }
            if ((double) altura < alturaMenor) {
                alturaMenor = (double) altura;
            }

        }

        promedio = suma / super.size();
    }

    public void determinarAlturas() {
        calcularPromedio();

        mayorPromedio = 0;
        igualPromedio = 0;
        menorPromedio = 0;

        this.forEach(altura -> {
            if ((double) altura > promedio) {
                mayorPromedio++;
            } else if ((double) altura < promedio) {
                menorPromedio++;
            } else {
                igualPromedio++;
            }
        });
    }

}
