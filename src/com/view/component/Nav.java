package com.view.component;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import com.utils.UtilsP;
import java.util.Objects;

/**
 * Autor: Rolando Murillo Aguirre
 * Clase: Nav
 * Descripción: Barra de navegación principal de la app
 * Fecha: 18 jul. 2025
 */
public final class Nav extends JPanel {

    private static final Font NAV_FONT = new Font("Georgina", Font.PLAIN, 18);
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final UtilsP utilsTools;

    private final JLabel descriptionModule = createStyledLabel();
    private final JLabel iconModule = new JLabel();
    private final JLabel userName = createStyledLabel();
    private final JLabel iconUser = new JLabel();
    private final JLabel timeView = createStyledLabel();
    private final JLabel iconTime = new JLabel();

    private final JPanel boxLeft = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
    private final JPanel boxCenter = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
    private final JPanel boxRight = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));

    public Nav(UtilsP utilsTools) {
        this.utilsTools = Objects.requireNonNull(utilsTools, "UtilsP no puede ser null");
        initPanel();
        initComponents();
        initClock();
    }

    private void initPanel() {
        setBackground(UtilsP.COLOR_BACKGROUND);
        setPreferredSize(new Dimension(0, 50));
        setLayout(new BorderLayout(10, 10));

        boxLeft.setOpaque(false);
        boxCenter.setOpaque(false);
        boxRight.setOpaque(false);

        add(boxLeft, BorderLayout.WEST);
        add(boxCenter, BorderLayout.CENTER);
        add(boxRight, BorderLayout.EAST);
    }

    private void initComponents() {
        iconUser.setIcon(utilsTools.getIc_usr());
        iconTime.setIcon(utilsTools.getIc_time());

        boxLeft.add(descriptionModule);
        boxLeft.add(iconModule);

        boxCenter.add(timeView);
        boxCenter.add(iconTime);

        boxRight.add(userName);
        boxRight.add(iconUser);
    }

    private void initClock() {
        Timer timer = new Timer(1000, e -> {
            String hora = LocalTime.now().format(TIME_FORMAT);
            String fecha = LocalDate.now().format(DATE_FORMAT);
            timeView.setText(fecha + " - " + hora);
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    private JLabel createStyledLabel() {
        JLabel label = new JLabel();
        label.setFont(NAV_FONT);
        label.setForeground(UtilsP.COLOR_BTN_GENERAL);
        return label;
    }

    // Getters públicos para modificar contenido desde fuera
    public JLabel getDescriptionModule() {
        return descriptionModule;
    }

    public JLabel getIconModule() {
        return iconModule;
    }

    public JLabel getIconUser() {
        return iconUser;
    }

    public JLabel getUserName() {
        return userName;
    }
}
