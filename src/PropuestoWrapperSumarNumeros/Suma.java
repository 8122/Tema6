/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PropuestoWrapperSumarNumeros;

/**
 *
 * @author ùser
 */
public class Suma {
    
    public static String calcular(String s){
        Double suma = 0.0;
        for(int i=0; i<s.length();){
            if(Character.isWhitespace(s.charAt(i))){
                double num = Double.valueOf(s.substring(0, i));
                s = s.substring(i);
                suma += Double.valueOf(s);
            }
        }
        return Double.toString(suma);
    }
}
