/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.componentesreutilizables;

import java.awt.event.KeyEvent;

/**
 *
 * @author Bryan Andagoya
 */
public class VerificarDatos {

    public void validarNumeros(KeyEvent evt) {
        char validar = evt.getKeyChar(); //capturar cada caracter que se ingrese

        if (Character.isAlphabetic(validar)) {
            //no mostrar en el campo
            evt.consume();
        }
    }

    public void validarLetras(KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (validar >= 33 && validar <= 64
                || validar >= 91 && validar <= 96
                || validar >= 123 && validar <= 126) {

            evt.consume();
        }
    }

    public void validarLetrasNumeros(KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (!Character.isLetterOrDigit(validar)) {
            evt.consume();
        }
    }
}
