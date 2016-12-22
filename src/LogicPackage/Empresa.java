
package LogicPackage;

import java.util.ArrayList;

/**
 * This file contains the class Empresa
 */
public class Empresa {
    public String nombre;
    public ArrayList<Franquicia> franq;
    public Gerente ger;
    
    public Empresa()
    {
        this.nombre = null;
        this.franq = new ArrayList<>();
        ger = new Gerente("Jovana", "milozevic", "jovana_mil", "913037795");
    }
    
    public Empresa(ArrayList<Franquicia> l, String nombre, Gerente g)
    {
        this.franq = l;
        this.nombre = nombre;
        this.ger = g;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public boolean darBajaF(String nombre)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franq)
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
        
        franq.remove(id);
        
        return true;
    }
    
    public boolean modificarFranq(String Nombre_fr, String Direccion, String horaApertura, String horaCierre, Dueno d, ArrayList<Trabajador> trab)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franq)
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
        
        franq.get(id).setDireccion(Direccion);
        franq.get(id).setHorarioApertura(horaApertura);
        franq.get(id).setHorarioCierre(horaCierre);
       
        return true;
    }
    
    public boolean darAltaFranq(Franquicia f)
    {
        
        franq.add(f);
        
        return true;
    }
    
    public boolean modificarDueno(String nombre_franq, String nombre, String password, String apelidos)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franq)
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
        
        franq.get(id).getDueno().setApelido(apelidos);
        franq.get(id).getDueno().setPassword(password);
        franq.get(id).getDueno().setNombre(nombre);
        
        return true;
    }
    
    public boolean darBajaDueno(String nombre_franq)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franq)
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
        
        franq.get(id).setDueno(null);
        
        return true;
    }
    
    public boolean darAltaDueno(String nombre_franq, Dueno d)
    {
        
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franq)
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
        
        if(franq.get(id).getDueno() != null)
        {
            darBajaDueno(nombre_franq);
        }
            
        franq.get(id).setDueno(d);
        
        return true;
    }
    
    public Catalogo consultaCatalogo(String nombre_franq)
    {
        int flag = 0;
        int id = 0;
        
        for(Franquicia t : franq)
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
        
        return franq.get(id).getCatalogo();
    }
}
