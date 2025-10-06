/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg4;

/**
 *
 * @author German
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Ana", "Gerente", 30000);
        Empleado e2 = new Empleado("Carlos", "mantenimiento");
        Empleado e3 = new Empleado("Celeste", "Contadora");
        
        //Aumentos
        e1.actualizarSalario(10.00);  // 10 % de aumento con double
        e2.actualizarSalario(5000); // aumento fijo con int
        
        
        //Mostrar info
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        //Total empleados
        System.out.println("Toteal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
 
   
    
}
