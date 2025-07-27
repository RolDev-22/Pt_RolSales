
package com.utils;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Autor: Rolando Murillo Aguirre Clase: ButtonFactory Descripción: Interface
 * para la mejora lógica en la creación de botones del menu Fecha: 26 jul. 2025
 */
public interface ButtonFactory {

    JButton createMenuButton(String text);// Usa color por defecto

    JButton createMenuButton(String text, ImageIcon icon);//Icono personalizado
    
    JButton createMenuButton(String text, Color bgColor);//Color personalizado
    
    JButton createMenuButton(String text, Color bgColor, ImageIcon icon); //Botón personalizado

}
