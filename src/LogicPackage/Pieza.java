
package LogicPackage;

import java.io.Serializable;

/**
 *  This file contains the class Pieza
 */
public class Pieza extends Producto implements Serializable{

    public Pieza(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho){
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
    }
    
}
