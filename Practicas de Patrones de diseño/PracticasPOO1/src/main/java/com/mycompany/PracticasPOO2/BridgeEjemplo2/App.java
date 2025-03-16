/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PracticasPOO2.BridgeEjemplo2;

/**
 *
 * @author pablo
 */
public class App implements Implementation
        /*Desde el ejemplo que nos ponen dentro de los patrones de diseño, parece que podemos considerar el "interface" 
        como una especie de "framework" donde nos trabaje de una forma distinta en función de la plataforma. Por lo que en 
        este caso si nos hace falta, podemos trabajar o implementar distintos tipos de frames. */
{

    @Override
    public void Method1() {
        System.out.println("Estoy en Linux");
    }

    @Override
    public void Method2() {
        System.out.println("Estoy en MAC");
    }

    @Override
    public void Method3() {
        System.out.println("Estoy en Window");
    }


    
}
