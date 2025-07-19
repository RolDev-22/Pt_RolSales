package com.view.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import utilsProyect.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: Menu Descripción: Clase que contendrá
 * el menú de la aplicación Fecha: 17 jul. 2025
 */
public class Menu extends JPanel {

    private GridBagConstraints gbc;
    public JButton btnPb;

    public Menu() {
        gbc = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(250, new UtilsP().heigthWindow()));
        //this.setBackground(new Color(178, 198, 213));
        this.setBackground(new Color(18, 52, 88));
        initComponent();
    }

    private void initComponent() {
        btnGerally();
    }

    private void btnGerally() {
        btnPb = new JButton("Salir");
        btnPb.setPreferredSize(new Dimension(200, 50));
        btnPb.setFocusable(false);
        btnPb.setFont(new Font("Arial", Font.BOLD, 18));
        btnPb.setForeground(Color.WHITE);
        btnPb.setBackground(new Color(220, 60, 34));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(btnPb, gbc);
    }

    public Menu menInit() {
        return this;
    }
}
