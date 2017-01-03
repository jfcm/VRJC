
package LogicPackage;

import java.io.Serializable;

/**
 * This file contains the class VentanaPreconfigurada
 */
public class VentanaPreconfigurada extends Producto implements Serializable{
    
    private double precioInstalacion;
    private int numeroHojas;
    private boolean instalada;
    
    public VentanaPreconfigurada(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho){
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
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
    
    public boolean getInstalada(){
        return instalada;
    }
    
    public void setInstalada(boolean instalada){
        this.instalada = instalada;
    }
    
    @Override
    public double calcularPrecio(){
        if(instalada == true){
            return super.calcularPrecio() + precioInstalacion;
        }
        else{
            return super.calcularPrecio();
        }
    }
    
}
