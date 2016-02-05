/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

/**
 *
 * @author ùser
 */
public class ElementoQuimico {
    String nombre = null;
    String simbolo = null;
    int periodo = 0;
    int grupo = 0;
    static int identificador = 0;

    public ElementoQuimico(String nombre, String simbolo, int periodo, int grupo) {
        identificador++;
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.periodo = periodo;
        this.grupo = grupo;
    }
    
    public static int numerodeElementos(){
        return identificador;
    }
}
