
package LogicPackage;

/**
 * This file contains the class Persona
 */
public abstract class Persona {
    private String nombre;
    private String apelido;
    private String usuario;
    private String password;
    
    public Persona()
    {
        this.nombre = null;
        this.password = null;
        this.usuario = null;
        this.apelido = null;
    }
    
    public Persona(String nombre, String password, String usuario, String apelido)
    {
        this.apelido = apelido;
        this.nombre = nombre;
        this.password = password;
        this.usuario = usuario;
    }
    
    public String getNombre(){
        return nombre;
    }
        
    public String getApelido(){
        return apelido;
    }
            
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }        
    
    public void setApelido(String apelido){
        this.apelido = apelido;
    }           
    
    public String getUsername(){
        return usuario;
    }
            
    public void setUsername(String username){
        this.usuario = username;
    }        
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
}
