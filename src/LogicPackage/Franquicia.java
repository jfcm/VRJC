    
package LogicPackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author João Piedade
 * This file contains the class Franquicia
 */
public class Franquicia implements Serializable {
    
    private String Nombre;
    private String Direccion;
    private String horaApertura;
    private String horaCierre;
    private int numeroProductosVendidos;
    private double ventas_totales;
    private Dueno dueno;
    private double beneficio;
    private ArrayList<Trabajador> lista_trabajadores;
    private ArrayList<Producto> compras;
    private Catalogo cat;
    
    public Franquicia(){
        lista_trabajadores = new ArrayList<>();
        compras = new ArrayList<>();
        numeroProductosVendidos = 0;
        ventas_totales = 0;
        cat = new Catalogo();
    }
    
    public Franquicia(Dueno dueno, ArrayList<Trabajador> l, String Nombre, String Direccion, String horaApertura, String horaCierre, int numeroProductosVendidos, double ventas_totales){
        this.dueno = dueno;
        this.lista_trabajadores = l;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.horaApertura = horaApertura; 
        this.horaCierre = horaCierre; 
        this.numeroProductosVendidos = numeroProductosVendidos;
        this.ventas_totales = ventas_totales;
        compras = new ArrayList<>();
        cat = new Catalogo();
    }
    
    public int getNumTotalPvendidos()
    {
        return numeroProductosVendidos;
    }
    
    public void setNumTotalPvendidos(int numeroProductosVendidos)
    {
        this.numeroProductosVendidos = numeroProductosVendidos;
    }
    
    public double getBeneficio()
    {
        return beneficio;
    }
    
    public void setBeneficio(double beneficio)
    {
        this.beneficio = beneficio;
    }
   
    
    public double getTotal_ventas()
    {
        return ventas_totales;
    }
    
     
    public void setTotal_ventas(double ventas_totales)
    {
        this.ventas_totales = ventas_totales;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }
        
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }
    
    public String getHorarioApertura(){
        return horaApertura;
    }
    
    public void setHorarioApertura(String horaApertura){
        this.horaApertura = horaApertura;
    } 
    
    public String getHorarioCierro(){
        return horaCierre;
    }
    
    public void setHorarioCierre(String horaCierre){
        this.horaCierre = horaCierre;
    } 
            
    public void setDueno(Dueno dueno)
    {
        this.dueno = dueno;
    }
    
    public Dueno getDueno()
    {
        return dueno;
    }
    
    public void setCatalogo(Catalogo cat)
    {
        this.cat = cat;
    }
    
    public Catalogo getCatalogo()
    {
        return cat;
    }
    
    public void setCompras(ArrayList<Producto> compras)
    {
        this.compras = compras;
    }
    
    public ArrayList<Producto> getCompras()
    {
        return compras;
    }
    
    public void setTrabajador(ArrayList<Trabajador> lista_trabajadores)
    {
        this.lista_trabajadores = lista_trabajadores;
    }
    
    public ArrayList<Trabajador> getListTrabajadores()
    {
        return lista_trabajadores;
    }
    
    public void setListTrabajadores(ArrayList<Trabajador> lista_trabajadores)
    {
        this.lista_trabajadores = lista_trabajadores;
    }
    
    public boolean modificarTrabajador(String usuario, String nombre, String password, String apelidos)
    {
        int flag = 0;
        int id = 0;
        
        for(Trabajador t : lista_trabajadores)
        {
            if(t.getUsername().equals(usuario))
            {
                flag = 1;
                break;
            }
            id++;
        }
        
        if(flag == 0)
        {
            return false;
        }
        
        lista_trabajadores.get(id).setNombre(nombre);
        lista_trabajadores.get(id).setPassword(password);
        lista_trabajadores.get(id).setApelido(apelidos);
        
        return true;
    }
    
    public boolean darBajaTrabajador(Trabajador trabajador)
    {
        int flag = 0;
        int id = 0;
        
        for(Trabajador t : lista_trabajadores)
        {
            if(t.equals(trabajador))
            {
                flag = 1;
                break;
            }
            id++;
        }
        
        if(flag == 0)
        {
            return false;
        }
        
        lista_trabajadores.remove(id);
        
        return true;
    }
    
    public boolean darAltaTrabajador(Trabajador trab)
    {
        
        lista_trabajadores.add(trab);
        
        return true;
    }
  
}
