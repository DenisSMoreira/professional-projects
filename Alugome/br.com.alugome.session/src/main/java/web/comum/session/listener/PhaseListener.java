/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.comum.session.listener;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.servlet.http.HttpSession;
import web.comum.session.SessaoWeb;

/**
 *
 * @author dmoreira
 */
public class PhaseListener implements javax.faces.event.PhaseListener {

    private static final long serialVersionUID = 1L;

    @Override
    public void afterPhase(PhaseEvent event) {

        // Obtém o contexto atual
        FacesContext contexto = event.getFacesContext();
        // Obtém a página que atualmente está interagindo com o ciclo
        String paginaAtual = contexto.getViewRoot().getViewId();
        // Se for a página 'Autenticacao.xhtml' seta a variável como true
        boolean isLoginPage = paginaAtual.lastIndexOf("Autenticacao.xhtml") > -1;
        // Obtém a sessão atual
        HttpSession sessao = (HttpSession) contexto.getExternalContext().getSession(false);

        SessaoWeb sessaoWeb;


        if (sessao == null) {
            sessao = (HttpSession) contexto.getExternalContext().getSession(true);
        }
        //Resgata um objeto da sessão
        sessaoWeb = (SessaoWeb) sessao.getAttribute("sessaoWeb");

        if (sessaoWeb != null) {

            // Verifica se o usuário está logado e se não está na página de login
            if (!isLoginPage && sessaoWeb.isStatusUser() != SessaoWeb.ESTADO_ONLINE) {
                boolean isRecuperar = paginaAtual.lastIndexOf("RecuperarSenha.xhtml") > -1;

                if (isRecuperar) {
                    sessaoWeb = new SessaoWeb();
                    sessaoWeb.setStatusUser(SessaoWeb.ESTADO_LOGOUT);
                    sessao.setAttribute("sessaoWeb", sessaoWeb);
                } else {
                    // Redireciona o fluxo para a página de login
                    NavigationHandler nh = contexto.getApplication().getNavigationHandler();
                    nh.handleNavigation(contexto, null, "autenticacao");
                }


            } else if (isLoginPage && sessaoWeb.isStatusUser() == SessaoWeb.ESTADO_ONLINE) {
                // Se o usuário logado tentar acessar a página de login ele é
                // redirecionado para a página inicial
                NavigationHandler nh = contexto.getApplication().getNavigationHandler();
                nh.handleNavigation(contexto, null, "home");
            }


        } else {
            if (isLoginPage) {

                sessaoWeb = new SessaoWeb();
                sessaoWeb.setStatusUser(SessaoWeb.ESTADO_LOGOUT);
                sessao.setAttribute("sessaoWeb", sessaoWeb);
            } else {
                // Redireciona o fluxo para a página de login
                NavigationHandler nh = contexto.getApplication().getNavigationHandler();
                nh.handleNavigation(contexto, null, "autenticacao");
                sessaoWeb = new SessaoWeb();
                sessaoWeb.setStatusUser(SessaoWeb.ESTADO_LOGOUT);
                sessao.setAttribute("sessaoWeb", sessaoWeb);

            }

        }


    }

    @Override
    public void beforePhase(PhaseEvent event) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
    }
