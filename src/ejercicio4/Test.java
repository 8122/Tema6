/*
Escribe en Java una clase Enumerados que incluya los siguientes tipos enumerados:
a. Dias laborables
b. Calificaciones de un alumno
c. Notas musicales
d. Puestos en un hospital
e. Modelos de SEAT
Crea dos variables de cada tipo. Una la inicializas con alguno de los valores
posibles y la otra asigna su valor recogiéndolo por teclado. Compara sus valores
y muestra resultado por pantalla. Lista todos los valores de uno de los enumerados.
 */
package ejercicio4;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //varibles dias laborables
        DiasLaborables hoy = DiasLaborables.JUEVES;
        System.out.println("Introduzca el próximo dia laboral: ");
        String dia = sc.nextLine().toUpperCase();
        DiasLaborables mañana = DiasLaborables.valueOf(dia);
        System.out.println("Mañana es: "+mañana);
        
        //variables Calificaciones de una alumno
        Alumno.CalificacionesAlumno nota1 = Alumno.CalificacionesAlumno.BIEN;
        System.out.println("Introduzca nota alumno: ");
        Alumno.CalificacionesAlumno nota = Alumno.CalificacionesAlumno.valueOf(sc.nextLine().toUpperCase());
        
        //variable notas musicales
        Musica.NotasMusicales notaM1 = Musica.NotasMusicales.DO;
        System.out.println("Introduzca nota musical: ");
        Musica.NotasMusicales notaM2 = Musica.NotasMusicales.valueOf(sc.nextLine().toUpperCase());
        
        //variables modelos Seat
        System.out.println("Los modelos de SEAT son: ");
        Seat.Modelos[] modelos = Seat.Modelos.values();
        for(Seat.Modelos modelo: modelos){
            System.out.println(modelo);
        }
        
    }
    
}
