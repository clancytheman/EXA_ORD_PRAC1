/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_2;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class PROBLEMA_2 {
    private static final Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fah;
        double kel;
        double cen;
        int grados;
        
        System.out.println("Ingrese la temperatura en grados Fahrenheit");
        fah = input.nextDouble();
        System.out.println("Ingerse el numero 1 para convertir la temperatura a grados Centigrados o el numero 2 para grados Kelvin");
        grados = input.nextInt();
        if (grados == 1) {
            cen = (fah - 32) / 1.8;
            System.out.println(cen + " Grados Centigrados.");
        } else {
            kel = (double) 5 / 9 * (fah - 32) + 273.15;
            System.out.println(kel + " Grados Kelvin.");
        }
    }
    
}
