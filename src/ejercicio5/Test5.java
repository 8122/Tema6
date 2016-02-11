/*
Se desea representar las bombillas que pueda haber en una casa. Cada bombilla 
tiene asociado un interruptor y solo uno. Así mismo, existe un interruptor 
general, ambos interruptores tienen dos estados, ON y OFF (crea un enum para 
esta información). Una bombilla luce si el interruptor general de la casa esta 
ON y si su interruptor también. Escribe una clase de nombre Bombilla que permita 
modelar la información anterior. Para ello, la clase dispondrá de los siguientes 
métodos:
? Para cambiar el estado del interruptor de la bombilla
? Para cambiar el estado del interruptor general de la casa
? Determinar si una bombilla está encendida o no
Recuerda que el interruptor general es común a todas las bombillas que se puedan
crear.
Escribe un programa que utilice la clase Bombilla anterior. Para ello se creará
una bombilla, se mostrara si está luciendo o no. Luego se cambiará el estado del
interruptor de la bombilla, volver a mostrar si está encendida o no. Se crea 
otra bombilla y se enciende. Se indica el estado de cada una de las dos 
bombillas. Se pulsa el interruptor general de la casa e imprimimos si las 
bombillas siguen o no luciendo.
 */

package ejercicio5;

public class Test5 {

    public static void main(String[] args) {
        Bombilla bombillaSalon = new Bombilla();
        System.out.println("¿La bombilla del salon esta encendida? "+bombillaSalon.estaEncendida());
        System.out.println("Cambiar estado interruptor bombilla salon");
        bombillaSalon.setEstadoI(Interruptor.ON);
        System.out.println("¿La bombilla del salon esta encendida? "+bombillaSalon.estaEncendida());
        System.out.println("Cambiar estado interruptor General");
        Bombilla.setEstadoIG(InterruptorGeneral.ON);
        System.out.println("¿La bombilla del salon esta encendida? "+bombillaSalon.estaEncendida());
        Bombilla bombillaCocina = new Bombilla();
        System.out.println("¿La bombilla de la cocina esta encendida? "+bombillaCocina.estaEncendida());
        System.out.println("Cambiar estado interruptor bombilla cocina");
        bombillaCocina.setEstadoI(Interruptor.ON);
        System.out.println("¿La bombilla de la cocina esta encendida? "+bombillaCocina.estaEncendida());
        System.out.println("Cambiar estado interruptor General");
        Bombilla.setEstadoIG(InterruptorGeneral.OFF);
        System.out.println("¿La bombilla del salon esta encendida? "+bombillaSalon.estaEncendida());
        System.out.println("¿La bombilla de la cocina esta encendida? "+bombillaCocina.estaEncendida());
    }
    
}
