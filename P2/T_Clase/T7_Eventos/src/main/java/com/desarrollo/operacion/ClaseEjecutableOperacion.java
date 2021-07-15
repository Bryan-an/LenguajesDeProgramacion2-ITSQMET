/*
 * Eventos
 */
package com.desarrollo.operacion;

import javax.swing.SwingUtilities;

/**
 *
 * @author Bryan Andagoya
 */
public class ClaseEjecutableOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Operacion op = new Operacion();
            op.setVisible(true);
        });

    }

}
