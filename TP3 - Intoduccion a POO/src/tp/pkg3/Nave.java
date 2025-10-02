/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3;

/**
 *
 * @author German
 */
public class Nave {
    String nombre;
    int combustible;
    
    // metodo despegue
    public void despegar() {
        if (combustible > 50) {
            System.out.println("La nave " + nombre + " ha despegado ");
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }
    public void avanzar(int distancia) {
        if(distancia <= combustible) {
            combustible -= distancia;
            System.out.println("la nave " + nombre + " avanzó " + distancia + " unidades \n");
        } else
            System.out.println("No hay suficiente combustible ");
            
    }
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible +=cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible");
        } else {
            int recargaPosible = 100 - combustible;
            System.out.println("Solo se puede cargar " + recargaPosible + " o menos");
        }
            
        
    }
    public void mostrarEstado() {
        System.out.println("️Nave: " + nombre + " | Combustible actual: " + combustible);
    }
}
