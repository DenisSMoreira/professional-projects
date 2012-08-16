/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sokkyo.dao.impl;

import br.com.sokkyo.dao.DaoGenerico;  
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;  
  
public class DaoGenericoHibernateImpl<T, ID extends Serializable> extends HibernateDaoSupport implements DaoGenerico<T, ID> {  
  
   private Class<T> clazz;  
  
   public DaoGenericoHibernateImpl() {  
      ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();  
      clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];  
   }  
  
   @SuppressWarnings("unchecked")  
   @Override
   public T procurar(ID id, boolean lock) {  
      if (lock) {  
         return (T) getHibernateTemplate().get(clazz, id, LockMode.UPGRADE);  
      } else {  
         return (T) getHibernateTemplate().get(clazz, id);  
      }  
   }  
  
   @SuppressWarnings("unchecked")  
   @Override
   public List<T> listar() {  
      return (List<T>) getHibernateTemplate().execute(  
            new HibernateCallback() {  
               @Override
               public Object doInHibernate(Session session)  
                     throws HibernateException, SQLException {  
                  return session.createCriteria(clazz).list();  
               }  
            });  
   }  
  
   @SuppressWarnings("unchecked")  
   @Override
   public List<T> procurar(T exemplo, String... propriedadesDeExclusao) {  
  
      final T exemplo_ = exemplo;  
      final String[] propriedadesDeExclusao_ = propriedadesDeExclusao;  
  
      return (List<T>) getHibernateTemplate().execute(  
            new HibernateCallback() {  
              @Override
               public Object doInHibernate(Session session)  
                     throws HibernateException, SQLException {  
                  Criteria crit = getSession().createCriteria(clazz);  
                  Example example = Example.create(exemplo_);  
                  for (String exclusao : propriedadesDeExclusao_) {  
                     example.excludeProperty(exclusao);  
                  }  
                  crit.add(example);  
                  return crit.list();  
               }  
            });  
   }  
  
   @Override
   public void apagar(T entidade) {  
      getHibernateTemplate().delete(entidade);  
   }  
  
   @Override
   public void atualizar(T entidade) {  
      getHibernateTemplate().update(entidade);  
   }  
  
   @SuppressWarnings("unchecked")  
   @Override
   public ID salvar(T entidade) {  
      return (ID) getHibernateTemplate().save(entidade);  
   }  
  
   @Override
   public void salvarOuAtualizar(T entidade) {  
      getHibernateTemplate().saveOrUpdate(entidade);  
   }  
}  


