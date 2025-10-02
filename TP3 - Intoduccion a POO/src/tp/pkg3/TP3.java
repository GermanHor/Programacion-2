/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante juan = new Estudiante();
        juan.nombre = "Juan";
        juan.apellido = "Messi";
        juan.calificacion = 7;
        juan.curso = "robotica";
        
               
        juan.mostrarInfo();
        
        //Bajamos un punto a la nota
        juan.bajarCalificacion(1);
        juan.mostrarInfo();
        
        // Subimos 2 puntos a la nota
        juan.subirCalificacion(2);
        juan.mostrarInfo();
    
    }
    
}
