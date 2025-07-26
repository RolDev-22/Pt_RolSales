package com.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Autor: Rolando Murillo Aguirre Clase: Utils Descripción: Java class con
 * funciones y componentes reutilizables Fecha: 16 jul. 2025
 */
public class UtilsP implements ButtonFactory {

    //Variables de colores generales para componentes de la app
    public static final Color COLOR_BTN_GENERAL = new Color(56, 179, 217, 240);
    public static final Color COLOR_BTN_AUX = new Color(23, 240, 100, 240);
    public static final Color COLOR_BACKGROUND = new Color(18, 52, 88);
    public static final Color COLOR_BTN_AUX2 = new Color(240, 30, 90);

    //Imagen de usuario para la aplicacíon
    private final ImageIcon imageIconUs = new ImageIcon(getClass()
            .getResource("/assets/log_user.png"));
    //Imagen tipo ícono de la app
    private final ImageIcon imageIcon = new ImageIcon(getClass()
            .getResource("/assets/log.png"));
    //Redimención de la imagen tipo icono de usuario para mejor adaptación
    private final Image iconUs = imageIconUs.getImage()
            .getScaledInstance(110, 110, Image.SCALE_SMOOTH);
    private final Image iconIcon = imageIcon.getImage()
            .getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    private final Image icon = imageIcon.getImage();
    //variable que permite implementar la clase Toolkit para luego obtener el 
    //width de la pantalla
    private final Toolkit tk = Toolkit.getDefaultToolkit();

    //Variable que almacena las dimensiones de la panatlla
    private final Dimension screnSize = tk.getScreenSize();

    //Icono de usuario redimencionado para buena adaptación visual
    private final ImageIcon resizeIconUs = new ImageIcon(iconUs);
    //Icono de la app
    private final ImageIcon resizeIconApp = new ImageIcon(iconIcon);

    public UtilsP() {
    }

    //Método que retorna el icono de usuario redimencionado
    public ImageIcon resizeIcon() {
        return resizeIconUs;
    }

    //Método que retorna el icono de la app redimencionado
    public ImageIcon resizeIconApp() {
        return resizeIconApp;
    }

    //Método que retorna el icono de la app para uso
    public Image iconWindow() {
        return icon;
    }

    //Método que retorna la altura de la pantalla del dispositivo
    public int heigthWindow() {
        return screnSize.height;
    }

    @Override
    public JButton createMenuButton(String text) {
        return createMenuButton(text, COLOR_BTN_GENERAL);
    }

    @Override
    public JButton createMenuButton(String text, Color bgColor) {
        JButton btn = new JButton(text);
        btn.setBackground(bgColor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 16));
        btn.setPreferredSize(new Dimension(200, 0));
        return btn;
    }

    public Image getIcon() {
        return icon;
    }

}
