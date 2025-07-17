package com.controller;

import com.model.UserModel;
import com.view.LoginView;
import com.view.DashbordView;
import javax.swing.JOptionPane;
import utilsProyect.UtilsP;

/**
 * Autor: Rolando Murillo Aguirre Clase: LoginController 
 * Descripción: Clase encargada de mostrar u ocultar las vistas, es un 
 * intermediario entre la parte gráfica (Vistas) y el modelo de negocio (Model)
 * del Login
 * Fecha: 16 jul. 2025
 */
public class LoginController {

    private UserModel model;
    private LoginView loginView;

    public LoginController(UserModel modelP, LoginView loginViewP) {
        this.model = modelP;
        this.loginView = loginViewP;

        this.loginView.btnEnter.addActionListener(((e) -> {
            String usr = model.sanitationUser(loginView.inputUser.getText());
            String psw = model.sanitationPasword(new String(loginView.inputPas
                    .getPassword()));

            if (model.userVerification(usr, psw)) {
                cleanInputs();
                msjSystem("Bienvenid@ "+usr);
                loginView.dispose();
                new DashbordView().setVisible(true);
            }else{
                cleanInputs();
                msjSystem("Usuario o contraseña incorrectos");
            }
        }));
    }

    private void msjSystem(String msj) {
        JOptionPane.showMessageDialog(loginView, msj, "Respuesta del sistema", 0,
                new UtilsP().resizeIcon());
    }
    
    private void cleanInputs (){
    loginView.inputUser.setText("");
    loginView.inputPas.setText("");
    }
    
     public void iniciar() {
        loginView.setVisible(true);
    }
}
