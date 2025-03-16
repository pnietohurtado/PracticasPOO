/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaspoo1.Clases;

/**
 *
 * @author pablo
 */
public class Ordenador extends DispositivoRed{
    
    private String nombreUsuario; 
    private String marca; 
    
    public Ordenador(int id, String nombre1, String contra, String ip,String nombre, String marca){
        super(id, nombre1, contra, ip);
        this.nombreUsuario = nombre; 
        this.marca = marca ;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" Nombre del Usuario -> ").append(this.nombreUsuario).append(" Marca -> ").append(this.marca)
                .append("\n"); 
        return sb.toString(); 
    }
    
}
