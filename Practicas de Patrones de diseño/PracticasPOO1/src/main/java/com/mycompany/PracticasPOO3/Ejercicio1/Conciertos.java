/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO3.Ejercicio1;

/**
 *
 * @author pablo
 */
public class Conciertos extends EventosEnVivo{
    
    private String artista; 
    private String ubicacion; 
    
    public Conciertos(String titulo, int duracion, String categoria, int puntuacion, String fecha, String horaInicio, double precioEntrada, int capacidadMaxima, String artista, String ubicacion) {
        super(titulo, duracion, categoria, puntuacion, fecha, horaInicio, precioEntrada, capacidadMaxima);
        this.artista = artista; 
        this.ubicacion = ubicacion; 
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("El artista es "+this.artista+" la ubicación del concierto es "+this.ubicacion);
    }
    
    public boolean esContenidoPopular(){
        if(super.getPuntuacion() > 8){
            return true; 
        }
        return false; 
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(super.toString()).append(" ,artista ").append(this.artista).append(" ,ubicación ").append(this.ubicacion).append("\n"); 
        return sb.toString(); 
    }
    
}
