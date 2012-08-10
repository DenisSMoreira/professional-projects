/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * telaLogin.java
 *
 * Created on 08/02/2011, 18:50:55
 */

package Login;

import com.sun.awt.AWTUtilities;
import lookAndFeel.LookAndFeel;



public class TelaLogin extends javax.swing.JFrame {

    Usuarios user;
    LookAndFeel look;
    public TelaLogin() {
        initComponents();
        user = new Usuarios();
        user.conectar();
        
        look = new LookAndFeel();
        look.LookAndFeelLuna(this);

if((AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.PERPIXEL_TRANSLUCENT))) {
AWTUtilities.setWindowOpaque(this, false);
}
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Tahoma", 1, 24));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 270, 30));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, 50));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 60, 60));

        senha.setFont(new java.awt.Font("Tahoma", 1, 24));
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 260));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-650)/2, (screenSize.height-262)/2, 650, 262);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
ChamarVerificação();
    }//GEN-LAST:event_jLabel2MouseClicked
 public void ChamarVerificação(){
      if(user.verificiar(usuario.getText(), senha.getText()) == 0){
        return;
   }
          if(user.Conta == 1){
             usuario.setText("");
             senha.setText("");
         }
                if(user.Conta == 2){
                  usuario.setText("");
                  senha.setText("");
              }
                    if(user.Conta == 3){
                      dispose();
                   }
                       if(user.Conta == 4){
                          dispose();
                       }
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}
