package com.view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import utilsProyect.UtilsP;
import com.view.component.Menu;
import com.view.component.Nav;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

/**
 * Autor: Rolando Murillo Aguirre Clase: DashbordView Descripción: Interfaz
 * gráfica del dashbord principal Fecha: 16 jul. 2025
 */
public class DashbordView extends JFrame {

    private JPanel boxContent;
    private JPanel module;
    private GridBagConstraints gbc;
    public Menu men = new Menu();
    public Nav nav = new Nav();

    public DashbordView() {
        gbc = new GridBagConstraints();

        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new UtilsP().iconWindow());
        initComponent();
    }

    private void initComponent() {
        mainPanel();
    }

    private void mainPanel() {
        boxContent = new JPanel(new GridBagLayout());//Box de contenido general
        boxContent.setBackground(new Color(67, 170, 211, 50));

        module = new JPanel();
        module.setBackground(Color.red);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTH;
        boxContent.add(nav.navInit(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 5;
        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        boxContent.add(men.menInit(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        boxContent.add(module, gbc);

        this.add(boxContent);
    }

}
