package com.controller;

import com.view.DashbordView;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Autor: Rolando Murillo Aguirre Clase: DashbordController Descripción: Clase
 * encargada de mostrar u ocultar las vistas, es un intermediario entre la parte
 * gráfica (Vistas) y el modelo de negocio (Model) del Dashbord Fecha: 16 jul.
 * 2025
 */
public class DashbordController {

    private final DashbordView dashView;
    private final String user;
    private final String initialModule = "MÓDULO DE VENTAS";

    public DashbordController(DashbordView dashViewP, String usrP,
            ImageIcon ic_initialP) {
        this.dashView = dashViewP;
        this.user = usrP;

        initialNav(initialModule,ic_initialP,user);
        initListeners();
    }

    public void iniciar() {
        dashView.setVisible(true);
    }

    private void initListeners() {
        // Salir
        dashView.getMenu().getBtnExit().addActionListener(e -> dashView.dispose());

        // Listeners para módulos
        addModuleListener(dashView.getMenu().getBtnVentas(), "MÓDULO DE VENTAS", Color.BLUE);
        addModuleListener(dashView.getMenu().getBtnInventario(), "MÓDULO DE INVENTARIO", Color.CYAN);
        addModuleListener(dashView.getMenu().getBtnResumen(), "MÓDULO DE RESUMEN", Color.GREEN);
        addModuleListener(dashView.getMenu().getBtnReportes(), "MÓDULO DE REPORTES", Color.PINK);
        addModuleListener(dashView.getMenu().getBtnClientes(), "MÓDULO DE CLIENTES",Color.magenta);
        addModuleListener(dashView.getMenu().getBtnEdicion(), "MÓDULO DE EDICIÓN", Color.orange);
    }

    /**
     * Método para registrar acción a un botón de menú y cambiar contenido del
     * módulo.
     */
    private void addModuleListener(JButton button, String moduleDescription,
            Color clr) {
        button.addActionListener(e -> {
            dashView.getNav().getDescriptionModule().setText(moduleDescription);
            dashView.getNav().getIconModule().setIcon(button.getIcon());
            dashView.getModule().setBackground(clr);
        });
    }
    
    private void initialNav(String txtInit, ImageIcon imgInit, String usr){
        dashView.getNav().getDescriptionModule().setText(txtInit);
        dashView.getNav().getIconModule().setIcon(imgInit);
        dashView.getNav().getUserName().setText(usr);
    }
    
}
