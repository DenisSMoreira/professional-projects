/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao;

import web.comum.dao.IDAO;
import web.comum.dao.exception.DataBaseException;
import com.alugome.entitys.Login;

/**
 *
 * @author Admin
 */
public interface ILoginDAO extends IDAO<Login , Long> {
    
    Login validaLogin(String usuario) throws DataBaseException;


    

}
