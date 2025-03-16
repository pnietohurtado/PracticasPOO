/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO2.BridgeEjemplo;

/**
 *
 * @author pablo
 */
public enum Color {
    ROJO ("Rojo"), 
    AZUL ("Azul"); 
    
    private String name; 
    
    private Color(String n){
        this.name = n; 
    }
    
    public String toString(){
        return this.name; 
    }
}
