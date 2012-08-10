/*
 * ClassConecta.java
 *
 * Created on 29 de Novembro de 2005, 15:09
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
public class ClassConecta {
    
    /** Creates a new instance of ClassConecta */
    public ClassConecta() {    }
   
    //função para conexão com Banco    
    
    private String url = "jdbc:odbc:DBDiaria";
    private String driver ="sun.jdbc.odbc.JdbcOdbcDriver";
    private String user ="OK"; 
    private String pwd = "corepbastec123";//Senha do Banco de dados
    Connection con = null;    
     
    public Connection conecta(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user,pwd);            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Driver não encontrado!\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Erro na Conexão com Banco\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);            
}
       // System.out.println("Conectado");
        return con;  
    }
    //fim da conexao
    //========================================================
}
