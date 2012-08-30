/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.session;

import java.util.Date;

/**
 *
 * @author dmoreira
 */
public class SessaoWeb {

    public static final boolean ESTADO_ONLINE = true;

    public static final boolean ESTADO_LOGOUT = false;

    public static final boolean ESTADO_EXPIRADO = false;

    public static final boolean ESTADO_PENDENTE = false;

    private boolean statusUser;
    private String nomeUser;
    private String ipUser;
    private Date dataLogin;
    private String indentificadorUser;
    private String numeroSessao;

    /**
     * @return the statusUser
     */
    public boolean isStatusUser() {
        return statusUser;
    }

    /**
     * @param statusUser the statusUser to set
     */
    public void setStatusUser(boolean statusUser) {
        this.statusUser = statusUser;
    }

    /**
     * @return the nomeUser
     */
    public String getNomeUser() {
        return nomeUser;
    }

    /**
     * @param nomeUser the nomeUser to set
     */
    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    /**
     * @return the ipUser
     */
    public String getIpUser() {
        return ipUser;
    }

    /**
     * @param ipUser the ipUser to set
     */
    public void setIpUser(String ipUser) {
        this.ipUser = ipUser;
    }

    /**
     * @return the dataLogin
     */
    public Date getDataLogin() {
        return dataLogin;
    }

    /**
     * @param dataLogin the dataLogin to set
     */
    public void setDataLogin(Date dataLogin) {
        this.dataLogin = dataLogin;
    }

    /**
     * @return the indentificadorUser
     */
    public String getIndentificadorUser() {
        return indentificadorUser;
    }

    /**
     * @param indentificadorUser the indentificadorUser to set
     */
    public void setIndentificadorUser(String indentificadorUser) {
        this.indentificadorUser = indentificadorUser;
    }

    /**
     * @return the numeroSessao
     */
    public String getNumeroSessao() {
        return numeroSessao;
    }

    /**
     * @param numeroSessao the numeroSessao to set
     */
    public void setNumeroSessao(String numeroSessao) {
        this.numeroSessao = numeroSessao;
    }
}
