/*
 * Corrección del deber 1: HashMap y Excepciones
 */
package com.desarrollo.parqueadero;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Bryan Andagoya
 */
public class Parqueadero {

    HashMap<Integer, String> parqueadero = new HashMap<Integer, String>();

    public Parqueadero() {
        generarEspacios();
    }

    //generar espacios
    public void generarEspacios() {
        for (int i = 1; i <= 10; i++) {
            parqueadero.put(i, "");
        }

        System.out.println("Espacios generados");
    }

    //método agregar vehículo
    public void agregarVehiculo(int espacio, String placa) {

        if (parqueadero.containsKey(espacio)) {

            if (!parqueadero.containsValue(placa)) {
                //Método que toma el valor a partir de la clave
                if (parqueadero.get(espacio).equals("")) {
                    parqueadero.put(espacio, placa);
                    System.out.println("Vehículo agregado");
                } else {
                    System.out.println("Espacio ocupado");
                }
            } else {
                System.out.println("La placa ya existe");
            }

        } else {
            System.out.println("Ese espacio no existe (1-10)");
        }
    }

    public void removerVehiculo(String placa) {
        if (parqueadero.containsValue(placa)) {
            parqueadero.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().equals(placa))
                    .forEach(entry -> parqueadero.replace(entry.getKey(), placa));

            System.out.println("Vehículo retirado");

//            parqueadero.entrySet().stream().filter(retirar -> (retirar.getValue().equals(placa))).forEachOrdered(retirar -> {
//                parqueadero.replace(retirar.getKey(), "");
//                    System.out.println("Vehículo retirado");
//            });
        } else {
            System.out.println("No existe la placa");
        }
    }

    public void removerVehiculo(int espacio) {
        if (parqueadero.containsKey(espacio)) {
            parqueadero.put(espacio, "");
        } else {
            System.out.println("");
        }
    }

    public void mostrarEspacios() {
        System.out.println("");
        System.out.println("Espacios disponibles");
        System.out.println("Espacio \t Vehículo");

        for (Map.Entry<Integer, String> espacio : parqueadero.entrySet()) {
            System.out.println("  " + espacio.getKey() + "\t\t"
                    + espacio.getValue());
        }
    }
}
