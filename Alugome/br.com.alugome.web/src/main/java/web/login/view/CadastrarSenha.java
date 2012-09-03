/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import web.login.service.ICadastrarService;
import web.login.service.facade.ILoginFacade;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "cadastrar")
@RequestScoped
public class CadastrarSenha  {

    @EJB
    private ILoginFacade loginFacade;
    
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
