package com.view.component;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.utils.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: Menu Descripción: Clase que contendrá
 * el menú de la aplicación Fecha: 17 jul. 2025
 */
public class Menu extends JPanel {

    //Variable de apoyo de la clase Util para mejor centralización de diseños
    private final UtilsP utlsTools;
    //Variable para indicaciones del acomodo del GridBagLayout
    private final GridBagConstraints gbc;

    //Variables de visuales para compoción del menú de la app
    private JLabel logoLabel;
    private JButton btnVentas;
    private JButton btnResumen;
    private JButton btnEdicion;
    private JButton btnInventario;
    private JButton btnReportes;
    private JButton btnClientes;
    private JButton btnExit;

    //Constructor de la clase con parámetros
    public Menu(UtilsP utlsP) {
        this.gbc = new GridBagConstraints();
        this.utlsTools = utlsP;

        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(250, 0));
        this.setBackground(UtilsP.COLOR_BACKGROUND);
        initComponent();
    }

    //Método privado para iniciar los componentes del menu
    private void initComponent() {
        labelLogo();
        initMenuButtons();
    }

    //Método privado que gestiona el label del logo del menú
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

    //Método privado que gestiona los botones del menú
    private void initMenuButtons() {
        //Creación de los botones mediante el método de la clase UtilsP
        btnVentas = utlsTools.createMenuButton("VENTAS");
        btnInventario = utlsTools.createMenuButton("INVENTARIO");
        btnResumen = utlsTools.createMenuButton("RESUMEN");
        btnReportes = utlsTools.createMenuButton("REPORTES");
        btnClientes = utlsTools.createMenuButton("CLIENTES");
        btnEdicion = utlsTools.createMenuButton("EDITAR");
        btnExit = utlsTools.createMenuButton("SALIR", UtilsP.COLOR_BTN_AUX);

        //Implementación del método para agregar los botones al panel del menú
        //se pasa por parámetro el botón, margin superior deseado y posición
        //fila donde se ubicará dentro del GridBagLayout
        addButton(btnVentas, 20, 1);
        addButton(btnInventario, 20, 2);
        addButton(btnResumen, 20, 3);
        addButton(btnReportes, 20, 4);
        addButton(btnClientes, 20, 5);
        addButton(btnEdicion, 20, 6);
        addButton(btnExit, 70, 7);
    }

    //Método para la agregación de los bótones al panel del menú
    private void addButton(JButton btnP, int insetP, int gridYP) {
        gbc.gridx = 0;
        gbc.gridy = gridYP;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(insetP, 0, 0, 0);
        this.add(btnP, gbc);
    }

    //Método de acceso al botón de ventas
    public JButton getBtnVentas() {
        return btnVentas;
    }
    //Método de acceso al botón de Resumen

    public JButton getBtnResumen() {
        return btnResumen;
    }
    //Método de acceso al botón de Edición

    public JButton getBtnEdicion() {
        return btnEdicion;
    }
    //Método de acceso al botón de Inventario

    public JButton getBtnInventario() {
        return btnInventario;
    }
    //Método de acceso al botón de Reportes

    public JButton getBtnReportes() {
        return btnReportes;
    }
    //Método de acceso al botón de Clientes

    public JButton getBtnClientes() {
        return btnClientes;
    }
    //Método de acceso al botón de Salir

    public JButton getBtnExit() {
        return btnExit;
    }
}
