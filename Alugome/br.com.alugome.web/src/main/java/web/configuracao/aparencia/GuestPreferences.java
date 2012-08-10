/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.configuracao.aparencia;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Admin
 */
@ManagedBean
@SessionScoped
class GuestPreferences {
    private String theme;

    String getTheme() {
      return theme;
    }

    void setTheme(String theme) {
       this.theme = theme;
    }
    
}
