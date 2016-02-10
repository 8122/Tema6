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
public class Error2 extends RuntimeException{
    public Error2(String matricula){
        super("ERROR 2: No ha introducido los numeros correctamente.");
    }
}
