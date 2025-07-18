package com.controller;

import com.view.DashbordView;

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
    }

    public void iniciar() {
        dashView.setVisible(true);
    }
}
