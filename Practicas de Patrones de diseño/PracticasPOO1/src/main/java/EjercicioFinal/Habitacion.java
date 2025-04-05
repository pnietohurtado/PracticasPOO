/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFinal;

/**
 *
 * @author pablo
 */
public class Habitacion {
    
    enum Tipo{
        INDIVIDUAL ("Individual"), 
        DOBLE ("Doble"), 
        SUITE ("Suite"); 
        
        private String nombre; 
        private Tipo(String n){
            this.nombre = n; 
        }
        
        @Override 
        public String toString(){
            return this.nombre; 
        }
        
    }
    
    
    private int numero; 
    private Tipo tipo_habitacion; 
    
    
    public Habitacion(){}
    public Habitacion(int numero, Tipo tipo){this(); this.numero = numero; this.tipo_habitacion = tipo; }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Tipo getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(Tipo tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }
    
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" Numero de la habitación : ").append(this.numero).append(" Tipo de habitación : ").append(this.tipo_habitacion).append("\n"); 
        return sb.toString(); 
    }
}
