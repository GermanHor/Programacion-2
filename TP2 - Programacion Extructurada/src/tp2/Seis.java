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
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Ingrese un numero " + i + ": ");
            int num = Integer.parseInt(input.nextLine());
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }else {
                ceros++;
            }
        }
        System.out.println("Cantidad de positivos: " + positivos  + "\n Cantidad de  negativos: " + negativos + "\n Cantidad de ceros: " + ceros);
    }
}   
    