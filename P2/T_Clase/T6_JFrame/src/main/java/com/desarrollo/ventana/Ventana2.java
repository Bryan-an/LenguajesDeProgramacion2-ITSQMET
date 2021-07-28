/*
 * JFrame
 */
package com.desarrollo.ventana;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Bryan Andagoya
 */
public final class Ventana2 extends JFrame {

    //Fields
    JPanel panel = new JPanel();

    //constructor
    public Ventana2() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Segunda ventana");
        setLocationRelativeTo(null);
        setResizable(false);
        inciarComponente();
    }

    public void inciarComponente() {
        panel();
        //radioButtons();
        //camposTexto();
        //textArea();
        listaDesplegable();
    }

    public void panel() {
        getContentPane().add(panel);
        panel.setLayout(null); //desactiva el layout
        panel.setBackground(Color.LIGHT_GRAY);
    }

    public void radioButtons() {
        JRadioButton op1 = new JRadioButton("Opción 1", true);
        op1.setBounds(50, 100, 100, 50);
        panel.add(op1);

        JRadioButton op2 = new JRadioButton("Opción 1");
        op2.setBounds(50, 150, 100, 50);
        panel.add(op2);

        //Permite agrupar los radioButtons
        ButtonGroup grupoRadioB = new ButtonGroup();
        grupoRadioB.add(op1);
        grupoRadioB.add(op2);
    }

    public void camposTexto() {
        JTextField nombre = new JTextField();
        nombre.setBounds(50, 50, 100, 30);
        nombre.setText("holaaa");
        System.out.println("Texto: " + nombre.getText()); //obtener el texto del JTextField
        panel.add(nombre);
    }

    public void textArea() {
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 200);
        textArea.append("holaaaaaaa\nes\nuna\nprueba");
        textArea.setEditable(false); //deshabilitar la edición
        System.out.println("TextArea: " + textArea.getText());
        panel.add(textArea);
    }

    public void listaDesplegable() {
        String[] paises = {"Ecuador", "Italia", "Colombia", "Rusia"};
        JComboBox combo = new JComboBox(paises);
        combo.setBounds(50, 50, 150, 30);
        //añadir combo item
        combo.addItem("España");
        panel.add(combo);
    }
}
