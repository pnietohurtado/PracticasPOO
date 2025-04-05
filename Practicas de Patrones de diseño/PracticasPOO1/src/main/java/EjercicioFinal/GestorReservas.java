/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pablo
 */
public class GestorReservas {
    
    private List<Reserva> reservas; 
    
    public GestorReservas(){
        this.reservas = new ArrayList<>(); 
    }
    
    public void addReserva(Reserva r){
        reservas.add(r); 
    }
    
    public boolean hayConflicto(Reserva r){
        Iterator<Reserva> it = reservas.iterator(); 
        while(it.hasNext()){
            Reserva s = it.next(); 
            if((s.getHabitacion().getNumero()) == r.getHabitacion()
                    .getNumero() && s.getReserva().equals(r.getReserva()) ){
                return true; 
            }
        }
        return false; 
    }
    
    public List<Reserva> mostrarReservas(){
        return this.reservas; 
    }
    
}
