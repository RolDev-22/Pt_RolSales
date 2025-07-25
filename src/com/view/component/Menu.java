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

    private final Color clBtnGeneral = new Color(56, 179, 217, 240);
    private final Color clBtnAux = new Color(23, 240, 100, 240);

    private GridBagConstraints gbc;
    private JLabel logoLabel;
    private UtilsP utlsTools;
    public JButton btnVentas;
    public JButton btnResumen;
    public JButton btnEdicion;
    public JButton btnInventario;
    public JButton btnReportes;
    public JButton btnClientes;
    public JButton btnExit;

    public Menu() {
        gbc = new GridBagConstraints();
        utlsTools = new UtilsP();

        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(250, 0));
        //this.setBackground(new Color(178, 198, 213));
        this.setBackground(new Color(18, 52, 88));
        initComponent();
    }

    private void initComponent() {
        labelLogo();
        btnGerally();
    }

    private void labelLogo() {
        logoLabel = new JLabel(utlsTools.resizeIcon());
        logoLabel.setPreferredSize(new Dimension(100, 100));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 50, 0);
        this.add(logoLabel, gbc);
    }

    private void btnGerally() {
        btnVentas = utlsTools.btnMenuGenerate("VENTAS", clBtnGeneral);
        btnInventario = utlsTools.btnMenuGenerate("INVENTARIO", clBtnGeneral);
        btnResumen = utlsTools.btnMenuGenerate("RESUMEN", clBtnGeneral);
        btnReportes = utlsTools.btnMenuGenerate("REPORTES", clBtnGeneral);
        btnClientes = utlsTools.btnMenuGenerate("CLIENTES", clBtnGeneral);
        btnEdicion = utlsTools.btnMenuGenerate("EDITAR", clBtnGeneral);
        btnExit = utlsTools.btnMenuGenerate("SALIR", clBtnAux);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0);
        this.add(btnVentas, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0);
        this.add(btnInventario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0);
        this.add(btnResumen, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0);
        this.add(btnReportes, gbc);
     
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0);
        this.add(btnClientes, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 0, 0, 0);
        this.add(btnEdicion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(70, 0, 0, 0);
        this.add(btnExit, gbc);
    }

    public Menu menInit() {
        return this;
    }
}
