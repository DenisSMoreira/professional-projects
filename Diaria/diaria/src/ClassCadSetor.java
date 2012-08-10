import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * ClassCadSetor.java
 *
 * Created on 29 de Novembro de 2005, 15:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */
public class ClassCadSetor {
    
    /** Creates a new instance of ClassCadSetor */
    public ClassCadSetor() {
    }
    private int codigo;
    private String nome;
    private String descricao;
    
 ClassConecta conexao = new ClassConecta();
    
    public void setCodigo(int _codigo){
        this.codigo = _codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
   
    public void setNome(String _nome){
        this.nome = _nome;
    }
    
    public void setDescricao(String _descricao){
        this.descricao = _descricao;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
   
    
    //===============================
    //Connection con= null;
    Statement stmt = null;
    ClassAuditoria audita = new ClassAuditoria();
    void CadastraSetor(){
        conexao.conecta();
        try{
          stmt = conexao.con.createStatement();  
          String ComandoSql = "insert into TabcadSetor(nome, descricao) values('"+ getNome() +"','"+ getDescricao() +"')";
          stmt.executeUpdate(ComandoSql);
          audita.setTxt("Setor Cadastrado: " + getNome());
          audita.incluiAuditoria();
          stmt.close();
          conexao.con.close();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    
    
    void deletaSetor(){
        conexao.conecta();
         try{
            stmt = conexao.con.createStatement();
             String comando = "delete from TabCadSetor where codigo = "+ getCodigo() +"";
             stmt.executeUpdate(comando);
             audita.setTxt("Setor Deletado: " +  getNome());
             audita.incluiAuditoria();
             stmt.close();
             conexao.con.close();
         }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n"+ e,"ATENÇÃO",JOptionPane.WARNING_MESSAGE);
         }
    }
}
     






