/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "cadConfirmacao")
public class CadastrarSenhaConfirmacao implements Serializable{
    private static final long serialVersionUID = 1L;
    private String pergunta ;
    private String resposta;
    
    public String conclusao(){
        
        return "conclusao";
    }

    /**
     * @return the pergunta
     */
    public String getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * @return the resposta
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
