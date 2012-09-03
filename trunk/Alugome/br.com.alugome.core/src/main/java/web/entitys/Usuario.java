/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.entitys;

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
public class Usuario implements java.io.Serializable{
  
    private static final long serialVersionUID = 1L;
    
 
    @Id
    @GeneratedValue
    private Long codigo;
    private String nome;
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private Long cpf; 
    private Character sexo;
    private String email;
    private Integer codigoPais;  
    private Integer ddd;
    private Long telefonePrincipal;
    private Long telefoneOpcional;     
    private Long telefoneCelular;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCriacao;
     
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAtualizacao;
    private Integer numeroDddOpcional;
    private Integer numeroDddCelular;
    private String endereco;
    private String numero;
    private Integer cep;
    private String complemento;
    private String municipio;
    
    @OneToOne
    private Login login;

    @OneToOne
    private Conta conta;
    
    @OneToMany
    private List<Servico> listaServicos;

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the cpf
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the sexo
     */
    public Character getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the codigoPais
     */
    public Integer getCodigoPais() {
        return codigoPais;
    }

    /**
     * @param codigoPais the codigoPais to set
     */
    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * @return the ddd
     */
    public Integer getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    /**
     * @return the telefonePrincipal
     */
    public Long getTelefonePrincipal() {
        return telefonePrincipal;
    }

    /**
     * @param telefonePrincipal the telefonePrincipal to set
     */
    public void setTelefonePrincipal(Long telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    /**
     * @return the telefoneOpcional
     */
    public Long getTelefoneOpcional() {
        return telefoneOpcional;
    }

    /**
     * @param telefoneOpcional the telefoneOpcional to set
     */
    public void setTelefoneOpcional(Long telefoneOpcional) {
        this.telefoneOpcional = telefoneOpcional;
    }

    /**
     * @return the telefoneCelular
     */
    public Long getTelefoneCelular() {
        return telefoneCelular;
    }

    /**
     * @param telefoneCelular the telefoneCelular to set
     */
    public void setTelefoneCelular(Long telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    /**
     * @return the dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return the dataAtualizacao
     */
    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * @param dataAtualizacao the dataAtualizacao to set
     */
    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    /**
     * @return the numeroDddOpcional
     */
    public Integer getNumeroDddOpcional() {
        return numeroDddOpcional;
    }

    /**
     * @param numeroDddOpcional the numeroDddOpcional to set
     */
    public void setNumeroDddOpcional(Integer numeroDddOpcional) {
        this.numeroDddOpcional = numeroDddOpcional;
    }

    /**
     * @return the numeroDddCelular
     */
    public Integer getNumeroDddCelular() {
        return numeroDddCelular;
    }

    /**
     * @param numeroDddCelular the numeroDddCelular to set
     */
    public void setNumeroDddCelular(Integer numeroDddCelular) {
        this.numeroDddCelular = numeroDddCelular;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cep
     */
    public Integer getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(Integer cep) {
        this.cep = cep;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return the conta
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    /**
     * @return the listaServicos
     */
    public List<Servico> getListaServicos() {
        return listaServicos;
    }

    /**
     * @param listaServicos the listaServicos to set
     */
    public void setListaServicos(List<Servico> listaServicos) {
        this.listaServicos = listaServicos;
    }
}
