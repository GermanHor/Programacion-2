/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Nueve {

    /**
     * @param args the command line arguments
     */
    public static double calcularEnvio(double peso, String zona) {
            if (zona.equalsIgnoreCase("Nacional")) {
               return  5 * peso;
            } else if (zona.equalsIgnoreCase("Internacional")) {
                return  10 * peso;
            } else {
                System.out.println("Error");
                return -1;
            }
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
       return precioProducto + costoEnvio;
    }
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double precio, peso;
        String zona;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el peso del producto: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese zona de envio (nacional/internacional): ");
        zona = input.nextLine();
        
        double costoEnvio = calcularEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("Costo de envio: " + costoEnvio);
        System.out.println("Total a pagar: " + total);
    }
    
}