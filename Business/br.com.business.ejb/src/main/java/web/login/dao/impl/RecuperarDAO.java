/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.impl;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.comum.dao.AbstractDAO;
import web.login.dao.IRecuperarDAO;

/**
 *
 * @author dmoreira
 */
@Local(IRecuperarDAO.class)
@Stateless(name="RecuperarDAO")
@Resource(authenticationType= Resource.AuthenticationType.CONTAINER,type=javax.sql.DataSource.class, name="WebApp")
public class RecuperarDAO extends AbstractDAO<Object, Object>  implements IRecuperarDAO{
    
}
