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
    
    
    public Configuration(){
        
       
        
    }
    
    public static Configuration configuration(){
        if(conf == null){
            conf = new Configuration(); 
        }
        return conf; 
    }
    
}
