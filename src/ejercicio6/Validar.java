
package ejercicio6;

public class Validar {
    public static void  haSalido(int num){
        if(num == 42089){
            throw new MiError(num);
        }
    }
    
}
