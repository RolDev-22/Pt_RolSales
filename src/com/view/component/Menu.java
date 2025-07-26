package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
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
    private final UtilsP utlsTools;

    private GridBagConstraints gbc;
    private JLabel logoLabel;
    private JButton btnVentas;
    private JButton btnResumen;
    private JButton btnEdicion;
    private JButton btnInventario;
    private JButton btnReportes;
    private JButton btnClientes;
    private JButton btnExit;

    public Menu(UtilsP utlsP) {
        gbc = new GridBagConstraints();
        this.utlsTools = utlsP;

        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(250, 0));
        //this.setBackground(new Color(178, 198, 213));
        this.setBackground(new Color(18, 52, 88));
        initComponent();
    }

    private void initComponent() {
        labelLogo();
        initMenuButtons();
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

    private void initMenuButtons() {
        btnVentas = utlsTools.btnMenuGenerate("VENTAS", clBtnGeneral);
        btnInventario = utlsTools.btnMenuGenerate("INVENTARIO", clBtnGeneral);
        btnResumen = utlsTools.btnMenuGenerate("RESUMEN", clBtnGeneral);
        btnReportes = utlsTools.btnMenuGenerate("REPORTES", clBtnGeneral);
        btnClientes = utlsTools.btnMenuGenerate("CLIENTES", clBtnGeneral);
        btnEdicion = utlsTools.btnMenuGenerate("EDITAR", clBtnGeneral);
        btnExit = utlsTools.btnMenuGenerate("SALIR", clBtnAux);

        addButton(btnVentas, 20, 1);
        addButton(btnInventario, 20, 2);
        addButton(btnResumen, 20, 3);
        addButton(btnReportes, 20, 4);
        addButton(btnClientes, 20, 5);
        addButton(btnEdicion, 20, 6);
        addButton(btnExit, 70, 7);
    }

    private void addButton(JButton btnP,int insetP, int gridYP){
        gbc.gridx = 0;
        gbc.gridy = gridYP;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(insetP, 0, 0, 0);
        this.add(btnP, gbc);
    }
    
    public JButton getBtnVentas() {
        return btnVentas;
    }

    public JButton getBtnResumen() {
        return btnResumen;
    }

    public JButton getBtnEdicion() {
        return btnEdicion;
    }

    public JButton getBtnInventario() {
        return btnInventario;
    }

    public JButton getBtnReportes() {
        return btnReportes;
    }

    public JButton getBtnClientes() {
        return btnClientes;
    }

    public JButton getBtnExit() {
        return btnExit;
    }
}
