/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO3.Ejercicio1;

/**
 *
 * @author pablo
 */
public abstract class EventosEnVivo {
    
    protected String titulo; 
    protected int duracion; 
    protected String categoria;
    protected int puntuacion; 
    protected String fecha; 
    protected String horaInicio; 
    protected double precioEntrada; 
    protected int capacidadMaxima; 

    public EventosEnVivo(String titulo, int duracion, String categoria, int puntuacion, String fecha, String horaInicio, double precioEntrada, int capacidadMaxima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.precioEntrada = precioEntrada;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public abstract void mostrarInformacion(); 

    @Override
    public String toString() {
        return " Titulo=" + titulo + ", duracion=" + duracion + ", categoria=" + categoria + ", puntuacion=" + puntuacion + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", precioEntrada=" + precioEntrada + ", capacidadMaxima=" + capacidadMaxima;
    }
    
    
    
    
}
