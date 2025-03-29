/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaPOO4;

/**
 *
 * @author pablo
 */
public class Configuration {
    
    private static Configuration conf; 
    public String value; 
    
    public Configuration(String value){
        this.value = value ; 
        
    }
    
    public static Configuration configuration(String value){
        if(conf == null){
            conf = new Configuration(value); 
        }
        return conf; 
    }
    
}
