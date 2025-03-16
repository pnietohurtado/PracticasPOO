/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO2.BridgeEjemplo;

/**
 *
 * @author pablo
 */
public abstract class Shape {
    
    private Color color; 
    
    public Shape(Color c){
        this.color = c; 
    }
    
    
    public String toString(){
        return this.color.toString(); 
    }
}
