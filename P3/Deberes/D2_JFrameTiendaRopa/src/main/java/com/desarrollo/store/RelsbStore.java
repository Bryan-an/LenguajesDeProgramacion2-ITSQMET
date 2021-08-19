/*
 * JFrame
 */
package com.desarrollo.store;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Bryan Andagoya
 */
public final class RelsbStore extends javax.swing.JFrame {

    //Fields
    DefaultTableModel tableModel = new DefaultTableModel();
    DecimalFormat formatter = new DecimalFormat("###,###.00");
    int invoiceNumber = 1;

    /**
     * Creates new form TiendaRELSB
     */
    public RelsbStore() {
        initComponents();
        configureFrame();
        configureTable();
    }

    /**
     * Configures the Frame.
     */
    public void configureFrame() {
        setLocationRelativeTo(null);
        
        setIconImage(new ImageIcon("src/main/java/com/desarrollo/images/icon.png")
                .getImage());
    }

    /**
     * Configures the table and its model.
     */
    public void configureTable() {
        tbl_details.setModel(tableModel);
        
        tableModel.addColumn("Marca");
        tableModel.addColumn("Género");
        tableModel.addColumn("Talla");
        tableModel.addColumn("Color");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn("Precio unitario");
        tableModel.addColumn("Precio total");
    }

    /**
     * Applies the promotion to price.
     */
    public void applyPromotion() {
        int quantity = (int) spn_quantity.getValue();
        double price = Double.parseDouble(txt_price.getText());
        double subtotal = price * quantity;
        double discount = 0;
        double total;

        //Maraton
        if (cbx_trademark.getSelectedIndex() == 1) {
            //Man
            if (rbtn_man.isSelected()) {
                switch (cbx_size.getSelectedIndex()) {
                    case 1:
                        discount = subtotal * 0.05;
                        break;
                    case 2:
                        discount = subtotal * 0.07;
                        break;
                    case 3:
                        discount = subtotal * 0.09;
                        break;
                    case 4:
                        discount = subtotal * 0.11;
                        break;
                    case 5:
                        discount = subtotal * 0.12;
                        break;
                }

                //Woman
            } else if (rbtn_woman.isSelected()) {
                switch (cbx_size.getSelectedIndex()) {
                    case 1:
                        discount = subtotal * 0.04;
                        break;
                    case 2:
                        discount = subtotal * 0.06;
                        break;
                    case 3:
                        discount = subtotal * 0.08;
                        break;
                    case 4:
                        discount = subtotal * 0.10;
                        break;
                    case 5:
                        discount = subtotal * 0.11;
                        break;
                }
            }

            //Adidas
        } else if (cbx_trademark.getSelectedIndex() == 2) {
            //Man
            if (rbtn_man.isSelected()) {
                switch (cbx_size.getSelectedIndex()) {
                    case 1:
                        discount = subtotal * 0.04;
                        break;
                    case 2:
                        discount = subtotal * 0.06;
                        break;
                    case 3:
                        discount = subtotal * 0.08;
                        break;
                    case 4:
                        discount = subtotal * 0.10;
                        break;
                    case 5:
                        discount = subtotal * 0.11;
                        break;
                }

                //Woman
            } else if (rbtn_woman.isSelected()) {
                switch (cbx_size.getSelectedIndex()) {
                    case 1:
                        discount = subtotal * 0.05;
                        break;
                    case 2:
                        discount = subtotal * 0.07;
                        break;
                    case 3:
                        discount = subtotal * 0.09;
                        break;
                    case 4:
                        discount = subtotal * 0.11;
                        break;
                    case 5:
                        discount = subtotal * 0.11;
                        break;
                }
            }
        }
        
        total = subtotal - discount;
        lbl_totalPay.setText(formatter.format(total));
    }

    /**
     * Cleans fields.
     */
    public void clean() {
        cbx_trademark.setSelectedIndex(0);
        bntGGenero.clearSelection();
        cbx_size.setSelectedIndex(0);
        txt_color.setText("");
        spn_quantity.setValue(0);
        txt_price.setText("");
    }

    /**
     * Calculates total to pay.
     */
    public void calculateTotalToPay() {
        double totalPay = 0;
        
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            try {
                totalPay += formatter.parse((String) tableModel.getValueAt(i, 6))
                        .doubleValue();
                
            } catch (ParseException ex) {
                System.out.println(ex);
            }
        }
        
        lbl_netValue.setText(formatter.format(totalPay));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntGGenero = new javax.swing.ButtonGroup();
        pnl_mainPanel = new javax.swing.JPanel();
        lbl_store = new javax.swing.JLabel();
        pnl_promotions = new javax.swing.JPanel();
        lbl_maraton = new javax.swing.JLabel();
        lbl_adidas = new javax.swing.JLabel();
        lbl_manMaraton = new javax.swing.JLabel();
        lbl_maratonManPromotions = new javax.swing.JLabel();
        lbl_maratonWomanPromotions = new javax.swing.JLabel();
        lbl_womanMaraton = new javax.swing.JLabel();
        promotionsSeparator = new javax.swing.JSeparator();
        lbl_manAdidas = new javax.swing.JLabel();
        lbl_adidasManPromotions = new javax.swing.JLabel();
        lbl_womanAdidas = new javax.swing.JLabel();
        lbl_adidasWomanPromotions = new javax.swing.JLabel();
        pnl_purchase = new javax.swing.JPanel();
        lbl_trademark = new javax.swing.JLabel();
        cbx_trademark = new javax.swing.JComboBox<>();
        lbl_gender = new javax.swing.JLabel();
        rbtn_woman = new javax.swing.JRadioButton();
        rbtn_man = new javax.swing.JRadioButton();
        lbl_size = new javax.swing.JLabel();
        cbx_size = new javax.swing.JComboBox<>();
        lbl_color = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        txt_color = new javax.swing.JTextField();
        spn_quantity = new javax.swing.JSpinner();
        lbl_price = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        lbl_totalPay = new javax.swing.JLabel();
        btn_generatePurchase = new javax.swing.JButton();
        purchaseSeparator = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btn_clean = new javax.swing.JButton();
        btn_netValuePay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_details = new javax.swing.JTable();
        btn_remove = new javax.swing.JButton();
        lbl_netValue = new javax.swing.JLabel();
        btn_invoice = new javax.swing.JButton();
        purchaseDetailSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RELSB - Tienda de chompas");
        setResizable(false);

        pnl_mainPanel.setBackground(new java.awt.Color(251, 252, 252));

        lbl_store.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_store.setForeground(new java.awt.Color(0, 153, 255));
        lbl_store.setText("TIENDA DE CHOMPAS IMPERMEABLES RELSB");

        pnl_promotions.setBackground(new java.awt.Color(251, 252, 252));
        pnl_promotions.setBorder(javax.swing.BorderFactory.createTitledBorder("Promociones"));

        lbl_maraton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_maraton.setText("MARATON");

        lbl_adidas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_adidas.setText("ADIDAS");

        lbl_manMaraton.setText("HOMBRE");

        lbl_maratonManPromotions.setText("XS -> 5%       S -> 7%        M -> 9%      L -> 11%    XL -> 12%");

        lbl_maratonWomanPromotions.setText("XS -> 4%       S -> 6%        M -> 8%      L -> 10%    XL -> 11%");

        lbl_womanMaraton.setText("MUJER");

        lbl_manAdidas.setText("HOMBRE");

        lbl_adidasManPromotions.setText("XS -> 4%       S -> 6%        M-> 8%      L -> 10%    XL -> 11%");

        lbl_womanAdidas.setText("MUJER");

        lbl_adidasWomanPromotions.setText("XS -> 5%       S -> 7%        M -> 9%      L -> 11%    XL -> 11%");

        javax.swing.GroupLayout pnl_promotionsLayout = new javax.swing.GroupLayout(pnl_promotions);
        pnl_promotions.setLayout(pnl_promotionsLayout);
        pnl_promotionsLayout.setHorizontalGroup(
            pnl_promotionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(promotionsSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnl_promotionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_promotionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_maraton)
                    .addComponent(lbl_manMaraton)
                    .addComponent(lbl_maratonManPromotions)
                    .addComponent(lbl_womanMaraton)
                    .addComponent(lbl_maratonWomanPromotions)
                    .addComponent(lbl_adidas)
                    .addComponent(lbl_manAdidas)
                    .addComponent(lbl_adidasManPromotions)
                    .addComponent(lbl_womanAdidas)
                    .addComponent(lbl_adidasWomanPromotions))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnl_promotionsLayout.setVerticalGroup(
            pnl_promotionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_promotionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_maraton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_manMaraton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_maratonManPromotions, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_womanMaraton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_maratonWomanPromotions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(promotionsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_adidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_manAdidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_adidasManPromotions, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_womanAdidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_adidasWomanPromotions)
                .addContainerGap())
        );

        pnl_purchase.setBackground(new java.awt.Color(251, 252, 252));
        pnl_purchase.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra"));

        lbl_trademark.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_trademark.setText("MARCA");

        cbx_trademark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Máraton", "Adidas" }));

        lbl_gender.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_gender.setText("GÉNERO");

        bntGGenero.add(rbtn_woman);
        rbtn_woman.setText("MUJER");
        rbtn_woman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_womanActionPerformed(evt);
            }
        });

        bntGGenero.add(rbtn_man);
        rbtn_man.setText("HOMBRE");

        lbl_size.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_size.setText("TALLA CHOMPA");

        cbx_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "XS", "S", "M", "L", "XL" }));

        lbl_color.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_color.setText("COLOR");

        lbl_quantity.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_quantity.setText("CANTIDAD");

        spn_quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lbl_price.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_price.setText("PRECIO");

        txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_priceKeyTyped(evt);
            }
        });

        lbl_total.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_total.setText("TOTAL A PAGAR");

        lbl_totalPay.setBackground(new java.awt.Color(235, 245, 251));
        lbl_totalPay.setOpaque(true);

        btn_generatePurchase.setBackground(new java.awt.Color(127, 179, 213));
        btn_generatePurchase.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_generatePurchase.setText("GENERAR COMPRA");
        btn_generatePurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generatePurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_purchaseLayout = new javax.swing.GroupLayout(pnl_purchase);
        pnl_purchase.setLayout(pnl_purchaseLayout);
        pnl_purchaseLayout.setHorizontalGroup(
            pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_purchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_purchaseLayout.createSequentialGroup()
                        .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_trademark)
                            .addComponent(cbx_trademark, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_purchaseLayout.createSequentialGroup()
                                .addComponent(lbl_gender)
                                .addGap(123, 123, 123))
                            .addGroup(pnl_purchaseLayout.createSequentialGroup()
                                .addComponent(rbtn_man)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtn_woman)
                                .addGap(61, 61, 61)))
                        .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_size)
                            .addComponent(cbx_size, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_purchaseLayout.createSequentialGroup()
                        .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_purchaseLayout.createSequentialGroup()
                                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_color)
                                    .addComponent(lbl_quantity))
                                .addGap(27, 27, 27)
                                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spn_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_purchaseLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lbl_price)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_total)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_totalPay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_purchaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_generatePurchase)
                .addGap(190, 190, 190))
            .addComponent(purchaseSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnl_purchaseLayout.setVerticalGroup(
            pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_purchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_trademark)
                    .addComponent(lbl_gender)
                    .addComponent(lbl_size))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_trademark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_man)
                    .addComponent(rbtn_woman))
                .addGap(18, 18, 18)
                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_color)
                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lbl_quantity))
                .addGap(18, 18, 18)
                .addGroup(pnl_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_price)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total)
                    .addComponent(lbl_totalPay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(purchaseSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_generatePurchase)
                .addGap(24, 24, 24))
        );

        jPanel4.setBackground(new java.awt.Color(251, 252, 252));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Compra"));

        btn_clean.setBackground(new java.awt.Color(127, 179, 213));
        btn_clean.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_clean.setText("LIMPIAR COMPRA");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        btn_netValuePay.setBackground(new java.awt.Color(127, 179, 213));
        btn_netValuePay.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_netValuePay.setText("VALOR NETO A PAGAR");
        btn_netValuePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_netValuePayActionPerformed(evt);
            }
        });

        tbl_details.setBackground(new java.awt.Color(251, 252, 252));
        tbl_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_details);

        btn_remove.setBackground(new java.awt.Color(127, 179, 213));
        btn_remove.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_remove.setText("QUITAR COMPRA");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        lbl_netValue.setBackground(new java.awt.Color(235, 245, 251));
        lbl_netValue.setOpaque(true);

        btn_invoice.setBackground(new java.awt.Color(127, 179, 213));
        btn_invoice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_invoice.setText("FACTURAR");
        btn_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_invoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_clean)
                        .addGap(28, 28, 28)
                        .addComponent(btn_remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(btn_netValuePay)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_netValue, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btn_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(purchaseDetailSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_clean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_netValuePay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_remove))
                    .addComponent(lbl_netValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(purchaseDetailSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_invoice)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_mainPanelLayout = new javax.swing.GroupLayout(pnl_mainPanel);
        pnl_mainPanel.setLayout(pnl_mainPanelLayout);
        pnl_mainPanelLayout.setHorizontalGroup(
            pnl_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainPanelLayout.createSequentialGroup()
                .addGroup(pnl_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_promotions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(pnl_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_mainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnl_mainPanelLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(lbl_store)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mainPanelLayout.setVerticalGroup(
            pnl_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_store)
                .addGap(18, 18, 18)
                .addGroup(pnl_mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_promotions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_womanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_womanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_womanActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        while (tableModel.getRowCount() != 0) {
            tableModel.removeRow(0);
        }
        
        lbl_totalPay.setText("");
        lbl_netValue.setText("");
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_generatePurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generatePurchaseActionPerformed
        String genero;
        
        if (cbx_trademark.getSelectedIndex() != 0
                && (rbtn_man.isSelected() || rbtn_woman.isSelected())
                && cbx_size.getSelectedIndex() != 0
                && !txt_color.getText().equals("")
                && !txt_price.getText().equals("")
                && !spn_quantity.getValue().equals(0)) {
            
            if (rbtn_man.isSelected()) {
                genero = "Hombre";
            } else {
                genero = "Mujer";
            }
            
            applyPromotion();
            
            tableModel.addRow(new Object[]{
                cbx_trademark.getSelectedItem(),
                genero,
                cbx_size.getSelectedItem(),
                txt_color.getText(),
                spn_quantity.getValue(),
                txt_price.getText(),
                lbl_totalPay.getText()
            });
            
            clean();
        } else {
            
            JOptionPane.showMessageDialog(this, "Información incompleta",
                    "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_generatePurchaseActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        if (tbl_details.getSelectedRow() >= 0) {
            tableModel.removeRow(tbl_details.getSelectedRow());
            
            if (!lbl_netValue.getText().isEmpty()) {
                calculateTotalToPay();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccionar compra",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_netValuePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_netValuePayActionPerformed
        if (tableModel.getRowCount() != 0) {
            calculateTotalToPay();
        } else {
            JOptionPane.showMessageDialog(this, "Agregue compra",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_netValuePayActionPerformed

    private void btn_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_invoiceActionPerformed
        if (tableModel.getRowCount() != 0) {
            if (lbl_netValue.getText().isEmpty()) {
                calculateTotalToPay();
            }
            
            Invoice factura = new Invoice();
            factura.setVisible(true);
            factura.displayInvoice(tbl_details, lbl_netValue, this, invoiceNumber++);
            clean();
            btn_cleanActionPerformed(evt);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Agregue compra",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_invoiceActionPerformed

    private void txt_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_priceKeyTyped
        int keyChar = (int) evt.getKeyChar();
        
        boolean lock = txt_price.getText().matches("\\d+\\.\\d{2}");
        
        if (lock || !(keyChar >= 48 && keyChar <= 57 || keyChar == 46)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_priceKeyTyped

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
            java.util.logging.Logger.getLogger(RelsbStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelsbStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelsbStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelsbStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RelsbStore().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bntGGenero;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_generatePurchase;
    private javax.swing.JButton btn_invoice;
    private javax.swing.JButton btn_netValuePay;
    private javax.swing.JButton btn_remove;
    private javax.swing.JComboBox<String> cbx_size;
    private javax.swing.JComboBox<String> cbx_trademark;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_adidas;
    private javax.swing.JLabel lbl_adidasManPromotions;
    private javax.swing.JLabel lbl_adidasWomanPromotions;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_manAdidas;
    private javax.swing.JLabel lbl_manMaraton;
    private javax.swing.JLabel lbl_maraton;
    private javax.swing.JLabel lbl_maratonManPromotions;
    private javax.swing.JLabel lbl_maratonWomanPromotions;
    private javax.swing.JLabel lbl_netValue;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_size;
    private javax.swing.JLabel lbl_store;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_totalPay;
    private javax.swing.JLabel lbl_trademark;
    private javax.swing.JLabel lbl_womanAdidas;
    private javax.swing.JLabel lbl_womanMaraton;
    private javax.swing.JPanel pnl_mainPanel;
    private javax.swing.JPanel pnl_promotions;
    private javax.swing.JPanel pnl_purchase;
    private javax.swing.JSeparator promotionsSeparator;
    private javax.swing.JSeparator purchaseDetailSeparator;
    private javax.swing.JSeparator purchaseSeparator;
    private javax.swing.JRadioButton rbtn_man;
    private javax.swing.JRadioButton rbtn_woman;
    private javax.swing.JSpinner spn_quantity;
    private javax.swing.JTable tbl_details;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
