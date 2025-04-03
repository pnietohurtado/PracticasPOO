/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        Map<Integer, Contacto> agenda = new HashMap<>(); 
        
        String opcion = ""; 
        int id = 0; 
        String nombre =" "; 
        String numero =" "; 
        int contador = 1; 
        boolean existe = false; 
        
        do{
            
            System.out.println("[1] Añadir una tarea.");
            System.out.println("[2] Buscar contacto.");
            System.out.println("[3] Mostrar todos los contactos.");
            System.out.println("[4] Eliminar una tarea por número.");
            System.out.println("[0] Salir del programa.");
            System.out.print("Eleccion: ");
            opcion = sc.nextLine();
            
            
            switch(opcion){
                case "1" : {
                    System.out.print("Dime el nombre del contacto: ");
                    nombre = sc.nextLine(); 
                    System.out.print("Dime el número del contacto: ");
                    numero = sc.nextLine(); 
                    
                    agenda.put(contador, new Contacto(nombre, numero)); 
                    contador++; 
                    break; 
                }
                
                case "2": {
                    System.out.print("Dime el nombre del contacto: ");
                    nombre = sc.nextLine(); 
                    
                    for(Map.Entry<Integer, Contacto> entry: agenda.entrySet()){
                        if((entry.getValue().getNombre()).equals(nombre)){
                            System.out.println("\nNúmero: " + entry.getValue().getNumero());
                            existe = true; 
                        }
                        
                    }
                    
                    if(existe == false){
                        System.out.println("No existe ese contacto!!");
                    }
                    break; 
                }
                
                case "3" : {
                    
                    for(Map.Entry<Integer,Contacto> entry : agenda.entrySet()){
                        System.out.println(entry.getValue().getNombre());
                    }
                        
                    break; 
                }
                
                case "4" : {
                    System.out.print("Dime el nombre del contacto a eliminar: ");
                    nombre = sc.nextLine(); 
                    for(Map.Entry<Integer, Contacto> entry: agenda.entrySet()){
                        if((entry.getValue().getNombre()).equals(nombre)){
                            int id_busqueda = entry.getKey(); 
                            agenda.remove(id_busqueda); 
                        }
                    }
                    break; 
                }
                
                case "0": {
                    System.exit(0); 
                }
            }
            
            
        }while(!(opcion.equals("0"))); 
        
        
        
    }
}
