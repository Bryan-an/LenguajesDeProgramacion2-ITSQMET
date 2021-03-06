/*
 * Sign In
 */
package ui;

import business.*;
import java.awt.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import ui.components.*;

/**
 *
 * @author Bryan Andagoya
 */
public final class SignInUI extends javax.swing.JFrame {
    
    private Fonts fonts = new Fonts();
    public static int alternative = 0;

    /**
     * Creates new form SignIn
     */
    public SignInUI() {
        initComponents();
        configureWindow();
        configureComponents();
        alternative();
    }
    
    public void configureWindow() {
        setLocationRelativeTo(null);
    }
    
    public void configureComponents() {
        lbl_fields.requestFocus();
        cbx_userType.setUI(new CustomizedComboBox());
        
        mainPanel.remove(txt_department);
        mainPanel.remove(txt_licensePlate);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    //Para añadir manager o DeliveryDriver desde el menú de manager
    public void alternative() {
        if (alternative != 0) {
            cbx_userType.setSelectedIndex(alternative);
            cbx_userType.setEnabled(false);
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

        mainPanel = new javax.swing.JPanel();
        txt_licensePlate = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_lastName = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_document = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        pwd_confirmPassword = new javax.swing.JPasswordField();
        pwd_password = new javax.swing.JPasswordField();
        cbx_userType = new javax.swing.JComboBox<>();
        chx_wantInformation = new javax.swing.JCheckBox();
        chx_acceptConditions = new javax.swing.JCheckBox();
        btn_cancel = new javax.swing.JButton();
        lbl_viewPassword1 = new javax.swing.JLabel();
        lbl_viewPassword2 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        lbl_fields = new javax.swing.JLabel();
        btn_signIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSQMET BURGER");
        setIconImage(Icons.FRAME_ICON.getImage());
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(254, 249, 231));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_licensePlate.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_licensePlate.setForeground(new java.awt.Color(204, 209, 209));
        txt_licensePlate.setText("Placa vehicular");
        txt_licensePlate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_licensePlate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_licensePlate.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_licensePlate.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_licensePlate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_licensePlateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_licensePlateFocusLost(evt);
            }
        });
        txt_licensePlate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_licensePlateKeyTyped(evt);
            }
        });
        mainPanel.add(txt_licensePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 220, 30));

        txt_department.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_department.setForeground(new java.awt.Color(204, 209, 209));
        txt_department.setText("Departamento");
        txt_department.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_department.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_department.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_department.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_department.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_departmentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_departmentFocusLost(evt);
            }
        });
        txt_department.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_departmentKeyTyped(evt);
            }
        });
        mainPanel.add(txt_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 220, 30));

        txt_name.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_name.setForeground(new java.awt.Color(204, 209, 209));
        txt_name.setText("Nombre");
        txt_name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_name.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_name.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nameFocusLost(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        mainPanel.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 220, 30));

        txt_lastName.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_lastName.setForeground(new java.awt.Color(204, 209, 209));
        txt_lastName.setText("Apellido");
        txt_lastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_lastName.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_lastName.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_lastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_lastNameFocusLost(evt);
            }
        });
        txt_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastNameKeyTyped(evt);
            }
        });
        mainPanel.add(txt_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 220, 30));

        txt_address.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_address.setForeground(new java.awt.Color(204, 209, 209));
        txt_address.setText("Dirección");
        txt_address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_address.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_address.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_addressFocusLost(evt);
            }
        });
        mainPanel.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 220, 30));

        txt_document.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_document.setForeground(new java.awt.Color(204, 209, 209));
        txt_document.setText("Cédula de identidad");
        txt_document.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_document.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_document.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_document.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_documentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_documentFocusLost(evt);
            }
        });
        txt_document.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentKeyTyped(evt);
            }
        });
        mainPanel.add(txt_document, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 220, 30));

        txt_user.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_user.setForeground(new java.awt.Color(204, 209, 209));
        txt_user.setText("Usuario");
        txt_user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_user.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_user.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
            }
        });
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userKeyTyped(evt);
            }
        });
        mainPanel.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 220, 30));

        txt_email.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_email.setForeground(new java.awt.Color(204, 209, 209));
        txt_email.setText("Correo electrónico");
        txt_email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_email.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_email.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        mainPanel.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 220, 30));

        txt_phone.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        txt_phone.setForeground(new java.awt.Color(204, 209, 209));
        txt_phone.setText("Teléfono");
        txt_phone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txt_phone.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        txt_phone.setSelectionColor(new java.awt.Color(229, 152, 102));
        txt_phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_phoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_phoneFocusLost(evt);
            }
        });
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        mainPanel.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 220, 30));

        pwd_confirmPassword.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        pwd_confirmPassword.setForeground(new java.awt.Color(204, 209, 209));
        pwd_confirmPassword.setText("Confirmar contraseña");
        pwd_confirmPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        pwd_confirmPassword.setEchoChar((char)0);
        pwd_confirmPassword.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        pwd_confirmPassword.setSelectionColor(new java.awt.Color(229, 152, 102));
        pwd_confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwd_confirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd_confirmPasswordFocusLost(evt);
            }
        });
        mainPanel.add(pwd_confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 220, 30));

        pwd_password.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        pwd_password.setForeground(new java.awt.Color(204, 209, 209));
        pwd_password.setText("Contraseña");
        pwd_password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        pwd_password.setEchoChar((char)0);
        pwd_password.setSelectedTextColor(new java.awt.Color(253, 254, 254));
        pwd_password.setSelectionColor(new java.awt.Color(229, 152, 102));
        pwd_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwd_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwd_passwordFocusLost(evt);
            }
        });
        mainPanel.add(pwd_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 220, 30));

        cbx_userType.setBackground(new java.awt.Color(253, 254, 254));
        cbx_userType.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 15));
        cbx_userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Administrador", "Delivery" }));
        cbx_userType.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        cbx_userType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbx_userType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_userTypeItemStateChanged(evt);
            }
        });
        mainPanel.add(cbx_userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 220, 30));

        chx_wantInformation.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 12));
        chx_wantInformation.setText("Deseo recibir información de productos y servicios.");
        chx_wantInformation.setContentAreaFilled(false);
        chx_wantInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chx_wantInformation.setFocusPainted(false);
        mainPanel.add(chx_wantInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        chx_acceptConditions.setFont(fonts.robotoRegular.deriveFont(Font.PLAIN, 12));
        chx_acceptConditions.setSelected(false);
        chx_acceptConditions.setText("Acepto los términos y condiciones.");
        chx_acceptConditions.setContentAreaFilled(false);
        chx_acceptConditions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chx_acceptConditions.setFocusPainted(false);
        mainPanel.add(chx_acceptConditions, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        btn_cancel.setBackground(new java.awt.Color(231, 76, 60));
        btn_cancel.setFont(fonts.robotoBold.deriveFont(Font.PLAIN, 18));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("CANCELAR");
        btn_cancel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_cancel.setBorderPainted(false);
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.setFocusPainted(false);
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        mainPanel.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        lbl_viewPassword1.setIcon(Icons.VIEW_PASSWORD);
        lbl_viewPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_viewPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_viewPassword1MouseClicked(evt);
            }
        });
        mainPanel.add(lbl_viewPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 65, 20, 20));

        lbl_viewPassword2.setIcon(Icons.VIEW_PASSWORD);
        lbl_viewPassword2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_viewPassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_viewPassword2MouseClicked(evt);
            }
        });
        mainPanel.add(lbl_viewPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 105, 20, 20));

        lbl_image.setIcon(Icons.SIGN_IN_IMAGE);
        mainPanel.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        lbl_fields.setIcon(Icons.HAMBURGER_BACKGROUD);
        mainPanel.add(lbl_fields, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 610, 450));

        btn_signIn.setBackground(new java.awt.Color(231, 76, 60));
        btn_signIn.setFont(fonts.robotoBold.deriveFont(Font.PLAIN, 18));
        btn_signIn.setForeground(new java.awt.Color(255, 255, 255));
        btn_signIn.setText("REGISTRAR");
        btn_signIn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_signIn.setBorderPainted(false);
        btn_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signIn.setFocusPainted(false);
        btn_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_signInMouseExited(evt);
            }
        });
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });
        mainPanel.add(btn_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusLost
        if (txt_name.getText().isEmpty()) {
            txt_name.setText(SignInController.DEFAULT_NAME);
            txt_name.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_nameFocusLost

    private void txt_lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lastNameFocusLost
        if (txt_lastName.getText().isEmpty()) {
            txt_lastName.setText(SignInController.DEFAULT_LAST_NAME);
            txt_lastName.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_lastNameFocusLost

    private void txt_documentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_documentFocusLost
        if (txt_document.getText().isEmpty()) {
            txt_document.setText(SignInController.DEFAULT_DOCUMENT);
            txt_document.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_documentFocusLost

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        if (txt_email.getText().isEmpty()) {
            txt_email.setText(SignInController.DEFAULT_EMAIL);
            txt_email.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_emailFocusLost

    private void pwd_confirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_confirmPasswordFocusLost
        if (String.valueOf(pwd_confirmPassword.getPassword()).isEmpty() /*&&!pwd_confirmPassword.isFocusOwner()*/) {
            pwd_confirmPassword.setText(SignInController.DEFAULT_CONFIRM_PASSWORD);
            pwd_confirmPassword.setEchoChar((char) 0);
            pwd_confirmPassword.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_pwd_confirmPasswordFocusLost

    private void pwd_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_passwordFocusLost
        if (String.valueOf(pwd_password.getPassword()).isEmpty()) {
            pwd_password.setText(SignInController.DEFAULT_PASSWORD);
            pwd_password.setEchoChar((char) 0);
            pwd_password.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_pwd_passwordFocusLost

    private void btn_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseEntered
        btn_cancel.setBackground(new Color(203, 67, 53));
    }//GEN-LAST:event_btn_cancelMouseEntered

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
        btn_cancel.setBackground(new Color(231, 76, 60));
    }//GEN-LAST:event_btn_cancelMouseExited

    private void txt_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusLost
        if (txt_address.getText().isEmpty()) {
            txt_address.setText(SignInController.DEFAULT_ADDRESS);
            txt_address.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_addressFocusLost

    private void txt_phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_phoneFocusLost
        if (txt_phone.getText().isEmpty()) {
            txt_phone.setText(SignInController.DEFAULT_PHONE);
            txt_phone.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_phoneFocusLost

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        if (txt_user.getText().isEmpty()) {
            txt_user.setText(SignInController.DEFAULT_USER);
            txt_user.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_userFocusLost

    private void lbl_viewPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewPassword1MouseClicked
        if (!(String.valueOf(pwd_password.getPassword()).equals(SignInController.DEFAULT_PASSWORD)
                || String.valueOf(pwd_password.getPassword()).isEmpty())) {
            if (pwd_password.getEchoChar() == 0) {
                pwd_password.setEchoChar('\u2022');
            } else {
                pwd_password.setEchoChar((char) 0);
            }
        }
    }//GEN-LAST:event_lbl_viewPassword1MouseClicked

    private void lbl_viewPassword2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewPassword2MouseClicked
        if (!(String.valueOf(pwd_confirmPassword.getPassword()).equals(SignInController.DEFAULT_CONFIRM_PASSWORD)
                || String.valueOf(pwd_confirmPassword.getPassword()).isEmpty())) {
            if (pwd_confirmPassword.getEchoChar() == 0) {
                pwd_confirmPassword.setEchoChar('\u2022');
            } else {
                pwd_confirmPassword.setEchoChar((char) 0);
            }
        }
    }//GEN-LAST:event_lbl_viewPassword2MouseClicked

    private void txt_departmentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_departmentFocusLost
        if (txt_department.getText().isEmpty()) {
            txt_department.setText(SignInController.DEFAULT_DEPARTMENT);
            txt_department.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_departmentFocusLost

    private void cbx_userTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_userTypeItemStateChanged
        String userType = (String) evt.getItem();
        
        switch (userType) {
            case "Cliente":
                mainPanel.remove(txt_department);
                mainPanel.remove(txt_licensePlate);
                mainPanel.revalidate();
                mainPanel.repaint();
                break;
            case "Administrador":
                mainPanel.remove(txt_licensePlate);
                mainPanel.add(txt_department, new AbsoluteConstraints(630, 140, 220, 30), 1);
                mainPanel.revalidate();
                mainPanel.repaint();
                break;
            case "Delivery":
                mainPanel.remove(txt_department);
                mainPanel.add(txt_licensePlate, new AbsoluteConstraints(630, 140, 220, 30), 1);
                mainPanel.revalidate();
                mainPanel.repaint();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbx_userTypeItemStateChanged

    private void txt_licensePlateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_licensePlateFocusLost
        if (txt_licensePlate.getText().isEmpty()) {
            txt_licensePlate.setText(SignInController.DEFAULT_LICENSE_PLATE);
            txt_licensePlate.setForeground(new Color(204, 209, 209));
        }
    }//GEN-LAST:event_txt_licensePlateFocusLost

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        Validate.allowLetters(evt);
    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastNameKeyTyped
        
        Validate.allowLetters(evt);
    }//GEN-LAST:event_txt_lastNameKeyTyped

    private void txt_documentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentKeyTyped
        if (txt_document.getText().length() < 10) {
            Validate.allowDigits(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_documentKeyTyped

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        if (txt_phone.getText().length() < 10) {
            Validate.allowDigits(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyTyped
        Validate.allowLettersAndDigits(evt);
    }//GEN-LAST:event_txt_userKeyTyped

    private void txt_licensePlateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_licensePlateKeyTyped
        char character = evt.getKeyChar();
        
        if (txt_licensePlate.getText().length() >= 3) {
            if (!Character.isDigit(character) || txt_licensePlate.getText().length() == 7) {
                evt.consume();
            }
        } else {
            if (!(Character.isLetter(character))) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_licensePlateKeyTyped

    private void txt_departmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_departmentKeyTyped
        Validate.allowLettersAndSpaces(evt);
    }//GEN-LAST:event_txt_departmentKeyTyped

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        if (alternative != 0) {
            new Staff().setVisible(true);
            dispose();
        } else {
            new LogInUI().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_lastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lastNameFocusGained
        if (txt_lastName.getText().equals(SignInController.DEFAULT_LAST_NAME)) {
            txt_lastName.setText("");
            txt_lastName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_lastNameFocusGained

    private void txt_licensePlateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_licensePlateFocusGained
        if (txt_licensePlate.getText().equals(SignInController.DEFAULT_LICENSE_PLATE)) {
            txt_licensePlate.setText("");
            txt_licensePlate.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_licensePlateFocusGained

    private void txt_departmentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_departmentFocusGained
        if (txt_department.getText().equals(SignInController.DEFAULT_DEPARTMENT)) {
            txt_department.setText("");
            txt_department.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_departmentFocusGained

    private void txt_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusGained
        if (txt_name.getText().equals(SignInController.DEFAULT_NAME)) {
            txt_name.setText("");
            txt_name.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_nameFocusGained

    private void txt_addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusGained
        if (txt_address.getText().equals(SignInController.DEFAULT_ADDRESS)) {
            txt_address.setText("");
            txt_address.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_addressFocusGained

    private void txt_documentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_documentFocusGained
        if (txt_document.getText().equals(SignInController.DEFAULT_DOCUMENT)) {
            txt_document.setText("");
            txt_document.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_documentFocusGained

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        if (txt_user.getText().equals(SignInController.DEFAULT_USER)) {
            txt_user.setText("");
            txt_user.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        if (txt_email.getText().equals(SignInController.DEFAULT_EMAIL)) {
            txt_email.setText("");
            txt_email.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_phoneFocusGained
        if (txt_phone.getText().equals(SignInController.DEFAULT_PHONE)) {
            txt_phone.setText("");
            txt_phone.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_phoneFocusGained

    private void pwd_confirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_confirmPasswordFocusGained
        if (String.valueOf(pwd_confirmPassword.getPassword()).equals(SignInController.DEFAULT_CONFIRM_PASSWORD)) {
            pwd_confirmPassword.setText("");
            pwd_confirmPassword.setEchoChar('\u2022');
            pwd_confirmPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pwd_confirmPasswordFocusGained

    private void pwd_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwd_passwordFocusGained
        if (String.valueOf(pwd_password.getPassword()).equals(SignInController.DEFAULT_PASSWORD)) {
            pwd_password.setText("");
            pwd_password.setEchoChar('\u2022');
            pwd_password.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pwd_passwordFocusGained

    private void btn_signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signInMouseEntered
        btn_signIn.setBackground(new Color(203, 67, 53));
        btn_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_signInMouseEntered

    private void btn_signInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signInMouseExited
        btn_signIn.setBackground(new Color(231, 76, 60));
    }//GEN-LAST:event_btn_signInMouseExited

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        if (SignInController.validateFields(this, cbx_userType, txt_name, txt_lastName,
                txt_document, txt_phone, txt_address, txt_email,
                txt_user, pwd_password, pwd_confirmPassword,
                txt_department, txt_licensePlate, chx_acceptConditions)) {

            SignInController.register(this);
            new LogInUI().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_signInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_signIn;
    private javax.swing.JComboBox<String> cbx_userType;
    private javax.swing.JCheckBox chx_acceptConditions;
    private javax.swing.JCheckBox chx_wantInformation;
    private javax.swing.JLabel lbl_fields;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_viewPassword1;
    private javax.swing.JLabel lbl_viewPassword2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField pwd_confirmPassword;
    private javax.swing.JPasswordField pwd_password;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_document;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JTextField txt_licensePlate;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
