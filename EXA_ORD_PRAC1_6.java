package com.mycompany.exa_ord_prac1_6;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EXA_ORD_PRAC1_6 {

    public static void main(String[] args) {
      //
      //Captura de Datos.
    Scanner CPTR = new Scanner(System.in);
        System.out.println("Velocidad Angular Inicial (rad/s): ");
        double velocidadInicial = CPTR.nextDouble();
        System.out.println("Velocidad Angular Final (rad/s): ");
        double velocidadFinal = CPTR.nextDouble();
        System.out.println("Tiempo de Rotación (s): ");
        double tiempoRotacion = CPTR.nextDouble();
        System.out.println("Radio de la Rueda (m): ");
        double radioRueda = CPTR.nextDouble ();
      
      //Sección para calcular datos.
        double distAngular = (velocidadInicial * tiempoRotacion);
        double distMetros = (distAngular * radioRueda);
        double velAngularPromedio = (velocidadInicial + velocidadFinal) / 2;
        double velMetrosPorSegundo = (velAngularPromedio * radioRueda);
        double aceleracionAngular = (velocidadFinal - velocidadInicial) / tiempoRotacion;
        double aceleracionMetrosPorSegundo = (aceleracionAngular / radioRueda);
        double frecuenciaGiro = (1 / tiempoRotacion);
        
      //Sección para resultados.
        System.out.println("Resultados:");
        System.out.println("Distancia angular recorrida: " + distAngular + " rad");
        System.out.println("Distancia en metros recorrida: " + distMetros + " m");
        System.out.println("Velocidad angular promedio recorrida: " + velAngularPromedio + " rad/s");
        System.out.println("Velocidad en m/s promedio recorrida: " + velMetrosPorSegundo + " m/s");
        System.out.println("Aceleración Angular: " + aceleracionAngular + " rad/s^2");
        System.out.println("Aceleración en m/s^2: " + aceleracionMetrosPorSegundo + " m/s^2");
        System.out.println("Frecuencia de giro: " + frecuenciaGiro + " Hz");
        
    }
}
