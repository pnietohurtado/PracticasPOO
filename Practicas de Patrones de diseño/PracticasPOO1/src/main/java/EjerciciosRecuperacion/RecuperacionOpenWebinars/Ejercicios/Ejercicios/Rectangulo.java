/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosRecuperacion.RecuperacionOpenWebinars.Ejercicios.Ejercicios;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class Rectangulo {
    private final int COORD_X = 0; 
    private final int COORD_Y = 1; 
    
    private double[] c1,c2,c3,c4; 
    
    public Rectangulo(){
        c1 = new double[2]; 
        c2 = new double[2]; 
        c3 = new double[2]; 
        c4 = new double[2]; 
    }
    
    public Rectangulo (double[] c1, double[] c2, double[] c3, double[] c4){
        this.c1 = c1; 
        this.c2 = c2; 
        this.c3 = c3; 
        this.c4 = c4; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangulo other = (Rectangulo) obj;
        if (!Arrays.equals(this.c1, other.c1)) {
            return false;
        }
        if (!Arrays.equals(this.c2, other.c2)) {
            return false;
        }
        if (!Arrays.equals(this.c3, other.c3)) {
            return false;
        }
        return Arrays.equals(this.c4, other.c4);
    }
    
    public double base(){
        return Math.abs(c3[COORD_X] - c4[COORD_X]); 
    }
    
    public double altura(){
        return Math.abs(c3[COORD_Y] - c2[COORD_Y]); 
    }
    
    public void dibujar(char c){
        int base = (int) Math.round(base()); 
        int altura = (int) Math.round(altura()); 
        
        String pintura = "" + c; 
        System.out.println(pintura.repeat(base));
        
        if(altura > 2){
            for(int i = 0; i< altura - 2; i++){
                System.out.print(pintura);
                if(base > 2){
                    System.out.print(" ".repeat(base - 2) );
                }
                System.out.println(pintura);
            }
        }
        
        System.out.println(pintura.repeat(base));
    }
}
