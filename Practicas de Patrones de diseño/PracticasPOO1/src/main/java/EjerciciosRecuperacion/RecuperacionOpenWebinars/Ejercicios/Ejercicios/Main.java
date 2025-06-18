/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecuperacion.RecuperacionOpenWebinars.Ejercicios.Ejercicios;

/**
 *
 * @author pablo
 */
public class Main {

    public static void main(String[] args) {
        
        double[] p1 = new double[] {0,0}; 
        double[] p2 = new double[] {10,0}; 
        double[] p3 = new double[] {10,10}; 
        double[] p4 = new double[] {0,10};
        
        Rectangulo r = new Rectangulo(p1,p2,p3,p4); 
        
        r.dibujar('*');
        
    }
    
}
