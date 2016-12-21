/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicPackage;

/**
 *
 * @author joaom
 */

public class Persona {
    private String nombre;
    private String apelidos;
    private String usuario;
    private String password;
    
    public Persona()
    {
        this.nombre = null;
        this.password = null;
        this.usuario = null;
        this.apelidos = null;
    }
    
    public Persona(String nombre, String password, String usuario, String apelidos)
    {
        this.apelidos = apelidos;
        this.nombre = nombre;
        this.password = password;
        this.usuario = usuario;
    }
    
    public String getNombre(){
        return nombre;
    }
        
    public String getApelido(){
        return apelidos;
    }
            
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }        
    
    public void setApelido(String Apelido){
        this.apelidos = Apelido;
    }           
    
    public String getUsername(){
        return usuario;
    }
            
    public void getUsername(String username){
        this.usuario = username;
    }        
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String Password)
    {
        this.password = Password;
    }
    
}
