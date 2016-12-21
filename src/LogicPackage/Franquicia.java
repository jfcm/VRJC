    
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
    
    public Franquicia(){
        
        dueno = new Dueno("João", "Piedade", "joao_piedade", "913037795");
        lista_trabajadores = new ArrayList<>();
        Nombre = null;
        Direccion = null;
        horaApertura = null;
        horaCierre = null;
    }
    
    public Franquicia(String Nombre, String Direccion, String horaApertura, String horaCierre, int n_total_p_vendidos, float ventas_totales){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.horaApertura = horaApertura; 
        this.horaCierre = horaCierre; 
        this.n_total_p_vendidos = n_total_p_vendidos;
        this.ventas_totales = ventas_totales;
    }
    
    public int getTOTAL_produtos_vendidos()
    {
        return n_total_p_vendidos;
    }
    
    public float getToAL_ventas()
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
        
        return false;
    }
    
    public boolean darBajaTrabajador(String usuario)
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
        
        lista_trabajadores.remove(id);
        
        return false;
    }
    
    public boolean darAltaTrabajador(Trabajador trab)
    {
        int tam = lista_trabajadores.size();
        
        lista_trabajadores.add(trab);
        
        return false;
    }
    
    
}
