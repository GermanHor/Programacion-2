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
public class Diez {

    /**
     * @param args the command line arguments
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int stockA, stockV, stockR;
        
        System.out.println("Ingrese el stock actual: ");
        stockA = Integer.parseInt(input.nextLine());
       
        System.out.println("Ingrese la cantidad vendida: ");
        stockV = Integer.parseInt(input.nextLine());
       
        System.out.println("Ingrese la cantidad recibida: ");
        stockR = Integer.parseInt(input.nextLine());
        System.out.println("El stock actual es: " + actualizarStock(stockA, stockV, stockR));
        
       
    }
    
}
