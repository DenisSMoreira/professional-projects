/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import web.login.service.IAlterarService;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name="alterar")
@RequestScoped
public class AlterarSenha {
    
    private IAlterarService alterarService;

    /**
     * @return the alterarService
     */
    public IAlterarService getAlterarService() {
        return alterarService;
    }

    /**
     * @param alterarService the alterarService to set
     */
    public void setAlterarService(IAlterarService alterarService) {
        this.alterarService = alterarService;
    }
}
