package com.controller;

import com.view.DashbordView;
import javax.swing.JButton;

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
        initListeners();
    }

    public void iniciar() {
        dashView.setVisible(true);
    }

    private void initListeners() {
        // Salir
        dashView.getMenu().getBtnExit().addActionListener(e -> dashView.dispose());

        // Listeners para módulos
        addModuleListener(dashView.getMenu().getBtnVentas(), "MÓDULO DE VENTAS");
        addModuleListener(dashView.getMenu().getBtnInventario(), "MÓDULO DE INVENTARIO");
        addModuleListener(dashView.getMenu().getBtnResumen(), "MÓDULO DE RESUMEN");
        addModuleListener(dashView.getMenu().getBtnReportes(), "MÓDULO DE REPORTES");
        addModuleListener(dashView.getMenu().getBtnClientes(), "MÓDULO DE CLIENTES");
        addModuleListener(dashView.getMenu().getBtnEdicion(), "MÓDULO DE EDICIÓN");
    }

    /**
     * Método para registrar acción a un botón de menú y cambiar contenido del
     * módulo.
     */
    private void addModuleListener(JButton button, String moduleDescription) {
        button.addActionListener(e -> {
            dashView.getNav().getDescriptionModule().setText(moduleDescription);
            dashView.getNav().getIconModule().setIcon(button.getIcon());
        });
    }
}
