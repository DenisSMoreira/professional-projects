/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.IAlterarDAO;
import web.login.service.IAlterarService;

/**
 *
 * @author dmoreira
 */

@Stateless
@Local(IAlterarService.class)
public class AlterarService implements IAlterarService{
    
    @EJB
    private IAlterarDAO alterarDAO;

    
}
