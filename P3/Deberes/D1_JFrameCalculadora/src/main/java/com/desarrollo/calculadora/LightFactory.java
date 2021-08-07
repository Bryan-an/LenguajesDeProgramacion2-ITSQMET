/*
 * 
 */
package com.desarrollo.calculadora;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Bryan Andagoya
 */
public class LightFactory implements CalculatorFactory {

    //Fields
    JButton button;
    JPanel panel;
    JTextField textField;

    public JButton configureSymbolsButton(JButton button) {
        button.setBackground(new java.awt.Color(234, 254, 255));

        button.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N

        button.setForeground(new java.awt.Color(15, 70, 82));

        button.setIcon(new ImageIcon("src/main/java/com/desarrollo/images/button.png"));

        button.setContentAreaFilled(false);

        button.setFocusPainted(false);

        button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button.setRolloverIcon(new ImageIcon("src/main/java/com/desarrollo/images/button2.png"));

        return button;
    }

    public JButton configureNumbersButton(JButton button) {
        button.setBackground(new Color(234, 254, 255));

        button.setFont(new Font("Cambria Math", 1, 18)); // NOI18N

        button.setForeground(new Color(15, 70, 82));

        return button;
    }

    //Implemented methods
    @Override
    public JButton createButton0() {
        button = new JButton();

        button.setText("0");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton1() {
        JButton button = new JButton();

        button.setText("1");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton2() {
        button = new JButton();

        button.setText("2");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton3() {
        button = new JButton();

        button.setText("3");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton4() {
        button = new JButton();

        button.setText("4");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton5() {
        button = new JButton();

        button.setText("5");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton6() {
        button = new JButton();

        button.setText("6");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton7() {
        button = new JButton();

        button.setText("7");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton8() {
        button = new JButton();

        button.setText("8");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createButton9() {
        button = new JButton();

        button.setText("9");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createDivisionButton() {
        button = new JButton();

        button.setText("÷");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createMultiplicationButton() {
        button = new JButton();

        button.setText("X");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createSubtractionButton() {
        button = new JButton();

        button.setText("-");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createSqrtButton() {
        button = new JButton();

        button.setText("√");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createSumButton() {
        button = new JButton();

        button.setText("+");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createPowButton() {
        button = new JButton();

        button.setText("^");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createEqualButton() {
        button = new JButton();

        button.setText("=");

        return configureSymbolsButton(button);
    }

    @Override
    public JButton createCommaButton() {
        button = new JButton();

        button.setText(",");

        return configureNumbersButton(button);
    }

    @Override
    public JButton createClearButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createThemeButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel createMainPanel() {
        panel = new JPanel();
        panel.setBackground(new java.awt.Color(221, 253, 255));
        panel.setMinimumSize(new java.awt.Dimension(350, 570));
        panel.setPreferredSize(new java.awt.Dimension(350, 570));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        return panel;
    }

    @Override
    public JPanel createTitleBarPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel createScreenPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField createMainScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField createSecondScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
