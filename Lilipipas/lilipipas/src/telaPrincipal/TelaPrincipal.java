/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * telaPrincipal.java
 *
 * Created on 08/02/2011, 19:24:07
 */

package telaPrincipal;

import Cadastro.CadastrarCategoria;
import Cadastro.CadastroDeCliente;
import Cadastro.CadastroDeProduto;
import Lembrete.Lembrete;
import Cadastro.CadastrarLogin;
import Reportar.Reportar;
import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;


/**
 *
 * @author Regivaldo
 */
public class TelaPrincipal extends javax.swing.JFrame {

      CadastroDeCliente  f =  new CadastroDeCliente();
       CadastroDeProduto p;
   CadastrarLogin framinho;
    Lembrete Lembre =  new Lembrete();
     Reportar r =  new Reportar();
     CadastrarCategoria c;




    public TelaPrincipal() {
        initComponents();
  
         jDesktopPane1.add(Lembre);
           jDesktopPane1.add(r);
        Lembre.setVisible(true);
        Lembre.moveToFront();
        Lembre.setLocation(getSize().width-276, getSize().height-360);
       
      

  
    }
    public void iniciar(){
      
//       f.setVisible(false);
//       framinho.setVisible(false);
//       r.setVisible(false);
//       p.setVisible(false);
//       c.setVisible(false);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){public void paintComponent (Graphics g){
            ImageIcon img = new ImageIcon("F:\\imganes software\\papelParede01.jpg");
            g.drawImage(img.getImage(),0,0,null);
            super.paintComponent(g);
        }}
        ;
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        WWW = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Noky's Sistemas - Lili Pipas ");
        setIconImage(new ImageIcon("F:/lilipipas/software/lilipipas/src/icones/AirIcon12x12.gif").getImage());
        setResizable(false);
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(java.awt.SystemColor.menu);
        jDesktopPane1.setForeground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/people(2).png"))); // NOI18N
        jButton1.setText("Cadastrar Usuario");
        jButton1.setAutoscrolls(true);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(0, 0, 150, 70);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/people(2).png"))); // NOI18N
        jButton2.setText("Cadastrar Cliente");
        jButton2.setAutoscrolls(true);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(0, 70, 150, 70);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/people(2).png"))); // NOI18N
        jButton3.setText("Cadastrar Produto");
        jButton3.setAutoscrolls(true);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(0, 140, 150, 70);
        jDesktopPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/people(2).png"))); // NOI18N
        jButton4.setText("Cadastrar Categoria");
        jButton4.setAutoscrolls(true);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(0, 210, 150, 70);
        jDesktopPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 970, 550);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WWW.setFont(new java.awt.Font("Tahoma", 1, 12));
        WWW.setForeground(new java.awt.Color(102, 102, 102));
        WWW.setText("Noky's Sistemas");
        WWW.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WWW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WWWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WWWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WWWMouseExited(evt);
            }
        });
        jPanel2.add(WWW, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 550, 980, 20);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setMnemonic('A');
        jMenu1.setText("Arquivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('C');
        jMenuItem2.setText("Configuração");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setMnemonic('T');
        jMenuItem3.setText("Trocar Login");
        jMenu1.add(jMenuItem3);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setMnemonic('e');
        jMenuItem14.setText("Tela Cheia");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('C');
        jMenu2.setText("Cadastro");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setMnemonic('U');
        jMenuItem4.setText("Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Categoria");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setMnemonic('l');
        jMenuItem7.setText("Cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("Produto");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        jMenu5.setMnemonic('o');
        jMenu5.setText("Controle");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setMnemonic('P');
        jMenuItem9.setText("Produto");
        jMenu5.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenu5.add(jMenuItem11);

        jMenuItem5.setText("Caixa");
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu3.setMnemonic('V');
        jMenu3.setText("Venda");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem8.setMnemonic('P');
        jMenuItem8.setText("Produto");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setMnemonic('j');
        jMenu4.setText("Ajuda");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem10.setMnemonic('C');
        jMenuItem10.setText("Conteudo da Ajuda");
        jMenu4.add(jMenuItem10);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem12.setMnemonic('R');
        jMenuItem12.setText("Reportar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setMnemonic('S');
        jMenuItem13.setText("Sobre");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-977)/2, (screenSize.height-622)/2, 977, 622);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
TelaCheia();
//setIconImage(new ImageIcon("G:/lilipipas/software/lilipipas/src/icones/AirIcon12x12.gif").getImage()); 
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 framinho =  new CadastrarLogin();
         jDesktopPane1.add(framinho);
        framinho.setVisible(true);
  framinho.moveToFront();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   framinho =  new CadastrarLogin();
         jDesktopPane1.add(framinho);
         framinho.setVisible(true);
  framinho.moveToFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
 f =  new CadastroDeCliente();
        jDesktopPane1.add(f);
        f.setVisible(true);
  f.moveToFront();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        r.setVisible(true);
  r.moveToFront();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 f =  new CadastroDeCliente();
        jDesktopPane1.add(f);
        f.setVisible(true);
  f.moveToFront();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void WWWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe www.nokys.com.br");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_WWWMouseClicked

    private void WWWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseEntered
        WWW.setForeground(new java.awt.Color(0, 153, 255));
}//GEN-LAST:event_WWWMouseEntered

    private void WWWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseExited
        WWW.setForeground(new java.awt.Color(102, 102, 102));
}//GEN-LAST:event_WWWMouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
p =  new CadastroDeProduto();
         p.setVisible(true);
        jDesktopPane1.add(p);
        p.moveToFront();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
chamarCategoria();

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
chamarCategoria();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
p = new CadastroDeProduto();
         p.setVisible(true);
         jDesktopPane1.add(p);
         p.moveToFront();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

  
public void TelaCheia(){
    setExtendedState(MAXIMIZED_BOTH);
System.out.print(getSize().height);
jPanel2.setSize(getSize().width,20); 
jPanel2.setLocation(0, getSize().height-65);
jDesktopPane1.setSize(getSize().width,getSize().height-70);
Lembre.setLocation(getSize().width-276, getSize().height-360);


}
public void chamarCategoria(){

        c = new CadastrarCategoria();
           jDesktopPane1.add(c);
      c.setVisible(true);
  c.moveToFront();
    
}
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WWW;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables



}
