/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaspoo1.Clases;

/**
 *
 * @author pablo
 */
abstract public class DispositivoRed extends Router{
    
    protected int id; 
    protected String nombreRed; 
    protected String contrasenaRed; 
    protected String ip; 
    protected boolean conectado; 
    
    public DispositivoRed(){
        
    }
    
    public DispositivoRed(int id, String nombre, String contra, String ip){
        this(); 
        this.id = id; 
        this.nombreRed = nombre; 
        this.contrasenaRed = contra; 
        this.ip = ip; 
        this.conectado = false; 
    }
    
    public boolean conectar(Router r){
        
        if(r.getNombreRed().equals(this.nombreRed) &&  r.getPassRed().equals(this.contrasenaRed)){
            r.addDispositivo(this);
            
        }else{
            System.out.println("No se ha podido conectar a la red...");
        }
       
        return false; 
    }
    
    public void desconectar(Router r){
        if(this.conectado == true){
            r.eliminarDispositivo(this.id);
        }else{
            System.out.println("El dispositivo no está conectado...");
        }
        
    }
    
    public int getId(){return this.id; }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" ID -> ").append(this.id).append(" Nombre Red -> ").append(this.nombreRed)
                .append(" Contraseña -> ").append(this.contrasenaRed).append(" IP -> ").append(this.ip)
                .append(" Conectado -> ").append(this.conectado).append("\n"); 
        return sb.toString(); 
    }
    
}
