/**
 * Created by Bryan on 29/04/2021
 */
package com.desarrollo.introduccion;

/**
 *
 * @author bryan
 */
public class Persona {

    //clases plantilla
    String nombre;
    String direccion;
    int edad;
    double estatura;

    //métodos - acciones
    //método void
    public void informacion() {
        System.out.println("INFORMACIÓN PERSONA");
        System.out.println("Nombre: " + nombre + "\n"
                + "Dirección: " + direccion + "\n"
                + "Edad: " + edad + "\n"
                + "Estatura: " + estatura);
    }
}
