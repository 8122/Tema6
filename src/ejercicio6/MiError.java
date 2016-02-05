
package ejercicio6;

public class MiError extends RuntimeException{
    public MiError(int num){
        super("Ha salido el "+num);
    }
    
}
