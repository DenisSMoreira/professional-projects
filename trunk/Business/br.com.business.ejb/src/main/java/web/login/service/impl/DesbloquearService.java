/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.IDesbloquearDAO;
import web.login.service.IDesbloquearService;

/**
 *
 * @author dmoreira
 */

@Stateless
@Local(IDesbloquearService.class)
public class DesbloquearService implements IDesbloquearService{
    
    @EJB
    private IDesbloquearDAO desbloquearDAO;

   
}
