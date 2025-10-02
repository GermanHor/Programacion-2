/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    // Mostrar info - mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años" + "\n");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumple un año más, ahora tiene " + edad + "\n");
    }
}
