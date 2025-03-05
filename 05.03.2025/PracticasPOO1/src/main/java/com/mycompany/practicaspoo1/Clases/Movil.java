/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaspoo1.Clases;

/**
 *
 * @author pablo
 */
public class Movil extends DispositivoRed{
    private String numTelf; 
    private String pin; 
    private String marca; 
    
    public Movil(int id, String nombre1, String contra, String ip, String num, String pin, String marca){
        super(id, nombre1, contra, ip);
        this.numTelf = num; 
        this.pin = pin; 
        this.marca = marca;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" Número de teléforno -> ").append(this.numTelf).append(" Pin -> ").append(this.pin)
                .append(" Marca -> ").append(this.marca).append("\n"); 
        return sb.toString(); 
    }
    
}
