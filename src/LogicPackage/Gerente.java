
package LogicPackage;

import java.io.Serializable;

/**
 * @author João Piedade
 * This file contains the class Gerente
 */
public class Gerente extends Persona implements Serializable{
    
    public Gerente(String nombre, String apelidos, String usuario, String password){
        super(nombre, apelidos, usuario, password);
    }
    
}
