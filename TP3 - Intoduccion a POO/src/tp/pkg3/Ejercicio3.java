/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Libro
        Libro libro1 = new Libro ();
        
        libro1.setTitulo("PrimerLibro");
        libro1.setAutor("Messi");
        libro1.setAnioPublic(2022);
    
    
    //agrgar año invalido
    libro1.setAnioPublic(2027);
    
    // Mostrar info
    libro1.mostrarInfo();
    
    System.out.println("\n");

//agrgar año valido
    libro1.setAnioPublic(2023);
    
    // Mostrar info
    libro1.mostrarInfo();
    }
}
