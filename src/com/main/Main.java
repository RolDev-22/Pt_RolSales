package com.main;

import com.controller.DashbordController;
import com.controller.LoginController;
import com.model.UserModel;
import com.utils.UtilsP;
import com.view.DashbordView;
import com.view.LoginView;
import com.view.component.LoadingPage;

/**
 * Autor: Rolando Murillo Aguirre Clase: Main Descripción: [Clase principal de
 * entrada al proyecto] Fecha: 8 jul. 2025
 */
public class Main {

    private static LoginView lgn;
    private static UserModel usMod;
    private static LoginController logCont;
    
    private static DashbordController dshCont;
    private static DashbordView dshView;

    public static void main(String[] args) {

        LoadingPage loading = new LoadingPage();
        loading.setVisible(true);
        // Simula carga de datos (por ejemplo, 3 segundos)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        loading.dispose();

        //lgn = new LoginView();
        //usMod = new UserModel();
        //logCont = new LoginController(usMod, lgn);
        dshView = new DashbordView();
        dshCont = new DashbordController(dshView, "Rolando", new UtilsP().getIc_vts());

        //logCont.iniciar();
        dshCont.iniciar();
    }
}
