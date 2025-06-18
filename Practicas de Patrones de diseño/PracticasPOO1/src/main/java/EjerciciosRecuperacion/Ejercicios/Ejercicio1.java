/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecuperacion.Ejercicios;

/**
 *
 * @author pablo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Router r = new Router("RedCasa","123"); 
        
        Dispositivo d1 = new Ordenador("RedCasa", "123", "pnh0002", "192.168.0.1"); 
        Dispositivo d2 = new Ordenador("RedCasa", "123", "pnh0003", "192.168.0.2"); 
        Dispositivo d3 = new Movil("RedCasa", "123", "pnh0003", "635290993", 32); 
        
        System.out.println("==========PCPablo===========");
        System.out.println(d1);
        System.out.println("==========PCPevlo===========");
        System.out.println(d2);
        
        d1.addList(d2);
        System.out.println("===========");
        System.out.println(d1.devuelve());
        System.out.println("===========");
        
        r.addDispositivo(d1);
        r.addDispositivo(d2);
        r.addDispositivo(d3);
        
        System.out.println(r.devuelve());
    }
}
