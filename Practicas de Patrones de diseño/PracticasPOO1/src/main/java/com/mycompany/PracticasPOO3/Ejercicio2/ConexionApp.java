/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO3.Ejercicio2;

/**
 *
 * @author pablo
 */
public class ConexionApp {
    private static ConexionApp conexion; 
    private String user; 
    private String pass; 
    
    public ConexionApp(){}
    public ConexionApp(String user, String pass){
        this.user = user; 
        this.pass = pass; 
    }
    
    public static ConexionApp getConnection(String u, String p){
        if(conexion != null){
            conexion = new ConexionApp(u,p); 
        }
        return null; 
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return " user=" + user + ", pass=" + pass + '}';
    }
    
    
    
}
