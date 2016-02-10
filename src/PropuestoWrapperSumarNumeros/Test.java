/*
Crea una variable String números y recoge por pantalla todos los números que el usuario quiera, crea
una clase suma con un método calcular y pásale los números introducidos por el usuario para que los
sume. Imprime por pantalla un String que sea el resultado que devuelve el método calcular. Debe aceptar
decimales.
 */

package PropuestoWrapperSumarNumeros;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros;
        System.out.println("Introduzca números, escriba 0 para parar: ");
        String num = sc.next();
        numeros = num+" ";
        while(!num.equals("0")){
            num = sc.next();
            numeros = numeros+num+" ";
        }
        System.out.println(Suma.calcular(numeros));
    }
    
}
