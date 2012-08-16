package com.Sokkyo.ControleGeral;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ControleGeral_Metodos {
    
  public String foto;
    
     public String ChamarImagenDeFundo(JFrame frame){
 try{
    JFileChooser buscar_foto = new JFileChooser();
    buscar_foto.setCurrentDirectory(new File("/Software Sokkyo/src/imganes software/"));
   buscar_foto.setDialogTitle("Carregar Fundo de Tela");
    buscar_foto.showOpenDialog(frame);
    foto = ""+buscar_foto.getSelectedFile();
}
  catch(Exception erro){
      JOptionPane.showMessageDialog(null,"Falha no Carregamento da Foto");
  }
 return foto;

  }
    
}

