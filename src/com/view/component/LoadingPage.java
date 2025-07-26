package com.view.component;

import com.utils.UtilsP;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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

        setUndecorated(true); // Sin bordes ni botones
        setSize(250, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Evita cerrar accidentalmente
        setLayout(new BorderLayout(10, 10));

        JLabel message = new JLabel("CARGANDO, POR FAVOR ESPERE...");
        message.setFont(new Font("arial", Font.ROMAN_BASELINE, 12));
        message.setForeground(UtilsP.COLOR_BTN_GENERAL);
        message.setHorizontalAlignment(SwingConstants.CENTER);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true); // Barra en modo "infinito"
        progressBar.setBorderPainted(false);
        progressBar.setBackground(UtilsP.COLOR_BACKGROUND);
        progressBar.setForeground(UtilsP.COLOR_BTN_AUX);

        add(message, BorderLayout.CENTER);
        add(progressBar, BorderLayout.SOUTH);
    }

}
