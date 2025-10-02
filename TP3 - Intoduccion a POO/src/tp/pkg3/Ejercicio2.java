/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota capu = new Mascota();
        
        capu.nombre = "Capu";
        capu.especie = "Perro";
        capu.edad = 1;
        
        //mostrar info
        capu.mostrarInfo();
        
        //cumplir años
        capu.cumplirAnios();
        
        //mostrar info
        capu.mostrarInfo();
        
    }
    
}
