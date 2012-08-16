/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sokkyo.entitys;

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
public class StatusServico implements java.io.Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private Double valor;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
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
