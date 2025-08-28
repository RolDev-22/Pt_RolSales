package com.controller;

import com.view.component.LoadingPage;

/**
 * Autor: Rolando Murillo Aguirre Clase: LoadController Descripción: Clase
 * encargada de el control de la página de loading Fecha: 27 ago. 2025
 */
public class LoadController {

    private final LoadingPage loadPage;

    public LoadController(LoadingPage loadPageP) {
        this.loadPage = loadPageP;
    }

    public void initSesion() {
        loadPage.setVisible(true);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        disguise();
    }

    public void disguise() {
        loadPage.dispose();
    }
}
