package com.module;

/**
 * Autor: Rolando Murillo Aguirre Clase: AbstractModule Descripción: [Breve
 * descripción] Fecha: 28 ago. 2025
 */
import javax.swing.*;
import java.awt.*;

public abstract class AbstractModule extends JPanel implements Module {

    private final String key, title;
    private final Icon icon;

    protected AbstractModule(String key, String title, Icon icon) {
        this.key = key;
        this.title = title;
        this.icon = icon;
        setLayout(new BorderLayout());
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Icon getIcon() {
        return icon;
    }

    @Override
    public JPanel getPanel() {
        return this;
    }
}
