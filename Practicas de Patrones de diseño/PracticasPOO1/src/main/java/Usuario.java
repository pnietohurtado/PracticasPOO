/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class Usuario {
    
    private String user; 
    private String pass; 
    
    
    public Usuario(){}
    public Usuario(String u, String p ){
        this(); 
        this.user = u; 
        this.pass = p; 
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(this.user).append(" ").append(this.pass).append("\n"); 
        return sb.toString(); 
    }
}
