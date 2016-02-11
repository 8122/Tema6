
package ejercicio5;

public class Bombilla {
    private Interruptor estadoI = Interruptor.OFF;
    private static InterruptorGeneral estadoIG = InterruptorGeneral.OFF;

    public Interruptor getEstadoI() {
        return estadoI;
    }

    public void setEstadoI(Interruptor estadoI) {
        this.estadoI = estadoI;
    }

    public static InterruptorGeneral getEstadoIG() {
        return estadoIG;
    }

    public static void setEstadoIG(InterruptorGeneral estadoIG) {
        Bombilla.estadoIG = estadoIG;
    }
    
    public boolean estaEncendida(){
        boolean encendida = false;
        if(this.getEstadoI() == Interruptor.ON && Bombilla.estadoIG == InterruptorGeneral.ON){
            encendida = true;
        }else{
            
        }
        return encendida;
    }
}
