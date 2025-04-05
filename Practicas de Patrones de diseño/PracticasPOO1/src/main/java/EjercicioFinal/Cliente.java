/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFinal;

/**
 *
 * @author pablo
 */
public class Cliente {
    
    private String nombre; 
    private String dni; 
    private int id; 
    private static int contador; 
    
    public Cliente(){this.id = ++contador; } 
    public Cliente(String n, String d){this(); this.nombre = n; this.dni = d; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append("[").append(this.id).append("] ").append(this.nombre).append(" ").append(this.dni).append("\n"); 
        return sb.toString(); 
    }
    
    
}
