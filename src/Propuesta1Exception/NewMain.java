/*

 */
package Propuesta1Exception;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        String vehiculo;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Introduzca un vehiculo: ");
            vehiculo = sc.nextLine();
            Validar.validarVehiculo(vehiculo);
        }catch(MiExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    
}
