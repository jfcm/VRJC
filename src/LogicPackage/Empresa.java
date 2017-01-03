
package LogicPackage;

import java.util.ArrayList;

/**
 * This file contains the class Empresa
 */
public class Empresa {
    
    private String nombre;
    private ArrayList<Franquicia> franquicias;
    private Gerente gerente;
    
    public Empresa()
    {
        this.nombre = null;
        this.franquicias = new ArrayList<>();
        gerente = new Gerente("admin", "admin", "admin", "123");
        Franquicia f = new Franquicia();
        franquicias.add(f);
    }
    
    public Empresa(ArrayList<Franquicia> franquicias, String nombre, Gerente gerente)
    {
        this.franquicias = franquicias;
        this.nombre = nombre;
        this.gerente = gerente;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public ArrayList<Franquicia> getFranquicias(){
        return franquicias;
    }
    
    public Gerente getGerente(){
        return gerente;
    }
    
    public void setGerente(Gerente gerente){
        this.gerente = gerente;
    }
       
    public void modificarFranquicia(int id, String nombre, String direccion, String horaApertura, String horaCierre)
    {        
        franquicias.get(id).setNombre(nombre);
        franquicias.get(id).setDireccion(direccion);
        franquicias.get(id).setHorarioApertura(horaApertura);
        franquicias.get(id).setHorarioCierre(horaCierre);
    }
    
    public void darAltaFranquicia(String nombre, String direccion, String horaApertura, String horaCierre)
    {
        Franquicia f = new Franquicia();
        f.setNombre(nombre);
        f.setDireccion(direccion);
        f.setHorarioApertura(horaApertura);
        f.setHorarioCierre(horaCierre);
        franquicias.add(f);
    }
    
    public boolean darBajaFranquicia(Franquicia f)
    {        
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franquicias)
        {
            if(t.equals(f))
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
        
        franquicias.remove(id);
        
        return true;
    }
        
    public void modificarDueno(int id, String nombre_franq, String nombre, String password, String apelidos)
    {
        franquicias.get(id).getDueno().setApelido(apelidos);
        franquicias.get(id).getDueno().setApelido(apelidos);
        franquicias.get(id).getDueno().setPassword(password);
        franquicias.get(id).getDueno().setNombre(nombre);
    }
    
    public boolean darBajaDueno(int id)
    {
        franquicias.get(id).setDueno(null);
        
        return true;
    }
    
    public boolean darAltaDueno(Dueno d, int id)
    {            
        franquicias.get(id).setDueno(d);
        
        return true;
    }
    
    public Catalogo consultaCatalogo(String nombre_franq)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franquicias)
        {
            if(t.getNombre().equals(nombre_franq))
            {
                flag = 1;
                break;
            }
            id++;
        }
        
        if(flag == 0)
        {
            return null;
        }
        
        return franquicias.get(id).getCatalogo();
    }
    
}
