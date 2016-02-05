/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Propuesta1Exception;

public class MiExcepcion extends RuntimeException {
    public MiExcepcion(String s){
        System.out.println("Este tipo de vehículo no es correcto.");
    }
}
