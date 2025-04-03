/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author pablo
 */
public class Contacto {
    
    private String nombre; 
    private String numero; 
    private int id; 
    private static int contador; 
    
    public Contacto(){this.id = ++contador; }
    public Contacto(String n, String num){
        this(); 
        this.nombre = n; 
        this.numero = num; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(this.id).append(" ").append(this.nombre).append(" ").append(this.numero).append("\n"); 
        return sb.toString(); 
    }
    
}
