
package LogicPackage;

import java.io.Serializable;

/**
 * This file contains the class VentanaPreconfigurada
 */
public class VentanaPreconfigurada extends Producto implements Serializable{
    
    private double precioInstalacion;
    private int numeroHojas;
    
    public VentanaPreconfigurada(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho, double precioInstalacion){
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
        this.precioInstalacion = precioInstalacion;
    }
    
    public double getPrecioInstalacion(){
        return precioInstalacion;
    }
    
    public void setPrecioInstalacion(double precioInstalacion){
        this.precioInstalacion = precioInstalacion;
    }
    
    public int getNumeroHojas(){
        return numeroHojas;
    }
    
    public void setNumeroHojas(int numeroHojas){
        this.numeroHojas = numeroHojas;
    }
    
    @Override
    public double calcularConPrecioInstalacao(){
        
            return super.calcularConPrecioInstalacao() + precioInstalacion;
        
    }
    
}
