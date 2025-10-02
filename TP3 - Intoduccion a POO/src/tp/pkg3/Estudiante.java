/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion; 

//Metodo que muestra la informacion
public void mostrarInfo(){
    System.out.println("Nombre: " + nombre + " " + apellido);
    System.out.println("Curso: " + curso);
    System.out.println("Calificación: " + calificacion);
    System.out.println(" ");
}

 //Subir nota    
public void subirCalificacion(int puntos) {
    calificacion += puntos;
}

//Bajar nota
public void bajarCalificacion(int puntos){
    calificacion -= puntos;
}

}