package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import utilsProyect.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: Menu Descripción: Clase que contendrá
 * el menú de la aplicación Fecha: 17 jul. 2025
 */
public class Menu extends JPanel {

    public JButton btnPb;

    public Menu() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(250, new UtilsP().heigthWindow()));
        this.setBackground(Color.yellow);
        initComponent();
    }

    private void initComponent() {
        btnGerally();
    }

    private void btnGerally() {
        btnPb = new JButton("Salir");
        btnPb.setSize(200, 50);

        this.add(btnPb);
    }
    
    public Menu menInit(){
        return this;
    }
}
