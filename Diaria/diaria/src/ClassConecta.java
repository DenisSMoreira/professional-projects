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
   
    //fun��o para conex�o com Banco    
    
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
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Driver n�o encontrado!\n"+ e,"ATEN��O",JOptionPane.WARNING_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Erro na Conex�o com Banco\n"+ e,"ATEN��O",JOptionPane.WARNING_MESSAGE);            
}
       // System.out.println("Conectado");
        return con;  
    }
    //fim da conexao
    //========================================================
}
