/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        List<Tarea> tareas = new ArrayList<>(); 
        
        String opcion = ""; 
        int id = 0; 
        String titulo =" "; 
        
        do{
            
            System.out.println("[1] Añadir una tarea.");
            System.out.println("[2] Ver todas las tareas.");
            System.out.println("[3] Eliminar una tarea por número.");
            System.out.println("[0] Salir del programa.");
            System.out.print("Eleccion: ");
            opcion = sc.nextLine(); 
            
            switch(opcion){
                case "1" : {
                    System.out.print("Dime el titulo de la nueva tarea: ");
                    titulo = sc.nextLine(); 
                    
                    tareas.add(new Tarea(titulo)); 
                    break; 
                }
                
                case "2": {
                    System.out.println("-------- Lista de tareas --------");
                    System.out.println(tareas);
                    break; 
                }
                
                case "3" : {
                    try{
                        System.out.println("------- Lista de tareas -------");
                        System.out.println(tareas);
                        System.out.println("-------------------------------");
                        System.out.print("Dime el id de la tarea que quieres eliminar: ");
                        id = sc.nextInt(); 
                        sc.nextLine(); 
                        System.out.println(tareas.lastIndexOf(id));
                        Iterator<Tarea> it = tareas.iterator();
                            while(it.hasNext()){
                                Tarea t = it.next(); 
                                if(t.getId() == id){
                                    tareas.remove(t); 
                                }
                            }
                        
                        
                    }catch(IndexOutOfBoundsException e){
                        System.err.println("Ese id no existe!!"); 
                    }catch(InputMismatchException  e2){
                        System.err.println("Ese nos es el valor solicitado!!"); 
                        sc.nextLine(); 
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
