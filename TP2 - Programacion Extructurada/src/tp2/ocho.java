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
public class ocho {

    /**
     * @param args the command line arguments
     */

    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        
        //formula
        double precioFinal = base + (base * impuestoDecimal) - (base * descuentoDecimal);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base;
        int imp, desc;
        
        System.out.println("Ingrese el precio base del producto: ");
        base = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        imp = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el descuento de porcentaje (Ejemplo: 5 para 5%): ");
        desc = Integer.parseInt(input.nextLine());
        
        double precio = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + precio);

    }

}
