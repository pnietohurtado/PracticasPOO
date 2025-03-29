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
        
        //not null
        Configuration conf =  Configuration.configuration(); 
        System.out.println(conf);
        
        //null
        Configuration conf2 = null; 
        System.out.println(conf2);
    }
    
}
