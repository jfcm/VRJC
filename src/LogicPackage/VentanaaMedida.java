
package LogicPackage;

import java.io.Serializable;

/**
 * This file contains the class VentanaaMedida
 */
public class VentanaaMedida extends VentanaPreconfigurada implements Serializable{
    
    private double nuevoAlto;
    private double nuevoAncho;

    public VentanaaMedida(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho, double precioInstalacao) {
        super(nombre, description, precioVenta, precioCompra, alto, ancho, precioInstalacao);
    }

    public void cambiarAncho(double Ancho){
        super.setAncho(Ancho);
    }

    public void cambiarAlto(double Alto){
        super.setAlto(Alto);
    }
    
}
