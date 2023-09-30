/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_3;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        double radio;
        double velocidad;
        
        System.out.println("Ingresa el radio de la tuberia:");
        radio = cap.nextDouble();
        System.out.println("Ingresa la velocidad del flujo de agua  en m/s:");
        velocidad = cap.nextDouble();
        
        double area = velocidad * 2;
        double flujo = area * velocidad;
        
        System.out.println("La cantidad  que fluye en la tuberia en m3 es:" + flujo);
        
    }
    
}
