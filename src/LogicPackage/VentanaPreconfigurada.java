
package LogicPackage;

/**
 * This file contains the class VentanaPreconfigurada
 */
public class VentanaPreconfigurada extends Producto {
    
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
        
        int valor1 = 50;
        int valor2 = 75;
        int valor3 = 100;
        
        if(super.getAlto() >= 30 && super.getAlto() <= 120 && super.getAncho() >= 30 && super.getAncho() <= 120){
            if(super.getAlto() % 5 == 0 && super.getAncho() % 5 == 0){
                if(instalada == true){
                    precioInstalacion = valor1 + (valor1 * 0.10);
                }
                else{
                    precioInstalacion = valor1;
                }
            }
        }
        
        if(super.getAlto() > 120 && super.getAlto() <= 210 && super.getAncho() > 120 && super.getAncho() <= 210){
            if(super.getAlto() % 5 == 0 && super.getAncho() % 5 == 0){
                if(instalada == true){
                    precioInstalacion = valor2 + (valor2 * 0.10);
                }
                else{
                    precioInstalacion = valor2;
                }
            }
        }
        
        if(super.getAlto() > 210 && super.getAlto() <= 300 && super.getAncho() > 210 && super.getAncho() <= 300){
            if(super.getAlto() % 5 == 0 && super.getAncho() % 5 == 0){
                if(instalada == true){
                    precioInstalacion = valor3 + (valor3 * 0.10);
                }
                else{
                    precioInstalacion = valor3;
                }
            }
        }
        
        return precioInstalacion;
    }
    
}
