package br.com.sokkyo.entitys;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * 
 * Classe BEAN Login
 *
 */
@Entity
public class Login implements java.io.Serializable {


    @Id
    @GeneratedValue
    private Long id;
    
    @OneToMany
    private HistSenha histSenha;   
    
    @OneToOne
    private Usuario usuario;

    private String senha;
    private Integer perguntaSecreta;
    private String respostaSecreta;
    private Date dataUltimoAcesso;
    private Integer quantidadeTentativasAcesso;
    private Date dataUltimaAlteracaoSenha;
    private Date dataExlusao;
    private Boolean flagExclusao;
   

    
    public Login(){
        
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
     * @return the histSenha
     */
    public HistSenha getHistSenha() {
        return histSenha;
    }

    /**
     * @param histSenha the histSenha to set
     */
    public void setHistSenha(HistSenha histSenha) {
        this.histSenha = histSenha;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the perguntaSecreta
     */
    public Integer getPerguntaSecreta() {
        return perguntaSecreta;
    }

    /**
     * @param perguntaSecreta the perguntaSecreta to set
     */
    public void setPerguntaSecreta(Integer perguntaSecreta) {
        this.perguntaSecreta = perguntaSecreta;
    }

    /**
     * @return the respostaSecreta
     */
    public String getRespostaSecreta() {
        return respostaSecreta;
    }

    /**
     * @param respostaSecreta the respostaSecreta to set
     */
    public void setRespostaSecreta(String respostaSecreta) {
        this.respostaSecreta = respostaSecreta;
    }

    /**
     * @return the dataUltimoAcesso
     */
    public Date getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    /**
     * @param dataUltimoAcesso the dataUltimoAcesso to set
     */
    public void setDataUltimoAcesso(Date dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    /**
     * @return the quantidadeTentativasAcesso
     */
    public Integer getQuantidadeTentativasAcesso() {
        return quantidadeTentativasAcesso;
    }

    /**
     * @param quantidadeTentativasAcesso the quantidadeTentativasAcesso to set
     */
    public void setQuantidadeTentativasAcesso(Integer quantidadeTentativasAcesso) {
        this.quantidadeTentativasAcesso = quantidadeTentativasAcesso;
    }

    /**
     * @return the dataUltimaAlteracaoSenha
     */
    public Date getDataUltimaAlteracaoSenha() {
        return dataUltimaAlteracaoSenha;
    }

    /**
     * @param dataUltimaAlteracaoSenha the dataUltimaAlteracaoSenha to set
     */
    public void setDataUltimaAlteracaoSenha(Date dataUltimaAlteracaoSenha) {
        this.dataUltimaAlteracaoSenha = dataUltimaAlteracaoSenha;
    }

    /**
     * @return the dataExlusao
     */
    public Date getDataExlusao() {
        return dataExlusao;
    }

    /**
     * @param dataExlusao the dataExlusao to set
     */
    public void setDataExlusao(Date dataExlusao) {
        this.dataExlusao = dataExlusao;
    }

    /**
     * @return the flagExclusao
     */
    public Boolean getFlagExclusao() {
        return flagExclusao;
    }

    /**
     * @param flagExclusao the flagExclusao to set
     */
    public void setFlagExclusao(Boolean flagExclusao) {
        this.flagExclusao = flagExclusao;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
