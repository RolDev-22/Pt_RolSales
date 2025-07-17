package com.ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Autor: Rolando Murillo Aguirre Clase: Dashbord Descripción: [Breve
 * descripción] Fecha: 16 jul. 2025
 */
public class Dashbord extends JFrame {

    private final ImageIcon imageIcon = new ImageIcon(getClass().getResource("/assets/log.png"));
    private final Image icon = imageIcon.getImage();

    public Dashbord() {
        this.setIconImage(icon);
        this.setTitle("Módulo Dashbord");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
    }

}
