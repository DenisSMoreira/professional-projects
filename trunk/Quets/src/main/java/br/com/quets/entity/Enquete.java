/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quets.entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Guilhe
 */
public class Enquete {
    
    private Long codigo;
    private List<Resposta> listaResposta;
    private List<StatusEnquete> listaStatus;
    private List<Alternativa> listaAlternativa;
    private Date dataCriacao;
    private Date dataFinal;
    private String descricao;
    private List<Comentario> listaComentario;
    
}
