/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.impl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import web.login.dao.ICadastrarDAO;
import web.login.service.ICadastrarService;

/**
 *
 * @author dmoreira
 */

@Stateless
@Local(ICadastrarService.class)
public class CadastrarService implements ICadastrarService{

   @EJB
   private ICadastrarDAO cadastrarDAO;

   

   
}
