package com.view.module;

import com.module.AbstractModule;
import java.awt.*;
import javax.swing.*;

/**
 * Autor: Rolando Murillo Aguirre Clase: ReportesModule Descripción: [Breve
 * descripción] Fecha: 28 ago. 2025
 */
public class ReportesModule extends AbstractModule {

    public ReportesModule(Icon icon) {
        super("Reportes", "MÓDULO DE REPORTES", icon);
        add(new JLabel("REPORTES"), BorderLayout.NORTH);
        add(new JPanel(), BorderLayout.CENTER); // tu contenido
    }
}
