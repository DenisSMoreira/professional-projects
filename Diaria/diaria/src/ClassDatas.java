/*
 * ClassDatas.java
 *
 * Created on 9 de Dezembro de 2005, 14:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */
import java.text.*;
import java.util.*;
public class ClassDatas {

    
    
    /** Creates a new instance of ClassDatas */
    public ClassDatas() {    }
    
    private Object Data;
    private Object hora;
    
    public Object PegaDataAtual(){
     GregorianCalendar cal = new GregorianCalendar();
     int dia = cal.get(Calendar.DAY_OF_MONTH);
     int mes = cal.get(Calendar.MONTH);
     int ano = cal.get(Calendar.YEAR);     
 
     Data = dia+"/"+mes+"/"+ano;
     return this.Data;
    }
    
    public Object PegaHora(){
        GregorianCalendar ho = new GregorianCalendar();
     int h = ho.get(Calendar.HOUR);
     int m = ho.get(Calendar.MINUTE);
     int s = ho.get(Calendar.SECOND);
     hora = h+":"+m+":"+s;
     return this.hora;
    }
    
    
}
