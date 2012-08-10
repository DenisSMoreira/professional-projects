import java.io.*;
import javax.swing.JOptionPane;
/*
 * FAutenticacao.java
 *
 * Created on 7 de Dezembro de 2005, 13:36
 */

/**
 *
 * @author  rodrigo.tavares
 */
public class FAutenticacao extends javax.swing.JFrame {
    
    /** Creates new form FAutenticacao */
    public FAutenticacao() {
        initComponents();
        setBounds(380,250,290,210);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciador de Di\u00e1rias ASTEC-PB v1.0");
        setFont(new java.awt.Font("Agency FB", 0, 3));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setFont(new java.awt.Font("MS Sans Serif", 1, 12));
        jLabel3.setText("Valida\u00e7\u00e3o de Usu\u00e1rio");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 10, 180, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 260, 30);

        jPanel2.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtLogin);
        txtLogin.setBounds(60, 10, 170, 20);

        jLabel1.setText("Usu\u00e1rio:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 15);

        jLabel2.setText("Senha:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 40, 50, 15);

        jPanel2.add(txtPwd);
        txtPwd.setBounds(60, 40, 170, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 50, 260, 70);

        jPanel3.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jPanel3.add(btnOk);
        btnOk.setBounds(20, 10, 100, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel3.add(btnCancelar);
        btnCancelar.setBounds(130, 10, 100, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 130, 260, 40);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    public int Pnivel;
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
// TODO add your handling code here:

        ClassAutentica autentica = new ClassAutentica();
        FPrincipal principal = new FPrincipal();     
        autentica.setLogin(txtLogin.getText());
        autentica.setSenha(txtPwd.getText());  
        autentica.setRetornaNivel(1);
        String login = txtLogin.getText();
       
        if(autentica.autentica() == false){
         JOptionPane.showMessageDialog(null,"Login ou Senha Inv�lidos","ATEN��O",JOptionPane.WARNING_MESSAGE);
        }else{
 
            ClassAuditoria audita = new ClassAuditoria();
            audita.setTxt("Usu�rio: " + login + " Conectou-se");
            audita.incluiAuditoria();
            principal.show();
            this.dispose();
        }
    }//GEN-LAST:event_btnOkActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAutenticacao().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
    
}
