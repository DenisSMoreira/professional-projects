/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.dao;

import web.comum.dao.exception.DataBaseException;

/**
 * Interface genérica de persistência de Entidades de Negócio. Cada Entidade de
 * Negócio que precisa ser persistida deve possuir uma Interface DAO específica
 * a Entidade e extender a Interface genérica.
 * 
 * @author Denis Soares Moreira.
 * 
 * @param <T> O Tipo da Entidade de Negócio a ser persistida.
 * @param <K>  O Tipo da Chave primária da Entidade de Negócio a ser persistida.
 */
 public interface IDAO<T, K> {

	/**
	 * Persiste uma Entidade de Negócio em banco de dados.
	 * 
	 * @param objeto
	 *            A Entide de Negócio a ser inserida.
	 * 
	 * @return A Entidade de Negócio persistida.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
	public T salvar(T objeto) throws DataBaseException;

	/**
	 * Atualiza uma Entidade de Negócio em banco de dados.
	 * 
	 * @param objeto
	 *            A Entidade de Negócio a ser atualizada.
	 * 
	 * @return A Entidade de Negócio atualizada.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
	public T atualizar(T objeto) throws DataBaseException;

	/**
	 * Remove uma Entidade de Negócio do banco de dados.
	 * 
	 * @param pk
	 *            A chave primária da Entidade de Negócio a ser removida.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
	public void remover(K pk) throws DataBaseException;

	/**
	 * Recupera uma Entidade de Negócio do banco de dados através da
	 * implementação JPA.
	 * 
	 * @param pk
	 *            A chave primária da Entidade de Negócio a ser recuperada.
	 * 
	 * @return A Entidade de Negócio recuperada.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
	public T buscar(K pk);

	/**
	 * Otém o tipo da Classe da Entidade de Negócio.
	 * 
	 * @return O tipo da Classe da Entidade de Negócio.
	 */
	public Class<T> getEntityTypeClass();

	/**
	 * Otém o tipo da Classe da Chave primária da Entidade de Negócio.
	 * 
	 * @return O tipo da Classe da Chave primária da Entidade de Negócio.
	 */
	public Class<K> getPrimaryKeyTypeClass();
}
