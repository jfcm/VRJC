
package LogicPackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file contains the class Catalogo
 */
public class Catalogo implements Serializable, Variables {

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
    
    public ArrayList<Producto> getListaProductos(){
        return listaproductos;
    }
    
    public void setListaProductos(ArrayList<Producto> listaproductos){
        this.listaproductos = listaproductos;
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
    
    
    public ArrayList<Producto> buscarProducto(String nombreProducto){
        ArrayList<Producto> buscaProduto = new ArrayList<>();
       
        for(Producto p : listaproductos){
            if(p.getNombre().equals(nombreProducto)){
                buscaProduto.add(p);
            }
        } 

        return buscaProduto;
    }

    public ArrayList<Producto> ordenaNumero(ArrayList<Producto> p)
    {
        this.listaproductos = p;
        
        Producto tmp;
        
        for (int i = 0; i < listaproductos.size(); i++) {

            for (int j = listaproductos.size() - 1; j > i; j--) {
              
                if(listaproductos.get(i).getPrecioVenta() > listaproductos.get(j).getPrecioVenta()){

                  tmp = listaproductos.get(i);
                  listaproductos.set(i,listaproductos.get(j)) ;
                  listaproductos.set(j,tmp);
                }
            } 
        }
        return listaproductos;
    }   
    
    
}
