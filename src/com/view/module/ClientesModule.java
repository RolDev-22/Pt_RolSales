package com.view.module;

import com.module.AbstractModule;
import java.awt.*;
import javax.swing.*;

/**
 * Autor: Rolando Murillo Aguirre
 * Clase: ClientesModule
 * Descripción: [Breve descripción]
 * Fecha: 28 ago. 2025
 */
public class ClientesModule extends AbstractModule{
      public ClientesModule(Icon icon) {
        super("Clientes", "MÓDULO DE CLIENTES", icon);
        add(new JLabel("CLIENTES"), BorderLayout.NORTH);
        add(new JPanel(), BorderLayout.CENTER); // tu contenido
    }

}
