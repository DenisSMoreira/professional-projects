/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.impl;

import web.entitys.Login;
import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import web.comum.dao.AbstractDAO;
import web.comum.dao.exception.DataBaseException;
import web.comum.dao.util.SessionDao;
import web.login.dao.ILoginDAO;


@Stateless(name="LoginDAO")
@Local(ILoginDAO.class)
@Resource(authenticationType= Resource.AuthenticationType.CONTAINER, type=javax.sql.DataSource.class ,name="WebApp")
public class LoginDAO extends AbstractDAO<Login, Long> implements ILoginDAO {

    @Override
    public Login validaLogin(String usuario) throws DataBaseException {
        Session session = SessionDao.getSession(super.getEntityManager());
        Criteria critLogin = session.createCriteria(Login.class);
        Login login = null;
        
        try {
            login = (Login) critLogin.add(Restrictions.eq("cpf", usuario)).uniqueResult();
        }
        catch (Exception e) {
            System.out.println(e);
         }

        return login;
    }
}
