/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.IRecuperarDAO;
import web.login.service.IRecuperarService;

/**
 *
 * @author dmoreira
 */

@Stateless
@Local(IRecuperarService.class)
public class RecuperarService implements IRecuperarService {

    @EJB
    private IRecuperarDAO recuperarDAO;

   
}
