/*
Entrada por pantalla de una frase, indicar cuantas palabras tiene la frase, e
indicar cuantas palabras de cada tipo hay:
*Menos de 5 letras.
*Mas de 8 letras.
 */
package Propuesta1StringTokenizer;

import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase; //recoge la frase a invertir
        String invertida = "";//esta sera la frase invertida
        Stack<String> pila = new Stack();//creo una pila Stack
        int contador = 0;
        
        System.out.print("Escriba la frase a invertir: ");
        frase = sc.nextLine();
        
        //String[] palabras = frase.split("\\s");//Array con las palabras de la frase
        
        //introduzco las palabras en la pila
        /*for(String t: palabras){
            pila.push(t);
        }*/
    }
    
}
