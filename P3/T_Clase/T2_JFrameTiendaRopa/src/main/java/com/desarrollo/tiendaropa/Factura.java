/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.tiendaropa;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan Andagoya
 */
public class Factura extends javax.swing.JFrame {

    DefaultTableModel modeloFactura = new DefaultTableModel();

    /**
     * Creates new form Factura
     */
    public Factura() {
        initComponents();
        setLocationRelativeTo(null);
        jTableFactura.setModel(modeloFactura);

        //agregar columnas
        modeloFactura.addColumn("Detalle");
        modeloFactura.addColumn("Cantidad");
        modeloFactura.addColumn("Precio Unitario");
        modeloFactura.addColumn("Precio Total");
    }

    public void mostrarFactura(JTable jTablaDetalle, String subTotal) {
        for (int i = 0; i < jTablaDetalle.getRowCount(); i++) {
            modeloFactura.addRow(new Object[]{
                jTablaDetalle.getValueAt(i, 0),
                jTablaDetalle.getValueAt(i, 4),
                jTablaDetalle.getValueAt(i, 5),
                jTablaDetalle.getValueAt(i, 6),});
        }
        
        jTxtSubTotal.setText(subTotal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtCedula = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFactura = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTxtSubTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtIva = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("FACTURA N?? ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 20, 150, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Direcci??n:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(44, 209, 67, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("C??dula:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(44, 128, 50, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(44, 169, 40, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(44, 84, 60, 20);

        jTxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtCedula);
        jTxtCedula.setBounds(166, 120, 247, 30);

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtEmail);
        jTxtEmail.setBounds(166, 161, 247, 30);

        jTxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtDireccion);
        jTxtDireccion.setBounds(166, 201, 247, 30);

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtNombre);
        jTxtNombre.setBounds(166, 76, 247, 30);

        jTableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableFactura);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(6, 257, 452, 196);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("IVA 12%:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 530, 59, 20);

        jTxtSubTotal.setEditable(false);
        jTxtSubTotal.setBackground(new java.awt.Color(204, 204, 255));
        jTxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSubTotalActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtSubTotal);
        jTxtSubTotal.setBounds(340, 482, 120, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("SUBTOTAL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 490, 71, 20);

        jTxtTotal.setEditable(false);
        jTxtTotal.setBackground(new java.awt.Color(204, 204, 255));
        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtTotal);
        jTxtTotal.setBounds(340, 562, 120, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("TOTAL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 570, 44, 20);

        jTxtIva.setEditable(false);
        jTxtIva.setBackground(new java.awt.Color(204, 204, 255));
        jTxtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIvaActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtIva);
        jTxtIva.setBounds(340, 522, 120, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 470, 464, 10);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Gracias por su confianza");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(37, 510, 158, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDireccionActionPerformed

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jTxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSubTotalActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jTxtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIvaActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableFactura;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtIva;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtSubTotal;
    private javax.swing.JTextField jTxtTotal;
    // End of variables declaration//GEN-END:variables
}
