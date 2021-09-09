/*
 * City combo box.
 */
package ui.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Bryan Andagoya
 */
public class CustomizedComboBox extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent component) {
        return new CustomizedComboBox();
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = new JButton();
        button.setIcon(Icons.COMBO_BOX_ARROW);
        button.setBorder(null);
        button.setContentAreaFilled(false);
        return button;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(Color.WHITE);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }

    @Override
    protected ListCellRenderer<Object> createRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                list.setSelectionBackground(Color.WHITE);
                return this;
            }

        };
    }

}
