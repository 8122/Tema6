/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionMatricula;

import java.util.Scanner;

/**
 *
 * @author ùser
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String matricula;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca matricula: ");
        matricula = sc.nextLine();
        try{
            Validar.validarMatricula(matricula);
            System.out.println("Matricula válida");
        }catch(Error1 e){
            System.out.println(e.getMessage());
        }catch(Error2 e){
            System.out.println(e.getMessage());
        }catch(Error3 e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
