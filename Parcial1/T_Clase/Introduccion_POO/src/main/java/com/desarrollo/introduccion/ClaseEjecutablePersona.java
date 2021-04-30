/**
 * Created by Bryan on 29/04/2021
 */
package com.desarrollo.introduccion;

/**
 *
 * @author bryan
 */
public class ClaseEjecutablePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear objeto - asignar la referencia de la clase
        //Instanciar la clase
        Persona pers1 = new Persona();

        pers1.nombre = "Andres";
        pers1.direccion = "El Condado";
        pers1.edad = 34;
        pers1.estatura = 1.20;

        //llamar método - void
        pers1.informacion();

        //Crear otra instacia-objeto
        Persona pers2 = new Persona();

        pers2.nombre = "Adrian";
        pers2.edad = 23;

        pers2.informacion();
    }

}
