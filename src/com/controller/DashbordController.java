package com.controller;

import com.view.DashbordView;
import java.awt.Color;

/**
 * Autor: Rolando Murillo Aguirre Clase: DashbordController Descripción: Clase
 * encargada de mostrar u ocultar las vistas, es un intermediario entre la parte
 * gráfica (Vistas) y el modelo de negocio (Model) del Dashbord Fecha: 16 jul.
 * 2025
 */
public class DashbordController {

    private DashbordView dashView;
    
    public DashbordController(DashbordView dashViewP) {
        this.dashView = dashViewP;
        
        this.dashView.getMenu().getBtnExit().addActionListener((e) -> {
            dashView.dispose();
        });
        
        this.dashView.getMenu().getBtnVentas().addActionListener((e) -> {
            dashView.getModule().setBackground(Color.red);
        });
        
        this.dashView.getMenu().getBtnInventario().addActionListener((e) -> {
            dashView.getModule().setBackground(Color.BLUE);
        });
        
        this.dashView.getMenu().getBtnResumen().addActionListener((e) -> {
            dashView.getModule().setBackground(Color.CYAN);
        });
        
        this.dashView.getMenu().getBtnReportes().addActionListener((e) -> {
            dashView.getModule().setBackground(Color.GREEN);
        });
        
        this.dashView.getMenu().getBtnClientes().addActionListener((e) -> {
            dashView.getModule().setBackground(Color.MAGENTA);
        });
        
        this.dashView.getMenu().getBtnEdicion().addActionListener((e) -> {
            dashView.getModule().setBackground(Color.ORANGE);
        });
        
    }

    public void iniciar() {
        dashView.setVisible(true);
    }
}
