/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

/**
 *
 * @author German
 */
public class Doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        for (double p : precios) {
            System.out.println("Precios: " + p);
        }
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados: ");
        for (double p : precios) {
            System.out.println("Precios: " + p);
        }
    }
    
}
