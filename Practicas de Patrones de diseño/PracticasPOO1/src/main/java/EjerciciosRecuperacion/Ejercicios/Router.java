/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecuperacion.Ejercicios;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Router {
    
    private String nombre; 
    private String pass; 
    private ArrayList<Dispositivo> dispositivos_conectados; 
    
    
    public Router(){
        this.dispositivos_conectados = new ArrayList<>(); 
    }
    
    public Router(String nombre, String pass){
        this(); 
        this.nombre = nombre; 
        this.pass = pass; 
    }
    
    public void setNombre(String n){
        this.nombre = n; 
    }
    public void setPass(String p){this.pass = p; }
    public String getNombre(){return this.nombre; }
    public String getPass(){return this.pass; }
    
    public void addDispositivo(Dispositivo d){
        if(d.getNombre().equals(this.nombre) && d.getPass().equals(this.pass)){
            this.dispositivos_conectados.add(d); 
        }
    }
    
    public ArrayList devuelve(){
        return this.dispositivos_conectados; 
    }
    
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append("Nombre Red: ").append(this.nombre).append(" Password: ").append(this.pass).append("\n"); 
        return sb.toString(); 
    }
    
}
