/**
 * Created by Bryan on 29/04/2021
 */
package com.desarrollo.operaciones;

/**
 *
 * @author bryan
 */
public class Operaciones {

    //Atributos
    double num1, num2, resultado;

    //Métodos
    //Métodos void - método return
    //Método void: no retorna ningún valor
    //Parámetros: datos que se van a recibir de otra clase, y serán utilizados en el método
    public void sumaVoid(double num1, double num2) {
        resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    //Método return: retorna un valor
    public double sumaReturn(double num1, double num2) {
        resultado = num1 + num2;
        return resultado;
    }

    //Resta
    public void resta(double num1, double num2) {
        resultado = num1 - num2;
        System.out.println("La resta es: " + resultado);
    }

    //Potencia
    public void potencia(double base, double exponente) {
        resultado = Math.pow(base, exponente);
        System.out.println("La potencia es: " + resultado);
    }
}
