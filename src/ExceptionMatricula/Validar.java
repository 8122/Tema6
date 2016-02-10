/*
Dado el ejercicio de parking implementa una excepción que salte si la matrícula
del vehículo no contiene letras o también si contiene más de 4 dígitos. Debe
respetar el siguiente formato: 0000AAA
 */

package ExceptionMatricula;

public class Validar {
    
    public static void validarMatricula(String matricula){
        if(matricula.length() != 7){
            throw new Error1(matricula);
        }else{
            for(int i=0; i<4; i++){
                if(!Character.isDigit(matricula.charAt(i))){
                    throw new Error2(matricula);
                }
            }
            for(int i=4; i<7; i++){
                if(!Character.isLetter(matricula.charAt(i))){
                    throw new Error3(matricula);
                }
            }
        }
    }
    
}
