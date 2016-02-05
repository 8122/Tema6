/*
Crea una clase con un método que genere números aleatorios de forma infinita en 
un rango de 1 a 1000000. Cuando genere el numero 42089 debe generar una 
excepción y por tanto el programa terminar (recuerda que cuando un método lanza 
una excepción el que llama a ese método debe recogerla con un try-catch). Indica 
cuantos números se han tenido que generar para obtenerlo.
 */
package ejercicio6;

import java.util.Random;

public class ejercicio6 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero = 0;
        int contador = 0;
        
        while(numero != 42089){
            try{
                numero = (int) (aleatorio.nextDouble()*1000000 + 1);
                contador++;
                Validar.haSalido(numero);
            }catch(MiError e){
                System.out.println(e.getMessage());
                System.out.println("Contador vale "+contador);
            }
        }
    }
    
}
