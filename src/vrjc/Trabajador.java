
package vrjc;

public class Trabajador {
    
    private String Nombre;
    private String Apelido;
    private float Saldo;
    
    public Trabajador(){
        Nombre = null;
        Apelido = null;
        Saldo = 0;
    }
    
    public Trabajador(String Nombre, String Apelido, float Saldo){
        this.Nombre = Nombre;
        this.Apelido = Apelido;
        this.Saldo = Saldo;        
    }
    
    public String getNombre(){
        return Nombre;
    }
        
    public String getApelido(){
        return Apelido;
    }
    
    public float getSaldo(){
        return Saldo;
    }
            
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }        
    
    public void setApelido(String Apelido){
        this.Apelido = Apelido;
    }           
            
    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }   
    
    @Override
    public String toString(){
        return ("Nombre: " + Nombre + "\nApelido: " + Apelido + "\nSaldo: " + Saldo);
    }    
    
}