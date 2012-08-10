/*
 * ClassServidor.java
 *
 * Created on 15 de Dezembro de 2005, 13:22
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

public class ClassServidor {
    
    /** Creates a new instance of ClassServidor */
    public ClassServidor() {    }
    
    private String nome;
    private String setor;
    private String funcao;
    
    public void setServidor(String _nome, String _setor, String _funcao){
        this.nome = _nome;
        this.setor = _setor;
        this.funcao = _funcao;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSetor(){
        return this.setor;
    }
    public String getFuncao(){
        return this.funcao;
    }
    
    ClassConecta conexao = new ClassConecta();
    ClassDatas data = new ClassDatas();
    ClassAuditoria audita = new ClassAuditoria();
    
    void incluiServidor(){
        try{            
            conexao.conecta();
            Statement stmt = conexao.con.createStatement();
            stmt.executeUpdate("insert into TabServidor(nome, setor, funcao, dataCadastro) values ('"+
                               getNome()+"','"+ getSetor() +"','"+ getFuncao() +"', '"+ data.PegaDataAtual() +"')");
            stmt.close();
            conexao.con.close();
            audita.setTxt("Servidor: " + getNome() + " do Setor " + getSetor() + " de Função "+ getFuncao() + " Foi cadastrado");
            audita.incluiAuditoria();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    private int codigo;
    
    public void setCodigo(int _codigo){
        this.codigo = _codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setDeletaServidor(String _nome, String _setor){
        this.nome = _nome;
        this.setor = _setor;
    }
    
    void deletaServidor(){
        try{            
        conexao.conecta();
        Statement stmt = conexao.con.createStatement();
        String comando = "delete from TabServidor where codigo = "+ getCodigo() +"";        
        stmt.executeUpdate(comando);
        audita.setTxt("Servidor: "+ getNome() + " Excluído");
        audita.incluiAuditoria();
        stmt.close();
        conexao.con.close();        
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
    }
}
