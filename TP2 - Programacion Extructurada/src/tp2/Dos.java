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
public class Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, c, b;
        System.out.println("Ingrese el primer numero: ");
        a = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        b = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercer numero: ");
        c = Integer.parseInt(input.nextLine());
        
        if ( a > b && a > c) {
            System.out.println("El numero mayor es " + a);
        } else if (b > a && b > c ) {
            System.out.println("El numero mayor es " + b);
        }else{
            System.out.println("El numero mayor es " + c);
        }
    }
    
}
