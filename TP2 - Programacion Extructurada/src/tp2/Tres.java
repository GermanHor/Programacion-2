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
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        if (edad < 12 && edad >= 0) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad < 60 ) {
            System.out.println("Adulto");
        }else if (edad >= 60) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Error");
        }
    }
    
}
