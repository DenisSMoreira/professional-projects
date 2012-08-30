/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.IAlterarDAO;
import web.comum.dao.AbstractDAO;

/**
 *
 * @author dmoreira
 */

@Local
@Stateless
public class AlterarDAO extends AbstractDAO<Object, Object>  implements IAlterarDAO{
    
}
