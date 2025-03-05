/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaspoo1.Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Router {
    private int velocidad; 
    private String marca; 
    private String nombreRed; 
    private String pass; 
    private List<DispositivoRed> dispositivos; 
    
    public Router(){this.dispositivos = new ArrayList<>();}
    public Router(int velocidad, String marca, String nombre, String pass){
        this(); 
        this.velocidad = velocidad ; 
        this.marca = marca; 
        this.nombreRed = nombre; 
        this.pass = pass; 
    }
    
    public void addDispositivo(DispositivoRed d){
        dispositivos.add(d); 
    }
    
    public void eliminarDispositivo(int id){
        Iterator it = dispositivos.iterator(); 
        while(it.hasNext()){
            DispositivoRed r = (DispositivoRed) it.next(); 
            if(r.getId() == id){
                dispositivos.remove(id); 
            }
        }
    }
    
    public String getNombreRed(){return this.nombreRed; }
    public String getPassRed(){return this.pass; }
    
    public List<DispositivoRed> listarDispositivos(){
        return this.dispositivos; 
    }
    
}
