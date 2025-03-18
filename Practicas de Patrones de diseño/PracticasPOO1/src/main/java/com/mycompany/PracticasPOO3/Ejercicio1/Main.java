/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO3.Ejercicio1;

/**
 *
 * @author pablo
 */
public class Main {
    
    public static void main(String[] args) {
        EventosEnVivo e1 = new Conciertos("ACDC",1212,"ROCK",9,"2","20:30",23.2d,23,"ExtremoDuro","Linares"); 
        Conciertos e = (Conciertos)e1; 
        System.out.println(e.esContenidoPopular());
        
        
    }
    
    
}
