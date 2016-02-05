/*
Dado un NIF en formato String, comprueba que la letra es la correcta.
La letra se calcula mediante el resto de 23 de la parte numérica. Cada numero
resultante se corresponde con una letra según el orden del string:

String letras = "TRWAGMYFPDXBNJZSQVHLCKE" 
 */

package comprobarnif;

import java.util.Scanner;

public class ComprobarNIF {

    public static void main(String[] args) {
        String NIF = null;
        Character letra = null;
        Integer numeros = 0;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un NIF: ");
        NIF = sc.nextLine(); //recogemos el nif
        letra = NIF.charAt(8); //extraemos la letra del NIF en un Character
        //para evitar que la letra este en minuscula la transformamos a String
        String letraMayuscula = letra.toString().toUpperCase(); //y la ponemos en mayuscula
        letra = letraMayuscula.charAt(0); //se vuelve a pasar a Character
        //extraemos la subcadena String de digitos
        numeros = Integer.parseInt(NIF.substring(0, 8)); //y la transformamosa un numero int
        int num = numeros%23;// obtenermos la posicion en el string letras
        char ch = letras.charAt(num);//extraemos la letra correspondiente en char
        if(letra == ch){//comparamos los dos char
            System.out.println("El NIF "+NIF+" es correcto.");
        }else{
            System.out.println("El NIF "+NIF+" es incorrecto.");
        }
    }
    
}