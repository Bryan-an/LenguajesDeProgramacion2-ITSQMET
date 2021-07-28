/*
 * JFrame
 */
package com.desarrollo.ventana;

import javax.swing.SwingUtilities;

/**
 *
 * @author Bryan Andagoya
 */
public class ClaseEjecutableVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
//            new Ventana().setVisible(true);

            //instanciar la clase
            Ventana ventana = new Ventana();
            //ventana visible
            ventana.setVisible(true);
        });
    }
    
}
