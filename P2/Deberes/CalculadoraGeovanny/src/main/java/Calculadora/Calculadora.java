package Calculadora;

import BarSuperior.BarSuperior;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * @author Created by: Geovanny Zambrano <z1705@outlook.com>
 *
 * Date: 15 jul. 2021
 *
 */
public class Calculadora extends JFrame {

    public Calculadora() {
        inciarVentana();
    }

    private void inciarVentana() {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        agregarPanelSecundario();
        configurarBotones();

        this.setVisible(true);
    }

    private void agregarPanelSecundario() {
        panelSecundario.setLayout(new GridBagLayout());
        panelSecundario.setBackground(new Color(Integer.parseInt("00fa9a", 16)));
        conts.insets = new Insets(5, 5, 5, 5);

        conts.weightx = 1.0;
        conts.weighty = 1.0;
        conts.fill = GridBagConstraints.BOTH;

        conts.gridx = 0;
        conts.gridy = 0;
        conts.gridwidth = 4;
        conts.gridheight = 1;
        panelSecundario.add(consolaTexto, conts);

        //Agregar botones primera linea
        conts.gridx = 0;
        conts.gridy = 1;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bBorrarTodo, conts);

        conts.gridx = 1;
        conts.gridy = 1;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bBorrarDigi, conts);

        conts.gridx = 2;
        conts.gridy = 1;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bDividir, conts);

        conts.gridx = 3;
        conts.gridy = 1;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bMultiplicar, conts);

        //Agregar botones segunda linea
        conts.gridx = 0;
        conts.gridy = 2;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bSiete, conts);

        conts.gridx = 1;
        conts.gridy = 2;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bOcho, conts);

        conts.gridx = 2;
        conts.gridy = 2;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bNueve, conts);

        conts.gridx = 3;
        conts.gridy = 2;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bRestar, conts);

        //Agregar botones tercera linea
        conts.gridx = 0;
        conts.gridy = 3;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bCuatro, conts);

        conts.gridx = 1;
        conts.gridy = 3;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bCinco, conts);

        conts.gridx = 2;
        conts.gridy = 3;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bSeis, conts);

        conts.gridx = 3;
        conts.gridy = 3;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bSumar, conts);

        //Agregar botones cuarta linea
        conts.gridx = 0;
        conts.gridy = 4;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bUno, conts);

        conts.gridx = 1;
        conts.gridy = 4;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bDos, conts);

        conts.gridx = 2;
        conts.gridy = 4;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bTres, conts);

        conts.gridx = 3;
        conts.gridy = 4;
        conts.gridwidth = 1;
        conts.gridheight = 2;
        panelSecundario.add(bIgual, conts);

        //Agregar botones cuarta linea
        conts.gridx = 0;
        conts.gridy = 5;
        conts.gridwidth = 2;
        conts.gridheight = 1;
        panelSecundario.add(bCero, conts);

//        conts.gridx = 1;
//        conts.gridy = 5;
//        conts.gridwidth = 1;
//        conts.gridheight = 1;
//        panelSecundario.add(bCero, conts);
        conts.gridx = 2;
        conts.gridy = 5;
        conts.gridwidth = 1;
        conts.gridheight = 1;
        panelSecundario.add(bPi, conts);

//        conts.gridx = 3;
//        conts.gridy = 5;
//        conts.gridwidth = 1;
//        conts.gridheight = 2;
//        panelSecundario.add(bIgual, conts);
        this.add(panelSecundario);
    }

    private void configurarBotones() {

        consolaTexto.setHorizontalAlignment(JTextField.RIGHT);
        consolaTexto.setText("0");

        bCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(0);
            }

        });

        bUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(1);
            }

        });

        bDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(2);
            }

        });

        bTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(3);
            }

        });

        bCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(4);
            }

        });

        bCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(5);
            }

        });

        bSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(6);
            }

        });

        bSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(7);
            }

        });

        bOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(8);
            }

        });

        bNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarValor(9);
            }

        });

        bBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarTodo();
            }
        });

        bBorrarDigi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = consolaTexto.getText();
                if (a.length() > 0) {
                    consolaTexto.setText(a.substring(0, a.length() - 1));
                }
            }
        });

        bSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumar();
            }

        });

        bRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resta();
            }

        });

        bMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicar();
            }

        });

        bDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dividir();
            }

        });

        bIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual(opcion);
            }

        });
    }

    private void sumar() {
        opcion = 1;
        if (!segundoValor.equals("")) {
            igual(opcion);
        }
    }

    private void resta() {
        opcion = 2;
        if (!segundoValor.equals("")) {
            igual(opcion);
        }
    }

    private void multiplicar() {
        opcion = 3;
        if (!segundoValor.equals("")) {
            igual(opcion);
        }
    }

    private void dividir() {
        opcion = 4;
        if (!segundoValor.equals("")) {
            igual(opcion);
        }
    }

    private void igual(int opcion) {
        int resultado = 0;
        int a = Integer.parseInt(primerValor), b = Integer.parseInt(segundoValor);
        switch (opcion) {
            case 1 ->
                resultado = a + b;
            case 2 ->
                resultado = a - b;
            case 3 ->
                resultado = a * b;
            case 4 ->
                resultado = a / b;
        }
        primerValor = "" + resultado;
        segundoValor = "";
        consolaTexto.setText("" + resultado);
    }

    private void agregarValor(int valor) {
        if (opcion == 0) {
            primerValor = primerValor + valor;
            consolaTexto.setText(primerValor);
        } else {
            segundoValor = segundoValor + valor;
            consolaTexto.setText(segundoValor);
        }
    }

    private void borrarTodo() {
        consolaTexto.setText("0");
        primerValor = "";
        segundoValor = "";
        opcion = 0;
    }

    //Tamaño de la ventana
    private final int width = 350;
    private final int height = 500;

    private String primerValor = "";
    private String segundoValor = "";
    private int opcion = 0;

    //Paneles
    private JPanel panelContenedor = new JPanel();
    private BarSuperior panelBar = new BarSuperior(this);
    private JPanel panelSecundario = new JPanel();

    private GridBagConstraints conts = new GridBagConstraints();

    //botones y textFiel
    private JTextField consolaTexto = new JTextField();
    private JButton bBorrarTodo = new JButton("C");
    private JButton bBorrarDigi = new JButton("<<");
    private JButton bDividir = new JButton("/");
    private JButton bMultiplicar = new JButton("*");
    private JButton bRestar = new JButton("-");
    private JButton bSumar = new JButton("+");
    private JButton bIgual = new JButton("=");
    private JButton bPi = new JButton("π");

    private JButton bCero = new JButton("0");
    private JButton bUno = new JButton("1");
    private JButton bDos = new JButton("2");
    private JButton bTres = new JButton("3");
    private JButton bCuatro = new JButton("4");
    private JButton bCinco = new JButton("5");
    private JButton bSeis = new JButton("6");
    private JButton bSiete = new JButton("7");
    private JButton bOcho = new JButton("8");
    private JButton bNueve = new JButton("9");

}
