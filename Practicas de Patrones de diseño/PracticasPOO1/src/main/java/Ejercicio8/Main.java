/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author pablo
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Dime varias palabras separadas por una coma: ");
        String usuario = sc.nextLine(); 
        
        String palabras = usuario; 
        String[] separado; 
        
        separado = palabras.split(","); 
        
        Set<String> unico = new HashSet<>(); 
        for(String h : separado){
            unico.add(h); 
        }
        
        List<String> ultima = new ArrayList<>(unico); 
        
        Collections.sort(ultima); 
        
        for(String h: unico){
            System.out.println(h);
        }
        
    }
}
