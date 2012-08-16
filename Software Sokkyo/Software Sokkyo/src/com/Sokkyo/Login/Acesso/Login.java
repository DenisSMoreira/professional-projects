package com.Sokkyo.Login.Acesso;


import com.Sokkyo.Login.Acesso.ContaPerdida.EsqueciMinhaConta;
import com.Sokkyo.Utilitarios.LookAndFeel.LookAndFeel;
import com.sun.awt.AWTUtilities;
import java.awt.event.KeyEvent;




public class Login extends javax.swing.JFrame {

 //Objetos
 LookAndFeel Look = new LookAndFeel();
 Login_Metodos Metodos_Look = new Login_Metodos();

 
    public Login() {          
     initComponents();
 // Chama a Aparencia padrão e Conecta com o banco
 Look.lookandfeel(this);
 Metodos_Look.Conectar();

//Deixa a Tela 100% transparente mas mostrar seus atributos
if((AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.PERPIXEL_TRANSLUCENT))) {
AWTUtilities.setWindowOpaque(this, false); 
}


    }
//Chama o Metodo Verficausuario e Depois Verifica a Variavel de retorno
 public void ChamarVerificação(){
      if(Metodos_Look.VerificarUsuario(Login.getText(), Senha.getText()) == 0){
        return;
   }
          if(Metodos_Look.Conta == 1){
             Login.setText("");
             Senha.setText("");
         }
                if(Metodos_Look.Conta == 2){
                  Login.setText("");
                  Senha.setText("");
              }
                    if(Metodos_Look.Conta == 3){
                      dispose();
                   }
                       if(Metodos_Look.Conta == 4){
                          dispose();
                       }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CONSEGUE = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6155_32x32.png"))); // NOI18N
        jButton3.setToolTipText("Sair do Login");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 40, 30));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/confirmarOpaco.png"))); // NOI18N
        jButton1.setToolTipText("Entrar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 40, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        Senha.setFont(new java.awt.Font("Arial Black", 1, 18));
        Senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SenhaKeyPressed(evt);
            }
        });
        jPanel1.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 110, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 28));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SENHA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Black", 2, 28));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, 30));

        Login.setFont(new java.awt.Font("Arial Black", 1, 18));
        Login.setNextFocusableComponent(Senha);
        Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginFocusLost(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 110, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -120, -1, -1));

        CONSEGUE.setFont(new java.awt.Font("Tahoma", 1, 12));
        CONSEGUE.setForeground(new java.awt.Color(255, 255, 255));
        CONSEGUE.setText("Account Lost?");
        CONSEGUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CONSEGUEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CONSEGUEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CONSEGUEMouseExited(evt);
            }
        });
        jPanel1.add(CONSEGUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/10hvacw.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-510)/2, (screenSize.height-253)/2, 510, 253);
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SenhaKeyPressed
//Se  usuario precionar enter ele chama o metodo ChamarVerificação
if (evt.getKeyCode() == KeyEvent.VK_ENTER){
   ChamarVerificação();
 }
    }//GEN-LAST:event_SenhaKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Fecha o Login
        dispose();
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 //chama o metodo ChamarVerificação
  ChamarVerificação();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void CONSEGUEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONSEGUEMouseEntered
// se o Mouse for posiciona em cima da label ela muda para outra cor
        CONSEGUE.setForeground(new java.awt.Color(0, 102, 255));
    }//GEN-LAST:event_CONSEGUEMouseEntered

    private void CONSEGUEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONSEGUEMouseExited
// se o mouse sair de cima da label ele volta a cor padrão
        CONSEGUE.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_CONSEGUEMouseExited

    private void CONSEGUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONSEGUEMouseClicked
// Chama a Class EsqueciMinhaConta e fecha o Login
new EsqueciMinhaConta().show();
dispose();
    }//GEN-LAST:event_CONSEGUEMouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
//se o Mouse for posicionado em Cima ele altera o Icone
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
//se o Mouse for Retirado de Cima dele, ele volta ao icone anterior
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/confirmarOpaco.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginFocusLost
      
    }//GEN-LAST:event_LoginFocusLost

    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CONSEGUE;
    public javax.swing.JTextField Login;
    public javax.swing.JPasswordField Senha;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
