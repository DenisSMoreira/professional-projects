/*
 * ClassEntregaRelatorio.java
 *
 * Created on 16 de Novembro de 2005, 16:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */

public class ClassEntregaRelatorio {
    
    /** Creates a new instance of ClassEntregaRelatorio */
    public ClassEntregaRelatorio() {    }
    
    private String codigo;
    private String servidor;
    private String dataSaida;
    private String dataChegada;    
    private String destino;
    private String situacao;
    
    public void setValoresRel(String _codigo, String _servidor, String _dataSaida, String _dataChegada, String _destino, String _situacao){
      this.codigo = _codigo;
      this.servidor = _servidor;
      this.dataSaida = _dataSaida;
      this.dataChegada = _dataChegada;
      this.destino = _destino;
      this.situacao = _situacao;        
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getServidor(){
        return this.servidor;
    }
    public String getDataSaida(){
        return this.dataSaida;
    }
    public String getDataChegada(){
        return this.dataChegada;
    }
    public String getDestino(){
        return this.destino;
    }
    public String getSituacao(){
        return this.situacao;
    }
}
