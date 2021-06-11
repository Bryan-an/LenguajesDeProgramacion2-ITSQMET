/*
Constructor
 */
package com.desarrollo.constructor;

/**
 *
 * @author bryan
 */
public class Empleado {

    //Atributos
    private String nombre;
    private String codigo;
    private int horasT;
    private double valorH;
    private double sueldo;

    //Constructor
    public Empleado(String argNombre, String argCodigo, int argHorasT) {
        nombre = argNombre;
        codigo = argCodigo;
        horasT = argHorasT;
        valorH = 10;
    }

    //Métodos
    @Override
    public String toString() {
        return "\nInformación Empleado:\nNombre: " + nombre + "\nCódigo: "
                + codigo + "\nHoras trabajadas: " + horasT + "\nValor por hora: "
                + valorH;
    }

    public void calcularSueldo() {
        //variable local
        sueldo = horasT * valorH;
        descuento();
        System.out.println("El sueldo es: " + sueldo);
    }

    //Método descuento
    //depende horasT menores 80 --> descuento del 5% al sueldo total
    public void descuento() {
        if (horasT < 80) {
            sueldo *= 0.95;
            System.out.println("Ha recibido un descuento de 5%");
        } else {
            System.out.println("Usted no ha recibido ningún descuento");
        }
    }
}
