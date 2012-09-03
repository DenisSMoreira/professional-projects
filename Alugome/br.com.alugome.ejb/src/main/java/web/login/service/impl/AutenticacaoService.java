/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import web.entitys.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import web.comum.dao.exception.DataBaseException;
import web.login.dao.ILoginDAO;
import web.login.service.IAutenticacaoService;

/**
 *
 * @author Admin
 */

@Stateless
@Local(IAutenticacaoService.class)
@TransactionManagement(TransactionManagementType.CONTAINER)  
public class AutenticacaoService implements IAutenticacaoService {

    @EJB
    private ILoginDAO loginDAO;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public  Login validaLogin(String usuario) throws Exception {
        try {
            return loginDAO.validaLogin(usuario);
        } catch (DataBaseException ex) {
            Logger.getLogger(AutenticacaoService.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }
    }

   

}
