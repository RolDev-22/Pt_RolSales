package com.view.module;

import com.module.AbstractModule;
import javax.swing.*;
import java.awt.*;

/**
 * Autor: Rolando Murillo Aguirre Clase: VentasModule Descripción: [Breve
 * descripción] Fecha: 28 ago. 2025
 */
public class VentasModule extends AbstractModule {

    public VentasModule(String user, Icon icon) {
        super("ventas", "MÓDULO DE VENTAS", icon);
        add(new JLabel("Hola " + user + ", aquí va Ventas"), BorderLayout.NORTH);
        add(new JScrollPane(new JTable(/* TableModel de ventas */)), BorderLayout.CENTER);
    }

}
