package com.view.module;

import com.module.AbstractModule;
import java.awt.*;
import javax.swing.*;

/**
 * Autor: Rolando Murillo Aguirre Clase: InventarioModule Descripción: [Breve
 * descripción] Fecha: 28 ago. 2025
 */
public class InventarioModule extends AbstractModule {

    public InventarioModule(Icon icon) {
        super("inventario", "MÓDULO DE INVENTARIO", icon);
        add(new JLabel("Inventario"), BorderLayout.NORTH);
        add(new JPanel(), BorderLayout.CENTER); // tu contenido
    }
}
