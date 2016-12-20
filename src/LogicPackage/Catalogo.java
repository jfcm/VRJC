
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
        anadirProducto(REJA, "Reja", "Reja con 30x60", 50, 14, 40, 60);
        anadirProducto(REJA, "Reja", "Reja con 50x60", 55, 15, 50, 60);
        anadirProducto(REJA, "Reja", "Reja con 90x60", 60, 17, 90, 60);
        anadirProducto(REJA, "Reja", "Reja con 150x180", 100, 20, 150, 180);
        anadirProducto(REJA, "Reja", "Reja con 215x260", 120, 35, 215, 260);
        anadirProducto(REJA, "Reja", "Reja con 215x260", 140, 40, 260, 250);
        
        //VENTANAS
        anadirProducto(VENTANA, "Ventana", "Ventana con 30x60", 50, 14, 40, 60);
        anadirProducto(VENTANA, "Ventana", "Ventana con 50x60", 55, 15, 50, 60);
        anadirProducto(VENTANA, "Ventana", "Ventana con 90x60", 60, 17, 90, 60);
        anadirProducto(VENTANA, "Ventana", "Ventana con 150x180", 100, 20, 150, 180);
        anadirProducto(VENTANA, "Ventana", "Ventana con 215x260", 120, 35, 215, 260);
        anadirProducto(VENTANA, "Ventana", "Ventana con 215x260", 140, 40, 260, 250);
               
        //PIEZAS
        anadirProducto(PIEZA, "Pieza", "Pieza con 30x60", 50, 14, 40, 60);
        anadirProducto(PIEZA, "Pieza", "Pieza con 50x60", 55, 15, 50, 60);
        anadirProducto(PIEZA, "Pieza", "Pieza con 90x60", 60, 17, 90, 60);
        anadirProducto(PIEZA, "Pieza", "Pieza con 150x180", 100, 20, 150, 180);
        anadirProducto(PIEZA, "Pieza", "Pieza con 215x260", 120, 35, 215, 260);
        anadirProducto(PIEZA, "Pieza", "Pieza con 215x260", 140, 40, 260, 250);
                
    }
    
    public boolean anadirProducto(String tipo, String nombre, String description, double precioVenta, double precioCompra, double alto, double ancho) {
        
        Producto obj = null;

        if (tipo.equalsIgnoreCase(REJA)) {
            obj = new RejaPreconfigurada(nombre, description, precioVenta, precioCompra, alto, ancho);
        } else if (tipo.equalsIgnoreCase(VENTANA)) {
            obj = new VentanaPreconfigurada(nombre, description, precioVenta, precioCompra, alto, ancho);
        } else if (tipo.equalsIgnoreCase(PIEZA)) {
            obj = new Pieza(nombre, description, precioVenta, precioCompra, alto, ancho);
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
