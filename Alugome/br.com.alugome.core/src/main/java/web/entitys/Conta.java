/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.entitys;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Admin
 */
@Entity
public class Conta implements java.io.Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    private Double saldoConta;
    private Double saldoBloqueado;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVerificacao;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the saldoConta
     */
    public Double getSaldoConta() {
        return saldoConta;
    }

    /**
     * @param saldoConta the saldoConta to set
     */
    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    /**
     * @return the saldoBloqueado
     */
    public Double getSaldoBloqueado() {
        return saldoBloqueado;
    }

    /**
     * @param saldoBloqueado the saldoBloqueado to set
     */
    public void setSaldoBloqueado(Double saldoBloqueado) {
        this.saldoBloqueado = saldoBloqueado;
    }

    /**
     * @return the dataVerificacao
     */
    public Date getDataVerificacao() {
        return dataVerificacao;
    }

    /**
     * @param dataVerificacao the dataVerificacao to set
     */
    public void setDataVerificacao(Date dataVerificacao) {
        this.dataVerificacao = dataVerificacao;
    }
    
    
}
