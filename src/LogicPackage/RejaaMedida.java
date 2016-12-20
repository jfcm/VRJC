
package LogicPackage;

/**
 * This file contains the class RejaaMedida
 */
public class RejaaMedida extends RejaPreconfigurada {
    
    private double nuevoAlto;
    private double nuevoAncho;

    public RejaaMedida(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho) {
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
    }

    public void cambiarAncho(){
        super.setInstalada(true);
        super.setAncho(nuevoAncho);
    }
    
    public void cambiarAlto(){
        super.setInstalada(true);
        super.setAlto(nuevoAlto);
    }
    
}
