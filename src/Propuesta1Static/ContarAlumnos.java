/*
Escribe una clase llamada Contar_alumnos que disponga de unos atributos nombre,
edad y grupo al que pertenece. La clase debe contener unos métodos que devuelvan
el número total de alumnos que se han instanciado, el número total de alumnos
del grupo 1 y el número total de alumnos mayores de 18 años.
 */
package Propuesta1Static;

public class ContarAlumnos {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Ramon Aliena", 47, "Grupo 1");
        Alumno a2 = new Alumno("Juan Aliena", 58, "Grupo 1");
        Alumno a3 = new Alumno("Jose Aliena", 23, "Grupo 2");
        Alumno a4 = new Alumno("Pepe Aliena", 17, "Grupo 2");
        Alumno a5 = new Alumno("Lidia Aliena", 9, "Grupo 3");
        Alumno a6 = new Alumno("Tina Aliena", 42, "Grupo 3");
        Alumno a7 = new Alumno("Vicente Aliena", 20, "Grupo 1");
        Alumno a8 = new Alumno("Yolanda Aliena", 18, "Grupo 1");
        Alumno a9 = new Alumno("Aranzazu Aliena", 15, "Grupo 2");
        Alumno a10 = new Alumno("David Aliena", 14, "Grupo 1");
        Alumno a11 = new Alumno("Ruben Aliena", 15, "Grupo 3");
        Alumno a12 = new Alumno("Sebastian Aliena", 13, "Grupo 1");
        Alumno a13 = new Alumno("Raquel Aliena", 25, "Grupo 3");
        Alumno a14 = new Alumno("Maria Aliena", 26, "Grupo 3");
        Alumno a15 = new Alumno("Cristina Aliena", 16, "Grupo 2");
        Alumno a16 = new Alumno("Ana Aliena", 26, "Grupo 1");
        
        System.out.println("Total alumnos: "+Alumno.contadorTotal);
        System.out.println("Total alumnos grupo 1: "+Alumno.contadorGrupo1);
        System.out.println("Total alumnos mayores de edad: "+Alumno.contadorMayoresEdad);
                
        
        
        
    }
    
}
