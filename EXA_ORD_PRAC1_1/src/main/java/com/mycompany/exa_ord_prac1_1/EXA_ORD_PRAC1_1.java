package com.mycompany.exa_ord_prac1_1;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EXA_ORD_PRAC1_1 {

    public static void main(String[] args) {
        //Datos del Equipo.
        String Equipo ="Backyardigans";
        String Proyecto = "Proyecto Final";
        
        //Datos de los Integrantes.
        String [][] integrantes = {
            {"Diego", "Escarcega", "23550403"},
            {"Nestor","Escudero", "23550844"},
            {"Ivan", "Hernandez", "23550366"},
            {"Sergio", "Olague", "23550388"}
        };
        
        //Imprimir datos del Equipo.
        System.out.println("Nombre del Equipo: " + Equipo);
        System.out.println("Proyecto: " + Proyecto);
        
        // Imprimir los datos de cada integrante del equipo
        System.out.println("Integrantes del equipo: ");
        for (String[] integrante : integrantes) {
            String Nombre = integrante[0];
            String Apellido = integrante[1];
            String numControl = integrante[2];
            System.out.println(Nombre + " " + Apellido + "|" + numControl);           
        }
        
    }
}
