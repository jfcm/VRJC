
package LogicPackage;

/**
 * This file contains the class Producto
 */
public class Producto {

    private String nombre;
    private String description;
    private double precioVenta;
    private double precioCompra;
    private double alto;
    private double ancho;
    
    public Producto(){
        nombre = null;
        description = null;
        precioVenta = 0;
        precioCompra = 0;
        alto = 0;
        ancho = 0;
    }
    
    public Producto(String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho){
        this.nombre = nombre;
        this.description = description;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public double getPrecioVenta(){
        return precioVenta;
    }
    
    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }
    
    public double getPrecioCompra(){
        return precioCompra;
    }
    
    public void setPrecioCompra(double precioCompra){
        this.precioCompra = precioCompra;
    }
    
    public double getAlto(){
        return alto;
    }
    
    public void setAlto(double alto){
        this.alto = alto;
    }
    
    public double getAncho(){
        return ancho;
    }
    
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    
    public double calcularPrecio(){
        if(alto >= 30 && alto <= 300 && ancho >= 30 && ancho <= 300){
            if(alto % 5 == 0 && ancho % 5 == 0){
                return precioVenta;
            }
        }
        return 0;
    }
    
    public double calcularBeneficio(){
        return precioVenta - precioCompra;
    }
    
}
