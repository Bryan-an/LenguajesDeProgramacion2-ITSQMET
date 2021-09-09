package ui;

import data.RawMaterialDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import domain.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import data.Connect;
import ui.components.Icons;
import business.ColorTableData;

public class Inventory extends javax.swing.JFrame {

    //ventana padre
    ManagerMenu menu;
    //ventanas hijas
    ContactSupplier contact;
    RawMaterialAddition rMAdd;

    DefaultTableModel modelInventory = new DefaultTableModel();
    List<RawMaterial> rawMaterials = new ArrayList();
    java.util.Date fechaIngreso = new java.util.Date();
    java.sql.Date fechaIngresoSQL = null;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    RawMaterialDAO rawMaterialDAO;
    Connection conexionTransaccional = null;
    public static Manager manager;

    public Inventory() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //rawMaterials = rawMaterialList();
        jTableRawMaterial.setModel(modelInventory);
        //agregar columnas
        modelInventory.addColumn("Código");
        modelInventory.addColumn("Producto");
        modelInventory.addColumn("Precio Unitario");
        modelInventory.addColumn("Stock ");
        modelInventory.addColumn("Detalle");
        modelInventory.addColumn("Fecha de Caducidad");
        showRawMaterials();
        columnColor();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRawMaterial = new javax.swing.JTable();
        jBtnBack = new javax.swing.JButton();
        jBtnContactSupplier = new javax.swing.JButton();
        jBtnRawMatAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSQMET BURGER");
        setIconImage(Icons.FRAME_ICON.getImage());

        jPanel1.setBackground(new java.awt.Color(238, 166, 94));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon("src/main/java/ui/resources/images/Inventory.png"));
        jLabel1.setText("INVENTARIO");

        jTableRawMaterial.setBackground(new java.awt.Color(255, 243, 146));
        jTableRawMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableRawMaterial);

        jBtnBack.setBackground(new java.awt.Color(255, 103, 87));
        jBtnBack.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBack.setIcon(new ImageIcon("src/main/java/ui/resources/images/Exit.png"));
        jBtnBack.setText("VOLVER");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jBtnContactSupplier.setBackground(new java.awt.Color(255, 103, 87));
        jBtnContactSupplier.setForeground(new java.awt.Color(255, 255, 255));
        jBtnContactSupplier.setIcon(new ImageIcon("src/main/java/ui/resources/images/Order.png"));
        jBtnContactSupplier.setText("CONTACTAR PROVEEDOR");
        jBtnContactSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnContactSupplierActionPerformed(evt);
            }
        });

        jBtnRawMatAdd.setBackground(new java.awt.Color(255, 103, 87));
        jBtnRawMatAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRawMatAdd.setIcon(new ImageIcon("src/main/java/ui/resources/images/Add.png"));
        jBtnRawMatAdd.setText("AÑADIR PRODUCTO");
        jBtnRawMatAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRawMatAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(86, 86, 86)
                            .addComponent(jBtnRawMatAdd)
                            .addGap(18, 18, 18)
                            .addComponent(jBtnContactSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnContactSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRawMatAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        this.dispose();
        menu = new ManagerMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnContactSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnContactSupplierActionPerformed
        ContactSupplier.manager=this.manager;
        contact=new ContactSupplier();
        //contact.supplierList();
        contact.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jBtnContactSupplierActionPerformed

    private void jBtnRawMatAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRawMatAddActionPerformed
        RawMaterialAddition.manager=this.manager;
        rMAdd =new RawMaterialAddition();
        rMAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRawMatAddActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }


    public void showRawMaterials() {
        try {
            conexionTransaccional = Connect.getConnection();
            //estado de autocommit
            if (conexionTransaccional.getAutoCommit()) {
                conexionTransaccional.setAutoCommit(false);
            }
            rawMaterialDAO = new RawMaterialDAO(conexionTransaccional);
            rawMaterials=rawMaterialDAO.select();
            conexionTransaccional.commit();
            
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
        for (RawMaterial rawMAterial : rawMaterials) {
            modelInventory.addRow(new Object[]{
                rawMAterial.getId(),
                rawMAterial.getName(),
                rawMAterial.getPrice(),
                rawMAterial.getQuantity(),
                rawMAterial.getDescription(),
                rawMAterial.getBestBy()});
        }

    }
    

    public void columnColor() {
        ColorTableData color=new ColorTableData(3);
        jTableRawMaterial.getColumnModel().getColumn(3).setCellRenderer(color);
        
    }

    public List<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }

    public void setRawMaterials(ArrayList<RawMaterial> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnContactSupplier;
    private javax.swing.JButton jBtnRawMatAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRawMaterial;
    // End of variables declaration//GEN-END:variables
}
