/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class EventoDeportivo extends EventosEnVivo{
    
    private List<String> equipos; 
    private String lugar; 
    
    public EventoDeportivo(String titulo, int duracion, String categoria, int puntuacion, String fecha, String horaInicio, double precioEntrada, int capacidadMaxima) {
        super(titulo, duracion, categoria, puntuacion, fecha, horaInicio, precioEntrada, capacidadMaxima);
        this.equipos = new ArrayList<>();
    }
    public EventoDeportivo(String titulo, int duracion, String categoria, int puntuacion, String fecha, String horaInicio, double precioEntrada, int capacidadMaxima, String lugar){
        this(titulo, duracion, categoria, puntuacion, fecha, horaInicio, precioEntrada, capacidadMaxima);
        this.lugar = lugar; 
    }

    public List<String> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<String> equipos) {
        this.equipos = equipos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Equipos{"+this.equipos+"}\n Lugar "+this.lugar);
    }
    
    public boolean esContenidoPopular(){
        if(super.getPuntuacion() > 8){
            return true; 
        }
        return false; 
    }

    @Override
    public String toString() {
        return super.toString() + "equipos=" + equipos + ", lugar=" + lugar + "\n";
    }
    
    
    
    
    
    
    
    
    
    
}
