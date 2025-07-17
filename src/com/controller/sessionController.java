package com.controller;

/**
 * Autor: Rolando Murillo Aguirre
 * Clase: sessionController
 * Descripción: [Breve descripción]
 * Fecha: 13 jul. 2025
 */
public class sessionController {
    
    private String user;
    private String password;
    
    public sessionController(){
    }
    
    public String sanitationUser(String usrP){
        user = usrP.trim();
        user = user.replaceAll("[^a-zA-Z0-9._*-]", "X");
        return user;
    }
    
    public boolean userVerification(String usrSan, String pswSan){
        boolean checked = false;
        
        if(usrSan.equals("Admin123") && pswSan.equals("Admin123")){
            checked = true;
        }
        
        return checked;
    }
    
    public String sanitationPasword(String pswP){
        password = pswP.trim();
        password = password.replaceAll("[^a-zA-Z0-9._*-]", "X");
        return password;
    }
    
}
