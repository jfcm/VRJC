
package LogicPackage;

import java.io.Serializable;

/**
 * 
 * @author Joao Piedade
 * @author Jovana Milivojevic
 * This file contains the class Dueno
 */
public class Dueno extends Persona implements Serializable {
   
    public Dueno(String nombre, String apelidos, String usuario, String password)
    {
        super(nombre, apelidos, usuario, password);
    }
}
