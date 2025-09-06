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
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Ingrese un numero o 0 para salir: ");
        num = Integer.parseInt(input.nextLine());
        while (num != 0) {
            if (num % 2 == 0) {
                sum += num;
            } 
                System.out.println("Ingrese otro numero o 0 para salir: ");
                num = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los numeros pares es: " + sum);
    }
    
}
