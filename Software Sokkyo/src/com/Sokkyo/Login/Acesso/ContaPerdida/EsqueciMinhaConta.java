/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EsqueciMinhaConta.java
 *
 * Created on 22/11/2010, 20:39:40
 */

package com.Sokkyo.Login.Acesso.ContaPerdida;


import com.Sokkyo.Login.Acesso.Login;

import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author adm
 */
public class EsqueciMinhaConta extends javax.swing.JFrame {

   Conexão softwaresokkyo;
     SendMailAcc sm = new SendMailAcc("smtp.gmail.com","465");
     String seta_look ="com.jtattoo.plaf.acryl.AcrylLookAndFeel";
     String Assunto = "Recovery Account";
     public String Login;
    public String Senha, LoSe;
      int Conta = 0;
 int Gravar =0;
    public EsqueciMinhaConta() {
        initComponents();
            lookandfeel();
       softwaresokkyo = new Conexão();
        softwaresokkyo.conecta();
        softwaresokkyo.executeSQL("select * from login");

    }

    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
 
 private void lookandfeel(){
         try   {
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (Exception erro)
           {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        emailUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Esqueci minha Senha");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 153, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/confirmarOpaco.png"))); // NOI18N
        jButton4.setToolTipText("Confirmar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/sairOpaco.png"))); // NOI18N
        jButton5.setToolTipText("Cancelar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/cancelarOpaco.png"))); // NOI18N
        jButton6.setMnemonic('c');
        jButton6.setToolTipText("Sair");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 50, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailUsuario.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(emailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("CPF");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Email do Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aviso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel3.setText("Por favor entre em contato com o administrador caso, nao ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel4.setText("consiga recuperar sua senha ! ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel5.setText("Dica: Tente colocar uma senha que seja facil a memorização");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel6.setText("By: Admintrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 120));

        CU.setFont(new java.awt.Font("Tahoma", 0, 3));
        CU.setText("jLabel7");
        getContentPane().add(CU, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-343)/2, (screenSize.height-358)/2, 343, 358);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png")));
}//GEN-LAST:event_jButton4MouseClicked

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png")));

        // TODO add your handling code here:
}//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/confirmarOpaco.png")));

        // TODO add your handling code here:
}//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (emailUsuario.getText().equals("")||(cpf.getText().equals(""))) {
            JOptionPane.showMessageDialog(null,"Os Campos não Podem ser vazio!");
            return;
        }
     
        if(Conta<=3){
            try {

                String sql = "select * from login Where cpf like '"+cpf.getText()+"' and email like '"+emailUsuario.getText()+"'";
                softwaresokkyo.executeSQL(sql);

        if(softwaresokkyo.resultset.first()){
 setLogin(softwaresokkyo.resultset.getString("login"));
 setSenha(softwaresokkyo.resultset.getString("senha"));
  try{
    sm.sendMail(emailUsuario.getText(),emailUsuario.getText(),Assunto,getLogin()+getSenha());
        }
catch(Exception e){
    JOptionPane.showMessageDialog(null,"Erro ao enviar!");
}
JOptionPane.showMessageDialog(null,"Enviado com Sucesso!");
    dispose();
                }
            else {
                    Conta++;
                    if(Conta==1){
                        JOptionPane.showMessageDialog(null,"Senha Incorreta \nVoce Sò Tem Mais 2 Chances !");
                        emailUsuario.setText("");
                        cpf.setText("");
                    } if(Conta==2){JOptionPane.showMessageDialog(null,"Senha Incorreta \nVoce Sò Tem Mais 1 Chance!");
                        emailUsuario.setText("");
                        cpf.setText("");
                    }
                    if(Conta==3){
                       JOptionPane.showMessageDialog(null,"Usuario Restrito ao Uso do Sistema \nO Aplicativo Será Fechado");
                       dispose();
        }
                    }




            } catch (Exception erro) {

            }

        }
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6155_32x32.png")));        // TODO add your handling code here:
}//GEN-LAST:event_jButton5MouseClicked

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6155_32x32.png")));
}//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/sairOpaco.png")));
}//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Login().setVisible(true);
           dispose();
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png")));
}//GEN-LAST:event_jButton6MouseClicked

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png")));
}//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/cancelarOpaco.png")));
}//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
}//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsqueciMinhaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CU;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField emailUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables




}
