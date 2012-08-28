/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.dao.exception;

import javax.ejb.ApplicationException;
import web.comum.excpetion.BaseException;
/**
 * Classe de Exceção para tratar problemas de operações na base de dados. Todos
 * os métodos que fazem acesso ao banco de dados deve lançar esta exceção.
 * Devido ao conceito de transação global, ao ser lançada esta exceção o
 * rollback da transação será realizado (a exceção está anotada com
 * <code>@ApplicationException(rollback = true)</code>).
 * 
 * 
 * @author Denis Soares Moreira.
 * 
 */
@ApplicationException(rollback = true)
public class DataBaseException extends BaseException {

	private static final long serialVersionUID = -4356796057133982849L;

	/**
	 * Construtor que cria uma exeção do Tipo DataBaseException.
	 * 
	 * @param e
	 *            A causa raíz da exceção.
	 */
	public DataBaseException(Throwable e) {
		super(e);
	}

	/**
	 * Construtor que cria uma exeção do Tipo DataBaseException.
	 * 
	 * @param msg
	 *            A mensagem da exceção.
	 */
	public DataBaseException(String msg) {
		super(msg);
	}

	/**
	 * Construtor que cria uma exeção do Tipo DataBaseException.
	 * 
	 * @param msg
	 *            A mensagem da exceção.
	 * @param e
	 *            A causa raíz da exceção.
	 */
	public DataBaseException(String msg, Throwable e) {
		super(msg, e);
	}

}
