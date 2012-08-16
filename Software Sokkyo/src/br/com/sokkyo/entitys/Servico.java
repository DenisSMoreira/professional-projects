/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sokkyo.entitys;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Admin
 */
@Entity
public class Servico implements java.io.Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private Double valor;
    private String urlImg;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFim;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @OneToMany
    private List<Categoria> categoria;
    
    @OneToOne
    private StatusServico servico;
    
    public Servico(){
        
    }

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
     * @return the urlImg
     */
    public String getUrlImg() {
        return urlImg;
    }

    /**
     * @param urlImg the urlImg to set
     */
    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    /**
     * @return the dataFim
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the categoria
     */
    public List<Categoria> getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the servico
     */
    public StatusServico getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(StatusServico servico) {
        this.servico = servico;
    }
}
