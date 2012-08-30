/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import web.login.service.IDesbloquearService;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "desbloquear")
@RequestScoped
public class DesbloquearSenha implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EJB
    private IDesbloquearService desbloquearService;
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

    /**
     * @return the desbloquearService
     */
    public IDesbloquearService getDesbloquearService() {
        return desbloquearService;
    }

    /**
     * @param desbloquearService the desbloquearService to set
     */
    public void setDesbloquearService(IDesbloquearService desbloquearService) {
        this.desbloquearService = desbloquearService;
    }
}
