/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionMatricula;

/**
 *
 * @author ùser
 */
public class Error3 extends RuntimeException{
    public Error3(String matricula){
        super("ERROR 3: No ha introducido las letras correctamente.");
    }
}
