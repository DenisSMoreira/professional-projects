import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
public class ClassDiaria {
    
    public ClassDiaria() {    }
    
    //=============================================
    //Objetos para receberem os valores das di�rias
    //=============================================
    private int codigo;
    private String nome;
    private String periodoInicio;
    private String periodoFim;
    private String destino;
    private String relatorio;
    
    private String setor;
    private String objetivo;
    private String observacoes;
    private int qtdDiaria;
    //=============================================
    //Fim da declara��o de Objetos
    //=============================================
    
    //Passando valores para os objetos
    public void setPegaValDiaria(String _nome, String _periodoInicio, String _periodoFim, String _destino, String _relatorio, String _setor, String _objetivo, String _observacoes, int _qtdDiaria){
      this.nome = _nome;
      this.periodoInicio = _periodoInicio;
      this.periodoFim = _periodoFim;
      this.destino = _destino;
      this.relatorio = _relatorio;
      this.setor = _setor;
      this.objetivo = _objetivo;
      this.observacoes = _observacoes;
      this.qtdDiaria = _qtdDiaria;
    }   
    //fun��o para receber e pegar o valor do c�digo para fazer o Update
     public void setCodigo(int _codigo){
         this.codigo = _codigo;         
     }
    
     public int getCodigo(){
         return this.codigo;
     }
     
    //pegando valores dos objetos
    public String getNome(){
        return this.nome;
    }
    
    public String getPeriodoInicio(){
        return this.periodoInicio;
    }
    
    public String getPeriodoFim(){
        return this.periodoFim;
    }
    
    public String getDestino(){
        return this.destino;
    }
    
    public String getRelatorio(){
        return this.relatorio;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public String getObjetivo(){
        return this.objetivo;
    }
    
    public String getObservacoes(){
        return this.observacoes;
    }
    
    public int getQtdDiaria(){
        return this.qtdDiaria;
    }
    
    //fim pega valores dos objetos
   
    // m�todos para receber os valores de nome, periodoSaida, PeriodoFim,
    // Destino para serem tratados na fun��o DeletaDiaria()
    
      public void setDeletaDiaria(String _nome, String _periodoInicio, String _periodoFim, String _destino){
      this.nome = _nome;
      this.periodoInicio = _periodoInicio;
      this.periodoFim = _periodoFim;
      this.destino = _destino;
    }  
    
      
      
    
    //========================================================
    //fun��o para conex�o com Banco    
   
    Connection con = null;
    Statement stmt = null;
      
    ClassConecta conexao = new ClassConecta();
    //Inst�ncio o objeto de auditoria
    ClassAuditoria audita = new ClassAuditoria();  
    
    
    void incluiDiaria(){        
        conexao.conecta();
        try{
            stmt = conexao.con.createStatement();
            String comando = "insert into TabCadDiaria(nome, periodoInicio, periodoFim, destino, situacao, setor, QtdDiaria, objetivo, obs) values('"+ 
                              getNome() +"','"+ getPeriodoInicio() +"','"+ getPeriodoFim() +"','"+ getDestino() +"','"+ getRelatorio()+"','"+ 
                              getSetor() +"','"+ String.valueOf(getQtdDiaria())+"','"+ getObjetivo() +"','"+ getObservacoes()+"')";
             stmt.executeUpdate(comando);
            //Insserindo na tabela de Auditoria
            audita.setTxt("Di�ria Cadastrada: " + getNome() + " com saida - " + getPeriodoInicio() + " e chegada - " + getPeriodoFim());
            audita.incluiAuditoria();
            stmt.close();            
            conexao.con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATEN��O",JOptionPane.WARNING_MESSAGE);             
        }
      }
    
    
    //===============================================================
    //M�todo para sele��o de Di�rias
    //===============================================================
    
    //Objeto Para receber o valor do comando SQL
    private String comandoSelecao;
    
    public void setComandoSelecao(String _ComandoSelecao){
        this.comandoSelecao = _ComandoSelecao;
    }
    
    public String getComandoSelecao(){
        return this.comandoSelecao;
    }
    
void EntregaRel(){
    conexao.conecta();
     try{
            stmt = conexao.con.createStatement();
            System.out.println("Entregando Relatorio"); 
            String comando = "Update TabCadDiaria set situacao = 'ENTREGUE' where codigo = "+ getCodigo() +"";
             stmt.executeUpdate(comando);
             audita.setTxt("Di�ria de C�digo: " + getCodigo() + " Entregou Relat�rio");
             audita.incluiAuditoria();
             stmt.close();
             conexao.con.close();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATEN��O",JOptionPane.WARNING_MESSAGE);
        }   
}


void DeletaDiaria(){
        conexao.conecta();
     try{
             stmt = conexao.con.createStatement();
             System.out.println("Deletando Di�ria"); 
             String comando = "Update TabCadDiaria set situacao = 'CANCELADA' where codigo = "+ getCodigo() +"";
             stmt.executeUpdate(comando);
             audita.setTxt("Di�ria Cancelada: " +  getNome() + " Per�odo "+ getPeriodoInicio()+ " � " + getPeriodoFim() + " Destino: "+ getDestino());
             audita.incluiAuditoria();
             stmt.close();
             conexao.con.close();
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATEN��O",JOptionPane.WARNING_MESSAGE);
        }   
}
  
}//fim da classe

     // ==> retorna o n�mero de colunas de uma tabela "rs.getMetaData().getColumnCount();"
    //para pegar o nome das colunas    
    /* for(int a=1; a!=rs.getMetaData().getColumnCount();a++){
         System.out.println(rs.getMetaData().getColumnName(a));
           }   */
