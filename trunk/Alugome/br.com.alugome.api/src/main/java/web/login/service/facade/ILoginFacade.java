/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.facade;

import web.entitys.Login;

/**
 *
 * @author dmoreira
 */
public interface ILoginFacade {
     
    Login validaLogin(String usuario) throws Exception;
}
