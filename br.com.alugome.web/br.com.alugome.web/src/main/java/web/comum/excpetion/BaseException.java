/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.excpetion;

import java.io.PrintWriter;

/**
 * Erro base do site. <br> Classe permite identificar erros que pertencem ao
 * site e erros que foram gerados pelo sistema. <BR><BR> Data de Criação:
 * 01/07/2011<br> Registro de Manutenções:<br> <ol> <li>Data: <ul> <li>Autor:
 * Denis Soares Moreira. <li>Descrição: versão inicial </ul> </ol>
 *
 * @author Denis Soares Moreira.
 */
public class BaseException extends Exception {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 6948935121976791325L;
    /**
     * Exception pai, que motivou criação desta exception.
     */
    private Throwable cause;
    /**
     * Código do erro.
     */
    private String codigo;
    /**
     * Uma string de identificação do local onde o erro identificado.
     */
    private String local;

    /**
     * Construtor da classe.
     */
    public BaseException() {
        codigo = "0";
        cause = null;
        local = null;
    }

    /**
     * Construtor da classe.
     *
     * @param mensagem mensagem de erro.
     */
    public BaseException(String mensagem) {
        super(mensagem);
        codigo = "0";
        cause = null;
        local = null;
    }

    /**
     * Construtor da classe.
     *
     * @param throwable objeto com erro original.
     */
    public BaseException(Throwable throwable) {
        codigo = "0";
        cause = throwable;
        local = null;
    }

    /**
     * Construtor da classe.
     *
     * @param mensagem mensagem de erro.
     * @param throwable objeto com erro original.
     */
    public BaseException(String mensagem, Throwable throwable) {
        super(mensagem);
        codigo = "0";
        cause = throwable;
        local = null;
    }

    /**
     * Construtor da classe.
     *
     * @param mensagem mensagem de erro.
     * @param codigoErro código do erro.
     * @param localErro local do erro.
     */
    public BaseException(String mensagem, String codigoErro, String localErro) {
        super(mensagem);
        codigo = codigoErro;
        local = localErro;
    }

    /**
     * Construtor da classe.
     *
     * @param mensagem mensagem de erro.
     * @param throwable objeto com erro original.
     * @param codigoErro código do erro.
     * @param localErro local do erro.
     */
    public BaseException(String mensagem, Throwable throwable, String codigoErro, String localErro) {
        super(mensagem);
        cause = throwable;
        codigo = codigoErro;
        local = localErro;
    }

    /**
     * Imprime erro com base nos campos adicionais.
     */
    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.err.println("Código: " + codigo + " - " + "Local : " + local);
        if (cause != null) {
            System.err.println("Causado por:");
            cause.printStackTrace();
        }
    }

    /**
     * Imprimie erro dentro de um printwriter.
     *
     * @param printwriter objeto de escrita que será utilizado durante
     * impressão.
     */
    @Override
    public void printStackTrace(PrintWriter printwriter) {
        super.printStackTrace(printwriter);
        printwriter.println("Código: " + codigo + " - " + "Local : " + local);
        if (cause != null) {
            printwriter.println("Causado por:");
            cause.printStackTrace(printwriter);
        }
    }

    /**
     * Obtém o erro original que justificou a criação desta exception.
     *
     * @return Throwable objeto de erro original que justificou a criação desta
     * exception.
     */
    @Override
    public Throwable getCause() {
        return cause;
    }

    /**
     * Seta o erro original que justificou a criação desta exception.
     *
     * @param value o erro original que justificou a criação desta exception.
     */
    public void setCause(Throwable value) {
        cause = value;
    }

    /**
     * Obtém o código de erro.
     *
     * @return o código de erro.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Seta o código de erro.
     *
     * @param value o código de erro.
     */
    public void setCodigo(String value) {
        codigo = value;
    }

    /**
     * Obtém o local do erro.
     *
     * @return o local do erro.
     */
    public String getLocal() {
        return local;
    }

    /**
     * Seta o local do erro.
     *
     * @param value o local do erro.
     */
    public void setLocal(String value) {
        local = value;
    }
}
