package com.main;

import com.controller.LoadController;
import com.controller.LoginController;
import com.model.UserModel;
import com.view.LoginView;

/**
 * Autor: Rolando Murillo Aguirre Clase: Main Descripción: [Clase principal de
 * entrada al proyecto] Fecha: 8 jul. 2025
 */
public class Main {

    private static LoginView lgn;
    private static UserModel usMod;
    private static LoginController logCont;

    private static LoadController ldCont;

    public static void main(String[] args) {

        ldCont = new LoadController();
        ldCont.init();//Inicio de loadpage
        
        lgn = new LoginView();
        usMod = new UserModel();
        logCont = new LoginController(usMod, lgn, ldCont);

        
        logCont.iniciar();//inicio de la vista del login
    }
}
