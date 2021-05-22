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

    //División
    public void division(double num1, double num2) {
        if (num1 == 0 && num2 == 0) {
            System.out.println("INDETERMINACIÓN");
        } else if (num2 == 0) {
            System.out.println("NO EXISTE DIVISIÓN PARA CERO");
        } else {
            resultado = num1 / num2;
            System.out.println("La división es: " + resultado);
        }
    }

    //Multiplicación
    public void multiplicacion(double num1, double num2) {
        resultado = num1 * num2;
        System.out.println("La multiplicación es: " + resultado);
    }

    //Raíz cuadrada
    public void sqrt(double num1) {
        resultado = Math.sqrt(num1);
        System.out.println("La raíz cuadrada es: " + resultado);
    }
}
