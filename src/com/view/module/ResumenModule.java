/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.module;

import com.module.AbstractModule;
import java.awt.*;
import javax.swing.*;

/**
 * Autor: Rolando Murillo Aguirre Clase: ResumenModule Descripción: [Breve
 * descripción] Fecha: 28 ago. 2025
 */
public class ResumenModule extends AbstractModule {

    public ResumenModule(Icon icon) {
        super("Resumen", "MÓDULO DE RESUMEN", icon);
        add(new JLabel("RESUMEN"), BorderLayout.NORTH);
        add(new JPanel(), BorderLayout.CENTER); // tu contenido
    }
}
