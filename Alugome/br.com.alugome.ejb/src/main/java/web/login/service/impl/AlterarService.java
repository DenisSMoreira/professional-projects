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
@Local(IAlterarService.class)
@Stateless
public class AlterarService implements IAlterarService{
    
    @EJB
    private IAlterarDAO alterarDAO;

    /**
     * @return the alterarDAO
     */
    public IAlterarDAO getAlterarDAO() {
        return alterarDAO;
    }

    /**
     * @param alterarDAO the alterarDAO to set
     */
    public void setAlterarDAO(IAlterarDAO alterarDAO) {
        this.alterarDAO = alterarDAO;
    }
}
