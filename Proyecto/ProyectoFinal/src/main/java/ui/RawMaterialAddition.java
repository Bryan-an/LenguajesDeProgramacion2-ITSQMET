
package ui;

import data.*;
import javax.swing.*;
import domain.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import ui.components.Icons;
import business.Validate;

public class RawMaterialAddition extends javax.swing.JFrame {

    Inventory inventory;
    List<Supplier> suppliers = new ArrayList();
    SupplierDAO supplierDAO;
    RawMaterialDAO rawMaterialDAO;
    Connection conexionTransaccional = null;
    Supplier supplier;
    public static Manager manager;

    java.util.Date fechaIngreso = new java.util.Date();
    java.sql.Date fechaIngresoSQL = null;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public RawMaterialAddition() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        try {
            insertItems();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtExpDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtDetail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBtnAdd = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jCBSuppliers = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSQMET BURGER");
        setIconImage(Icons.FRAME_ICON.getImage());

        jPanel1.setBackground(new java.awt.Color(238, 166, 94));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AÑADIR PRODUCTO DE INVENTARIO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jTxtName.setBackground(new java.awt.Color(253, 243, 146));
        jTxtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Unidad:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID de proveedor:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");

        jTxtPrice.setBackground(new java.awt.Color(253, 243, 146));
        jTxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock:");

        jTxtStock.setBackground(new java.awt.Color(253, 243, 146));
        jTxtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtStockActionPerformed(evt);
            }
        });
        jTxtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtStockKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de caducidad:");

        jTxtExpDate.setBackground(new java.awt.Color(253, 243, 146));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(lb, gl, ud)");

        jTxtDetail.setBackground(new java.awt.Color(253, 243, 146));
        jTxtDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtDetailKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(dd/mm/aaaa)");

        jBtnAdd.setBackground(new java.awt.Color(231, 103, 87));
        jBtnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAdd.setIcon(new ImageIcon("src/main/java/ui/resources/images/Add.png"));
        jBtnAdd.setText("AÑADIR");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnBack.setBackground(new java.awt.Color(231, 103, 87));
        jBtnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtnBack.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBack.setIcon(new ImageIcon("src/main/java/ui/resources/images/Exit.png"));
        jBtnBack.setText("VOLVER");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jCBSuppliers.setBackground(new java.awt.Color(231, 76, 60));
        jCBSuppliers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtName)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        inventory = new Inventory();
        inventory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "PRODUCTO AÑADIDO");
        } else {
            JOptionPane.showMessageDialog(null, "INFORMACIÓN INCOMPLETA");
        }
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jTxtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNameKeyTyped
        Validate.allowLettersAndSpaces(evt);
    }//GEN-LAST:event_jTxtNameKeyTyped

    private void jTxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPriceActionPerformed
        
    }//GEN-LAST:event_jTxtPriceActionPerformed

    private void jTxtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtStockActionPerformed
        
    }//GEN-LAST:event_jTxtStockActionPerformed

    private void jTxtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtStockKeyTyped
        Validate.allowDigits(evt);
    }//GEN-LAST:event_jTxtStockKeyTyped

    private void jTxtDetailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDetailKeyTyped
        Validate.allowLetters(evt);
    }//GEN-LAST:event_jTxtDetailKeyTyped

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
            java.util.logging.Logger.getLogger(RawMaterialAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawMaterialAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawMaterialAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawMaterialAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RawMaterialAddition().setVisible(true);
            }
        });
    }

    public void insertItems() throws SQLException {
        try {
            conexionTransaccional = Connect.getConnection();
            //estado de autocommit
            if (conexionTransaccional.getAutoCommit()) {
                conexionTransaccional.setAutoCommit(false);
            }
            supplierDAO = new SupplierDAO(conexionTransaccional);
            suppliers = supplierDAO.select();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            //revertir la base de datos
            System.out.println("ROLLBACK - BDD");
            try {
                conexionTransaccional.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        for (Supplier supplier1 : suppliers) {
            jCBSuppliers.addItem(supplier1.getName());

        }

    }

    public boolean validateFields() {
        boolean validate = false;
        if (!(jTxtName.getText().equals("")
                || jTxtPrice.getText().equals("")
                || jTxtStock.getText().equals("")
                || jCBSuppliers.getSelectedIndex() == 0
                || jTxtDetail.getText().equals("")
                || jTxtExpDate.getText().equals(""))) {
            supplier();
            try {
                fechaIngreso = df.parse(jTxtExpDate.getText());
                //Clase Date de SQL para que sea compatible
                fechaIngresoSQL = new java.sql.Date(fechaIngreso.getTime());
            } catch (ParseException ex) {
                ex.printStackTrace(System.out);
            }

            RawMaterial rawMaterial = new RawMaterial(jTxtName.getText(), jTxtDetail.getText(),
                    Double.parseDouble(jTxtPrice.getText()), Integer.parseInt(jTxtStock.getText()), fechaIngresoSQL, (long) supplier.getId());

            try {
                conexionTransaccional = Connect.getConnection();
                //estado de autocommit
                if (conexionTransaccional.getAutoCommit()) {
                    conexionTransaccional.setAutoCommit(false);
                }
                rawMaterialDAO = new RawMaterialDAO(conexionTransaccional);
                System.out.println(rawMaterialDAO.insert(rawMaterial));
                
                validate = true;

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                //revertir la base de datos
                System.out.println("ROLLBACK - BDD");
                try {
                    conexionTransaccional.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
                }
            }
            try {
                    conexionTransaccional.commit();
                } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
                }
        }
        return validate;
    }

    public void supplier() {
        for (Supplier supplier1 : suppliers) {
            if (supplier1.getName().equals(jCBSuppliers.getSelectedItem())) {
                supplier = supplier1;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JComboBox<String> jCBSuppliers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtDetail;
    private javax.swing.JTextField jTxtExpDate;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JTextField jTxtStock;
    // End of variables declaration//GEN-END:variables
}