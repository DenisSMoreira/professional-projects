/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.impl;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.comum.dao.AbstractDAO;
import web.login.dao.IAlterarDAO;
import web.login.dao.ICadastrarDAO;

/**
 *
 * @author dmoreira
 */
@Local(ICadastrarDAO.class)
@Stateless(name="CadastrarDAO")
@Resource(authenticationType= Resource.AuthenticationType.CONTAINER, type=javax.sql.DataSource.class ,name="WebApp")
public class CadastrarDAO extends AbstractDAO<Object, Object>  implements ICadastrarDAO{
    
}
