/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.IRecuperarDAO;
import web.login.service.IRecuperarService;

/**
 *
 * @author dmoreira
 */
@Local
@Stateless
public class RecuperarService implements IRecuperarService {

    private IRecuperarDAO recuperarDAO;

    /**
     * @return the recuperarDAO
     */
    public IRecuperarDAO getRecuperarDAO() {
        return recuperarDAO;
    }

    /**
     * @param recuperarDAO the recuperarDAO to set
     */
    public void setRecuperarDAO(IRecuperarDAO recuperarDAO) {
        this.recuperarDAO = recuperarDAO;
    }
}