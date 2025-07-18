package com.main;

import com.controller.DashbordController;
import com.controller.LoginController;
import com.model.UserModel;
import com.view.DashbordView;
import com.view.LoginView;

/**
 * Autor: Rolando Murillo Aguirre
 * Clase: Main
 * Descripción: [Clase principal de entrada al proyecto]
 * Fecha: 8 jul. 2025
 */
public class Main {
    private static LoginView lgn;
    private static UserModel usMod;
    private static LoginController logCont;
    private static DashbordController dshCont;
    private static DashbordView dash;
    
    public static void main(String[] args){
        //lgn = new LoginView();
        //usMod = new UserModel();
        //logCont = new LoginController(usMod, lgn);
        dash = new DashbordView();
        dshCont = new DashbordController(dash);
        
        //logCont.iniciar();
        dshCont.iniciar();
    }
}
