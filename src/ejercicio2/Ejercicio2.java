/*
Escribe un programa para representar el consumo de energía de una instalación
eléctrica. Para ello, se dispondrá de una clase AparatoElectrico que representa
a los aparatos conectados en la instalación eléctrica. Cada aparato tiene un
nombre, un consumo eléctrico determinado por su potencia. Al encender un aparato
eléctrico, el consumo de energía de toda la instalación, se incrementa en la
potencia de dicho aparato. Al apagarlo, se decrementa el consumo en la misma
cantidad. Inicialmente, los aparatos están todos apagados. Además se desea 
consultar el consumo total de la instalación.
El programa debe declarar 3 aparatos eléctricos, un microondas de 800w, un 
radiador de 2000w y una plancha de 1200w. Se debe imprimir el consumo nada mas 
crear los objetos. Posteriormente, se enciende el microondas y la plancha, 
mostramos el consumo. Luego se apaga la plancha y se enciende el radiador, 
volver a mostrar el consumo.
 */
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        AparatoElectrico microondas = new AparatoElectrico();
        AparatoElectrico radiador = new AparatoElectrico();
        AparatoElectrico plancha = new AparatoElectrico();
        
        System.out.println("El consumo con los apatatos apagados: "+AparatoElectrico.consumo+" w");
        System.out.println("Encendemos el microondas, el consumo es "+microondas.encender(800)+" w");
        System.out.println("Encendemos el radiador, el consumo es "+radiador.encender(2000)+" w");
        System.out.println("Encendemos la plancha, el consumo es "+plancha.encender(1200)+" w");
        System.out.println("Apagamos el microondas, el consumo es "+microondas.apagar(800)+" w");
        System.out.println("Apagamos el radiador, el consumo es "+radiador.apagar(2000)+" w");
        System.out.println("Apagamos la plancha, el consumo es "+plancha.apagar(1200)+" w");
    }
    
}
