/*
 * ClassListaDiaria.java
 *
 * Created on 11 de Novembro de 2005, 14:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo.tavares
 */
import java.util.Vector;
public class ClassListaDiaria {
    
    /** Creates a new instance of ClassListaDiaria */
    public ClassListaDiaria() {    }
    
    private Vector nome;
    
    public void setNome(String _nome){        
        this.nome.add(_nome);
    }
    
    public Vector getNome(){       
          return (Vector) this.nome;      
    } 

    
    
}
