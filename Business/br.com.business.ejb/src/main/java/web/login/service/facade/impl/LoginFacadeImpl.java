/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.facade.impl;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import web.entitys.Login;
import web.login.service.IAlterarService;
import web.login.service.IAutenticacaoService;
import web.login.service.ICadastrarService;
import web.login.service.IDesbloquearService;
import web.login.service.IRecuperarService;
import web.login.service.facade.ILoginFacade;

/**
 *
 * @author dmoreira
 */

@Stateful 
@Remote(ILoginFacade.class)
@Resource(authenticationType= Resource.AuthenticationType.CONTAINER,type=javax.sql.DataSource.class, name="WebApp")
public class LoginFacadeImpl implements ILoginFacade{

    @EJB
    private IAlterarService alterarService;

    @EJB
    private IAutenticacaoService autenticacaoService;

    @EJB
    private ICadastrarService cadastrarService;

    @EJB
    private IDesbloquearService desbloquearService;

    @EJB
    private IRecuperarService iRecuperarService;
    
    
    @Override
    public Login validaLogin(String usuario) throws Exception {
       return autenticacaoService.validaLogin(usuario);
    }
    
    
    
}
