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
    Scanner CPTR = new Scanner(System.in); //<- New Scanner para capturar datos | CPTR = CAPTURA (0w0)
        System.out.println("Velocidad Angular Inicial (rad/s): ");
        double velocidadInicial = CPTR.nextDouble();
        System.out.println("Velocidad Angular Final (rad/s): ");
        double velocidadFinal = CPTR.nextDouble();
        System.out.println("Tiempo de Rotación (s): ");
        double tiempoRotacion = CPTR.nextDouble();
        System.out.println("Radio de la Rueda (m): ");
        double radioRueda = CPTR.nextDouble ();
      
      /*
       Sección para calcular datos:
       Esta parte necesito investigación, duh.
      */
        double distAngular = (velocidadInicial * tiempoRotacion);
        double distMetros = (distAngular * radioRueda);
        double velAngularPromedio = (velocidadInicial + velocidadFinal) / 2;
        double velMetrosPorSegundo = (velAngularPromedio * radioRueda);
        double acelAngular = (velocidadFinal - velocidadInicial) / tiempoRotacion;
        double acelMetrosPorSegundo = (acelAngular / radioRueda);
        double frecuenciaGiro = (1 / tiempoRotacion);
        
      //Sección para resultados.
        System.out.println("Resultados:");
        System.out.println("Distancia angular recorrida: " + distAngular + " rad"); //<- Mostramos también las unidades de medida de los resultados.
        System.out.println("Distancia en metros recorrida: " + distMetros + " m");
        System.out.println("Velocidad angular promedio recorrida: " + velAngularPromedio + " rad/s");
        System.out.println("Velocidad en m/s promedio recorrida: " + velMetrosPorSegundo + " m/s");
        System.out.println("Aceleración Angular: " + acelAngular + " rad/s^2");
        System.out.println("Aceleración en m/s^2: " + acelMetrosPorSegundo + " m/s^2");
        System.out.println("Frecuencia de giro: " + frecuenciaGiro + " Hz");
        
    }
}
