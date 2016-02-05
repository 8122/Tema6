/*
Recoge números por teclado usando sc.next(), es decir como texto, conviértelos a
numérico, súmalos y calcula la media de todos.
 */
package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ramon Aliena
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int contador = 0;
        double suma = 0.0;
        double media = 0.0;
        String opcion = null;
        
        Scanner entradaOpcion = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("MENU");
            System.out.println("\ta. Introduzca número.");
            System.out.println("\tb. Calcular media.");
            System.out.println("\tc. Salir.");
            System.out.print("Elija una opcion: ");
            try{
                opcion = entradaOpcion.nextLine().toLowerCase();
            }catch(InputMismatchException e){
                sc.nextLine();
                opcion = "d";
            }
            
            switch(opcion){
                case "a":
                    try{
                        System.out.print("Introduzca número: ");
                        String num = sc.next();
                        suma += Double.parseDouble(num);
                        contador++;
                    }catch(InputMismatchException | NumberFormatException e){
                        System.out.println("ERROR: Debe introducir un número.");
                        contador--;
                        opcion = "a";
                    }
                    break;
                case "b":
                    if(contador == 0){
                        System.out.println("Debe introducir al menos un número.");
                        opcion = "a";
                    }else{
                        media = suma/contador;
                        System.out.println("La media es "+media);
                    }
                    break;
                case "d":
                    System.out.println("ERROR: No ha introducido una opcion correcta. Debe ser a, b ó c.");
            }
        }while(!opcion.equals("c"));
    }
    
}
