/**
 * Deber 1 Lenguajes de programación 2 - Operaciones Aritméticas.
 */
package com.desarrollo.deber1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author bryan
 */
public class Calculator extends javax.swing.JFrame {

    //Variables
    private boolean sqrt = false;
    private Point initialClick;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/java/images/icon.png"));
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_leftParentheses = new javax.swing.JButton();
        btn_rightParentheses = new javax.swing.JButton();
        btn_sqrt = new javax.swing.JButton();
        btn_pow = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_multiplication = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_AC = new javax.swing.JButton();
        btn_DEL = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 254, 255));

        jScrollPane1.setBackground(new java.awt.Color(231, 251, 255));
        jScrollPane1.setBorder(null);

        screen.setBackground(new java.awt.Color(244, 254, 255));
        screen.setFont(new java.awt.Font("Cambria Math", 1, 40)); // NOI18N
        screen.setForeground(new java.awt.Color(29, 83, 94));
        screen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        screen.setText("¡Bienvenid@!");
        screen.setOpaque(true);
        jScrollPane1.setViewportView(screen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, 90));

        jPanel2.setBackground(new java.awt.Color(221, 253, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel2.setLayout(new java.awt.GridLayout(6, 4, 10, 10));

        btn_leftParentheses.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_leftParentheses.setForeground(new java.awt.Color(15, 70, 82));
        btn_leftParentheses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.png"))); // NOI18N
        btn_leftParentheses.setText("(");
        btn_leftParentheses.setFocusPainted(false);
        btn_leftParentheses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_leftParentheses.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button2.png"))); // NOI18N
        btn_leftParentheses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leftParenthesesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_leftParentheses);

        btn_rightParentheses.setBackground(new java.awt.Color(77, 212, 242));
        btn_rightParentheses.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_rightParentheses.setForeground(new java.awt.Color(15, 70, 82));
        btn_rightParentheses.setText(")");
        btn_rightParentheses.setFocusPainted(false);
        btn_rightParentheses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_rightParentheses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rightParenthesesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rightParentheses);

        btn_sqrt.setBackground(new java.awt.Color(77, 212, 242));
        btn_sqrt.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_sqrt.setForeground(new java.awt.Color(15, 70, 82));
        btn_sqrt.setText("√");
        btn_sqrt.setFocusPainted(false);
        btn_sqrt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqrtActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sqrt);

        btn_pow.setBackground(new java.awt.Color(77, 212, 242));
        btn_pow.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_pow.setForeground(new java.awt.Color(15, 70, 82));
        btn_pow.setText("^");
        btn_pow.setFocusPainted(false);
        btn_pow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_powActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pow);

        btn_7.setBackground(new java.awt.Color(242, 251, 253));
        btn_7.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_7.setForeground(new java.awt.Color(15, 70, 82));
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7);

        btn_8.setBackground(new java.awt.Color(242, 251, 253));
        btn_8.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_8.setForeground(new java.awt.Color(15, 70, 82));
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8);

        btn_9.setBackground(new java.awt.Color(242, 251, 253));
        btn_9.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_9.setForeground(new java.awt.Color(15, 70, 82));
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9);

        btn_division.setBackground(new java.awt.Color(77, 212, 242));
        btn_division.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_division.setForeground(new java.awt.Color(15, 70, 82));
        btn_division.setText("÷");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division);

        btn_4.setBackground(new java.awt.Color(242, 251, 253));
        btn_4.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_4.setForeground(new java.awt.Color(15, 70, 82));
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4);

        btn_5.setBackground(new java.awt.Color(242, 251, 253));
        btn_5.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_5.setForeground(new java.awt.Color(15, 70, 82));
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5);

        btn_6.setBackground(new java.awt.Color(242, 251, 253));
        btn_6.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_6.setForeground(new java.awt.Color(15, 70, 82));
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6);

        btn_multiplication.setBackground(new java.awt.Color(77, 212, 242));
        btn_multiplication.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_multiplication.setForeground(new java.awt.Color(15, 70, 82));
        btn_multiplication.setText("x");
        btn_multiplication.setFocusPainted(false);
        btn_multiplication.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicationActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplication);

        btn_1.setBackground(new java.awt.Color(242, 251, 253));
        btn_1.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_1.setForeground(new java.awt.Color(15, 70, 82));
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1);

        btn_2.setBackground(new java.awt.Color(242, 251, 253));
        btn_2.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_2.setForeground(new java.awt.Color(15, 70, 82));
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2);

        btn_3.setBackground(new java.awt.Color(242, 251, 253));
        btn_3.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_3.setForeground(new java.awt.Color(15, 70, 82));
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3);

        btn_minus.setBackground(new java.awt.Color(77, 212, 242));
        btn_minus.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_minus.setForeground(new java.awt.Color(15, 70, 82));
        btn_minus.setText("-");
        btn_minus.setFocusPainted(false);
        btn_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });
        jPanel2.add(btn_minus);

        btn_0.setBackground(new java.awt.Color(242, 251, 253));
        btn_0.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_0.setForeground(new java.awt.Color(15, 70, 82));
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0);

        btn_dot.setBackground(new java.awt.Color(77, 212, 242));
        btn_dot.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(15, 70, 82));
        btn_dot.setText(".");
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot);

        btn_equal.setBackground(new java.awt.Color(77, 212, 242));
        btn_equal.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(15, 70, 82));
        btn_equal.setText("=");
        btn_equal.setFocusPainted(false);
        btn_equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });
        jPanel2.add(btn_equal);

        btn_plus.setBackground(new java.awt.Color(77, 212, 242));
        btn_plus.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_plus.setForeground(new java.awt.Color(15, 70, 82));
        btn_plus.setText("+");
        btn_plus.setFocusPainted(false);
        btn_plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });
        jPanel2.add(btn_plus);

        btn_AC.setBackground(new java.awt.Color(255, 186, 36));
        btn_AC.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        btn_AC.setForeground(new java.awt.Color(15, 70, 82));
        btn_AC.setText("AC");
        btn_AC.setFocusPainted(false);
        btn_AC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ACActionPerformed(evt);
            }
        });
        jPanel2.add(btn_AC);

        btn_DEL.setBackground(new java.awt.Color(255, 186, 36));
        btn_DEL.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        btn_DEL.setForeground(new java.awt.Color(15, 70, 82));
        btn_DEL.setText("DEL");
        btn_DEL.setFocusPainted(false);
        btn_DEL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DELActionPerformed(evt);
            }
        });
        jPanel2.add(btn_DEL);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 450));

        jPanel4.setBackground(new java.awt.Color(221, 253, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_leftParenthesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leftParenthesesActionPerformed
        write("(");
    }//GEN-LAST:event_btn_leftParenthesesActionPerformed

    private void btn_rightParenthesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rightParenthesesActionPerformed
        write(")");
    }//GEN-LAST:event_btn_rightParenthesesActionPerformed

    private void btn_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sqrtActionPerformed
        write("√(");
        sqrt = true;
    }//GEN-LAST:event_btn_sqrtActionPerformed

    private void btn_powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_powActionPerformed
        write("^");
    }//GEN-LAST:event_btn_powActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        write("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        write("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        write("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        write("÷");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        write("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        write("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        write("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicationActionPerformed
        write("x");
    }//GEN-LAST:event_btn_multiplicationActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        write("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        write("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        write("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        write("-");
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        write("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        write(".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        if (screen.getText().isEmpty()
                || screen.getText().equals("¡Error!")
                || screen.getText().equals("¡Bienvenid@!")
                || screen.getText().equals("No existe división para cero")
                || screen.getText().equals("No existe raíz cuadrada de un número negativo")
                || screen.getText().equals("Indeterminación")) {
            screen.setText("");
        } else {
            screen.setForeground(new Color(248, 97, 0));
            screen.setFont(new Font("Cooper Black", Font.BOLD, 25));
            try {
                String result = Equal.calculate(screen.getText()) + "";
                if (result.equalsIgnoreCase("infinity")) {
                    screen.setText("No existe división para cero");
                } else if (result.equalsIgnoreCase("nan") && sqrt == true) {
                    screen.setText("No existe raíz cuadrada de un número negativo");
                } else if (result.equalsIgnoreCase("nan")) {
                    screen.setText("Indeterminación");
                } else {
                    screen.setFont(new Font("Cambria Math", Font.BOLD, 40));
                    screen.setForeground(new Color(29, 83, 94));
                    screen.setText(Equal.calculate(screen.getText()) + "");
                }
            } catch (Exception ex) {
                screen.setText("¡Error!");
            }
        }
        sqrt = false;
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        write("+");
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DELActionPerformed
        if (screen.getText().isEmpty()
                || screen.getText().equals("¡Error!")
                || screen.getText().equals("¡Bienvenid@!")
                || screen.getText().equals("No existe división para cero")
                || screen.getText().equals("No existe raíz cuadrada de un número negativo")
                || screen.getText().equals("Indeterminación")) {
            screen.setText("");
        } else {
            screen.setText(screen.getText().substring(0, (screen.getText().length() - 1)));
        }
    }//GEN-LAST:event_btn_DELActionPerformed

    private void btn_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ACActionPerformed
        screen.setText("");
    }//GEN-LAST:event_btn_ACActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        initialClick = evt.getPoint();
        getComponentAt(initialClick);
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
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
    }//GEN-LAST:event_jPanel4MouseDragged

    /**
     * Method that write the sysmbols and numbers.
     *
     * @param buttonValue Button value.
     */
    private void write(String buttonValue) {
        screen.setFont(new Font("Cambria Math", Font.BOLD, 40));
        screen.setForeground(new Color(29, 83, 94));
        if (screen.getText().isEmpty()
                || screen.getText().equals("¡Error!")
                || screen.getText().equals("¡Bienvenid@!")
                || screen.getText().equals("No existe división para cero")
                || screen.getText().equals("No existe raíz cuadrada de un número negativo")
                || screen.getText().equals("Indeterminación")) {
            screen.setText(buttonValue);
        } else {
            screen.setText(screen.getText() + buttonValue);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_AC;
    private javax.swing.JButton btn_DEL;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_leftParentheses;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_multiplication;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_pow;
    private javax.swing.JButton btn_rightParentheses;
    private javax.swing.JButton btn_sqrt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel screen;
    // End of variables declaration//GEN-END:variables
}
