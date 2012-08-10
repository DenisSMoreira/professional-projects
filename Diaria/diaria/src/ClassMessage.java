/*
 * ClassMessage.java
 *
 * Created on 21 de Dezembro de 2005, 12:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
import javax.swing.JLabel;
import javax.swing.JDialog;
public class ClassMessage {
    
    /** Creates a new instance of ClassMessage */
    public ClassMessage() {    }
    
     public void msg(String _title, String _msg){
         JLabel texto = new JLabel();
         texto.setText(_msg);
         
         JDialog dialogo = new JDialog();
         dialogo.setBounds(300,300,500,100);
         dialogo.setTitle(_title);
         dialogo.getContentPane().add(texto);
         dialogo.setResizable(false);
         dialogo.show();
     }
     
    
}
