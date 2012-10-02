/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quets.entity;

/**
 *
 * @author Guilhe
 */
public class Alternativa {
 
    private Long codigo;
    private Integer numeroAlternativa;
    private Integer numeroMinimo;
    private Integer numeroMaximo;

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
     * @return the numeroAlternativa
     */
    public Integer getNumeroAlternativa() {
        return numeroAlternativa;
    }

    /**
     * @param numeroAlternativa the numeroAlternativa to set
     */
    public void setNumeroAlternativa(Integer numeroAlternativa) {
        this.numeroAlternativa = numeroAlternativa;
    }

    /**
     * @return the numeroMinimo
     */
    public Integer getNumeroMinimo() {
        return numeroMinimo;
    }

    /**
     * @param numeroMinimo the numeroMinimo to set
     */
    public void setNumeroMinimo(Integer numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    /**
     * @return the numeroMaximo
     */
    public Integer getNumeroMaximo() {
        return numeroMaximo;
    }

    /**
     * @param numeroMaximo the numeroMaximo to set
     */
    public void setNumeroMaximo(Integer numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }
    
    
}
