/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sokkyo.dao;

import java.io.Serializable;  
import java.util.List;  
  
public interface DaoGenerico<T, ID extends Serializable> {  
  
   public T procurar(ID id, boolean lock);  
  
   public List<T> listar();  
  
   public List<T> procurar(T exemplo, String... propriedadesDeExclusao);  
  
   public ID salvar(T entidade);  
  
   public void apagar(T entidade);  
  
   public void atualizar(T entidade);  
     
   public void salvarOuAtualizar(T entidade);  
}  

