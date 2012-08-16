package com.Sokkyo.Cadastros;

import com.Sokkyo.Consulta.Consulta_Fornecedor;
import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Cadastro_Fornecedor extends javax.swing.JFrame {

 public int navega = 0;
 Conexão software_Sokkyo;
   
    public Cadastro_Fornecedor()
{
initComponents();
software_Sokkyo = new Conexão();
software_Sokkyo.conecta();
try{
 PreencherDados();
            software_Sokkyo.resultset.first();
            mostrar_dados();
            navega = 1; }
catch(Exception e){

}

}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        numerodecliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        focodigo = new javax.swing.JTextField();
        fonome = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        foendereço = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tel = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cnpj = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        inscricao = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        web = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Proximo = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Primeiro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Cadastro de Fornecedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 102, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1408_32x32.png"))); // NOI18N
        jButton7.setText("Pesquisar");
        jButton7.setToolTipText("Efetuar busca de Fornecedores");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 174, 130, -1));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6155_32x32.png"))); // NOI18N
        jButton12.setMnemonic('c');
        jButton12.setText(" Cancelar");
        jButton12.setToolTipText("Cancelar Cadastro de Cliente");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 124, 130, 40));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png"))); // NOI18N
        jButton13.setText(" Confirmar");
        jButton13.setToolTipText("Confirmar cadastro de Cliente");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 74, 130, -1));

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png"))); // NOI18N
        jButton14.setMnemonic('s');
        jButton14.setText(" Sair");
        jButton14.setToolTipText("Sair do Menu Cadastro");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, 40));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/12594410.png"))); // NOI18N
        jButton10.setMnemonic('x');
        jButton10.setText(" Excluir");
        jButton10.setToolTipText("Excluir Cadastro");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 110, 40));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/gtk_edit.png"))); // NOI18N
        jButton9.setMnemonic('E');
        jButton9.setText(" Editar");
        jButton9.setToolTipText("Editar o Cadastro");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 40));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7813_32x32.png"))); // NOI18N
        jButton15.setMnemonic('N');
        jButton15.setText(" Novo");
        jButton15.setToolTipText("Novo Cadastro");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jButton15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton15FocusLost(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel16.setText("  Numero de Fornecedores Cadastrados:   ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 20));

        numerodecliente.setFont(new java.awt.Font("Tahoma", 1, 10));
        numerodecliente.setText("0");
        jPanel2.add(numerodecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 545, 820, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel26.setText("Razão Social");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel29.setText("Codigo");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 50, 20));

        focodigo.setFont(new java.awt.Font("Tahoma", 1, 11));
        focodigo.setNextFocusableComponent(foendereço);
        focodigo.setRequestFocusEnabled(false);
        jPanel1.add(focodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 100, -1));

        fonome.setFont(new java.awt.Font("Tahoma", 1, 11));
        fonome.setNextFocusableComponent(foendereço);
        fonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonomeActionPerformed(evt);
            }
        });
        jPanel1.add(fonome, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 30, 290, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel27.setText("Endereço");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 20));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel30.setText("CNPJ");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 40, 20));

        foendereço.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(foendereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 290, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Empresa", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 530, 130));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "RO", "AM", "AC", "AP", "CE", "PB", "MA", "SC" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 50, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Bairro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 40, 20));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 60, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("UF");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 20, 20));

        try {
            tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(0##) ####.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tel.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cep.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setText("CEP");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 30, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("Numero");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 20));

        bairro.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel31.setText("Telefone");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 20));

        cnpj.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 100, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel32.setText("Inscrição Estadual");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 110, 20));

        inscricao.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(inscricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 150, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel33.setText("Web Site");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, 20));

        web.setFont(new java.awt.Font("Tahoma", 1, 11));
        web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webActionPerformed(evt);
            }
        });
        jPanel1.add(web, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 150, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel34.setText("Email");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 40, 20));

        email.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, -1));

        Proximo.setFont(new java.awt.Font("Tahoma", 1, 11));
        Proximo.setForeground(new java.awt.Color(153, 153, 153));
        Proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/proximo_32x32.png"))); // NOI18N
        Proximo.setToolTipText("Proximo");
        Proximo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Proximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProximoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProximoMouseExited(evt);
            }
        });
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });
        jPanel1.add(Proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 40, -1));

        Ultimo.setFont(new java.awt.Font("Tahoma", 1, 11));
        Ultimo.setForeground(new java.awt.Color(153, 153, 153));
        Ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ultimo_32x32.png"))); // NOI18N
        Ultimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UltimoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UltimoMouseExited(evt);
            }
        });
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });
        jPanel1.add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 40, -1));

        Anterior.setFont(new java.awt.Font("Tahoma", 1, 11));
        Anterior.setForeground(new java.awt.Color(153, 153, 153));
        Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/anterior_32x32.png"))); // NOI18N
        Anterior.setToolTipText("Anterior");
        Anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnteriorMouseExited(evt);
            }
        });
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 40, -1));

        Primeiro.setFont(new java.awt.Font("Tahoma", 1, 11));
        Primeiro.setForeground(new java.awt.Color(153, 153, 153));
        Primeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/primeiro_32x32.png"))); // NOI18N
        Primeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrimeiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrimeiroMouseExited(evt);
            }
        });
        Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(Primeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 570, 430));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/LogoNoky.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -10, 380, 350));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-753)/2, (screenSize.height-597)/2, 753, 597);
    }// </editor-fold>//GEN-END:initComponents

    private void fonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonomeActionPerformed
   
}//GEN-LAST:event_fonomeActionPerformed

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
  try{
      software_Sokkyo.resultset.next();
       mostrar_dados();
         navega =2;

            }
            catch(SQLException erro){
              JOptionPane.showMessageDialog(null,"Nao foi Possivel ir para o Proximo Resgitro! ");
            }
   
}//GEN-LAST:event_ProximoActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed

        try{
               software_Sokkyo.resultset.previous();
               mostrar_dados();
               navega =1;
            }
            catch(SQLException erro){
              JOptionPane.showMessageDialog(null,"Nao Foi Possivel ir para o Registro Anterior");
            }

}//GEN-LAST:event_AnteriorActionPerformed

    private void PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeiroActionPerformed
 try{
          software_Sokkyo.resultset.first();
            mostrar_dados();
             navega = 1;

        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Nao localizou dados!");
        }
}//GEN-LAST:event_PrimeiroActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
  try{
      software_Sokkyo.resultset.last();
            mostrar_dados();
 navega = 2;
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Nao localizou dados! ");
        }
}//GEN-LAST:event_UltimoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 new Consulta_Fornecedor().show();

}//GEN-LAST:event_jButton7ActionPerformed


//GEN-FIRST:event_jButton13MouseClicked

//GEN-LAST:event_jButton13MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      try {

 software_Sokkyo.executeSQL("select * from cadastro_fornecedor");

 String sqlinsert ="INSERT INTO cadastro_fornecedor (`cadastroFor_nome`, `cadastroFor_end`, `cadastroFor_numero`, `cadastroFor_est`, `cadastroFor_tel`, `cadastroFor_cep`, `cadastro_bairro`, `cadastro_cnpj`, `cadastro_inscricao`, `cadastro_email`, `cadastro_web`) values ('"+fonome.getText()+"','"+foendereço.getText()+"','"+jTextField2.getText()+"','"+jComboBox1.getSelectedItem()+"','"+tel.getText()+"','"+cep.getText()+"','"+bairro.getText()+"','"+cnpj.getText()+"','"+inscricao.getText()+"','"+email.getText()+"','"+web.getText()+"')";

software_Sokkyo.statement.executeUpdate(sqlinsert);
JOptionPane.showMessageDialog(null,"Fornecedor Cadastrado Com Sucesso!");
 PreencherDados();
            software_Sokkyo.resultset.last();
            mostrar_dados();
            navega = 2;
}

 catch(SQLException erros){
     JOptionPane.showMessageDialog(null,"Erro Ao Gravar Dados! Por Favor Digite Novamente!"+erros);
 }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
try{
        String sql ="select * FROM cadastro_fornecedor WHERE `cadastroFor_codig` = "+focodigo.getText();
software_Sokkyo.executeSQL(sql);
software_Sokkyo.resultset.first();
String nome = "Tem Certeza Deseja Excluir o Fornecedor:  "+software_Sokkyo.resultset.getString("cadastroFor_nome")+" ?";
int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome," Exclusão",JOptionPane.YES_NO_OPTION);

if ( opcao_escolhida == JOptionPane.YES_OPTION){

sql = "DELETE FROM softwaresokkyo.cadastro_fornecedor WHERE `cadastroFor_codig` = "+focodigo.getText();
int conseguiu_excluir = software_Sokkyo.statement.executeUpdate(sql);
if (conseguiu_excluir == 1){

JOptionPane.showMessageDialog(null,"Esclusão realizada com sucesso! ");
 PreencherDados();
            software_Sokkyo.resultset.first();
            mostrar_dados();
            navega = 1;
}
}

else{
 return;
    }
  }
catch (SQLException erro)
{
JOptionPane.showMessageDialog(null,"Erro ao Excluir o Registro");
}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{

            String sql = "UPDATE softwaresokkyo.cadastro_fornecedor SET `cadastroFor_nome` = '"+fonome.getText()+"', `cadastroFor_end` = '"+foendereço.getText()+"', `cadastroFor_numero` = '"+jTextField2.getText()+"', `cadastroFor_est` = '"+jComboBox1.getSelectedItem()+"', `cadastroFor_tel` = '"+tel.getText()+"', `cadastroFor_cep` = '"+cep.getText()+"', `cadastro_bairro` = '"+bairro.getText()+"',`cadastro_cnpj`= '"+cnpj.getText()+"', `cadastro_inscricao` = '"+inscricao.getText()+"', `cadastro_email` = '"+email.getText()+"', `cadastro_web` = '"+web.getText()+"' WHERE `cadastroFor_codig` = "+focodigo.getText();
            software_Sokkyo.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Alteraçao realizada com sucesso!");

             PreencherDados();
            software_Sokkyo.resultset.first();
            mostrar_dados();
            navega = 1;
        }

        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro a Tentar Alterar o registro..");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
  fonome.setText("");
       focodigo.setText("");
       foendereço.setText("");
       tel.setText("");
       jTextField2.setText("");
       cep.setText("");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton15FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15FocusLost

    private void webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_webActionPerformed

    private void PrimeiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimeiroMouseEntered
 
    }//GEN-LAST:event_PrimeiroMouseEntered

    private void PrimeiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimeiroMouseExited

    }//GEN-LAST:event_PrimeiroMouseExited

    private void UltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltimoMouseEntered

    }//GEN-LAST:event_UltimoMouseEntered

    private void UltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltimoMouseExited
  
    }//GEN-LAST:event_UltimoMouseExited

    private void ProximoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProximoMouseEntered

    }//GEN-LAST:event_ProximoMouseEntered

    private void ProximoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProximoMouseExited
 
    }//GEN-LAST:event_ProximoMouseExited

    private void AnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnteriorMouseEntered

    
    }//GEN-LAST:event_AnteriorMouseEntered

    private void AnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnteriorMouseExited

      
    }//GEN-LAST:event_AnteriorMouseExited

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            @Override
            public void run() {
                new Cadastro_Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Primeiro;
    private javax.swing.JButton Proximo;
    private javax.swing.JButton Ultimo;
    private javax.swing.JTextField bairro;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField email;
    private javax.swing.JTextField focodigo;
    private javax.swing.JTextField foendereço;
    private javax.swing.JTextField fonome;
    private javax.swing.JTextField inscricao;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel numerodecliente;
    private javax.swing.JFormattedTextField tel;
    private javax.swing.JTextField web;
    // End of variables declaration//GEN-END:variables
 public void PreencherDados(){
  software_Sokkyo.executeSQL("select * from cadastro_fornecedor");
    DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
    modelo.setNumRows(0);
    try{
        while (software_Sokkyo.resultset.next())
            modelo.addRow(new Object[]{software_Sokkyo.resultset.getString("cadastroFor_codig"),software_Sokkyo.resultset.getString("cadastroFor_nome"),software_Sokkyo.resultset.getString("cadastroFor_tel")});

        }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null,"Erro Ao Aprensentar Dados na Tabela");
    }

}
    public void mostrar_dados() throws SQLException{
        try{

                 fonome.setText(software_Sokkyo.resultset.getString("cadastroFor_nome"));
               focodigo.setText(software_Sokkyo.resultset.getString("cadastroFor_codig"));
              foendereço.setText(software_Sokkyo.resultset.getString("cadastroFor_end"));
              tel.setText(software_Sokkyo.resultset.getString("cadastroFor_tel"));
              jTextField2.setText(software_Sokkyo.resultset.getString("cadastroFor_numero"));
               jComboBox1.setSelectedItem(software_Sokkyo.resultset.getString("cadastroFor_est"));
                  cep.setText(software_Sokkyo.resultset.getString("cadastroFor_cep"));
                    bairro.setText(software_Sokkyo.resultset.getString("cadastro_bairro"));
                    cnpj.setText(software_Sokkyo.resultset.getString("cadastro_cnpj"));
                    inscricao.setText(software_Sokkyo.resultset.getString("cadastro_inscricao"));
                    email.setText(software_Sokkyo.resultset.getString("cadastro_email"));
                    web.setText(software_Sokkyo.resultset.getString("cadastro_web"));
            }
            catch(SQLException erro){
               if (navega == 1){
                    JOptionPane.showMessageDialog(null, "Voçê jà Está no Primeiro Registro");
                  software_Sokkyo.resultset.next();
               }
                else if(navega == 2){
                    JOptionPane.showMessageDialog(null, "Voçê jà Está no Ultimo Registro");
                     software_Sokkyo.resultset.previous();
                  }
                else
                  navega = 0;
            }
    }
}
