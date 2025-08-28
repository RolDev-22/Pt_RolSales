package com.controller;

import com.view.component.LoadingPage;
import javax.swing.Timer;

/**
 * Autor: Rolando Murillo Aguirre Clase: LoadController Descripción: Clase
 * encargada de el control de la página de loading Fecha: 27 ago. 2025
 */
public class LoadController {

    private final LoadingPage loadPage;

    public LoadController() {
        this.loadPage = new LoadingPage();
    }

    public void init() {
        loadPage.setVisible(true);
        try {
            Thread.sleep(3000);
            disguise();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    // Muestra el loading por 'millis' y luego ejecuta 'onFinish' en el EDT
    public void showFor(int millis, Runnable onFinish) {
        loadPage.setLocationRelativeTo(null);
        loadPage.setVisible(true);
        new Timer(millis, e -> {
            disguise();
            if (onFinish != null) {
                onFinish.run();
            }
        }) {
            {
                setRepeats(false);
            }
        }.start();
    }

    public void disguise() {
        loadPage.dispose();
    }
}
