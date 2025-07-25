package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import utilsProyect.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: Menu Descripción: Clase que contendrá
 * el menú de la aplicación Fecha: 17 jul. 2025
 */
public class Menu extends JPanel {

    private GridBagConstraints gbc;
    private JLabel logoLabel;
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
        labelLogo();
        btnGerally();
    }
    
    private void labelLogo(){
        logoLabel = new JLabel(new UtilsP().resizeIcon());
        logoLabel.setPreferredSize(new Dimension(100,100));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 10, 0);
        this.add(logoLabel, gbc);
    }
    
    private void btnGerally() {
        btnExit = new JButton("Salir");
        btnExit.setPreferredSize(new Dimension(200, 50));
        btnExit.setFocusable(false);
        btnExit.setFont(new Font("Arial", Font.BOLD, 18));
        btnExit.setForeground(Color.WHITE);
        btnExit.setBackground(new Color(220, 60, 34));

        gbc.gridx = 0;
        gbc.gridy = 1;
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
