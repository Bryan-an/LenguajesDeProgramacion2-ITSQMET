package ui;
//new ImageIcon("src/main/java/ui/resources/images/ListIcon2.png")
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import domain.Product;
import java.sql.*;
import data.*;
import domain.Customer;
import java.util.*;
import ui.components.Icons;

public class CustomerMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMenu
     */
    public static double valorNeto = 0;
    public static Customer customer;
     HashMap<Product,Integer> productsHM=new HashMap<Product,Integer>();
    //

    DefaultTableModel model = new DefaultTableModel();
    List<Product> products = new ArrayList();
    Connection conexionTransaccional = null;
    CustomerInvoice invoice;

    public CustomerMenu() {
        initComponents();
        loadProducts();
        loadMenuProducts();
        setLocationRelativeTo(null);
        setResizable(false);

        this.jTableDetail.setModel(model);
        //agregar título columnas
        model.addColumn("CANTIDAD");
        model.addColumn("DETALLE");
        model.addColumn("PRECIO UNIT");
        model.addColumn("PRECIO");
    }
    public void fillProductHM(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLSimple = new javax.swing.JLabel();
        jLMexican = new javax.swing.JLabel();
        jLSpecial = new javax.swing.JLabel();
        jLHawaiian = new javax.swing.JLabel();
        jLHalfPound = new javax.swing.JLabel();
        jLCriolla = new javax.swing.JLabel();
        jLItalian = new javax.swing.JLabel();
        jLStreet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLSoda = new javax.swing.JLabel();
        jLMilkShake = new javax.swing.JLabel();
        jLJuice = new javax.swing.JLabel();
        jLWater = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLIceCream = new javax.swing.JLabel();
        jLSundae = new javax.swing.JLabel();
        jLCake = new javax.swing.JLabel();
        jLBrownie = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLFries = new javax.swing.JLabel();
        jLOnion = new javax.swing.JLabel();
        jLNachos = new javax.swing.JLabel();
        jLYucas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetail = new javax.swing.JTable();
        jBtnRemove = new javax.swing.JButton();
        jBtnMakeOrder = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSQMET BURGER");
        setBackground(new java.awt.Color(238, 166, 94));
        setIconImage(Icons.FRAME_ICON.getImage());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(238, 166, 94));

        jLSimple.setBackground(new java.awt.Color(255, 255, 255));
        jLSimple.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLSimple.setForeground(new java.awt.Color(255, 255, 255));
        jLSimple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSimple.setText("SIMPLE");
        jLSimple.setToolTipText("Una sola carne");
        jLSimple.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLSimple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSimple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSimpleMouseClicked(evt);
            }
        });

        jLMexican.setBackground(new java.awt.Color(255, 255, 255));
        jLMexican.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLMexican.setForeground(new java.awt.Color(255, 255, 255));
        jLMexican.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMexican.setText("SIMPLE");
        jLMexican.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLMexican.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMexican.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMexicanMouseClicked(evt);
            }
        });

        jLSpecial.setBackground(new java.awt.Color(255, 255, 255));
        jLSpecial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLSpecial.setForeground(new java.awt.Color(255, 255, 255));
        jLSpecial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSpecial.setText("SIMPLE");
        jLSpecial.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLSpecial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSpecial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSpecialMouseClicked(evt);
            }
        });

        jLHawaiian.setBackground(new java.awt.Color(255, 255, 255));
        jLHawaiian.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLHawaiian.setForeground(new java.awt.Color(255, 255, 255));
        jLHawaiian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHawaiian.setText("SIMPLE");
        jLHawaiian.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLHawaiian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLHawaiian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLHawaiianMouseClicked(evt);
            }
        });

        jLHalfPound.setBackground(new java.awt.Color(255, 255, 255));
        jLHalfPound.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLHalfPound.setForeground(new java.awt.Color(255, 255, 255));
        jLHalfPound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHalfPound.setText("SIMPLE");
        jLHalfPound.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLHalfPound.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLHalfPound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLHalfPoundMouseClicked(evt);
            }
        });

        jLCriolla.setBackground(new java.awt.Color(255, 255, 255));
        jLCriolla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLCriolla.setForeground(new java.awt.Color(255, 255, 255));
        jLCriolla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCriolla.setText("SIMPLE");
        jLCriolla.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLCriolla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCriolla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCriollaMouseClicked(evt);
            }
        });

        jLItalian.setBackground(new java.awt.Color(255, 255, 255));
        jLItalian.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLItalian.setForeground(new java.awt.Color(255, 255, 255));
        jLItalian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLItalian.setText("SIMPLE");
        jLItalian.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLItalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLItalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLItalianMouseClicked(evt);
            }
        });

        jLStreet.setBackground(new java.awt.Color(255, 255, 255));
        jLStreet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLStreet.setForeground(new java.awt.Color(255, 255, 255));
        jLStreet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLStreet.setText("SIMPLE");
        jLStreet.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLStreet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLStreet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLStreetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLHalfPound, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLCriolla, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLItalian, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLHawaiian, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLMexican, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHawaiian, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMexican, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHalfPound, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCriolla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLItalian, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HAMBURGUESAS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(238, 166, 94));
        jPanel2.setForeground(new java.awt.Color(238, 166, 94));

        jLSoda.setBackground(new java.awt.Color(255, 255, 255));
        jLSoda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLSoda.setForeground(new java.awt.Color(255, 255, 255));
        jLSoda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSoda.setText("SIMPLE");
        jLSoda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLSoda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSoda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSodaMouseClicked(evt);
            }
        });

        jLMilkShake.setBackground(new java.awt.Color(255, 255, 255));
        jLMilkShake.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLMilkShake.setForeground(new java.awt.Color(255, 255, 255));
        jLMilkShake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMilkShake.setText("SIMPLE");
        jLMilkShake.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLMilkShake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMilkShake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMilkShakeMouseClicked(evt);
            }
        });

        jLJuice.setBackground(new java.awt.Color(255, 255, 255));
        jLJuice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLJuice.setForeground(new java.awt.Color(255, 255, 255));
        jLJuice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLJuice.setText("SIMPLE");
        jLJuice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLJuice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLJuice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLJuiceMouseClicked(evt);
            }
        });

        jLWater.setBackground(new java.awt.Color(255, 255, 255));
        jLWater.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLWater.setForeground(new java.awt.Color(255, 255, 255));
        jLWater.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLWater.setText("SIMPLE");
        jLWater.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLWater.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLWater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLWaterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLSoda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLWater, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSoda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLWater, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BEBIDAS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(238, 166, 94));

        jLIceCream.setBackground(new java.awt.Color(255, 255, 255));
        jLIceCream.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLIceCream.setForeground(new java.awt.Color(255, 255, 255));
        jLIceCream.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIceCream.setText("SIMPLE");
        jLIceCream.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLIceCream.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLIceCream.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLIceCreamMouseClicked(evt);
            }
        });

        jLSundae.setBackground(new java.awt.Color(255, 255, 255));
        jLSundae.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLSundae.setForeground(new java.awt.Color(255, 255, 255));
        jLSundae.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSundae.setText("SIMPLE");
        jLSundae.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLSundae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSundae.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSundaeMouseClicked(evt);
            }
        });

        jLCake.setBackground(new java.awt.Color(255, 255, 255));
        jLCake.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLCake.setForeground(new java.awt.Color(255, 255, 255));
        jLCake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCake.setText("SIMPLE");
        jLCake.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLCake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCakeMouseClicked(evt);
            }
        });

        jLBrownie.setBackground(new java.awt.Color(255, 255, 255));
        jLBrownie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLBrownie.setForeground(new java.awt.Color(255, 255, 255));
        jLBrownie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBrownie.setText("SIMPLE");
        jLBrownie.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLBrownie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBrownie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBrownieMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLSundae, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLCake, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSundae, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("POSTRES", jPanel3);

        jPanel5.setBackground(new java.awt.Color(238, 166, 94));

        jLFries.setBackground(new java.awt.Color(255, 255, 255));
        jLFries.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFries.setForeground(new java.awt.Color(255, 255, 255));
        jLFries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFries.setText("SIMPLE");
        jLFries.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLFries.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLFries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLFriesMouseClicked(evt);
            }
        });

        jLOnion.setBackground(new java.awt.Color(255, 255, 255));
        jLOnion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLOnion.setForeground(new java.awt.Color(255, 255, 255));
        jLOnion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOnion.setText("SIMPLE");
        jLOnion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLOnion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLOnion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLOnionMouseClicked(evt);
            }
        });

        jLNachos.setBackground(new java.awt.Color(255, 255, 255));
        jLNachos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLNachos.setForeground(new java.awt.Color(255, 255, 255));
        jLNachos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNachos.setText("SIMPLE");
        jLNachos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLNachos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLNachos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLNachosMouseClicked(evt);
            }
        });

        jLYucas.setBackground(new java.awt.Color(255, 255, 255));
        jLYucas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLYucas.setForeground(new java.awt.Color(255, 255, 255));
        jLYucas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLYucas.setText("SIMPLE");
        jLYucas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLYucas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLYucas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLYucasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLFries, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLOnion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLYucas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFries, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLOnion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLYucas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ACOMPAÑANTES", jPanel5);

        jPanel4.setBackground(new java.awt.Color(238, 166, 94));

        jTableDetail.setBackground(new java.awt.Color(253, 243, 146));
        jTableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableDetail);

        jBtnRemove.setBackground(new java.awt.Color(255, 103, 87));
        jBtnRemove.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBtnRemove.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRemove.setIcon(new ImageIcon("src/main/java/ui/resources/images/Delete.png"));
        jBtnRemove.setText("QUITAR");
        jBtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoveActionPerformed(evt);
            }
        });

        jBtnMakeOrder.setBackground(new java.awt.Color(255, 103, 87));
        jBtnMakeOrder.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBtnMakeOrder.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMakeOrder.setIcon(new ImageIcon("src/main/java/ui/resources/images/Order.png"));
        jBtnMakeOrder.setText("REALIZAR PEDIDO");
        jBtnMakeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMakeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnMakeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBtnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnMakeOrder)))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLSimpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSimpleMouseClicked
        addProductRow(jLSimple);

    }//GEN-LAST:event_jLSimpleMouseClicked

    private void jLSpecialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSpecialMouseClicked
        addProductRow(jLSpecial);
    }//GEN-LAST:event_jLSpecialMouseClicked

    private void jLSodaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSodaMouseClicked
        addProductRow(jLSoda);
    }//GEN-LAST:event_jLSodaMouseClicked

    private void jLIceCreamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLIceCreamMouseClicked
        addProductRow(jLIceCream);
    }//GEN-LAST:event_jLIceCreamMouseClicked

    private void jLFriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFriesMouseClicked
        addProductRow(jLFries);
    }//GEN-LAST:event_jLFriesMouseClicked

    private void jBtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoveActionPerformed
        removeProduct();
    }//GEN-LAST:event_jBtnRemoveActionPerformed

    private void jBtnMakeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMakeOrderActionPerformed
        CustomerInvoice.customer = this.customer;
        CustomerInvoice.productsHM=this.productsHM;
        invoice = new CustomerInvoice();
        total();
        invoice.setVisible(true);
        invoice.showInvoice(jTableDetail, valorNeto);
        dispose();
    }//GEN-LAST:event_jBtnMakeOrderActionPerformed

    private void jLHawaiianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLHawaiianMouseClicked
        addProductRow(jLHawaiian);
    }//GEN-LAST:event_jLHawaiianMouseClicked

    private void jLMexicanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMexicanMouseClicked
        addProductRow(jLMexican);
    }//GEN-LAST:event_jLMexicanMouseClicked

    private void jLHalfPoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLHalfPoundMouseClicked
        addProductRow(jLHalfPound);
    }//GEN-LAST:event_jLHalfPoundMouseClicked

    private void jLCriollaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCriollaMouseClicked
        addProductRow(jLCriolla);
    }//GEN-LAST:event_jLCriollaMouseClicked

    private void jLItalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLItalianMouseClicked
        addProductRow(jLItalian);
    }//GEN-LAST:event_jLItalianMouseClicked

    private void jLStreetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLStreetMouseClicked
        addProductRow(jLStreet);
    }//GEN-LAST:event_jLStreetMouseClicked

    private void jLMilkShakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMilkShakeMouseClicked
        addProductRow(jLMilkShake);
    }//GEN-LAST:event_jLMilkShakeMouseClicked

    private void jLJuiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLJuiceMouseClicked
        addProductRow(jLJuice);
    }//GEN-LAST:event_jLJuiceMouseClicked

    private void jLWaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLWaterMouseClicked
        addProductRow(jLWater);
    }//GEN-LAST:event_jLWaterMouseClicked

    private void jLSundaeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSundaeMouseClicked
        addProductRow(jLSundae);
    }//GEN-LAST:event_jLSundaeMouseClicked

    private void jLCakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCakeMouseClicked
        addProductRow(jLCake);
    }//GEN-LAST:event_jLCakeMouseClicked

    private void jLBrownieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBrownieMouseClicked
        addProductRow(jLBrownie);
    }//GEN-LAST:event_jLBrownieMouseClicked

    private void jLOnionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLOnionMouseClicked
        addProductRow(jLOnion);
    }//GEN-LAST:event_jLOnionMouseClicked

    private void jLNachosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLNachosMouseClicked
        addProductRow(jLNachos);
    }//GEN-LAST:event_jLNachosMouseClicked

    private void jLYucasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLYucasMouseClicked
        addProductRow(jLYucas);
    }//GEN-LAST:event_jLYucasMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    public void loadProducts() {
        try {
            conexionTransaccional = Connect.getConnection();
            //estado de autocommit
            if (conexionTransaccional.getAutoCommit()) {
                conexionTransaccional.setAutoCommit(false);
            }
            ProductDAO productDAO = new ProductDAO(conexionTransaccional);
            products = productDAO.select();
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
    }

    public void addProductRow(JLabel productLabel) {
        System.out.println(productLabel.getText());
        for (Product product : products) {
            if (productLabel.getText().equals(product.getName() + " $" + String.format("%.2f", product.getPrice()))) {
                product.setQuantity(product.getQuantity() + 1);
                if (product.getQuantity() < 2) {
                    System.out.println(product.getName()+product.getQuantity());
                    productsHM.put(product, product.getQuantity());
                    this.model.addRow(new Object[]{
                        product.getQuantity(),
                        product.getName(),
                        product.getPrice(),
                        product.getPrice()
                    });
                } else {
                    productsHM.replace(product, product.getQuantity());
                    for (int i = 0; i < jTableDetail.getRowCount(); i++) {
                        if (jTableDetail.getValueAt(i, 1).equals(product.getName())) {
                            this.model.setValueAt(product.getQuantity(), i, 0);
                            this.model.setValueAt(product.getQuantity() * product.getPrice(), i, 3);
                        }
                    }

                }

            }
        }

    }

    public void removeProduct() {
        int quantity;
        double total;
        if (jTableDetail.getSelectedRow() >= 0) {
            if ((int) jTableDetail.getValueAt(jTableDetail.getSelectedRow(), 0) > 1) {
                quantity = (int) jTableDetail.getValueAt(jTableDetail.getSelectedRow(), 0) - 1;
                total = quantity * (double) jTableDetail.getValueAt(jTableDetail.getSelectedRow(), 2);
                this.model.setValueAt(quantity, jTableDetail.getSelectedRow(), 0);
                this.model.setValueAt(total, jTableDetail.getSelectedRow(), 3);
            } else {
                model.removeRow(jTableDetail.getSelectedRow());
            }

            //model.removeRow(jTablaDetalle.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONAR LA COMPRA");
        }
    }

    public void total() {
        double totalPagar = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            totalPagar += Double.parseDouble(String.valueOf(jTableDetail.getValueAt(i, 3)));

        }
        valorNeto = totalPagar;
    }
    public void setProductData(JLabel jLProduct, String name, String path){
        for (Product product : products) {
            if (product.getName().equals(name)) {
                jLProduct.setText(product.getName() + " $" + String.format("%.2f", product.getPrice()));
                jLProduct.setIcon(new ImageIcon(path));
                jLProduct.setVerticalTextPosition(JLabel.BOTTOM);
                jLProduct.setHorizontalTextPosition(JLabel.CENTER);
                //       
            }
        }
    }

    public void loadMenuProducts() {
        //PLATOS
        setProductData(jLSimple, "SIMPLE","src/main/java/ui/resources/images/SimpleBurger.png");
        setProductData(jLSpecial,"ESPECIAL","src/main/java/ui/resources/images/SpecialBurger.png");
        setProductData(jLStreet,"CALLEJERA","src/main/java/ui/resources/images/StreetBurger.png");
        setProductData(jLCriolla,"CRIOLLA","src/main/java/ui/resources/images/CriollaBurger.png");
        setProductData(jLHalfPound,"1/2 LIBRA","src/main/java/ui/resources/images/HalfPoundBurger.png");
        setProductData(jLHawaiian,"HAWAIANA","src/main/java/ui/resources/images/HawaiianBurger.png");
        setProductData(jLItalian,"ITALIANA","src/main/java/ui/resources/images/ItalianBurger.png");
        setProductData(jLMexican,"MEXICANA","src/main/java/ui/resources/images/MexicanBurger.png");
        //BEBIDAS
        setProductData(jLSoda,"GASEOSA","src/main/java/ui/resources/images/Soda.png");
        setProductData(jLMilkShake,"MILKSHAKE","src/main/java/ui/resources/images/MilkShake.jpg");
        setProductData(jLJuice,"JUGO","src/main/java/ui/resources/images/Juice.jpg");
        setProductData(jLWater,"AGUA","src/main/java/ui/resources/images/Water.png");
        //POSTRES
        setProductData(jLIceCream,"HELADO","src/main/java/ui/resources/images/IceCream.jpg");
        setProductData(jLSundae,"SUNDAE","src/main/java/ui/resources/images/Sundae.png");
        setProductData(jLCake,"PASTEL","src/main/java/ui/resources/images/Cake.jpg");
        setProductData(jLBrownie,"BROWNIE","src/main/java/ui/resources/images/Brownie.jpg");
        //ACOMPAÑANTES
        setProductData(jLFries,"PAPAS","src/main/java/ui/resources/images/Fries.jpg");
        setProductData(jLOnion,"AROS","src/main/java/ui/resources/images/Onion.jpg");
        setProductData(jLNachos,"NACHOS","src/main/java/ui/resources/images/Nachos.jpg");
        setProductData(jLYucas,"YUCAS","src/main/java/ui/resources/images/Yucas.jpg");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnMakeOrder;
    private javax.swing.JButton jBtnRemove;
    private javax.swing.JLabel jLBrownie;
    private javax.swing.JLabel jLCake;
    private javax.swing.JLabel jLCriolla;
    private javax.swing.JLabel jLFries;
    private javax.swing.JLabel jLHalfPound;
    private javax.swing.JLabel jLHawaiian;
    private javax.swing.JLabel jLIceCream;
    private javax.swing.JLabel jLItalian;
    private javax.swing.JLabel jLJuice;
    private javax.swing.JLabel jLMexican;
    private javax.swing.JLabel jLMilkShake;
    private javax.swing.JLabel jLNachos;
    private javax.swing.JLabel jLOnion;
    private javax.swing.JLabel jLSimple;
    private javax.swing.JLabel jLSoda;
    private javax.swing.JLabel jLSpecial;
    private javax.swing.JLabel jLStreet;
    private javax.swing.JLabel jLSundae;
    private javax.swing.JLabel jLWater;
    private javax.swing.JLabel jLYucas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDetail;
    // End of variables declaration//GEN-END:variables
}
