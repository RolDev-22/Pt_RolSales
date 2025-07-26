package com.view.component;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

/**
 * Autor: Rolando Murillo Aguirre Clase: LoadingPage Descripción: Clase
 * especialmente creada para la simulación de carga entre respuestas con
 * servidor o bien, navegación entre interfaces visuales Fecha: 26 jul. 2025
 */
public class LoadingPage extends JFrame {

    public LoadingPage() {

        setTitle("Cargando...");
        setUndecorated(true); // Sin bordes ni botones
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Evita cerrar accidentalmente
        setLayout(new BorderLayout(10, 10));

        JLabel message = new JLabel("Cargando, por favor espere...");
        message.setHorizontalAlignment(SwingConstants.CENTER);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true); // Barra en modo "infinito"
        progressBar.setBorderPainted(false);

        add(message, BorderLayout.CENTER);
        add(progressBar, BorderLayout.SOUTH);
    }

}
