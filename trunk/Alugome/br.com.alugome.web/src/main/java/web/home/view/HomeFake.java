/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.home.view;


import java.io.Serializable;  
  


import javax.faces.bean.ManagedBean;
import web.login.util.ForwardsConfig;
import web.login.util.ForwardsLogin;
  
/**
 *
 * @author dmoreira
 */
@ManagedBean(name="home")
public class HomeFake implements Serializable {

    
    private static final long serialVersionUID = 1L;

    /**
     * @return the forwardCadastrar
     */
    public String forwardCadastrar() {
        return ForwardsLogin.CADASTRAR_SENHA;
    }
   
    public String forwardConfigurar(){
        return ForwardsConfig.MENU_LAYOUT;
    }
            
       /**
     * @return the forwardCadastrar
     */
    public String forwardRecuperar() {
        return ForwardsLogin.RECUPERAR_SENHA;
    }
    
       /**
     * @return the forwardCadastrar
     */
    public String forwardDesbloquear() {
        return ForwardsLogin.DESBLOQUEAR_SENHA;
    }
    
    
       /**
     * @return the forwardCadastrar
     */
    public String forwardAlterar() {
        return ForwardsLogin.ALTERAR_SENHA;
    }

    
    
}  