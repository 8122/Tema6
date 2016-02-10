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
public class Error1 extends RuntimeException{
    public Error1(String matricula){
        super("ERROR 1: La matricula debe ser de siete caracteres.");
    }
}
