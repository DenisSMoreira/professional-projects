/*
 * ClassAuditoria.java
 *
 * Created on 9 de Dezembro de 2005, 16:34
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class ClassAuditoria {
    
    /** Creates a new instance of ClassAuditoria */
    public ClassAuditoria() {    }
    
    
    private String txt;
    ClassDatas data = new ClassDatas();
    ClassConecta conexao = new ClassConecta();
    
    public void setTxt(String _txt){
        this.txt = _txt;
    }
    
    public String getTxt(){
        return this.txt;
    }
    
    public void incluiAuditoria(){
        conexao.conecta();
        try{
            Statement stmt = conexao.con.createStatement();
            String comando = "insert into TabAuditoria(texto,data,hora)values('"+ getTxt() +"','"+ 
                              data.PegaDataAtual() +"', '"+ data.PegaHora() +"')";
            stmt.executeUpdate(comando);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
    
    
}
