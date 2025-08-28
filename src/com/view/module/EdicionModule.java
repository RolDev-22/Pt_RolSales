package com.view.module;

import com.module.AbstractModule;
import java.awt.*;
import javax.swing.*;

/**
 * Autor: Rolando Murillo Aguirre
 * Clase: EdicionModule
 * Descripción: [Breve descripción]
 * Fecha: 28 ago. 2025
 */
public class EdicionModule extends AbstractModule{
      public EdicionModule(Icon icon) {
        super("Edición", "MÓDULO DE EDICIÓN", icon);
        add(new JLabel("EDICIÓN"), BorderLayout.NORTH);
        add(new JPanel(), BorderLayout.CENTER); // tu contenido
    }
}