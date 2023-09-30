/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_7;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class PROBLEMA_7 {
    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double xpendiente;
        double xpenresultado;
        double x1;
        double x2;
        double x3;
        x3 = 10;
        //-------------------------------------
        double y1;
        double y2;
        double y3;
        double area;
        double suma;
        //-------------------------------------
        System.out.println("Ingresa un valor de X para calcular su pendiente");
        xpendiente = input.nextDouble();
        xpenresultado = Math.pow(xpendiente, (double) 2);
        System.out.println("El valor de la pendiente es: " + xpenresultado);
        System.out.println("Para continuar ingresa dos valores de X para conocer su area");
        System.out.println("Ingresa el primer valor que desees asignar a X");
        x1 = input.nextDouble();
        y1 = Math.pow(x1, (double) 2);
        System.out.println("Ingresa el segundo valor que desees asignar a X");
        x2 = input.nextDouble();
        y2 = Math.pow(x2, (double) 2);
        y3 = Math.pow(x3, (double) 2);
        //-------------------------------------
        suma = x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 + x3 * y2 + x2 * y1;
        area = suma / 2;
        System.out.println("El area es de: " +area +" Unidades cuadradas");
                
        
    }
    
}
