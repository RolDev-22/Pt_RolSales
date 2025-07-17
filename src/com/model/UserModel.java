/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 * Autor: Rolando Murillo Aguirre Clase: userModel 
 * Descripción: Clase Model donde se realiza todo lo asociado a validar el
 * usuario
 * Fecha: 16 jul. 2025
 */
public class UserModel {

    private String user;
    private String password;

    public String sanitationUser(String usrP) {
        user = usrP.trim();
        user = user.replaceAll("[^a-zA-Z0-9._*-]", "X");
        return user;
    }

    public String sanitationPasword(String pswP) {
        password = pswP.trim();
        password = password.replaceAll("[^a-zA-Z0-9._*-]", "X");
        return password;
    }

    public boolean userVerification(String usrSan, String pswSan) {
        boolean checked = false;

        if (usrSan.equals("Admin123") && pswSan.equals("Admin123")) {
            checked = true;
        }

        return checked;
    }
}
