/*
Escribe un programa Fechas que muestre la fecha y hora actual y la convierta
según los formatos:
a. “Hoy es Viernes, día 15 de Enero del año 2016 y son las 13:30”.
b. 15-01-16
c. 2016.01.15 13:30:15:55
d. viernes, Ene 15, '16
e. 1:30 PM
f. 13:30:55:624
g. 2016.enero.15 13:30
 */

package ejercicio7;

import java.util.Date;
import java.util.GregorianCalendar;

public class Fechas {
    
    public static String meridiano(int h){
        String m;
        if(h<12){
            m = "AM";
        }else{
            m = "PM";
        }
        return m;
    }

    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Juni",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves",
            "Viernes", "Sabado",};
        Date hoy = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(hoy);
        String diaSemana = diasSemana[gc.get(GregorianCalendar.DAY_OF_WEEK)-1];
        int diaMes = gc.get(GregorianCalendar.DAY_OF_MONTH);
        int anyo = gc.get(GregorianCalendar.YEAR);
        int numMes = gc.get(GregorianCalendar.MONTH);
        String mes = meses[numMes];
        int hora = gc.get(GregorianCalendar.HOUR_OF_DAY);
        int minutos = gc.get(GregorianCalendar.MINUTE);
        int segundos = gc.get(GregorianCalendar.SECOND);
        int milisegundos = gc.get(GregorianCalendar.MILLISECOND);
        
        //a
        System.out.printf("Hoy es %s, día %02d de %s y son las %02d:%02d\n", 
                diaSemana, diaMes, mes, hora, minutos);
        //b
        System.out.printf("%02d-%02d-%d\n",diaMes, (diaMes+1), anyo);
        //c
        System.out.printf("%d.%02d.%02d %02d:%02d:%02d:%02d\n",anyo, (numMes+1),
                diaMes, hora, minutos, segundos, milisegundos/10);
        //d
        System.out.printf("%s, %s %02d, '%02d\n", diaSemana.toLowerCase(),
                mes.substring(0, 3), diaMes, anyo%100);
        //e
        System.out.printf("%d:%02d %s\n", hora%12, minutos, meridiano(hora));
        //f
        System.out.printf("%02d:%02d:%02d:%03d\n", hora, minutos, segundos,
                milisegundos);
        //g
        System.out.printf("%d.%s.%02d %02d:%02d\n", anyo, mes.toLowerCase(),
                diaMes, hora, minutos);
    }
    
}
