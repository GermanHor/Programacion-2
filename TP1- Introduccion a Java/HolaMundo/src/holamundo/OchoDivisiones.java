/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class OchoDivisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int uno, dos;
        System.out.println("Ingrese un numero: ");
        uno = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero: ");
        dos = Integer.parseInt(input.nextLine());
        
        System.out.println("Con numeros enteros: ");
        System.out.println(uno / dos);
        System.out.println("Con numeros Double: ");
        System.out.println((double) uno / dos);
    }
    
}
