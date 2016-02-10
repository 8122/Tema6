/*
 Programa Trocear que recoja varias palabras separadas por ":" por teclado.
 Indique por pantalla de cuantas palabras está¡ compuesta y cuáles son éstas en
 líneas independientes.
 */
package Ejercicio8;

import java.util.StringTokenizer;

public class Test8 {

    public static void main(String[] args) {
        String semana = "Lunes:Martes:Miercoles:Jueves:Viernes:Sabado:Domingo";
        StringTokenizer s = new StringTokenizer(semana, ":");
        System.out.println("Total palabras: " + s.countTokens());
        while (s.hasMoreTokens() == true) {
            System.out.println(s.nextToken());
        }
    }

}
