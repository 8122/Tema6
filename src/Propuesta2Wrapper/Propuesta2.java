/*
Programa que lea un texto introducido por teclado y muestre cuantos digitos,
letras, espacios en blanco y cuantos caracteres no UNICODE hay. 
Utiliza los metodos de la api de Character.
*/
package Propuesta2Wrapper;

import java.util.Scanner;

public class Propuesta2 {

    public static void main(String[] args) {
        String texto = null;
        int contadorNum = 0;
        int contadorLetras = 0;
        int contadorEspacios = 0;
        int contadorNoUnicode = 0;
        String noUnicode = null;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca texto: ");
        texto = entrada.nextLine();
        for(int i=0; i<texto.length(); i++){
            if(Character.isDigit(texto.charAt(i))){
                contadorNum++;
            }else if(Character.isLetter(texto.charAt(i))){
                contadorLetras++;
            }else if(Character.isSpaceChar(texto.charAt(i))){
                contadorEspacios++;
            }else{
                contadorNoUnicode++;
            }
        }
        System.out.println("Hay "+contadorNum+" numeros, "+contadorLetras+
                " letras y "+contadorEspacios+" espacios en blanco y "+
                contadorNoUnicode+" caracteres no UNICODE.");
    }
    
}
