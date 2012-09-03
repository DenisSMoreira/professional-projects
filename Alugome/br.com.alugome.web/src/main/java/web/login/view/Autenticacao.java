/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import java.util.Date;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import web.comum.session.SessaoWeb;
import web.entitys.Login;
import web.login.service.facade.ILoginFacade;
import web.login.util.ForwardsLogin;

@ManagedBean
@RequestScoped
public class Autenticacao {

    private String usuario;
    private String senha;
    
    @EJB
    private ILoginFacade loginFacade;
    
    public String verificarAutenticacao() {
        String retorno = "";
        try {
            Login login = loginFacade.validaLogin(usuario);
            if (login.getSenha().equals(senha)) {
                FacesContext contexto = FacesContext.getCurrentInstance();

                HttpSession sessao = (HttpSession) contexto.getExternalContext().getSession(true);

                HttpServletRequest request = (HttpServletRequest) contexto.getExternalContext().getRequest();

                SessaoWeb sessaoWeb = new SessaoWeb();
                sessaoWeb.setDataLogin(new Date());
                sessaoWeb.setIndentificadorUser(usuario);
                sessaoWeb.setIpUser(request.getRemoteAddr());
                sessaoWeb.setStatusUser(SessaoWeb.ESTADO_ONLINE);
                sessaoWeb.setNumeroSessao(sessao.getId());

                sessao.setAttribute("sessaoWeb", sessaoWeb);

                retorno = ForwardsLogin.HOME;
                
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario ou senha invalida!", null));
                retorno = "";
            }
        }
        catch (Exception ex) {
           ex.printStackTrace();
        }
        return retorno;
    }

    public String forwardRecuperar() {
        return ForwardsLogin.RECUPERAR_SENHA;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
