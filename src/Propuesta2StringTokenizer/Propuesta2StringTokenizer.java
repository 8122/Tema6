/*
Escribe un programa que introducida una frase por teclado desordene aleatoriamente
las palabras.
 */

package Propuesta2StringTokenizer;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Propuesta2StringTokenizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String frase;
        String fraseAleatoria = "";
        int numPalabras;
        int posicion;
        
        System.out.print("Escriba una frase: ");
        frase = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(frase); //contiene las palabras como tokens
        numPalabras = st.countTokens();
        String[] palabrasAleatorias = new String[numPalabras];//guardara las palabras
        
        while(st.hasMoreTokens()){
            boolean rellenado = false;//posicion vacia
            do{
                posicion = (int) (rd.nextDouble()*numPalabras);//posicion aleatoria
                if(palabrasAleatorias[posicion] == null){//si la posicion esta vacia
                    palabrasAleatorias[posicion] = st.nextToken();//asignamos palabra a la posicion
                    rellenado = true;//posicion rellenada
                }
            }while(rellenado == false);//mientras la posicion este vacia
        }
        //ahora concatenamos cada elemento del array palabrasAleatorias en el String fraseAleatoria
        for(int i=0; i<palabrasAleatorias.length; i++){
            fraseAleatoria = fraseAleatoria+palabrasAleatorias[i]+" ";
        }
        
        System.out.println(fraseAleatoria.trim());//le quitamos los eapacios en en los extremos
    }
    
}
