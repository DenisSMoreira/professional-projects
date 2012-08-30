package web.entitys;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;


/**
 * 
 * Bean Historico Senha
 *
 */
@Entity
public class HistSenha implements java.io.Serializable {
 
    private static final long serialVersionUID = 1L;
    
    /**
     * Atributo = Codigo do Historico da Senha 
     */
    @Id
    @GeneratedValue
    private Long codHistSenha;
    
    /**
     * Atributo = Senha 
     */
    private String senha;
    
    /**
     * Atributo = Data Altera��o
     * 
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAlteracao;

    /**
     * @return the codHistSenha
     */
    public Long getCodHistSenha() {
        return codHistSenha;
    }

    /**
     * @param codHistSenha
     *            the codHistSenha to set
     */
    public void setCodHistSenha(Long codHistSenha) {
        this.codHistSenha = codHistSenha;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha
     *            the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dataAlteracao
     */
    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * @param dataAlteracao
     *            the dataAlteracao to set
     */
    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }



}
