package com.view.component;

import java.awt.Dimension;
import javax.swing.JPanel;
import com.utils.UtilsP;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;

/**
 * Autor: Rolando Murillo Aguirre Clase: Nav Descripción: Clase dedicada a la
 * interfaz del navar de la app Fecha: 18 jul. 2025
 */
public final class Nav extends JPanel {
    private JLabel descriptionModule;
    private JLabel iconModule;
    private UtilsP utlsTools;

    public Nav(UtilsP utlsP) {
        this.utlsTools = utlsP;
        this.setBackground(UtilsP.COLOR_BACKGROUND);
        this.setPreferredSize(new Dimension(0,50));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        initComponent();
    }

    public void initComponent(){
        contenDescription();
    }
    
    private void contenDescription(){
        descriptionModule = new JLabel("MÓDULO DE VENTAS");
        iconModule = new JLabel(this.utlsTools.getIc_vts());
        descriptionModule.setFont(new Font("Georgina", Font.PLAIN, 18));
        descriptionModule.setForeground(UtilsP.COLOR_BTN_GENERAL);
        this.add(descriptionModule);
        this.add(iconModule);
    }

    public JLabel getDescriptionModule() {
        return descriptionModule;
    }
    
    public JLabel getIconModule(){
        return iconModule;
    }
    
}
