/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import web.login.service.IRecuperarService;
import web.login.service.facade.ILoginFacade;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "recuperar")
@RequestScoped
public class RecuperarSenha {
    
    @EJB
    private ILoginFacade loginFacade;

   
}
