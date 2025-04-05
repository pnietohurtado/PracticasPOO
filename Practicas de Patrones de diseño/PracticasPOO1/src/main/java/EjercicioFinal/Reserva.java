/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFinal;

import java.time.LocalDate;

/**
 *
 * @author pablo
 */
public class Reserva {
    
    private int id_reserva; 
    private static int contador; 
    private Cliente cliente; 
    private Habitacion habitacion; 
    private String reserva; 
    
    public Reserva(){this.id_reserva = ++contador; }
    public Reserva(Cliente c, Habitacion h, String r){this(); this.cliente = c; this.habitacion = h; this.reserva = r; }

    public int getId_reserva() {
        return id_reserva;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append("[").append(this.reserva).append("] ").append(this.cliente).append(" ").append(this.habitacion).append("\n"); 
        return sb.toString(); 
    }
    
}
