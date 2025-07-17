package com.main;

import com.controller.LoginController;
import com.model.UserModel;
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
    
    public static void main(String[] args){
        lgn = new LoginView();
        usMod = new UserModel();
        logCont = new LoginController(usMod, lgn);
        
        logCont.iniciar();
    }
}
