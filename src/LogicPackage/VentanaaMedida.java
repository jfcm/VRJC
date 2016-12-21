
package LogicPackage;

/**
 * This file contains the class VentanaaMedida
 */
public class VentanaaMedida extends VentanaPreconfigurada {
    
    private double nuevoAlto;
    private double nuevoAncho;

    public VentanaaMedida(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho) {
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
    }

    public void cambiarAncho(){
        super.setAncho(nuevoAncho);
    }

    public void cambiarAlto(){
        super.setAlto(nuevoAlto);
    }
    
}
