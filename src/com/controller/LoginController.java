package com.controller;

import com.model.UserModel;
import com.view.LoginView;
import com.view.DashbordView;
import javax.swing.JOptionPane;
import com.utils.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: LoginController Descripción: Clase
 * encargada de mostrar u ocultar las vistas, es un intermediario entre la parte
 * gráfica (Vistas) y el modelo de negocio (Model) del Login Fecha: 16 jul. 2025
 */
public class LoginController {

    private UserModel model;
    private LoginView loginView;
    private final LoadController loadCont;
    private static DashbordView dashbordView;
    private static DashbordController dashbordCont;

    public LoginController(UserModel modelP, LoginView loginViewP,
            LoadController loadContP) {
        this.model = modelP;
        this.loginView = loginViewP;
        this.loadCont = loadContP;
        dashbordView = new DashbordView();

        this.loginView.btnEnter.addActionListener(((e) -> {
            String usr = model.sanitationUser(loginView.inputUser.getText());
            String psw = model.sanitationPasword(new String(loginView.inputPas
                    .getPassword()));
            initDashboard(usr, psw);
        }));
    }

    private void initDashboard(String usrP, String pswP) {
        if (model.userVerification(usrP, pswP)) {
            cleanInputs();
            msjSystem("Bienvenid@ " + usrP);
            loginView.dispose();

            // Mostrar loading 3s y luego abrir el dashboard
            loadCont.showFor(3000, () -> {
                dashbordCont = new DashbordController(
                        dashbordView, usrP, new UtilsP().getIc_vts()
                );
                dashbordCont.iniciar();
            });

        } else {
            cleanInputs();
            msjSystem("Usuario o contraseña incorrectos");
        }
    }

    private void msjSystem(String msj) {
        JOptionPane.showMessageDialog(loginView, msj, "Respuesta del sistema", 0,
                new UtilsP().resizeIcon());
    }

    private void cleanInputs() {
        loginView.inputUser.setText("");
        loginView.inputPas.setText("");
    }

    public void iniciar() {
        loginView.setVisible(true);
    }
}
