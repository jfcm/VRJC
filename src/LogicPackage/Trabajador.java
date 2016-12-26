
package LogicPackage;

/**
 * This file contains the class Trabajador
 */
public class Trabajador extends Persona {
    
    private float Sueldo;
    
    public Trabajador(String nombre, String apelidos, String usuario, String password){
        super(nombre, apelidos, usuario, password);
        this.Sueldo = 0;
    }

    public float getSueldo(){
        return Sueldo;
    }
                    
    public void setSaldo(float Sueldo){
        this.Sueldo = Sueldo;
    }   
    
 }