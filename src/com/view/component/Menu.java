package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Autor: Rolando Murillo Aguirre Clase: Menu Descripción: Clase que contendrá
 * el menú de la aplicación Fecha: 17 jul. 2025
 */
public class Menu extends JPanel {

    private GridBagConstraints gbc;
    public JButton btnExit;

    public Menu() {
        gbc = new GridBagConstraints();

        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(250,0));
        //this.setBackground(new Color(178, 198, 213));
        this.setBackground(new Color(18, 52, 88));
        initComponent();
    }

    private void initComponent() {
        btnGerally();
    }
    
    private void btnGerally() {
        btnExit = new JButton("Salir");
        btnExit.setPreferredSize(new Dimension(200, 50));
        btnExit.setFocusable(false);
        btnExit.setFont(new Font("Arial", Font.BOLD, 18));
        btnExit.setForeground(Color.WHITE);
        btnExit.setBackground(new Color(220, 60, 34));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(btnExit, gbc);
    }

    public Menu menInit() {
        return this;
    }
}
