package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.utils.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: Nav Descripción: Clase dedicada a la
 * interfaz del navar de la app Fecha: 18 jul. 2025
 */
public class Nav extends JPanel {
    
    private final UtilsP utlsTools;

    public Nav(UtilsP utlsP) {
        this.utlsTools = utlsP;
        
        this.setBackground(UtilsP.COLOR_BACKGROUND);
        this.setPreferredSize(new Dimension(0,50));
    }

}
