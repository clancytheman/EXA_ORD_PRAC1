/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_4;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Problema_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        double res1;
        double res2;
        double res3;
        double res4;
        double res5;
        
        System.out.println("Ingresa la primera resistencia:");
        res1 = cap.nextDouble();
        System.out.println("Ingresa la segunda resistencia:");
        res2 = cap.nextDouble();
        System.out.println("Ingresa la tercera resistencia:");
        res3 = cap.nextDouble();
        System.out.println("Ingresa la cuarta resistencia:");
        res4 = cap.nextDouble();
        System.out.println("Ingresa la quinta resistencia:");
        res5 = cap.nextDouble();
        
        System.out.println("Ingresa el voltaje:");
        double voltaje = cap.nextDouble();
        
        double res_equivalente = res1 + res2 + res3 + res4 + res5;
        System.out.println("La resistencia equivalente es:" + res_equivalente);
        
        double int_corriente = voltaje / res_equivalente;
        System.out.println("La intensidad de corriente es:" + int_corriente);
        
        double int_corriente_1 = voltaje / res1;
        System.out.println("La Intensidad de corriente de la primera resistencia es:" + int_corriente_1);
        
        double int_corriente_2 = voltaje / res2;
        System.out.println("La Intensidad de corriente de la segunda resistencia es:" + int_corriente_2);
        
        double int_corriente_3 = voltaje / res3;
        System.out.println("La Intensidad de corriente de la tercera resistencia es:" + int_corriente_3);
        
        double int_corriente_4 = voltaje / res4;
        System.out.println("La Intensidad de corriente de la cuarta resistencia es:" + int_corriente_4);
        
        double int_corriente_5 = voltaje / res5;
        System.out.println("La Intensidad de corriente de la quinta resistencia es:" + int_corriente_5);
    }
    
}
