    
package LogicPackage;

/**
 * This file contains the class Franquicia
 */
public class Franquicia {
    private String Nombre;
    private String Direccion;
    private String HorarioApertura;
    private int NumeroEmpregados;
    
    public Franquicia(){
        Nombre = null;
        Direccion = null;
        HorarioApertura = null;
        NumeroEmpregados = 0;
    }
    
    public Franquicia(String Nombre, String Direccion, String HorarioApertura, int NumeroEmpregados){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.HorarioApertura = HorarioApertura;  
        this.NumeroEmpregados = NumeroEmpregados;
    }
    
    public String getNombre(){
        return Nombre;
    }
        
    public String getDireccion(){
        return Direccion;
    }
    
    public String getHorarioApertura(){
        return HorarioApertura;
    }
    
    public int getNumeroEmpregados(){
        return NumeroEmpregados;
    }
            
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }        
    
    public void setApelido(String Direccion){
        this.Direccion = Direccion;
    }       

    public void setHorarioApertura(String HorarioApertura){
        this.HorarioApertura = HorarioApertura;
    }      
            
    public void setSaldo(int NumeroEmpregados){
        this.NumeroEmpregados = NumeroEmpregados;
    }   
    
    @Override
    public String toString(){
        return ("Nombre: " + Nombre + "\nDireccion: " + Direccion + "\nHorarioApertura: " + HorarioApertura + "\nNumeroEmpregados: " + NumeroEmpregados);
    }    
    
}
