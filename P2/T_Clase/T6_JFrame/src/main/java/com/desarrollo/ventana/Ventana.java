/*
 * JFrame
 */
package com.desarrollo.ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Bryan Andagoya
 */
public class Ventana extends JFrame {

    //Campos
    JPanel panel = new JPanel();

    //Constructor
    public Ventana() {
        //colocar una dimensión a mi ventana
        setSize(500, 500);

        //terminar la ejecución al momento de realizar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //establecer título
        setTitle("Primer ventana");

        //establecer posición
        //setLocation(100, 200);
        //establece posición x,y, / y dimensión de la ventana
//        setBounds(200, 200, 500, 500);
        //posiciona la ventana al centro de la pantalla
        setLocationRelativeTo(null);

        //desactivar redimensión
        setResizable(false);

        //color de fondo
//        getContentPane().setBackground(Color.CYAN);
        //métodos
        iniciarPanel();
    }

    //método Panel
    public void iniciarPanel() {
        //contenedor de todos los componentes
        panel.setBackground(Color.LIGHT_GRAY);
        //establecer gestor de disposición o estilo
        panel.setLayout(null);
        getContentPane().add(panel);
        //método etiqueta
        etiquetas();
    }

    public void etiquetas() {
        //crear etiquetas
        //etiqueta de texto
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola"); //colocar texto en la etiqueta
        etiqueta.setBounds(10, 10, 500, 30); //posición y dimensión de la etiqueta
        etiqueta.setForeground(Color.BLUE); //Color de letra

        //alinear el texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        //tipo de letra y tamaño
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(etiqueta);

        //etiqueta imágen
        JLabel etiquetaImagen = new JLabel();
        ImageIcon sistemas = new ImageIcon("icono.png");
        etiquetaImagen.setBounds(20, 70, 80, 80);
        etiquetaImagen.setIcon(new ImageIcon(sistemas.getImage()
                .getScaledInstance(etiquetaImagen.getWidth(),
                        etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiquetaImagen);
    }

}
