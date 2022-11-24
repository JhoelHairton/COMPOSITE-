/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.edu.pe.ejemplocomposite;

/**
 *
 * @author Usuario
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado empleado1 = new DeveloperHoja("Paul", 10000.0);
        Empleado empleado2 = new DeveloperHoja("Jose", 10000.0);
        Empleado gerente1 = new ManagerComposite("Laura", 200000.0);

        gerente1.add(empleado1);
        gerente1.add(empleado2);

        Empleado gerenteGeneral = new ManagerComposite("Antonio", 300000.0);

        gerenteGeneral.add(gerente1);
        gerenteGeneral.print();

    }

}
