/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO2.BridgeEjemplo;

/**
 *
 * @author pablo
 */
public class RoundShape extends Shape{
    private double radius; 
    
    public RoundShape(Color c, double r){
        super(c); 
        this.radius = r; 
    }
    
    public void setRadius(double number){this.radius = number;}
    public double getRadius(){return this.radius; }
    
    public String toString(){
        return "Color -> "+super.toString() + " Radius -> " + this.radius; 
    }
    
}
