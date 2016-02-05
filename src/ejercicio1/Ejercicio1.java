/*
Escribe una clase llamada ElementoQuimico, que disponga de un atributo con su 
nombre, otro para su símbolo y otros para indicar el periodo y el grupo al que 
pertenece. La clase debe contener un método llamado numerodeElementos() que 
devuelve el número total de elementos que se han instanciado. Cada elemento 
deberá tener también un atributo q sea un numero identificador único y no 
modificable para cada elemento que se crea.
Prueba la clase en un programa para: Oro, Plata, Hidrogeno y Zinc. Busca 
información en la Wikipedia
Nota: un atributo con valor común a todos los objetos se define como static
 */

package ejercicio1;

/**
 *
 * @author ùser
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ElementoQuimico oro = new ElementoQuimico("Oro", "Au", 6, 11);
        ElementoQuimico plata = new ElementoQuimico("Plata", "Ag", 5, 11);
        ElementoQuimico hidrogeno = new ElementoQuimico("Hidrógeno", "H", 1, 1);
        ElementoQuimico Zinc = new ElementoQuimico("Zinc", "Zn", 12, 4);
        
        System.out.println("Numero de elementos: "+ElementoQuimico.numerodeElementos());

    }
}
