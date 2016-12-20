
package LogicPackage;

/**
 * This file contains the class RejaPreconfigurada
 */
public class RejaPreconfigurada extends Producto {

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
               
        if(super.getAlto() >= 30 && super.getAlto() <= 120 && super.getAncho() >= 30 && super.getAncho() <= 120){
            if(super.getAlto() % 5 == 0 && super.getAncho() % 5 == 0){
                if(instalada == true){
                    precioInstalacion = super.getPrecioVenta() + (super.getPrecioVenta() * 0.10);
                }
                else{
                    precioInstalacion = super.getPrecioVenta();
                }
            }
        }
        
        if(super.getAlto() > 120 && super.getAlto() <= 210 && super.getAncho() > 120 && super.getAncho() <= 210){
            if(super.getAlto() % 5 == 0 && super.getAncho() % 5 == 0){
                if(instalada == true){
                    precioInstalacion = super.getPrecioVenta() + (super.getPrecioVenta() * 0.10);
                }
                else{
                    precioInstalacion = super.getPrecioVenta();
                }
            }
        }
        
        if(super.getAlto() > 210 && super.getAlto() <= 300 && super.getAncho() > 210 && super.getAncho() <= 300){
            if(super.getAlto() % 5 == 0 && super.getAncho() % 5 == 0){
                if(instalada == true){
                    precioInstalacion = super.getPrecioVenta() + (super.getPrecioVenta() * 0.10);
                }
                else{
                    precioInstalacion = super.getPrecioVenta();
                }
            }
        }
        
        return precioInstalacion;
    }
    
}