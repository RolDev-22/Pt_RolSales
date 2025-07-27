package com.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * Autor: Rolando Murillo Aguirre Clase: Utils Descripción: Java class con
 * funciones y componentes reutilizables Fecha: 16 jul. 2025
 */
public class UtilsP implements ButtonFactory {

    private ImageIcon imgAux;

    //Variables de colores generales para componentes de la app
    public static final Color COLOR_BTN_GENERAL = new Color(56, 179, 217);
    public static final Color COLOR_BTN_AUX = new Color(23, 240, 100);
    public static final Color COLOR_BACKGROUND = new Color(18, 52, 88);
    public static final Color COLOR_BTN_AUX2 = new Color(240, 30, 90);

    //Obtención redimencionada del logo de usuario
    private final Image img_Us = getImage("logo_user.png", 110);

    //Obtención redimencionada del logo de la app
    private final Image img_App = getImage("logo_app.png", 130);

    //iconos de la app
    private final ImageIcon ic_Us = new ImageIcon(img_Us);
    private final ImageIcon ic_App = new ImageIcon(img_App);
    private final ImageIcon ic_df = new ImageIcon(getImage("img_dfault.png",
            25));
    private final ImageIcon ic_vts = new ImageIcon(getImage("img_vts.png",
            25));
    private final ImageIcon ic_clts = new ImageIcon(getImage("img_clts.png",
            25));
    private final ImageIcon ic_edt = new ImageIcon(getImage("img_edt.png",
            25));
    private final ImageIcon ic_ext = new ImageIcon(getImage("img_ext.png",
            25));
    private final ImageIcon ic_rpts = new ImageIcon(getImage("img_rpts.png",
            25));
    private final ImageIcon ic_stk = new ImageIcon(getImage("img_stk.png",
            25));
    private final ImageIcon ic_rsm = new ImageIcon(getImage("img_resum.png",
            25));
    private final ImageIcon ic_usr = new ImageIcon(getImage("img_usr.png",
            25));
    private final ImageIcon ic_time = new ImageIcon(getImage("img_time.png",
            25));

    //variable que permite implementar la clase Toolkit para luego obtener el 
    //width de la pantalla
    private final Toolkit tk = Toolkit.getDefaultToolkit();

    //Variable que almacena las dimensiones de la panatlla
    private final Dimension screnSize = tk.getScreenSize();

    public UtilsP() {
    }

    //Método que retorna el icono de usuario redimencionado
    public ImageIcon resizeIcon() {
        return ic_Us;
    }

    //Método que retorna el icono de la app redimencionado
    public ImageIcon resizeIconApp() {
        return ic_App;
    }

    //Método que retorna el icono de la app para uso
    public Image iconWindow() {
        return img_App;
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
    public JButton createMenuButton(String text, ImageIcon icon){
        return createMenuButton(text, COLOR_BTN_GENERAL, icon);
    }
    
    @Override
    public JButton createMenuButton(String text, Color bgColor) {
        return createMenuButton(text, bgColor, ic_df);
    }

    @Override
    public JButton createMenuButton(String text, Color bgColor, ImageIcon icon) {
        JButton btn = new JButton(text);

        btn.setBackground(bgColor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 16));
        btn.setPreferredSize(new Dimension(200, 0));
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setIconTextGap(50);
        btn.setIcon(icon);
        //btn.add(logoAux_Btn);
        return btn;
    }

    //Método privado para la optención de imágenes redimencionadas desde la 
    //carpeta Assets
    private Image getImage(String nameFile, int val) {

        try {
            imgAux = new ImageIcon(getClass().getResource("/assets/"
                    + nameFile));
        } catch (Exception e) {
            //se retorna una imagen default establecida en caso de error
            imgAux = new ImageIcon(getClass().getResource("/assets/"
                    + "img_dfault.png"));
        }

        return resizeImage(imgAux, val);
    }

    //Método privado para la redimención de los iconos de la app
    private Image resizeImage(ImageIcon img, int val) {
        return img.getImage().getScaledInstance(val, val, Image.SCALE_SMOOTH);
    }

    public ImageIcon getIc_df() {
        return ic_df;
    }

    public ImageIcon getIc_vts() {
        return ic_vts;
    }

    public ImageIcon getIc_clts() {
        return ic_clts;
    }

    public ImageIcon getIc_edt() {
        return ic_edt;
    }

    public ImageIcon getIc_ext() {
        return ic_ext;
    }

    public ImageIcon getIc_rpts() {
        return ic_rpts;
    }

    public ImageIcon getIc_stk() {
        return ic_stk;
    }
    
    public ImageIcon getIc_rsm(){
        return ic_rsm;
    }
    
    public ImageIcon getIc_usr(){
        return ic_usr;
    }
    
    public ImageIcon getIc_time(){
        return ic_time;
    }

}
