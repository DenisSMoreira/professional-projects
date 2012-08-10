/*
 * ClassCadUsuario.java
 *
 * Created on 14 de Dezembro de 2005, 14:19
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

public class ClassCadUsuario {
    
    /** Creates a new instance of ClassCadUsuario */
    public ClassCadUsuario() {    }
    
    private String login;
    private String senha;
    
    public void setUsuario(String _login, String _senha){
        this.login = _login;
        this.senha = _senha;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    
    ClassConecta conexao = new ClassConecta();
    ClassDatas data = new ClassDatas();
    ClassAuditoria audita = new ClassAuditoria();
    
    void incluiUsuario(){
        try{
            conexao.conecta();
            Statement stmt = conexao.con.createStatement();
            stmt.executeUpdate("insert into TabUsuario(usuario, senha, dataCriacao)values('"+ getLogin() +"','"+ getSenha() +"','"+
                                                                                              data.PegaDataAtual()+"')");
            System.out.println("usuario inserido");
            audita.setTxt("Usuário Cadastrado: "+ getLogin());
            audita.incluiAuditoria();            
            stmt.close();
            conexao.con.close();
            System.out.println("Fechada");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    
}
