/*
Escribe una clase llamada Contar_alumnos que disponga de unos atributos nombre,
edad y grupo al que pertenece. La clase debe contener unos métodos que devuelvan
el número total de alumnos que se han instanciado, el número total de alumnos
del grupo 1 y el número total de alumnos mayores de 18 años.
 */
package Propuesta1Static;

public class Alumno {
    String nombre;
    int edad;
    String grupo;
    static int contadorTotal;
    static int contadorGrupo1;
    static int contadorMayoresEdad;

    public Alumno(String nombre, int edad, String grupo) {
        this.nombre = nombre;
        this.edad = edad;
        this.grupo = grupo;
        contadorTotal++;
        Alumno.totalGrupo1(this.grupo);
        Alumno.totalMayoresEdad(this.edad);
    }
    
    public static int totalAlumnos(){
        return contadorTotal;
    }
    
    public static int totalGrupo1(String grupo){
        if(grupo.equals("Grupo 1")){
            contadorGrupo1++;
        }
        return contadorGrupo1;
    }
    public static int totalMayoresEdad(int edad){
        if(edad >= 18){
            contadorMayoresEdad++;
        }
        return contadorMayoresEdad;
    }
}
