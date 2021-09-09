/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.componentesreutilizables;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bryan Andagoya
 */
public class Imagen {

    public ImageIcon redimensionarImagen(String imgPath, byte[] IMGBLOB, int ancho, int alto) {
        ImageIcon myImg;

        if (imgPath != null) {
            myImg = new ImageIcon(imgPath);
        } else {
            myImg = new ImageIcon(IMGBLOB);
        }

        Image redimensionarImg = myImg.getImage()
                .getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);

        ImageIcon imagenRedimensionada = new ImageIcon(redimensionarImg);

        return imagenRedimensionada;
    }

    public String cargarImagen(JLabel jLabelImagen) {
        String path = "";

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.dir")));

        FileNameExtensionFilter fileFilter
                = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");

        file.addChoosableFileFilter(fileFilter);

        //botón de selección
        int fileState = file.showSaveDialog(null);

        //si selecciona la imagen
        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            path = selectedFile.getAbsolutePath();

            //mostrar imagen en el label
//            jLabelImagen.setIcon(new ImageIcon(path));
            jLabelImagen.setIcon(redimensionarImagen(path, null, 
                    jLabelImagen.getWidth(), jLabelImagen.getHeight()));

        } else if (fileState == JFileChooser.CANCEL_OPTION) {
            System.out.println("No se ha seleccionado ninguna imagen");
        }

        return path;
    }
}
