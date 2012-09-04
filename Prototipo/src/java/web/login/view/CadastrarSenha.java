/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "cadastrar")
public class CadastrarSenha implements Serializable {

    private static final long serialVersionUID = 1L;
    private String rg;

    public String cadastrar() {
        
        return "confirmacao";
    }

    public String voltar() {

        return "autenticacao";
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    
}
