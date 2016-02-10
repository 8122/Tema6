/*
Programa Invertir que escriba una frase al revés, es decir desde la última
palabra hasta la primera.
Ejemplo: "Esta es la frase a invertir" ? "invertir a frase la es Esta"
Nota: haz una versión del ejercicio utilizando la clase Stack que representa a
una pila, busca información en el api de java y/o internet
 */
package ejercicio9;

import java.util.Scanner;
import java.util.Stack;

public class Test9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase; //recoge la frase a invertir
        String invertida = "";//esta sera la frase invertida
        Stack<String> pila = new Stack();//creo una pila Stack
        
        System.out.print("Escriba la frase a invertir: ");
        frase = sc.nextLine();
        
        String[] palabras = frase.split("\\s");//Array con las palabras de la frase
        
        //introduzco las palabras en la pila
        for(String t: palabras){
            pila.push(t);
        }

        while(!pila.empty()){ //mientras la pila no este vacia
            invertida = invertida + pila.pop()+" ";//extraigo los tokens por el final y los añado a invertida
            //pila.pop();//elimino el ultimo token
        }
        
        System.out.println(invertida.trim());//quito los espacios en los extremos del String
    }
    
}
