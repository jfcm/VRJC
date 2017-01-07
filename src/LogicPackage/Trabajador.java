
package LogicPackage;

import java.io.Serializable;

/**
 * @author João Piedade
 * @author Jovana Milivojevic
 * This file contains the class Trabajador
 */
public class Trabajador extends Persona implements Serializable{
    
    private float Sueldo;
    
    public Trabajador(String nombre, String apelidos, String usuario, String password){
        super(nombre, apelidos, usuario, password);
        this.Sueldo = 0;
    }
    
    public Trabajador(String nombre, String apelidos, String usuario, String password, float Sueldo){
        super(nombre, apelidos, usuario, password);
        this.Sueldo = Sueldo;
    }

    public float getSueldo(){
        return Sueldo;
    }
                    
    public void setSaldo(float Sueldo){
        this.Sueldo = Sueldo;
    }   
    
 }