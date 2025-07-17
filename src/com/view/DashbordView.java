package com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import utilsProyect.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: DashbordView Descripción: Interfaz
 * gráfica del dashbord principal Fecha: 16 jul. 2025
 */
public class DashbordView extends JFrame {

    private JPanel boxContent;
    private JPanel container;
    
    public DashbordView() {
        this.setUndecorated(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new UtilsP().iconWindow());
        
        initComponent();
    }
    
    private void initComponent(){
        
    }

    private void mainPanel(){
        boxContent = new JPanel();//Box de contenido general
        container = new JPanel();//Contenedor del login
        
        
    }
    
}
