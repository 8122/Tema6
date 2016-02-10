/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploStringTokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author daw1
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        String line,word,subword;
        StringTokenizer elementos,subelementos;
        line ="[[a,b],[c,d],[e,f]]";
        elementos = new StringTokenizer(line,"[]");
        while(elementos.hasMoreTokens()){
            word = elementos.nextToken();
            i=1;
            subelementos = new StringTokenizer(word,",");
            while(subelementos.hasMoreTokens()){
                subword = subelementos.nextToken();
                System.out.println(i+". "+subword);
                i++;
            }
        }
    }
}
