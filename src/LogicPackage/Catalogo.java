
package LogicPackage;

import java.util.ArrayList;

/**
 * This file contains the class Catalogo
 */
public class Catalogo implements Variables {

    private ArrayList<Producto> listaproductos;
    
    public Catalogo(){
        listaproductos = new ArrayList<>();
        
        generarProductos();
    }

    private void generarProductos() {
        
        //REJAS
        anadirProducto(REJA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(REJA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(REJA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(REJA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(REJA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        
        //VENTANAS
        anadirProducto(VENTANA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(VENTANA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(VENTANA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(VENTANA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(VENTANA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        anadirProducto(VENTANA, "Pieza", "Reja con 30x60", 50, 20, 30, 60);
        
        
        
        //PIEZAS
        
    }
    
    public boolean anadirProducto(String tipo, String nombre, String description, 
            double precioVenta, double precioCompra, double alto, double ancho) {
        
        Producto obj = null;

        if (tipo.equalsIgnoreCase(REJA)) {
            obj = new RejaPreconfigurada(nombre, description, precioVenta, precioCompra, alto, ancho);
        } else if (tipo.equalsIgnoreCase(VENTANA)) {
            obj = new VentanaPreconfigurada(nombre, description, precioVenta, precioCompra, alto, ancho);
        } else if (tipo.equalsIgnoreCase(PIEZA)) {
            //obj = new Pieza(nombre, description, precioVenta, precioCompra, alto, ancho);
        }

        if (obj == null) {
            return false;
        }

        for (Producto p : listaproductos) {
            if (p.equals(obj)) {
                return false;
            }
        }

        listaproductos.add(obj);

        return true;
    }
    
}
