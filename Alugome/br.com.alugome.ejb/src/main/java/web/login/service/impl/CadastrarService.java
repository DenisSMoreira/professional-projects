/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.ICadastrarDAO;
import web.login.service.ICadastrarService;

/**
 *
 * @author dmoreira
 */
@Local(ICadastrarService.class)
@Stateless
public class CadastrarService implements ICadastrarService{

   @EJB
   private ICadastrarDAO cadastrarDAO;

    /**
     * @return the cadastrarDAO
     */
    public ICadastrarDAO getCadastrarDAO() {
        return cadastrarDAO;
    }

    /**
     * @param cadastrarDAO the cadastrarDAO to set
     */
    public void setCadastrarDAO(ICadastrarDAO cadastrarDAO) {
        this.cadastrarDAO = cadastrarDAO;
    }

   
}
