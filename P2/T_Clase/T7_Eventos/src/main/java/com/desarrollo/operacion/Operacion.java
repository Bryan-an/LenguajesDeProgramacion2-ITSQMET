/*
 * Eventos
 */
package com.desarrollo.operacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Bryan Andagoya
 */
public final class Operacion extends JFrame {

    JPanel panel;
    JButton botonSuma;
    JLabel num1;
    JLabel num2;
    JTextField campoNum1;
    JTextField campoNum2;

    //constructor
    public Operacion() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Operación");
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        panel();
        etiquetas();
        camposTexto();
        botonSuma();
        resultado();
    }

    public void panel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel); //añadir el panel al JFrame
    }

    public void etiquetas() {
        JLabel titulo = new JLabel();
        titulo.setText("Operación Suma");
        titulo.setBounds(0, 10, 300, 50);
        titulo.setForeground(Color.MAGENTA);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Calibri", Font.BOLD, 25));
        panel.add(titulo);

        //etiquetas números
        num1 = new JLabel();
        num1.setText("Número 1");
        num1.setBounds(30, 60, 60, 30);
        num1.setFont(new Font("Calibri", Font.BOLD, 12));
        panel.add(num1);

        num2 = new JLabel();
        num2.setText("Número 2");
        num2.setBounds(30, 95, 60, 30);
        num2.setFont(new Font("Calibri", Font.BOLD, 12));
        panel.add(num2);
    }

    public void camposTexto() {
        campoNum1 = new JTextField();
        campoNum1.setBounds(90, 63, 150, 20);
        panel.add(campoNum1);

        campoNum2 = new JTextField();
        campoNum2.setBounds(90, 98, 150, 20);
        panel.add(campoNum2);
    }

    public void botonSuma() {
        botonSuma = new JButton();
        botonSuma.setText("Sumar");
        botonSuma.setBounds(93, 140, 100, 25);
        panel.add(botonSuma);
    }

    public void resultado() {
        JTextField resultado = new JTextField();
        resultado.setBounds(75, 190, 140, 25);
        resultado.setEditable(false);
        resultado.setHorizontalAlignment(SwingConstants.CENTER);
        resultado.setFont(new Font("Calibri", Font.BOLD, 15));
        panel.add(resultado);

        //Agregar el evento
        ActionListener suma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //capturar los datos de los campos números
                double num1Double = Double.parseDouble(campoNum1.getText());
                double num2Double = Double.parseDouble(campoNum2.getText());
                double resultadoSuma = num1Double + num2Double;

                //resultado.setText(Double.toString(resultadoSuma));
                //resultado.setText("La suma es: " + resultadoSuma);
                resultado.setText(resultadoSuma + "");
            }
        };

        botonSuma.addActionListener(suma);
    }
}
