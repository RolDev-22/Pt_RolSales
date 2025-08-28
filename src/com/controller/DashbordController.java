package com.controller;

import com.module.ModuleManager;
import com.view.DashbordView;
import com.view.module.*;
import com.utils.UtilsP;
import javax.swing.*;
import java.awt.Color;

public class DashbordController {

    private final DashbordView dashView;
    private final String user;
    private final ModuleManager modules;

    public DashbordController(DashbordView dashViewP, String usrP, ImageIcon icInitial) {
        this.dashView = dashViewP;
        this.user = usrP;

        // 1) Crear manager sobre el panel central:
        this.modules = new ModuleManager(dashView.getModule());

        // 2) Definir cómo se actualiza el Nav del dashboard
        modules.setNavUpdater(m -> {
            dashView.getNav().getDescriptionModule().setText(m.getTitle());
            dashView.getNav().getIconModule().setIcon(m.getIcon());
            dashView.getNav().getUserName().setText(user);
        });

        // 3) Registrar módulos (lazy). Usa tus propios iconos desde UtilsP:
        UtilsP u = new UtilsP();
        modules.register("ventas",     () -> new VentasModule(user, u.getIc_vts()));
        modules.register("inventario", () -> new InventarioModule(u.getIc_stk()));
        modules.register("resumen",    () -> new ResumenModule(u.getIc_rsm()));
        modules.register("reportes",   () -> new ReportesModule(u.getIc_rpts()));
        modules.register("clientes",   () -> new ClientesModule(u.getIc_clts()));
        modules.register("edicion",    () -> new EdicionModule(u.getIc_edt()));

        // 4) Listeners de menú -> mostrar por clave
        addModuleListener(dashView.getMenu().getBtnVentas(), "ventas");
        addModuleListener(dashView.getMenu().getBtnInventario(), "inventario");
        addModuleListener(dashView.getMenu().getBtnResumen(), "resumen");
        addModuleListener(dashView.getMenu().getBtnReportes(), "reportes");
        addModuleListener(dashView.getMenu().getBtnClientes(), "clientes");
        addModuleListener(dashView.getMenu().getBtnEdicion(), "edicion");

        // 5) Inicial
        modules.show("ventas"); // muestra y actualiza Nav
        initListenersGenerales();
    }

    public void iniciar() { dashView.setVisible(true); }

    private void addModuleListener(JButton button, String key) {
        button.addActionListener(e -> modules.show(key));
    }

    private void initListenersGenerales() {
        dashView.getMenu().getBtnExit().addActionListener(e -> dashView.dispose());
    }
}
