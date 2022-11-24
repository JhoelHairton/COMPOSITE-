/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.ejemplocomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ManagerComposite implements Empleado{
    
    private String Nombre; 
    
    private double Salario; 
    
public ManagerComposite(String nombre, double salario) {

    this.Nombre=nombre;
    this.Salario=salario;
}

    List<Empleado> empleados= new ArrayList<Empleado>();
    
    public void add(Empleado empleado){
        empleados.add(empleado);
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
        System.out.println("Salario:" + getSalario());
        System.out.println("============================");

        Iterator<Empleado> empleadoIterator=empleados.iterator();
        while (empleadoIterator.hasNext()) {            
            Empleado empleado=empleadoIterator.next();
            
            empleado.print();
        }
     
    }
    
}
