/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.estudiantes;

import com.desarrollo.componentesreutilizables.Imagen;
import com.desarrollo.datos.*;
import com.desarrollo.domain.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Bryan Andagoya
 */
public class Estudiantes extends javax.swing.JFrame {
    
    String path = null;
    public static int idUsuarioAutentificado;
    EstudianteDAO estudianteDAO = new EstudianteDAO();
    
    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 7) {
                return ImageIcon.class;
            } else {
                return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
            }
        }
    };

    /**
     * Creates new form Estudiantes
     */
    public Estudiantes() {
        initComponents();
        setLocationRelativeTo(null);
        jTableEstudiantes.setModel(model);
        jTableEstudiantes.setRowHeight(60);
        //añadir columnas tabla
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO");
        model.addColumn("NIVEL");
        model.addColumn("TELÉFONO");
        model.addColumn("EMAIL");
        model.addColumn("DIRECCIÓN");
        model.addColumn("IMAGEN");

        //propiedades
        jTableEstudiantes.setShowGrid(true);
        jTableEstudiantes.setGridColor(Color.yellow);
        JTableHeader th = jTableEstudiantes.getTableHeader();
        th.setForeground(Color.BLUE);
        th.setFont(new Font("Tahoma", Font.BOLD, 16));

        //método listar estudiantes
        listarEstudiantes();
        //System.out.println("Id Usuario: " + idUsuarioAutentificado);
    }
    
    public void refrescarTabla() {
        model.setRowCount(0);
        listarEstudiantes();
    }
    
    public void limpiarCampos() {
        jTxtIdEstudiante.setText("");
        jTxtNombre.setText("");
        jTxtApellido.setText("");
        jCmbBoxNivel.setSelectedIndex(0);
        jTxtEmail.setText("");
        jTxtTelefono.setText("");
        jTxtAreaDireccion.setText("");
        jLabelImagen.setIcon(null);
    }
    
    public void listarEstudiantes() {
        ArrayList<Estudiante> listaEstudiantes = estudianteDAO.listarEstudiantes(idUsuarioAutentificado);
        
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            ImageIcon img = new ImageIcon(new ImageIcon(listaEstudiantes.get(i).getImagen()).getImage()
                    .getScaledInstance(60, 60, Image.SCALE_SMOOTH));
            
            model.addRow(new Object[]{
                listaEstudiantes.get(i).getIdEstudiante(),
                listaEstudiantes.get(i).getNombre(),
                listaEstudiantes.get(i).getApellido(),
                listaEstudiantes.get(i).getNivel(),
                listaEstudiantes.get(i).getTelefono(),
                listaEstudiantes.get(i).getEmail(),
                listaEstudiantes.get(i).getDireccion(),
                img
            });
            
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JLMinimizar = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jLImagenUsuario = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBtnEditarEstudiante = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCmbBoxNivel = new javax.swing.JComboBox<>();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaDireccion = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jBntCargarImagen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstudiantes = new javax.swing.JTable();
        jBtnAñadirEstudiante1 = new javax.swing.JButton();
        jTxtIdEstudiante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBtnEliminarEstudiante1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 204, 113));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seminario REACT");

        JLMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JLMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        JLMinimizar.setText("-");
        JLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLMinimizarMouseClicked(evt);
            }
        });

        jLCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLCerrar.setText("X");
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });

        jLImagenUsuario.setBackground(new java.awt.Color(255, 255, 102));
        jLImagenUsuario.setOpaque(true);

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLUsuario.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jLImagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnEditarEstudiante.setBackground(new java.awt.Color(65, 131, 215));
        jBtnEditarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtnEditarEstudiante.setText("Editar");
        jBtnEditarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarEstudianteActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnEditarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 49, 63));
        jLabel4.setText("Dirección:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jTxtNombre.setBackground(new java.awt.Color(204, 255, 255));
        jTxtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxtNombre.setForeground(new java.awt.Color(51, 204, 255));
        jTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 290, 37));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 49, 63));
        jLabel5.setText("Apellido:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTxtApellido.setBackground(new java.awt.Color(204, 255, 255));
        jTxtApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxtApellido.setForeground(new java.awt.Color(51, 204, 255));
        jTxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(jTxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 290, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 49, 63));
        jLabel6.setText("Nivel:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jCmbBoxNivel.setBackground(new java.awt.Color(204, 255, 255));
        jCmbBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto" }));
        jCmbBoxNivel.setOpaque(true);
        jPanel3.add(jCmbBoxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 220, 30));

        jTxtTelefono.setBackground(new java.awt.Color(204, 255, 255));
        jTxtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxtTelefono.setForeground(new java.awt.Color(51, 204, 255));
        jTxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(jTxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 290, 37));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(34, 49, 63));
        jLabel7.setText("Teléfono:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 10, 260));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 49, 63));
        jLabel8.setText("Nombre:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(34, 49, 63));
        jLabel9.setText("Foto:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        jLabelImagen.setBackground(new java.awt.Color(204, 255, 255));
        jLabelImagen.setOpaque(true);
        jPanel3.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 230, 150));

        jTxtAreaDireccion.setBackground(new java.awt.Color(204, 255, 255));
        jTxtAreaDireccion.setColumns(20);
        jTxtAreaDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxtAreaDireccion.setForeground(new java.awt.Color(51, 204, 255));
        jTxtAreaDireccion.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaDireccion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 340, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(34, 49, 63));
        jLabel11.setText("Email:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jTxtEmail.setBackground(new java.awt.Color(204, 255, 255));
        jTxtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxtEmail.setForeground(new java.awt.Color(51, 204, 255));
        jTxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtEmailKeyTyped(evt);
            }
        });
        jPanel3.add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 290, 37));

        jBntCargarImagen.setBackground(new java.awt.Color(204, 255, 204));
        jBntCargarImagen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBntCargarImagen.setText("Cargar");
        jBntCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCargarImagenActionPerformed(evt);
            }
        });
        jPanel3.add(jBntCargarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        jTableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEstudiantes);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1020, 300));

        jBtnAñadirEstudiante1.setBackground(new java.awt.Color(65, 131, 215));
        jBtnAñadirEstudiante1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtnAñadirEstudiante1.setText("Añadir");
        jBtnAñadirEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAñadirEstudiante1ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnAñadirEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, -1));

        jTxtIdEstudiante.setEditable(false);
        jTxtIdEstudiante.setBackground(new java.awt.Color(204, 255, 255));
        jTxtIdEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxtIdEstudiante.setForeground(new java.awt.Color(51, 204, 255));
        jTxtIdEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdEstudianteKeyTyped(evt);
            }
        });
        jPanel3.add(jTxtIdEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 37));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(34, 49, 63));
        jLabel10.setText("ID:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jBtnEliminarEstudiante1.setBackground(new java.awt.Color(65, 131, 215));
        jBtnEliminarEstudiante1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtnEliminarEstudiante1.setText("Eliminar");
        jBtnEliminarEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarEstudiante1ActionPerformed(evt);
            }
        });
        jPanel3.add(jBtnEliminarEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1060, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_JLMinimizarMouseClicked

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyTyped
        //verificarDatos.validarLetrasNumeros(evt);
    }//GEN-LAST:event_jTxtNombreKeyTyped

    private void jTxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApellidoKeyTyped

    private void jTxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefonoKeyTyped

    private void jTxtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailKeyTyped

    private void jBntCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCargarImagenActionPerformed
        Imagen img = new Imagen();
        path = img.cargarImagen(jLabelImagen);
    }//GEN-LAST:event_jBntCargarImagenActionPerformed

    private void jBtnEditarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarEstudianteActionPerformed
        int idEstudiante = Integer.parseInt(jTxtIdEstudiante.getText());
        String nombre = jTxtNombre.getText();
        String apellido = jTxtApellido.getText();
        String nivel = jCmbBoxNivel.getSelectedItem().toString();
        int telefono = Integer.parseInt(jTxtTelefono.getText());
        String email = jTxtEmail.getText();
        String direccion = jTxtAreaDireccion.getText();
        
        if (path != null) {
            byte[] IMG = null;
            
            try {
                //capturar imagen en binario
                Path pth = Paths.get(path);
                IMG = Files.readAllBytes(pth);
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }

            //generar objeto
            Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellido, nivel, telefono, email, direccion, IMG, idUsuarioAutentificado);

            //llamar método insert
            estudianteDAO.actualizarEstudiante(estudiante, true);
        } else {
            Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellido, nivel, telefono, email, direccion, null, idUsuarioAutentificado);

            //llamar método insert
            estudianteDAO.actualizarEstudiante(estudiante, false);
        }

        //refrescar la tabla
        refrescarTabla();
        //limpiar campos
        limpiarCampos();
    }//GEN-LAST:event_jBtnEditarEstudianteActionPerformed

    private void jTableEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstudiantesMouseClicked
        int filaSeleccionada = jTableEstudiantes.getSelectedRow();
        jTxtIdEstudiante.setText(jTableEstudiantes.getValueAt(filaSeleccionada, 0).toString());
        jTxtNombre.setText(jTableEstudiantes.getValueAt(filaSeleccionada, 1).toString());
        jTxtApellido.setText(jTableEstudiantes.getValueAt(filaSeleccionada, 2).toString());
        jCmbBoxNivel.setSelectedItem(jTableEstudiantes.getValueAt(filaSeleccionada, 3));
        jTxtTelefono.setText(jTableEstudiantes.getValueAt(filaSeleccionada, 4).toString());
        jTxtEmail.setText(jTableEstudiantes.getValueAt(filaSeleccionada, 5).toString());
        jTxtAreaDireccion.setText(jTableEstudiantes.getValueAt(filaSeleccionada, 6).toString());
        
        jLabelImagen.setIcon(new ImageIcon(((ImageIcon) jTableEstudiantes.getValueAt(filaSeleccionada, 7)).getImage().getScaledInstance(jLabelImagen.getWidth(), jLabelImagen.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jTableEstudiantesMouseClicked

    private void jBtnAñadirEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAñadirEstudiante1ActionPerformed
        
        String nombre = jTxtNombre.getText();
        String apellido = jTxtApellido.getText();
        String nivel = jCmbBoxNivel.getSelectedItem().toString();
        int telefono = Integer.parseInt(jTxtTelefono.getText());
        String email = jTxtEmail.getText();
        String direccion = jTxtAreaDireccion.getText();
        
        byte[] IMG = null;
        
        try {
            //capturar imagen en binario
            Path pth = Paths.get(path);
            IMG = Files.readAllBytes(pth);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        //generar objeto
        Estudiante estudiante = new Estudiante(nombre, apellido, nivel, telefono, email, direccion, IMG, idUsuarioAutentificado);

        //llamar método insert
        estudianteDAO.insertarEstudiante(estudiante);

        //refrescar la tabla
        refrescarTabla();
        //limpiar campos
        limpiarCampos();
    }//GEN-LAST:event_jBtnAñadirEstudiante1ActionPerformed

    private void jTxtIdEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdEstudianteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdEstudianteKeyTyped

    private void jBtnEliminarEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarEstudiante1ActionPerformed
        int idEstudiante = Integer.parseInt(jTxtIdEstudiante.getText());
        estudianteDAO.eliminarEstudiante(idEstudiante);

        //listar estudiantes nuevamente
        refrescarTabla();
        //limpiar campos
        limpiarCampos();
    }//GEN-LAST:event_jBtnEliminarEstudiante1ActionPerformed

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
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Estudiantes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLMinimizar;
    private javax.swing.JButton jBntCargarImagen;
    private javax.swing.JButton jBtnAñadirEstudiante1;
    private javax.swing.JButton jBtnEditarEstudiante;
    private javax.swing.JButton jBtnEliminarEstudiante1;
    private javax.swing.JComboBox<String> jCmbBoxNivel;
    private javax.swing.JLabel jLCerrar;
    public javax.swing.JLabel jLImagenUsuario;
    public javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEstudiantes;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextArea jTxtAreaDireccion;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtIdEstudiante;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
