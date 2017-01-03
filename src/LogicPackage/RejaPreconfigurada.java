
package LogicPackage;

import java.io.Serializable;

/**
 * This file contains the class RejaPreconfigurada
 */
public class RejaPreconfigurada extends Producto implements Serializable{

    private double precioInstalacion;
    private int numeroBarrotes;
    private boolean instalada;
    
    public RejaPreconfigurada(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho){
        super(nombre, description, precioVenta, precioCompra, alto, ancho);
        precioInstalacion = 0;
        instalada = false;
        numeroBarrotes = 0;
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