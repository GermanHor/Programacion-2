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
public class once {

    /**
     * @param args the command line arguments
     */
    
    // Variable global
    static double descuento = 0.1;
    
   
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento;
        double pfinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("Precio final con descuento: " + pfinal);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble(input.nextLine());
        calcularDescuentoEspecial(precio);
    }
    
}
