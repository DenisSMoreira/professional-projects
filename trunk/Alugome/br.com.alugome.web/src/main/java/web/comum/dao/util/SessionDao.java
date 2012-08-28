/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.dao.util;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.ejb.EntityManagerImpl;

/**
 *
 * @author Admin
 */
public final class SessionDao {

    public static Session getSession(final EntityManager entityManager) {
        Session session;
        if (entityManager.getDelegate() instanceof EntityManagerImpl) {
         final EntityManagerImpl entityManagerImpl = (EntityManagerImpl) entityManager.getDelegate();
            session = entityManagerImpl.getSession();
        } else {
            session = (Session) entityManager.getDelegate();
        }
        return session;
    }
}
