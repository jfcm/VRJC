
package LogicPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author João Piedade
 * This file contains the class Empresa
 */
public class Empresa implements Serializable {
    
    private String nombre;
    private ArrayList<Franquicia> franquicias;
    private Gerente gerente;
    
    public Empresa()
    {
        this.nombre = null;
        this.franquicias = new ArrayList<>();
        gerente = new Gerente("admin", "admin", "admin", "123");
        llenarfranquicias();
    }
        
    private void llenarfranquicias() {
        
        //1ª Franquicia
        Dueno dueno = new Dueno("Juan", "Marques", "juan", "123");
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        Trabajador t1 = new Trabajador("Jorge", "Martins", "jorge", "123", 500);
        trabajadores.add(t1);
        Trabajador t2 = new Trabajador("João", "Piedade", "joao", "123", 600);
        trabajadores.add(t2);
        Trabajador t3 = new Trabajador("Jovana", "Milozhevic", "jovana", "123", 450);
        trabajadores.add(t3);
        Franquicia f = new Franquicia(dueno, trabajadores, "VRJC - Madrid", "Madrid", "09h00", "18h00", 0, 0);
        franquicias.add(f);
        
        //2ª Franquicia
        dueno = new Dueno("Rui", "Fernandez", "rui", "123");
        trabajadores = new ArrayList<>();
        t1 = new Trabajador("Gonzalo", "Martinez", "gonzalo", "123", 500);
        trabajadores.add(t1);
        t2 = new Trabajador("Juan", "Jegundo", "jegundo", "123", 600);
        trabajadores.add(t2);
        t3 = new Trabajador("Irene", "Teresa", "irene", "123", 450);
        trabajadores.add(t3);
        f = new Franquicia(dueno, trabajadores, "VRJC - Barcelona", "Barcelona", "09h00", "17h00", 0, 0);
        franquicias.add(f);
        
        //3ª Franquicia
        dueno = new Dueno("Jose", "Miguel", "jose", "123");
        trabajadores = new ArrayList<>();
        t1 = new Trabajador("Gustavo", "Andrade", "gustavo", "123", 500);
        trabajadores.add(t1);
        t2 = new Trabajador("Nuno", "Paiva", "nuno", "123", 600);
        trabajadores.add(t2);
        t3 = new Trabajador("Carlos", "Fonseca", "carlos", "123", 450);
        trabajadores.add(t3);
        f = new Franquicia(dueno, trabajadores, "VRJC - Salamanca", "Salamanca", "09h00", "17h00", 0, 0);
        franquicias.add(f);
        
        //4ª Franquicia
        dueno = new Dueno("Pedro", "Piedade", "pedro", "123");
        trabajadores = new ArrayList<>();
        t1 = new Trabajador("Claudio", "Fonseca", "claudio", "123", 500);
        trabajadores.add(t1);
        t2 = new Trabajador("Antoine", "Massart", "antoine", "123", 600);
        trabajadores.add(t2);
        t3 = new Trabajador("Pedro", "Esteves", "esteves", "123", 450);
        trabajadores.add(t3);
        f = new Franquicia(dueno, trabajadores, "VRJC - Valência", "Valência", "09h00", "17h00", 0, 0);
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
    
    public void setFranquicias(ArrayList<Franquicia> franquicias){
        this.franquicias = franquicias;
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
        
    public int crearCarpeta()
    {
        
        String filePath = "C:\\VRJC";
        FileOutputStream fout;
        ObjectOutputStream out;
        File directorio = new File(filePath);

        if (!directorio.exists()) {
            try {
                directorio.mkdir();
            } catch (Exception e) {
                return -1;
            }
        } else {
            return 0;
        }

        return 1;
        
    }   

}