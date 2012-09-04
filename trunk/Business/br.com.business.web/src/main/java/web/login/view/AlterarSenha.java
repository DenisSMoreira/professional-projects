/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import web.login.service.IAlterarService;
import web.login.service.facade.ILoginFacade;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name="alterar")
@RequestScoped
public class AlterarSenha {
    
    @EJB
    private ILoginFacade loginFacade;

  
}
