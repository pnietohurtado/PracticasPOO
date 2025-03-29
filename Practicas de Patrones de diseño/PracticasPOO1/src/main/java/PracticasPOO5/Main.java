/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticasPOO5;

/**
 *
 * @author pablo
 */
public class Main 
        /*En este caso vamos a ver como podemos usar de forma correcta el patrón de diseño de "Factory Method".
        En estos tipos de patrones, lo que buscamos es un programa mucho más flexible para lo que debemos implementar 
        interfaces donde la funcionalidad sea un tanto más abstracta, por decirlo de alguna manera. */
{
    
    public static void main(String[] args) {
        
        Notification emailNotification = new EmailNotification(); 
        Notification smsNotification = new SMSNotification(); 
        Notification pushNotification = new PushNotification(); 
        
        System.out.println(emailNotification.sendMessage("Enviando un email...")); 
        System.out.println(smsNotification.sendMessage("Enviando un SMS...")); 
        System.out.println(pushNotification.sendMessage("Enviando un Push...")); 
        
    }
   
}
