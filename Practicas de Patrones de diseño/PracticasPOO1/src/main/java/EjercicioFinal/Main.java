/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFinal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Habitacion h1 = new Habitacion( 1, Habitacion.Tipo.DOBLE); 
        Habitacion h2 = new Habitacion( 2, Habitacion.Tipo.INDIVIDUAL); 
        Habitacion h3 = new Habitacion( 3, Habitacion.Tipo.INDIVIDUAL); 
        Habitacion h4 = new Habitacion( 4, Habitacion.Tipo.SUITE); 
        Habitacion h5 = new Habitacion( 5, Habitacion.Tipo.SUITE); 
        List<Habitacion> habitaciones = Arrays.asList(h1,h2,h3,h4,h5);
        
        Cliente c; 
        GestorReservas g = new GestorReservas(); 
        Reserva r; 
        
        Scanner sc = new Scanner(System.in); 
        String opcion = "";  
        String dia = ""; 
        String nombre = ""; 
        String dni = ""; 
        int numero_habitacion = 0; 
        Habitacion h = new Habitacion(); 
            
            do{
                
                try{
                    //System.out.println(g.mostrarReservas());

                    System.out.print("Digame su nombre: ");
                    nombre = sc.nextLine(); 
                    System.out.print("Digame su DNI: ");
                    dni = sc.nextLine(); 
                    c = new Cliente(nombre, dni); 

                    System.out.println("------- Listado de habitaciones --------");
                    System.out.println(habitaciones);
                    System.out.print("Cual es su eleccion (Introduzca el número): ");
                    numero_habitacion = sc.nextInt(); 
                    for(Habitacion ha : habitaciones){
                        if(ha.getNumero() == numero_habitacion){
                            h = ha; 
                        }
                    }
                    sc.nextLine(); 

                    System.out.print("Dime la fecha en la que quiere reservar la habitación: ");
                    dia = sc.nextLine(); 

                    r = new Reserva(c, h, dia); 


                    if(g.hayConflicto(r) == true){
                        throw new ConflictoReservaException("Esa habitación ya está reservada para esa fecha!!"); 
                    }

                    g.addReserva(r);

                    System.out.print("Quiere ver todas las reservas [Y/0]: ");
                    opcion = sc.nextLine(); 

                    if(opcion.equalsIgnoreCase("Y")){
                        System.out.println(g.mostrarReservas());
                    }

                    System.out.print("Quiere añadir otra reserva [Y/0]: ");
                    opcion = sc.nextLine(); 
                    
                }catch(ConflictoReservaException e){
                    System.err.println(e.getMessage());
                }
            }while(!(opcion.equals("0"))); 
            
        
        
    }
    
}
