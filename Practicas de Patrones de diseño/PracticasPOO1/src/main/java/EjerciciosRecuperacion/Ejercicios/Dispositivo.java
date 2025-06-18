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
abstract public class Dispositivo<T> extends Router{
    
    private String nombre; 
    private String pass; 
    private String user; 
    private ArrayList<T> dispositivos; 
    
    public Dispositivo(){
        this.dispositivos = new ArrayList<>(); 
    }
    
    public Dispositivo(String nombre, String pass, String user){
        this(); 
        this.nombre = nombre; 
        this.pass = pass; 
        this.user = user; 
    }
    
    public String getNombre(){return this.nombre; }
    public String getPass(){return this.pass; }
    
    public void addList(T dis){
        dispositivos.add(dis); 
    }
    
    public ArrayList devuelve(){
        return this.dispositivos; 
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append("Nombre: ").append(this.nombre).append(" Password: ").append(this.pass).append(" User: ").append(this.user); 
        return sb.toString(); 
    }
    
}
