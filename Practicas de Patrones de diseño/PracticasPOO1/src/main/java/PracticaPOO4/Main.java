/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaPOO4;

/**
 *
 * @author pablo
 */
public class Main 
        /*En este ejercicio vamos a poder tratar más acerca de el patrón de diseño "Singleton", el cuál 
        si no he entendido mal, busca que una misma clase contenga toda la funcionalidad de un programa. Esto 
        claramente viola el principio de responsabilidad única.  */
{
   
    public static void main(String[] args) {
        
        Configuration conf1 = Configuration.configuration("Hola"); 
        Configuration conf2 = Configuration.configuration("Adios"); 
        System.out.println(conf1.value);
        System.out.println(conf2.value);
    }
    
}
