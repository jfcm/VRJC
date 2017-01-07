
package LogicPackage;

import java.io.Serializable;

/**
 * @author Jorge Martins
 * @author Jovana Milivojevic
 * This file contains the class RejaPreconfigurada
 */
public class RejaPreconfigurada extends Producto implements Serializable{

    private double precioInstalacion;
    private int numeroBarrotes;
    
    public RejaPreconfigurada(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho, double precioInstalacion){
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
        this.precioInstalacion = precioInstalacion;
    }
    
    public double getPrecioInstalacion(){
        return precioInstalacion;
    }
    
    public void setPrecioInstalacion(double precioInstalacion){
        this.precioInstalacion = precioInstalacion;
    }
    
    public int getNumeroBarrotes(){
        return numeroBarrotes;
    }
    
    public void setNumeroBarrotes(int numeroBarrotes){
        this.numeroBarrotes = numeroBarrotes;
    }
    
    
     @Override
    public double calcularConPrecioInstalacao(){
        
            return super.calcularConPrecioInstalacao() + precioInstalacion;
        
    }
    
}