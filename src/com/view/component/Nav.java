package com.view.component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import com.utils.UtilsP;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Autor: Rolando Murillo Aguirre Clase: Nav Descripción: Clase dedicada a la
 * interfaz del navar de la app Fecha: 18 jul. 2025
 */
public class Nav extends JPanel {
    private final UtilsP utlsTools;
    private JLabel logo;
    private JLabel textLogo;

    public Nav(UtilsP utlsP) {
        this.utlsTools = new UtilsP();
        this.setBackground(UtilsP.COLOR_BACKGROUND);
        this.setPreferredSize(new Dimension(0,50));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        initComponent();
    }

    public void initComponent(){
        contentLog();
    }
    
    public void contentLog(){
        logo = new JLabel(utlsTools.resizeIconApp());
        logo.setPreferredSize(new Dimension(50,50));
        
        this.add(logo);
    }
    
}
