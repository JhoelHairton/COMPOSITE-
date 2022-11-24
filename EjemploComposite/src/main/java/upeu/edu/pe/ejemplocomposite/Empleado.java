/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.ejemplocomposite;

/**
 *
 * @author Usuario
 */
public interface Empleado {
    
    public void add(Empleado empleado);
    
    public String getNombre();
    
    public double getSalario();
    
    public void print();
    
}
