package com.mycompany.exa_ord_prac1_8;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EXA_ORD_PRAC1_8 {

    public static void main(String[] args) {
        /*
        * 
          -> Usaremos la forma vertical de 
             la ecuación de una hipérbola.
          -> Para los datos escogimos double, ya que se pueden usar 
             decimales en la siguiente operación.
        */
        
        //Datos de la fórmula: 
        Scanner CPTR = new Scanner(System.in);
        System.out.println("Coordenadas del centro (h, k):");
        double h = CPTR.nextDouble();
        double k = CPTR.nextDouble();
        System.out.println("Valor de a:");
        double a = CPTR.nextDouble();
        System.out.println("Valor de b:");
        double b = CPTR.nextDouble();
        
        //Sección de procedimientos:
        //1. Distancia del centro al foco:
        double c = (a * a) + (b * b);
        //2. Coordenadas de los vértices:
        double v1 = (k + a);
        double v2 = (k - a);
        //3. Coordenadas de los focos:
        double f1 = (k + c);
        double f2 = (k - c);
        
        //Sección de resultados:
        System.out.println("Resultados;");
        System.out.println("Distancia del centro al foco: " + c);
        System.out.println("   "); // <- Espacio blanco para que se vea mejor los resultados.
        System.out.println("Coordenadas de los vértices:");
        System.out.println("V1: ("+ h +","+ v1 +")"); // <- Usamos comillas en los parentesis y coma para darle forma a las coordenadas.
        System.out.println("V2: ("+ h +","+ v2 +")");
        System.out.println("   ");
        System.out.println("Coordenadas de los focos:");
        System.out.println("F1: ("+ k +","+ f1 +")");
        System.out.println("F2: ("+ k +","+ f2 +")");
        
        //{°-°}
    }
}
