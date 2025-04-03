/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author pablo
 */
public class Tarea {
 
    private int id = 0; 
    private static int contador; 
    private String titulo; 
    
    public Tarea(){this.id = ++contador;}
    public Tarea(String titulo){this(); this.titulo = titulo; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(this.id).append(" ").append(this.titulo).append("\n"); 
        return sb.toString(); 
    }
    
    
}
