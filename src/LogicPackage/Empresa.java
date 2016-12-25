
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
        gerente = new Gerente("Jovana", "milozevic", "jovana_mil", "913037795");
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
    
    public boolean darBajaF(String nombre)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franquicias)
        {
            if(t.getNombre().equals(nombre))
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
    
    public boolean modificarFranq(String Nombre_fr, String Direccion, String horaApertura, String horaCierre, Dueno d, ArrayList<Trabajador> trab)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franquicias)
        {
            if(t.getNombre().equals(Nombre_fr))
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
        
        franquicias.get(id).setDireccion(Direccion);
        franquicias.get(id).setHorarioApertura(horaApertura);
        franquicias.get(id).setHorarioCierre(horaCierre);
       
        return true;
    }
    
    public boolean darAltaFranq(Franquicia f)
    {
        
        franquicias.add(f);
        
        return true;
    }
    
    public boolean modificarDueno(String nombre_franq, String nombre, String password, String apelidos)
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
            return false;
        }
        
        franquicias.get(id).getDueno().setApelido(apelidos);
        franquicias.get(id).getDueno().setPassword(password);
        franquicias.get(id).getDueno().setNombre(nombre);
        
        return true;
    }
    
    public boolean darBajaDueno(String nombre_franq)
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
            return false;
        }
        
        franquicias.get(id).setDueno(null);
        
        return true;
    }
    
    public boolean darAltaDueno(String nombre_franq, Dueno d)
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
            return false;
        }
        
        if(franquicias.get(id).getDueno() != null)
        {
            darBajaDueno(nombre_franq);
        }
            
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
