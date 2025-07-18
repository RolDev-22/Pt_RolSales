package com.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import utilsProyect.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: DashbordView Descripción: Interfaz
 * gráfica del dashbord principal Fecha: 16 jul. 2025
 */
public class DashbordView extends JFrame {
    
    private final int heihtgWindow = new UtilsP().heigthWindow();

    private JPanel boxContent;
    private JPanel container;
    private JButton btnPb;
    

    public DashbordView() {
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
        boxContent = new JPanel();//Box de contenido general
        boxContent.setBackground(new Color(67, 170, 211, 50));
        boxContent.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        container();
        this.add(boxContent);
    }

    private void container() {
        container = new JPanel();//Contenedor del general
        container.setLayout(null);
        container.setPreferredSize(new Dimension(250, heihtgWindow));

        btnGerally();
        boxContent.add(container);
    }

    private void btnGerally() {
        btnPb = new JButton("Salir");
        btnPb.setSize(200, 100);

        container.add(btnPb);

        btnPb.addActionListener((e) -> {
            this.dispose();
        });
    }
}
