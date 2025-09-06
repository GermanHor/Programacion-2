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
public class siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
            do { System.out.println("Ingrese un numero entre 0 y 10: ");
            numero = input.nextInt();
            if (numero < 0 || numero > 10) {
                System.out.println("Error: Numero invalido. Ingrese un numero entre 0 y 10");
            }
    } while (numero < 0 || numero > 10);
            System.out.println("Numero guardado correctamente: " + numero);
    }
}
