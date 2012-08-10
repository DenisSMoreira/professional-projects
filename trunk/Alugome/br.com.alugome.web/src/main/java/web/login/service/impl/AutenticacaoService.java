/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import com.alugome.entitys.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import web.comum.dao.exception.DataBaseException;
import web.comum.excpetion.BaseException;
import web.login.dao.ILoginDAO;
import web.login.service.IAutenticacaoService;

/**
 *
 * @author Admin
 */
public class AutenticacaoService implements IAutenticacaoService {

    private ILoginDAO loginDAO;

    @Override
    public  Login validaLogin(String usuario) throws BaseException {
        try {
            return loginDAO.validaLogin(usuario);
        } catch (DataBaseException ex) {
            Logger.getLogger(AutenticacaoService.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            throw new BaseException(ex.getMessage());
        }

    }

    /**
     * @return the loginDAO
     */
    public ILoginDAO getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

}
