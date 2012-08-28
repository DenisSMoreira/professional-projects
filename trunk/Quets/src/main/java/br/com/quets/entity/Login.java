/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quets.entity;

import java.util.List;

/**
 *
 * @author Guilhe
 */
public class Login {
    
    private Long codigo;
    private String senha;
    private String usuario;
    private Integer quantidadeAcesso;
    private List<PerfilLogin> listaPerfis;
}
