    
package LogicPackage;

import java.util.ArrayList;

/**
 * This file contains the class Franquicia
 */
public class Franquicia {
    
    private String Nombre;
    private String Direccion;
    private String horaApertura;
    private String horaCierre;
    private int n_total_p_vendidos;
    private float ventas_totales;
    private Dueno dueno;
    private ArrayList<Trabajador> lista_trabajadores;
    private ArrayList<Producto> compras;
    private Catalogo cat;
    
    public Franquicia(){
        dueno = new Dueno("João", "Piedade", "joao_piedade", "913037795");
        lista_trabajadores = new ArrayList<>();
        compras = new ArrayList<>();
        Nombre = "VRJC";
        Direccion = "Madrid";
        horaApertura = "09:00";
        horaCierre = "18:00";
        n_total_p_vendidos = 0;
        ventas_totales = 0;
        cat = new Catalogo();
        generarTrabajadores();
    }
    
    public Franquicia(Dueno dueno, ArrayList<Trabajador> l, String Nombre, String Direccion, String horaApertura, String horaCierre, int n_total_p_vendidos, float ventas_totales){
        this.dueno = dueno;
        this.lista_trabajadores = l;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.horaApertura = horaApertura; 
        this.horaCierre = horaCierre; 
        this.n_total_p_vendidos = n_total_p_vendidos;
        this.ventas_totales = ventas_totales;
        compras = new ArrayList<>();
    }
    
    private void generarTrabajadores() {
        Trabajador t1 = new Trabajador("Jorge", "Martins", "jorge", "123", 500);
        lista_trabajadores.add(t1);
        Trabajador t2 = new Trabajador("João", "Piedade", "joao", "123", 600);
        lista_trabajadores.add(t2);
        Trabajador t3 = new Trabajador("Jovana", "Milozhevic", "jovana", "123", 450);
        lista_trabajadores.add(t3);
    }
     
    public int getTotalProdutosVendidos()
    {
        return n_total_p_vendidos;
    }
    
    public float getTotal_ventas()
    {
        return ventas_totales;
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
    
    public String getNombreFranquicia()
    {
        return Nombre;
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
