/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicPackage;

/**
 *
 * @author joaom
 */
public class CatalogoGeneralObject {
   
        String nombre_f;
        Producto produtos;
        
        public CatalogoGeneralObject(String nombre_f, Producto produtos)
        {
            this.nombre_f = nombre_f;
            this.produtos = produtos;
        }
        
        public String getNombre()
        {
            return nombre_f;
        }
        
        public void setNombre(String nombre_f)
        {
            this.nombre_f = nombre_f;
        }
        
        public Producto getProduto()
        {
            return produtos;
        }
        
        public void setProduto(Producto p)
        {
            this.produtos = p;
        }
}
