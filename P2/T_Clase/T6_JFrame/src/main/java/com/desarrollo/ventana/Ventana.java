/*
 * JFrame
 */
package com.desarrollo.ventana;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Bryan Andagoya
 */
public class Ventana extends JFrame {

    //Campos
    JPanel panel = new JPanel();
    Ventana2 ventana2 = new Ventana2();

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
        botones();
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

    //botones
    public void botones() {
        JButton boton = new JButton();
        boton.setText("Ingresar");
        boton.setBounds(300, 400, 100, 30);
        boton.setForeground(Color.RED);
        //boton.setEnabled(false); //desabilitar el botón
        boton.setFont(new Font("Calibri", Font.BOLD, 15));
        //Acción - evento
//        boton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ventana2.setVisible(true);
//            }
//        });
        boton.addActionListener(e -> {
            ventana2.setVisible(true);
            dispose();  //cierra la ventana 1
        });

        panel.add(boton);

        JButton botonImagen = new JButton();
        botonImagen.setBounds(100, 400, 140, 30); //x, y, ancho, alto
        ImageIcon imagen = new ImageIcon("iconoherramienta.jpg");
        botonImagen.setIcon(new ImageIcon(imagen.getImage()
                .getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        botonImagen.setText("Configuración");
        panel.add(botonImagen);
    }
}
