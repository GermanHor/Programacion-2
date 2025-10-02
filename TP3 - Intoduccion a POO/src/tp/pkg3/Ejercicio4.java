/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        //gallina 1
        gallina1.idGallina = 1;
        gallina1.edad = 2;
                
        // gallina 2
        gallina2.idGallina = 2;
        gallina2.edad = 1;
        
        
        
        
        //mostrar estado
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        //acciones
        gallina1.ponerHuevos();
        gallina1.envejecer();
        gallina2.ponerHuevos();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.ponerHuevos();
        
        //mostrar nuevo estado
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }
    
}
