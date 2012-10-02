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
public class Usuario {
        
    private Long codigo;
    private String nome;
    private String sobreNome;
    private Character sexo;
    private Date dataNascimento;
    private Long cpf;
    private String telefone;
    private String ramal;
    private String cel;
    private String ddd;
    private List<Endereco> enderecos;
    private List<Login> logins;
    

}


