/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {

    public static void main(String[] args) {
        
        Queue<String> cola = new LinkedList<>(); 
        
        Scanner sc = new Scanner(System.in); 
        String opcion = ""; 
        String nombre = ""; 
        
        do{
            try{
                System.out.println("[1] Añadir persona a la cola.");
                System.out.println("[2] Atender a una persona.");
                System.out.println("[3] Ver siguiente persona en la cola.");
                System.out.println("[4] Mostrar todas las personas en la cola.");
                System.out.println("[0] Salir del programa.");
                System.out.print("Eleccion: ");
                opcion = sc.nextLine(); 

                switch(opcion){

                    case "1" : {
                        System.out.print("Dime el nombre de la siguiente persona: ");
                        nombre = sc.nextLine(); 

                        cola.add(nombre); 
                        break; 
                    }

                    case "2" : {
                        System.out.println("Se ha atendido a " + cola.remove());
                        break; 
                    }

                    case "3" : {
                        System.out.println("El siguiente en la cola es "+ cola.peek());
                        break; 
                    }

                    case "4" : {
                        for(String g : cola){
                            System.out.println(g);
                        }
                    }


                }
            }catch(Exception e){
                System.err.println("No hay ninguna persona esperando en la cola!!"); 
            }
            
        }while(!(opcion.equals("0"))); 
        
    }
    
}
