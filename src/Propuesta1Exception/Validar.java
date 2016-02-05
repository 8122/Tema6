/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Propuesta1Exception;

/**
 *
 * @author daw1
 */
public class Validar {
    static String[] vehiculos = {"Camión", "Furgoneta", "Deportivo", "Todoterreno", "Monovolumnen", "Turismo", "Moto", "Motocicleta", "Bicicleta"};
    
    public static void validarVehiculo(String vehiculo){
        boolean valido = false;
        for(int i=0; i<vehiculos.length; i++){
            if(vehiculo.equals(vehiculos[i]) && valido == false){
                valido = true;
            }
        }
        if(valido == false){
            throw new MiExcepcion(vehiculo);
        }
    }
}
