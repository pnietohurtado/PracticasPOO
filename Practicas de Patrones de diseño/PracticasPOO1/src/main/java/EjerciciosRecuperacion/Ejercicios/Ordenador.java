/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecuperacion.Ejercicios;

/**
 *
 * @author pablo
 */
public class Ordenador extends Dispositivo{
    
    private String ip; 
    
    public Ordenador(String n, String p, String u, String i) {
        super(n,p,u); 
        this.ip = i; 
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(super.toString()).append(" IP: ").append(this.ip).append("\n"); 
        return sb.toString(); 
    }
    
}
