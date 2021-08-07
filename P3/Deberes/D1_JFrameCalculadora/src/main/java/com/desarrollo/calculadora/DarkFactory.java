/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.calculadora;

import java.awt.*;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Bryan Andagoya
 */
public class DarkFactory implements CalculatorFactory {

    JButton button;
    JPanel panel;

    @Override
    public JButton createButton0() {
        button = new JButton();

        button.setText("s");

        button.setBackground(new Color(234, 254, 45));

        button.setFont(new Font("Cambria Math", 1, 18)); // NOI18N

        button.setForeground(new Color(100, 70, 82));

        return button;
    }

    @Override
    public JButton createButton1() {
        button = new JButton();

        button.setText("1");

        button.setBackground(new Color(100, 5, 45));

        button.setFont(new Font("Cambria Math", 1, 18)); // NOI18N

        button.setForeground(new Color(78, 200, 40));

        return button;
    }

    @Override
    public JButton createButton2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton6() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton8() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createButton9() {
        button = new JButton();

        button.setText("9");

        button.setBackground(new Color(234, 254, 45));

        button.setFont(new Font("Cambria Math", 1, 18)); // NOI18N

        button.setForeground(new Color(100, 70, 82));

        return button;
    }

    @Override
    public JButton createDivisionButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createMultiplicationButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createSubtractionButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createSqrtButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createSumButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createPowButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createEqualButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton createCommaButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        panel.setBackground(new Color(0, 12, 13));
        panel.setMinimumSize(new Dimension(350, 570));
        panel.setPreferredSize(new Dimension(350, 570));
        panel.setLayout(new AbsoluteLayout());

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
