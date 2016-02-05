/*
Dado un numero entero transformarlo en sistema binario, octal y hexadecimal.
Utilizar métodos de la api de Integer.
 */

package Propuesta1Wrapper;

import java.util.Scanner;

public class Propuesta1 {

    public static void main(String[] args) {
        int num = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = entrada.nextInt();
        System.out.println("Binario: "+Integer.toBinaryString(num));
        System.out.println("Octal: "+Integer.toOctalString(num));
        System.out.println("Hexadecimal: "+Integer.toHexString(num));
    }
    
}
