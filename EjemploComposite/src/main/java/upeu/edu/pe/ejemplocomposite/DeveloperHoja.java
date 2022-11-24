/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.ejemplocomposite;

/**
 *
 * @author Usuario
 */
public class DeveloperHoja implements Empleado{
    
    private String Nombre;
    private double Salario;
    
    public DeveloperHoja(String nombre, double salario){
    
    this.Nombre=nombre;
    this.Salario=salario;
    }

    public void add(Empleado empleado){
        
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public double getSalario() {
        return Salario; 
    }
    
    public void print(){
    
        System.out.println("============================");
        System.out.println("Nombre:" + getNombre());
        System.out.println("Salario" + getSalario());
        System.out.println("============================");
        
        
    }
}
