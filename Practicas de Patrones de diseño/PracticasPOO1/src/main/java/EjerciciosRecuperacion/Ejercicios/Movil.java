/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecuperacion.Ejercicios;

/**
 *
 * @author pablo
 */
public class Movil extends Dispositivo{
    
    public String telef; 
    public int bateria; 
    
    public Movil(String n, String p, String u, String t, int b){
        super(n,p,u); 
        this.telef = t; 
        this.bateria = b; 
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(super.toString()).append(" Telefono: ").append(this.telef).append(" Batería: ").append(this.bateria).append("\n"); 
        return sb.toString(); 
    }
    
}
