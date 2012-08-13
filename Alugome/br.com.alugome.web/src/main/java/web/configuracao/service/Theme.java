/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.configuracao.service;

/**
 *
 * @author Admin
 */
class Theme {
    private String name;
    private String image;
    
    Theme(String nome, String png) {
       this.name = nome;
       this.image = png;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    
}
