/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao;

import web.entitys.Login;
import javax.ejb.Local;
import web.comum.dao.IDAO;
import web.comum.dao.exception.DataBaseException;

/**
 *
 * @author Admin
 */

public interface ILoginDAO extends IDAO<Login , Long> {
    
    Login validaLogin(String usuario) throws DataBaseException;


    

}
