/*
 * ClassAutentica.java
 *
 * Created on 7 de Dezembro de 2005, 13:56
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
public class ClassAutentica {
    
    /** Creates a new instance of ClassAutentica */
    public ClassAutentica() {    }
    
    private String login;
    private String senha; 
    //Variáveis para retornar a senha e o login encontrados no banco
    private String retornaLogin;
    private String retornaSenha;
    private int retornaNivel;
    //======================================
    
    public void setLogin(String _login){
        this.login = _login;        
    }    
    public void setSenha(String _senha){
        this.senha = _senha;
    }    
    public String getLogin(){
        return this.login;
    }    
    public String getSenha(){
        return this.senha;
    }
    
    public void setRetornaLogin(String _retornaLogin){
        this.retornaLogin = _retornaLogin;
    }    
    public void setRetornaSenha(String _retornaSenha){
        this.retornaSenha = _retornaSenha;
    }
    
    public String getretornaLogin(){
        return this.retornaLogin;
    }
    public String getretornaSenha(){
        return this.retornaSenha;
    }
    
    public void setRetornaNivel(int _retornaNivel){
        this.retornaNivel = _retornaNivel;
    }
    
    public int getretornaNivel(){
        return this.retornaNivel;
    }
    
    ClassConecta conexao = new ClassConecta();
    FPrincipal principal = new FPrincipal();
    
    
    public boolean autentica(){ 
        boolean valida = true;
        try{
           conexao.conecta(); 
            Statement stmt = conexao.con.createStatement();            
            ResultSet rs = stmt.executeQuery("select * from Tabusuario where usuario = '"+ getLogin() +"' and senha = '"+ getSenha() +"'");   
            while(rs.next()){
               setRetornaLogin(rs.getString("usuario")); 
               setRetornaSenha(rs.getString("senha"));
               setRetornaNivel(1);
            } 
            if(getretornaLogin() == null && getretornaSenha() == null){
                valida = false;
                 }
             }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
           }
        return valida;
    }
    
    

    
    
    
    
}
