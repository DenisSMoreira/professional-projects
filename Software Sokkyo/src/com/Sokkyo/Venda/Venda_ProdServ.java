/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Venda_ProdServ.java
 *
 * Created on 05/09/2010, 08:24:01
 */

package com.Sokkyo.Venda;

import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Venda_ProdServ extends javax.swing.JFrame {
Conexão softwaresokkyo;
double nt0,nt,nt1;
    /** Creates new form Venda_ProdServ */
    public Venda_ProdServ() {
        initComponents();
         softwaresokkyo = new Conexão();
        softwaresokkyo.conecta();
        Date data = new Date();
        datae.setText(""+data.getDate()+"/"+data.getMonth()+"/"+(data.getYear()-100));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome11 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        vscodigocli = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnome = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        cod_peca = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vvalor = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        vqtd = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        vendedor = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        vtotal = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        datae = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        dias = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        vspreço = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        vspreço1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descrição = new javax.swing.JTextArea();
        BConfirmar = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        setTitle("Venda Completa");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        nome11.setFont(new java.awt.Font("Tahoma", 1, 11));
        nome11.setNextFocusableComponent(pnome);
        nome11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome11ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel38.setText("Nome do Cliente");

        vscodigocli.setFont(new java.awt.Font("Tahoma", 1, 11));
        vscodigocli.setRequestFocusEnabled(false);

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel41.setText("Codigo do Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vscodigocli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nome11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vscodigocli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 620, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Peça", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnome.setFont(new java.awt.Font("Tahoma", 1, 11));
        pnome.setToolTipText("Digite a Peça e Pressione Enter para Preencher");
        pnome.setMaximumSize(new java.awt.Dimension(20, 6));
        pnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnomeActionPerformed(evt);
            }
        });
        jPanel2.add(pnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 20, 282, 22));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel43.setText("Nome da Peça");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 20, 88, 20));

        cod_peca.setFont(new java.awt.Font("Tahoma", 1, 11));
        cod_peca.setFocusable(false);
        cod_peca.setRequestFocusEnabled(false);
        cod_peca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_pecaActionPerformed(evt);
            }
        });
        jPanel2.add(cod_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 21, 90, -1));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel52.setText("Codigo da Peça");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 20, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 620, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vvalor.setFont(new java.awt.Font("Tahoma", 1, 11));
        vvalor.setRequestFocusEnabled(false);
        jPanel3.add(vvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 90, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel44.setText("QTD Dejesada");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        vqtd.setFont(new java.awt.Font("Tahoma", 1, 11));
        vqtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vqtdFocusLost(evt);
            }
        });
        jPanel3.add(vqtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, 20));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel45.setText("Valor da Peça");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        vendedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel3.add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 90, 20));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel54.setText("Vendedor");
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 60, 20));

        vtotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        vtotal.setForeground(new java.awt.Color(255, 0, 0));
        vtotal.setNextFocusableComponent(placa);
        jPanel3.add(vtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 90, 20));

        jLabel48.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel48.setForeground(new java.awt.Color(0, 153, 255));
        jLabel48.setText("VALOR");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 70, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 620, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Orçamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datae.setFont(new java.awt.Font("Tahoma", 1, 11));
        datae.setRequestFocusEnabled(false);
        jPanel4.add(datae, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("Data de Entrada");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 20));

        dias.setFont(new java.awt.Font("Tahoma", 1, 11));
        dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoje", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "Mais" }));
        jPanel4.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Dias Previsto para Entrega");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 160, 20));

        placa.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel4.add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 90, 20));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel42.setText("Modelo");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 20));

        vspreço.setFont(new java.awt.Font("Tahoma", 1, 11));
        vspreço.setForeground(new java.awt.Color(255, 0, 51));
        vspreço.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vspreçoFocusLost(evt);
            }
        });
        jPanel4.add(vspreço, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 100, 20));

        modelo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel4.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel49.setText("Placa do Veiculo");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 20));

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel40.setForeground(new java.awt.Color(51, 153, 255));
        jLabel40.setText("VALOR");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 20));

        vspreço1.setFont(new java.awt.Font("Tahoma", 1, 11));
        vspreço1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel4.add(vspreço1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 100, 30));

        jLabel39.setFont(new java.awt.Font("Arial Black", 1, 18));
        jLabel39.setForeground(new java.awt.Color(0, 204, 204));
        jLabel39.setText("TOTAL");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 80, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 620, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descrição.setColumns(20);
        descrição.setFont(new java.awt.Font("Arial", 1, 12));
        descrição.setRows(5);
        jScrollPane2.setViewportView(descrição);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 26, 560, 90));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 620, 140));

        BConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png"))); // NOI18N
        BConfirmar.setText("Confirmar");
        BConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(BConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 40));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png"))); // NOI18N
        jButton14.setMnemonic('s');
        jButton14.setText(" Sair da Venda");
        jButton14.setToolTipText("Sair do Menu Cadastro");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8391_32x32.png"))); // NOI18N
        jButton6.setMnemonic('A');
        jButton6.setText("Adcionar Peça");
        jButton6.setToolTipText("Nova Busca");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 150, 40));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/5951_32x32.png"))); // NOI18N
        jButton15.setMnemonic('N');
        jButton15.setText("Nova Venda");
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
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Nokys Software");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 90, 20));

        jLabel50.setText("jLabel2");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 10, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-665)/2, (screenSize.height-578)/2, 665, 578);
    }// </editor-fold>//GEN-END:initComponents

    private void nome11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome11ActionPerformed
         softwaresokkyo.executeSQL("select * from cadastro_cliente");
        try	{

            softwaresokkyo.resultset.first();

            String igual ="n";

            int tamanho_pesquisa = nome11.getText().length();

            while ( igual == "n") {

                String pesquisando =  softwaresokkyo.resultset.getString("cadastro_nome").substring(0,(tamanho_pesquisa));

                if(pesquisando.equals(nome11.getText()))

                {
                    igual = "s";
                }

                else

                    softwaresokkyo.resultset.next();

            }


            vscodigocli.setText( softwaresokkyo.resultset.getString("codigo_cliente"));
            nome11.setText( softwaresokkyo.resultset.getString("cadastro_nome"));


        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
        }
}//GEN-LAST:event_nome11ActionPerformed

    private void pnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnomeActionPerformed
        softwaresokkyo.executeSQL("select * from cadastro_peca");
        try	{

            softwaresokkyo.resultset.first();

            String igual ="n";

            int tamanho_pesquisa = pnome.getText().length();

            while ( igual == "n") {

                String pesquisando = softwaresokkyo.resultset.getString("cadastroProdnome").substring(0,(tamanho_pesquisa));

                if(pesquisando.equals(pnome.getText()))

                {
                    igual = "s";
                }

                else

                    softwaresokkyo.resultset.next();

            }


            cod_peca.setText(softwaresokkyo.resultset.getString("cadastroProd"));
            mostrar_dados();

        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
        }        // TODO add your handling code here:
        // TODO add your handling code here:
}//GEN-LAST:event_pnomeActionPerformed

    private void cod_pecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_pecaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cod_pecaActionPerformed

    private void vqtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vqtdFocusLost


        nt= Double.parseDouble(vqtd.getText());
        nt1=Double.parseDouble(vvalor.getText());
        nt0 = nt*nt1;
        vtotal.setText(""+nt0);        // TODO add your handling code here:
}//GEN-LAST:event_vqtdFocusLost

    private void BConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirmarActionPerformed
        double nt,nt2,nt3 = 0;

        nt= Double.parseDouble(vqtd.getText());
        nt2=Double.parseDouble(jLabel50.getText());

        if(nt<nt2){
            nt3 = nt2 - nt;
        } else { JOptionPane.showMessageDialog(null,"Nao Tem Peças Suficiente!");
        return;
        }
        String nome = "Tem Certeza que gostaria de Efetuar a Venda?";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Confirmar",JOptionPane.YES_NO_OPTION);
        if ( opcao_escolhida == JOptionPane.YES_OPTION){
       CadastrarVenda();
 softwaresokkyo.executeSQL("select * from cadastro_peca");
  String sql = "UPDATE softwaresokkyo.cadastro_peca SET `cadastroProd_qtd` = '"+nt3+"' WHERE `cadastroProd` = "+cod_peca.getText();
            try {
   softwaresokkyo.statement.executeUpdate(sql);
     JOptionPane.showMessageDialog(null,"Venda Efetuada e Cadastrada Com Sucesso!");
            } catch (SQLException ex) {

            }


        } else
            return;
}//GEN-LAST:event_BConfirmarActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        dispose();
}//GEN-LAST:event_jButton14ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pnome.setText("");
        cod_peca.setText("");
        vqtd.setText("");
        vtotal.setText("");
        vvalor.setText("");
        nt0 = 0;

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        pnome.setText("");
        cod_peca.setText("");
        vqtd.setText("");
        vtotal.setText("");
        nome11.setText("");
        vendedor.setText("");
        nt0 = 0;
}//GEN-LAST:event_jButton15ActionPerformed

    private void jButton15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton15FocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_jButton15FocusLost

    private void vspreçoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vspreçoFocusLost
Double v = Double.parseDouble(vspreço.getText());
  nt0 = v + nt0;
  vspreço1.setText(""+nt0);
    }//GEN-LAST:event_vspreçoFocusLost

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Venda_ProdServ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConfirmar;
    private javax.swing.JTextField cod_peca;
    private javax.swing.JFormattedTextField datae;
    private javax.swing.JTextArea descrição;
    private javax.swing.JComboBox dias;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome11;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField pnome;
    private javax.swing.JTextField vendedor;
    private javax.swing.JTextField vqtd;
    private javax.swing.JTextField vscodigocli;
    private javax.swing.JTextField vspreço;
    private javax.swing.JTextField vspreço1;
    private javax.swing.JTextField vtotal;
    private javax.swing.JTextField vvalor;
    // End of variables declaration//GEN-END:variables
public void mostrar_dados(){
        try{

                pnome.setText(softwaresokkyo.resultset.getString("cadastroProdnome"));
          vvalor.setText(softwaresokkyo.resultset.getString("cadastroProd_preco"));
          jLabel50.setText(softwaresokkyo.resultset.getString("cadastroProd_qtd"));

            }
            catch(SQLException erro){

            }
    }
public void CadastrarVenda()
{
try {
softwaresokkyo.executeSQL("select * from softwaresokkyo.venda_prodserv");
 String sql_insrt ="INSERT INTO softwaresokkyo.venda_prodserv (nome_cliente, cod_cliente, peca, cod_peca, qtd, vendedor, valor_peca, `data`, previsao, placa, modelo, valor_or, total, valor_peca_unidade, descricao) VALUES ('"+nome11.getText()+"', '"+vscodigocli.getText()+"', '"+pnome.getText()+"', '"+cod_peca.getText()+"', '"+vqtd.getText()+"', '"+vendedor.getText()+"', '"+vtotal.getText()+"', '"+datae.getText()+"', '"+dias.getSelectedItem()+"', '"+placa.getText()+"', '"+modelo.getText()+"', '"+vspreço.getText()+"', '"+vspreço1.getText()+"', '"+vvalor.getText()+"', '"+descrição.getText()+"')";
softwaresokkyo.statement.executeUpdate(sql_insrt);

}

 catch(SQLException e){
     JOptionPane.showMessageDialog(null,"Erro Ao Gravar Dados! Por Favor Digite Novamente! "+e);
 }
}
}
