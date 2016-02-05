
package ejercicio2;

public class AparatoElectrico {
    String nombre;
    static int consumo = 0;
    boolean encendido = false;
    
    public int encender(int potencia){
        encendido = true;
        consumo += potencia;
        return consumo;
    }
    
    public int apagar(int potencia){
        if(encendido){
            encendido = false;
            consumo -= potencia;
        }
        return consumo;
    }
}
