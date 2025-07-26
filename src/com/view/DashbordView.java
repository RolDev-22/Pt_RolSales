package com.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.utils.UtilsP;
import com.view.component.Menu;
import com.view.component.Nav;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;

/**
 * Autor: Rolando Murillo Aguirre Clase: DashbordView Descripción: Interfaz
 * gráfica del dashbord principal Fecha: 16 jul. 2025
 */
public class DashbordView extends JFrame {

    private final GridBagConstraints gbc;
    private final Menu menu;
    private final Nav navbar;
    private final UtilsP util;

    private JPanel boxContent;
    private JPanel module;

    public DashbordView() {
        gbc = new GridBagConstraints();
        util = new UtilsP();
        menu = new Menu(util);
        navbar = new Nav(util);

        this.setTitle("SISTEME DE VENTA ROLSALES");
        this.setUndecorated(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(this.util.iconWindow());
        this.setMinimumSize(new Dimension(700, 600));
        initComponent();
    }

    private void initComponent() {
        mainPanel();
    }

    private void mainPanel() {
        boxContent = new JPanel(new GridBagLayout());//Box de contenido general
        module = new JPanel();//Contenido de las pantallas según el módulo

        boxContent.setBackground(new Color(67, 170, 211, 50));
        module.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTH;
        boxContent.add(navbar, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 5;
        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        boxContent.add(menu, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        boxContent.add(module, gbc);

        this.add(boxContent);
    }

    public Menu getMenu() {
        return menu;
    }

    public Nav getNav() {
        return navbar;
    }

    public JPanel getModule() {
        return module;
    }
}
