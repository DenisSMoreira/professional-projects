/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service;

import web.entitys.Login;



/**
 *
 * @author Admin
 */
public interface IAutenticacaoService {
 
    
    Login validaLogin(String usuario) throws Exception;
    
  
   
}
