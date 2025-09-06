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
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precio;
        String categoria;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese el precio: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la categoria \nA B o C: ");
        categoria = input.nextLine();
        
        if (categoria.equalsIgnoreCase("a")) {
            System.out.println("Descuento aplicado: 10%");
            System.out.println("Precio final: " + precio*0.90);
        } else if (categoria.equalsIgnoreCase("b")) {
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Precio final: " + precio*0.85);
        }
          else if (categoria.equalsIgnoreCase("c")) {
            System.out.println("Descuento aplicado: 20%");
            System.out.println("Precio final: " + precio*0.80);
        }
          else {
              System.out.println("Error");
          }
        
    }
    
}
