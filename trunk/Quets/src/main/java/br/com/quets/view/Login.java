/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.quets.view;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Guilhe
 */
@ManagedBean(name="login")
@Stateless
public class Login {
    private String usuario;
    private String senha;
    
    public String acessar(){
      
        if(this.usuario.equals("admin")){
            return "sucesso";
        }
          return "erro";

    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
}
