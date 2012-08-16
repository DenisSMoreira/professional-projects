
package br.com.sokkyo.view.ajuda;

import com.Sokkyo.Ajuda.*;


public class MenuAjuda extends javax.swing.JFrame {

    int pagina = 0;
 int menu = 0;
    public MenuAjuda() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        pg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Titulo1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7857_16x16.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7855_16x16.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Sobre o Software");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 170, -1));

        jButton4.setText("Efetuar cadastros");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 170, -1));

        jButton5.setText("Efetuar vendas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 170, -1));

        jButton6.setText("Look and Feel's");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 170, -1));

        jButton7.setText("Consultar ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 170, -1));

        jButton8.setText("Web Site");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, 170, -1));

        jButton9.setText("Resolvendo Problemas");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 170, -1));

        pg.setText("Pagina : 1");
        jPanel1.add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 90, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("    Esse Menu serve para auxiliar novos\n usuarios, para que possa ter o maior\n aproveitamento do software e suas \n utilidades !\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 270));

        Titulo1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(51, 51, 51));
        Titulo1.setText("                    Ajuda");
        jPanel2.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 390, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 590, 390));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/print_icon.gif"))); // NOI18N
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, -1));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/tooltip.png"))); // NOI18N
        jButton12.setText(" Home");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-601)/2, (screenSize.height-463)/2, 601, 463);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
menu = 2;
efetuarCadastro();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  menu = 1;
 Sobre();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if (menu ==1){
       int i=1;
      pagina = pagina + i;
 Sobre();
}
if (menu ==2){
       int i=1;
      pagina = pagina + i;
efetuarCadastro();
}
if(menu==3){
    int i=1;
    pagina = pagina + i;
    efetuarVenda();
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (menu ==1){
       int i=1;
      pagina = pagina - i;
 Sobre();
}
if (menu ==2){
       int i=1;
      pagina = pagina - i;
efetuarCadastro();
}
if(menu==3){
    int i=1;
    pagina = pagina - i;
    efetuarVenda();
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
menu = 0;
        Titulo1.setText("                    Ajuda");
        jTextArea1.setText("    Esse Menu serve para auxiliar novos\n"
             + " usuarios, para que possa ter o maior\n"
             + " aproveitamento do software e suas\n"
             + " utilidades !\n");
           pg.setText("Pagina : 1");

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 Titulo1.setText(" Resolvendo Problemas");
        jTextArea1.setText("   Alguns Problemas podem ser resolvido\n "
        + "reiniciando o aplicativo. Caso o Problema\n"
        + "seja no cadastro de cliente ou até mesmo venda,\n"
        + "tente olhar se você nao digitou algum palavra \n"
        + "ou codigo invalido ou nao permitido lembrando\n"
        + "que a ',' é .\n"
        + "   Caso nao vc tenha feito isso e ainda está \n"
        + "ocorrendo algum erro entre em contato com o adm \n"
        + "e reporte o erro para que possa ser enviado \n"
        + "a soluçao via email.");
        pg.setText("Pagina : 1");

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  menu = 3;
        efetuarVenda();
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Titulo1.setText(" Look and Feels");
    jTextArea1.setText("       Look and feel nada mais é do que a skins do software\n"
            + "(Aparencia), existe varios tipo de look's nesse\n"
            + "aplicativo , você pode modifica-lo acessando o\n"
            + "menu 'utilitarios' e acessando o sub-menu Look\n"
            + "and Feels ou JTatoo que sao algumas skins instaladas\n"
            + "você pode modifica-las para seu gosto.\n"
            + "   O look and feels instalados aqui sao pequenas\n"
            + "exemplos de como o java pode ser intereçante em\n "
            + "relaçao a interface grafica.\n"
            + "   Lembrando que os look aqui instalados alguns sao\n"
            + "privados ( jTatoo ) é um deles. Mas existe varias\n"
            + "versoes free, mais ao descobrir esse aplicativo\n"
            + "descidimos ser instalado essa skins !");
             pg.setText("Pagina : 1");



    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Titulo1.setText("Web Site");
         jTextArea1.setText("\n                   www.nokys.com.br");
           pg.setText("Pagina : 1");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     Titulo1.setText("Consultar");
     jTextArea1.setText("No menu Consulta você poderá ver\n"
             + "a ultima venda de um cliente a ultima\n"
             + "peça cadastrada e descobrir qual\n"
             + "fornecedor que vende tal peça você\n "
             + "poderá verificar orçamentos\n"
             + "  Para acessar a consulta basta\n"
             + "clicar no menu 'consulta' e procurar\n"
             + "a consulta que desejada lembrando\n "
             + "que o software é sensite key entao\n"
             + "ele diferencia MAISCULO de minusculos\n"
             + "entao digite identicamente o nome do individuo\n"
             + "ou parte dele.");
             pg.setText("Pagina : 1");
    }//GEN-LAST:event_jButton7ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAjuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel pg;
    // End of variables declaration//GEN-END:variables
public void Sobre(){

    if (pagina == 0){
       Titulo1.setText("Sobre o Software");
      jTextArea1.setText("     Esse software foi desenvolvido por Denis Soares Moreira\n"
              + "com o auxilo de Raphael Socolowisk.Esse software foi\n"
              + "desenvolvido para o auxilo de micro-empresas de\n"
              + "assistencia tecnica de automoveis, para que possa\n"
              + "facilitar o dia dia de seus funcionarios e ter maior\n"
              + "controle sobre o estoque, vendas, etc...\n"
              + "      Esse software foi desenvolvido em java, e utilizamos\n"
              + "a IDE Netbeans para maior facilidade de se efetuar\n"
              + "esse aplicativo de desktop.\n"
              + "      Essa é a versao 1.0, ainda possui alguns erros que estão\n"
              + "sendo revisto e arrumados e gostariamos que seja paciente\n"
              + "e nos Reporte os erros ou sugestões para que o software\n"
              + "possa ser arrumado e melhorado para as melhores funcionalidade\n"
              + "do programa!");

      pg.setText("Paginas : 1|2");
        }
  
if (pagina ==1){
        Titulo1.setText("Sobre o Software");
      jTextArea1.setText("     E gostariamos de agradecer principalmente ao professor Neri\n"
              + "e a professora Patricia que nos apoiou e nos ajudou\n"
              + "a termina esse aplicativo e nao menos importante meus colegas\n"
              + "de sala.\n"
              + "	by: Denis Soares Moreira\n");
            pg.setText("Paginas : 2|2");

 }



}
public void efetuarCadastro(){
    if (pagina == 0){
        Titulo1.setText("Efetuar um Novo Cadastro ");
        jTextArea1.setText("Para efetuar o novo cadastro basta clicar no menu 'Cadastro'.\n Abrirá o menu de cadastro de Cliente \n"
                + "clique nos botoes 'Adcionar'\n e depois preencha os campos e depois\nclique no no 'ok'");
          pg.setText("Pagina: 1");
                 
          
    }
  
}
public void efetuarVenda(){
    if(pagina == 0){
         Titulo1.setText("Efetuar um Nova Venda");
         jTextArea1.setText("Acesse o Menu 'Venda' \n e depois Preencha os campos!");
        pg.setText("Paginas : 1|2");
        
         
    }
    if(pagina == 1){
         Titulo1.setText("Efetuar um Nova Venda");
          jTextArea1.setText("Aperte 'Enter' apos \ndigitar parte do nome do cliente \ndigite a qtd's da peças\n e Clique no Confirmar!");
            pg.setText("Paginas : 2|2");
             
                
    }
}
}
