
package LogicPackage;

/**
 * This file contains the class Gerente
 */
public class Gerente {
    
    private String Nombre;
    private float Salario;
    private int Idade;
    
    public Gerente(){
        Nombre = null;
        Salario = 0;
        Idade = 0;
    }
    
    public Gerente(String Nombre, float Salario, int Idade){
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Idade = Idade;        
    }
    
    public String getNombre(){
        return Nombre;
    }
        
    public float getSalario(){
        return Salario;
    }
    
    public int getIdade(){
        return Idade;
    }
            
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }        
    
    public void setSalario(float Salario){
        this.Salario = Salario;
    }           
            
    public void setIdade(int Idade){
        this.Idade = Idade;
    }   
    
    @Override
    public String toString(){
        return ("Nombre: " + Nombre + "\nSalario: " + Salario + "\nIdade: " + Idade);
    }    
    
}
