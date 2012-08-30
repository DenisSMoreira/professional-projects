/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import web.login.service.IRecuperarService;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "recuperar")
@RequestScoped
public class RecuperarSenha {
    
    @EJB
    private IRecuperarService recuperarService;

    /**
     * @return the recuperarService
     */
    public IRecuperarService getRecuperarService() {
        return recuperarService;
    }

    /**
     * @param recuperarService the recuperarService to set
     */
    public void setRecuperarService(IRecuperarService recuperarService) {
        this.recuperarService = recuperarService;
    }
}
