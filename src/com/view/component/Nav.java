package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Autor: Rolando Murillo Aguirre Clase: Nav Descripción: Clase dedicada a la
 * interfaz del navar de la app Fecha: 18 jul. 2025
 */
public class Nav extends JPanel {

    public Nav() {
        this.setBackground(new Color(18, 52, 88));
        this.setPreferredSize(new Dimension(0,50));
    }

    public Nav navInit() {
        return this;
    }

}
