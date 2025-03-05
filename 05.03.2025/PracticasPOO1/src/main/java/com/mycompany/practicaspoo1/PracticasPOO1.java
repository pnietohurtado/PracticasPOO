/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaspoo1;

import com.mycompany.practicaspoo1.Clases.DispositivoRed;
import com.mycompany.practicaspoo1.Clases.Movil;
import com.mycompany.practicaspoo1.Clases.Ordenador;
import com.mycompany.practicaspoo1.Clases.Router;

/**
 *
 * @author pablo
 */
public class PracticasPOO1 {

    public static void main(String[] args) {
        
        Router r = new Router(21312, "HP", "PAconu", "123"); 
        
        DispositivoRed d1 = new Ordenador(1, "PAconu", "123" , "192.168.1.1", "Pepe", "HP"); 
        DispositivoRed d2 = new Movil(1, "Fimosis", "123" , "192.168.1.1", "635290993", "7375", "HP"); 
        
        d1.conectar(r); 
        d2.conectar(r); 
        
        System.out.println(r.listarDispositivos());
        
        System.out.println("************************");
        
        d1.desconectar(r);
        d2.desconectar(r);
        
        System.out.println(r.listarDispositivos());
    }
}
