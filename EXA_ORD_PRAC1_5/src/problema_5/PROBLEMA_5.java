/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_5;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class PROBLEMA_5 {
    private static final Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vel0;
        double alturamax;
        double distancia;
        int sen45por2;
        double senoangulo;
        double gravedad;
        
        senoangulo = 0.70710678118655;
        sen45por2 = 1;
        gravedad = 9.8;
        
        System.out.println("Ingresa la velocidad inicial del proyectil en metros");
        vel0 = input.nextDouble();
        alturamax = Math.pow(vel0, (double) 2) * Math.pow(senoangulo, (double) 2) / (2 * gravedad);
        distancia = Math.pow(vel0, (double) 2) * sen45por2 / gravedad;
        System.out.println("La altura maxima que alcanza el proyectil es de: " + alturamax + " metros.");
        System.out.println("La distancia maxima que alcanza el proyectil es de: " + distancia + " metros.");
        
    }
    
}
