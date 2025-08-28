/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.module;

/**
 * Autor: Rolando Murillo Aguirre Clase: ModuleManeger Descripción: Manager para
 * el control de carga de los distintos módulos así como la actualización de
 * información dentro de los mismos Fecha: 28 ago. 2025
 */
import javax.swing.*;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModuleManager {

    private final JPanel container;           // panel central del dashboard
    private final CardLayout layout;
    private final Map<String, Supplier<? extends Module>> registry = new HashMap<>();
    private final Map<String, Module> cache = new HashMap<>();
    private Module current;
    private Consumer<Module> navUpdater = m -> {
    }; // para actualizar Nav

    public ModuleManager(JPanel container) {
        this.container = container;
        this.layout = new CardLayout();
        container.setLayout(layout);
    }

    public void setNavUpdater(Consumer<Module> updater) {
        this.navUpdater = updater;
    }

    public void register(String key, Supplier<? extends Module> factory) {
        registry.put(key, factory);
    }

    public void preload(String key) { // opcional: crear por adelantado
        ensure(key);
    }

    public void show(String key) {
        Module next = ensure(key);
        if (next == null) {
            throw new IllegalArgumentException("Módulo no registrado: " + key);
        }
        if (current != null) {
            current.onHide();
        }

        layout.show(container, key);
        navUpdater.accept(next);
        next.onShow();
        current = next;
    }

    private Module ensure(String key) {
        if (!registry.containsKey(key)) {
            return null;
        }
        return cache.computeIfAbsent(key, k -> {
            Module m = registry.get(k).get();
            container.add(m.getPanel(), k);
            return m;
        });
    }

    public void refresh(String key) { // por si quieres reconstruir un módulo puntual
        if (cache.containsKey(key)) {
            Module m = cache.remove(key);
            container.remove(m.getPanel());
        }
        ensure(key);
    }

    public Module getCurrent() {
        return current;
    }
}

