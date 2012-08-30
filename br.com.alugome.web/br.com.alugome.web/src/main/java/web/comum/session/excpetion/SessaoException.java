/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.session.excpetion;

/**
 * Exceção gerada quando a sessão requisita não se encontra no sistema.
 * <br>
 * Data de Criação: 12/01/04<br>
 * Registro de Manutenções:<br>
 * <ol>
 * <li>Data: 12/01/2004
 *      <ul>
 *          <li>Autor: ThiagoMB
 *          <li>Descrição: versão inicial
 *      </ul>
 * </ol>
 * @author ThiagoMB.
 */
public class SessaoException extends Exception {

    /**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 2192203636339778710L;

    /**
     * @see cbss.util.exception.BaseException#BaseException() 
     */
    public SessaoException() {
        super();
    }

    /**
     * @see cbss.util.exception.BaseException#BaseException(String) 
     */
    public SessaoException(String arg0) {
        super(arg0);
    }

    /**
     * @see cbss.util.exception.BaseException#BaseException(String, int, String)     
     */
    public SessaoException(
        String arg0,
        String umCodigo,
        String umLocal)  {
    }

    /**
     * @see cbss.util.exception.BaseException#BaseException(String, Throwable)     
     */
    public SessaoException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    /**
     * @see cbss.util.exception.BaseException#BaseException(String, Throwable, int, String)     
     */
    public SessaoException(
        String arg0,
        Throwable arg1,
        String umCodigo,
        String umLocal) 
    {
    }

    /**
     * @see cbss.util.exception.BaseException#BaseException(Throwable)
     */
    public SessaoException(Throwable arg0) {
        super(arg0);
    }
}
