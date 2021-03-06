/**
 * Deber 3 Lenguajes de programación 2 - Calculadora división.
 */
package com.desarrollo.ejercicio2;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bryan
 */
public final class Promedio extends javax.swing.JFrame {

    //Variables
    private Point initialClick;
    private Font titleFont;
    private Font CooperBlack;
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form Calculator
     */
    public Promedio() {

        createFonts();
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("src/main/java/com/desarrollo/images/icon.png")
                .getImage());
        createTable();

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(),
                        getHeight(), 20, 20));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitleBar = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        btn_minimize = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_itsqmetLogo = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_lastname = new javax.swing.JLabel();
        lbl_idNumber = new javax.swing.JLabel();
        lbl_grade1 = new javax.swing.JLabel();
        lbl_grade2 = new javax.swing.JLabel();
        lbl_grade3 = new javax.swing.JLabel();
        txt_grade3 = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_idNumber = new javax.swing.JTextField();
        txt_grade1 = new javax.swing.JTextField();
        txt_grade2 = new javax.swing.JTextField();
        btn_average = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitleBar.setBackground(new java.awt.Color(245, 245, 245));
        jPanelTitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTitleBarMouseDragged(evt);
            }
        });
        jPanelTitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTitleBarMousePressed(evt);
            }
        });

        btn_close.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 149, 5));
        btn_close.setIcon(new ImageIcon("src/main/java/com/desarrollo/images/close.png"));
        btn_close.setBorder(null);
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_close.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_close.setRolloverIcon(new ImageIcon("src/main/java/com/desarrollo/images/closeRollover.png"));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_minimize.setIcon(new ImageIcon("src/main/java/com/desarrollo/images/minimize.png"));
        btn_minimize.setBorder(null);
        btn_minimize.setBorderPainted(false);
        btn_minimize.setContentAreaFilled(false);
        btn_minimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_minimize.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_minimize.setRolloverIcon(new ImageIcon("src/main/java/com/desarrollo/images/minimizeRollover.png"));
        btn_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizeActionPerformed(evt);
            }
        });

        lbl_title.setFont(titleFont);
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Examen Segundo Parcial");

        javax.swing.GroupLayout jPanelTitleBarLayout = new javax.swing.GroupLayout(jPanelTitleBar);
        jPanelTitleBar.setLayout(jPanelTitleBarLayout);
        jPanelTitleBarLayout.setHorizontalGroup(
            jPanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        jPanelTitleBarLayout.setVerticalGroup(
            jPanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanelTitleBarLayout.createSequentialGroup()
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelTitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(665, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_itsqmetLogo.setIcon(new ImageIcon("src/main/java/com/desarrollo/images/ITSQMET_logo.png"));
        jPanel1.add(lbl_itsqmetLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 250, 77));

        lbl_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_name.setText("Nombre:");
        jPanel1.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, -1, 20));

        lbl_lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_lastname.setText("Apellido:");
        jPanel1.add(lbl_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lbl_idNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_idNumber.setText("Cédula:");
        jPanel1.add(lbl_idNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lbl_grade1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_grade1.setText("Calificación 1:");
        jPanel1.add(lbl_grade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lbl_grade2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_grade2.setText("Calificación 2:");
        jPanel1.add(lbl_grade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lbl_grade3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_grade3.setText("Calificación 3:");
        jPanel1.add(lbl_grade3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPanel1.add(txt_grade3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 154, 30));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 154, 30));
        jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 154, 30));
        jPanel1.add(txt_idNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 154, 30));
        jPanel1.add(txt_grade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 154, 30));
        jPanel1.add(txt_grade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 154, 30));

        btn_average.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_average.setText("Calcular Promedio");
        btn_average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_averageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_average, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_data);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 650, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 960, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelTitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleBarMousePressed
        initialClick = evt.getPoint();
        //getComponentAt(initialClick);
    }//GEN-LAST:event_jPanelTitleBarMousePressed

    private void jPanelTitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleBarMouseDragged
        // get location of Window
        int thisX = getLocation().x;
        int thisY = getLocation().y;

        // Determine how much the mouse moved since the initial click
        int xMoved = evt.getX() - initialClick.x;
        int yMoved = evt.getY() - initialClick.y;

        // Move window to this position
        int X = thisX + xMoved;
        int Y = thisY + yMoved;
        setLocation(X, Y);
    }//GEN-LAST:event_jPanelTitleBarMouseDragged

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizeActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeActionPerformed

    private void btn_averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_averageActionPerformed

        String name = txt_name.getText();
        String lastname = txt_lastname.getText();
        String idNumber = txt_idNumber.getText();

        if (name.isEmpty() || lastname.isEmpty() || idNumber.isEmpty()
                || txt_grade1.getText().isEmpty()
                || txt_grade2.getText().isEmpty()
                || txt_grade3.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Información incompleta", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (name.matches("(\\w|ñ)+")) {
                if (lastname.matches("(\\w|ñ)+")) {
                    if (idNumber.matches("\\d{10}")) {
                        if (txt_grade1.getText().matches("\\d+\\.?\\d{0,2}")
                                && txt_grade2.getText().matches("\\d+\\.?\\d{0,2}")
                                && txt_grade3.getText().matches("\\d+\\.?\\d{0,2}")) {

                            try {
                                double grade1
                                        = Double.parseDouble(txt_grade1.getText());

                                double grade2
                                        = Double.parseDouble(txt_grade2.getText());

                                double grade3
                                        = Double.parseDouble(txt_grade3.getText());

                                if ((grade1 >= 0 && grade1 <= 10)
                                        && (grade2 >= 0 && grade2 <= 10)
                                        && (grade3 >= 0 && grade3 <= 10)) {

                                    double average = Math.round(((grade1 + grade2
                                            + grade3) / 3d) * 100d) / 100d;

                                    tableModel.addRow(new Object[]{name, lastname,
                                        idNumber, grade1, grade2, grade3, average});

                                    txt_name.setText("");
                                    txt_lastname.setText("");
                                    txt_idNumber.setText("");
                                    txt_grade1.setText("");
                                    txt_grade2.setText("");
                                    txt_grade3.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(this,
                                            "Calificaciones inválidas", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this,
                                        "Calificaciones inválidas", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this,
                                    "Calificaciones inválidas", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Número de cédula inválido", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Apellido inválido", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Nombre inválido", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btn_averageActionPerformed

    public void createFonts() {

        try {
            CooperBlack = Font.createFont(Font.TRUETYPE_FONT,
                    new File("src/main/java/com/desarrollo/fonts/COOPBL.TTF"));
            titleFont = CooperBlack.deriveFont(Font.BOLD, 20);
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(titleFont);
        } catch (FontFormatException | IOException ex) {
            System.out.println("Font error");
        }
    }

    public void createTable() {
        tbl_data.setModel(tableModel);

        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Cédula");
        tableModel.addColumn("Calificación 1");
        tableModel.addColumn("Calificación 2");
        tableModel.addColumn("Calificación 3");
        tableModel.addColumn("Promedio");
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new Promedio().setVisible(true);
//        });
//
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new Calculator().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_average;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitleBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_grade1;
    private javax.swing.JLabel lbl_grade2;
    private javax.swing.JLabel lbl_grade3;
    private javax.swing.JLabel lbl_idNumber;
    private javax.swing.JLabel lbl_itsqmetLogo;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_grade1;
    private javax.swing.JTextField txt_grade2;
    private javax.swing.JTextField txt_grade3;
    private javax.swing.JTextField txt_idNumber;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
