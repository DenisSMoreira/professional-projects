/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import web.comum.dao.AbstractDAO;
import web.login.dao.IDesbloquearDAO;

/**
 *
 * @author dmoreira
 */
@Local
@Stateless
public class DesbloquearDAO extends AbstractDAO<Object, Object>  implements IDesbloquearDAO{
    
}