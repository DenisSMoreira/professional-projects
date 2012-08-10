/*
 * ClassCadFuncao.java
 *
 * Created on 6 de Dezembro de 2005, 13:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.JOptionPane;
public class ClassCadFuncao {
    
    /** Creates a new instance of ClassCadFuncao */
    public ClassCadFuncao() {    }
    
    private String nome;
    
    public void setNome(String _nome){
        this.nome = _nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    ClassDatas data = new ClassDatas();
    ClassConecta conexao = new ClassConecta();
    ClassAuditoria audita = new ClassAuditoria();
    Statement stmt = null;
    
    void incluiFuncao(){
        conexao.conecta();
        try{
           stmt = conexao.con.createStatement();
           stmt.executeUpdate("insert into TabFuncao(nome,dataCadastro) values ('" + getNome() +"','"+ data.PegaDataAtual() +"')");           
           stmt.close();
           conexao.con.close();
           audita.setTxt("Função "+ getNome() + "Cadastrada");
           audita.incluiAuditoria();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }

    
    
}
