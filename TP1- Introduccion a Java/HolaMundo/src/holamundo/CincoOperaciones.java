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
public class CincoOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int uno, dos;
        System.out.println("Ingrese un numero:");
        uno = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero:");
        dos = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + (uno + dos) + "\nResta:  " + (uno - dos) +
                "\nMultiplicacion: " + (uno * dos) + "\nDivision: " + ((double) uno/dos));
            
    }
    
}
