
package LogicPackage;

import java.io.Serializable;

/**
 * This file contains the class RejaaMedida
 */
public class RejaaMedida extends RejaPreconfigurada implements Serializable{

    public RejaaMedida(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho) {
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
    }

    public void cambiarAncho(double Ancho){
        super.setAncho(Ancho);
    }

    public void cambiarAlto(double Alto){
        super.setAlto(Alto);
    }
    
}
