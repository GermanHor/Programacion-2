/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nave naveuno = new Nave();
        naveuno.nombre = "Navita";
        naveuno.combustible = 50;
        
        //acciones
        naveuno.despegar();
        naveuno.avanzar(70); //no puede
        
        // recargar
        naveuno.recargarCombustible(50);
        naveuno.despegar();
        naveuno.avanzar(70);
        
        //estado
        System.out.println("Estado de la nave \n");
        naveuno.mostrarEstado();
        
    }
    
}
