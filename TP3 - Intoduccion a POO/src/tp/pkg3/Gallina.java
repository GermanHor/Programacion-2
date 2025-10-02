/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    

//Metodo poner huevo
public void ponerHuevos() {
huevosPuestos++;
    System.out.println("la gallina " + idGallina + " ha puesto un huevo");
}

//Metodo envejecer
public void envejecer() {
edad++;
    System.out.println("la gallina " + idGallina + " ha envejecido. Ahora tiene " + edad);
}
// Metodo mostrar estado
public void mostrarEstado() {
    System.out.println("gallina " + idGallina + " | Edad: " + edad + " años | Huevos puestos: " + huevosPuestos);
    
}
} 