/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Venda_Produto.java
 *
 * Created on 05/09/2010, 08:20:35
 */

package com.Sokkyo.Venda;

import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author Administrador
 */
public class Venda_Produto extends javax.swing.JFrame {

Conexão softwaresokkyo;
double nt0,nt,nt1;


    /** Creates new form Venda_Produto */
    public Venda_Produto(String vend) {
        initComponents();
        vendedor.setText(vend);
        softwaresokkyo = new Conexão();
        softwaresokkyo.conecta();
        Date data = new Date();
        venda1.setText(""+data.getDate()+"/"+data.getMonth()+"/"+(data.getYear()-100));

        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        pnome1 = new javax.swing.JTextField();
        vcodigocli = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnome = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        venda = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ccc1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        vvalor = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        vqtd = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        venda1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        vendedor = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        vtotal = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        BConfirmar = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setTitle("Venda de Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Nokys Software");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 90, 20));

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

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 3));
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 40, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel46.setText("Nome do Cliente");

        pnome1.setFont(new java.awt.Font("Arial", 1, 12));
        pnome1.setToolTipText("Digite a Iniciais do Cliente e Digite Enter");
        pnome1.setMaximumSize(new java.awt.Dimension(20, 6));
        pnome1.setNextFocusableComponent(pnome);
        pnome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnome1ActionPerformed(evt);
            }
        });

        vcodigocli.setFont(new java.awt.Font("Arial", 1, 12));
        vcodigocli.setFocusable(false);
        vcodigocli.setRequestFocusEnabled(false);

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel49.setText("Codigo do Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vcodigocli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vcodigocli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 620, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Peça", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        pnome.setFont(new java.awt.Font("Arial", 1, 12));
        pnome.setToolTipText("Digite a Peça e Pressione Enter para Preencher");
        pnome.setMaximumSize(new java.awt.Dimension(20, 6));
        pnome.setNextFocusableComponent(vqtd);
        pnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnomeActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel43.setText("Nome da Peça");

        venda.setFont(new java.awt.Font("Arial", 1, 12));
        venda.setFocusable(false);
        venda.setRequestFocusEnabled(false);
        venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel51.setText("Codigo da Peça");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(venda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pnome, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addComponent(venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 620, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ccc1.setFont(new java.awt.Font("Arial", 1, 12));
        ccc1.setRequestFocusEnabled(false);
        jPanel3.add(ccc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, -1));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel47.setText("Codigo de Venda");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 110, 20));

        vvalor.setFont(new java.awt.Font("Arial", 1, 12));
        vvalor.setRequestFocusEnabled(false);
        jPanel3.add(vvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel44.setText("QTD Dejesada");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        vqtd.setFont(new java.awt.Font("Arial", 1, 12));
        vqtd.setNextFocusableComponent(BConfirmar);
        vqtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vqtdFocusLost(evt);
            }
        });
        jPanel3.add(vqtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 20));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel45.setText("Valor da Peça");
        jPanel3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 20));

        venda1.setFont(new java.awt.Font("Arial", 1, 12));
        jPanel3.add(venda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, -1));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel52.setText("Data da Venda");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 100, 20));

        vendedor.setFont(new java.awt.Font("Arial", 1, 12));
        vendedor.setRequestFocusEnabled(false);
        jPanel3.add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 90, -1));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel53.setText("Vendedor");
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 60, 20));

        vtotal.setFont(new java.awt.Font("Arial", 1, 12));
        vtotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(vtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 90, -1));

        jLabel48.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel48.setForeground(new java.awt.Color(0, 153, 255));
        jLabel48.setText("TOTAL");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 70, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 620, 100));

        BConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png"))); // NOI18N
        BConfirmar.setText("Confirmar");
        BConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(BConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 40));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8404_32x32.png"))); // NOI18N
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

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-674)/2, (screenSize.height-341)/2, 674, 341);
    }// </editor-fold>//GEN-END:initComponents

    private void pnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnomeActionPerformed
softwaresokkyo.executeSQL("select * from cadastro_peca");
        try	{

softwaresokkyo.resultset.first();

String igual ="n";

int tamanho_pesquisa = pnome.getText().length();

while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastroProdnome").substring(0,(tamanho_pesquisa));

if(pesquisando.equals(pnome.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}


	venda.setText(softwaresokkyo.resultset.getString("cadastroProd"));
	mostrar_dados();

}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
}        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_pnomeActionPerformed

    private void pnome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnome1ActionPerformed
softwaresokkyo.executeSQL("select * from cadastro_cliente");
        try	{

softwaresokkyo.resultset.first();

String igual ="n";

int tamanho_pesquisa = pnome1.getText().length();

while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastro_nome").substring(0,(tamanho_pesquisa));

if(pesquisando.equals(pnome1.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}


	vcodigocli.setText(softwaresokkyo.resultset.getString("codigo_cliente"));
	pnome1.setText(softwaresokkyo.resultset.getString("cadastro_nome"));


}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
}         // TODO add your handling code here:
    }//GEN-LAST:event_pnome1ActionPerformed

    private void vqtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vqtdFocusLost


nt= Double.parseDouble(vqtd.getText());
      nt1=Double.parseDouble(vvalor.getText());
      nt0 = nt*nt1;
      vtotal.setText(""+nt0);        // TODO add your handling code here:
    }//GEN-LAST:event_vqtdFocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
pnome.setText("");
venda.setText("");
vqtd.setText("");
vtotal.setText("");
nt0 = 0;
        

}//GEN-LAST:event_jButton6ActionPerformed

    private void vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaActionPerformed

    private void BConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirmarActionPerformed
      double nt,nt2,nt3 = 0;

      nt= Double.parseDouble(vqtd.getText());
      nt2=Double.parseDouble(jLabel50.getText());

     if(nt<nt2){
          nt3 = nt2 - nt;
     }
 else { JOptionPane.showMessageDialog(null,"Nao Tem Peças Suficiente!");
 return;
 }
     String nome = "Tem Certeza que gostaria de Efetuar a Compra?";
     int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Confirmar",JOptionPane.YES_NO_OPTION);
if ( opcao_escolhida == JOptionPane.YES_OPTION){

CadastrarVenda();
    String sql = "UPDATE softwaresokkyo.cadastro_peca SET `cadastroProd_qtd` = '"+nt3+"' WHERE `cadastroProd` = "+venda.getText();
            try
            {
                softwaresokkyo.statement.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Venda_Produto.class.getName()).log(Level.SEVERE, null, ex);
            }


}
 else
  return;
}//GEN-LAST:event_BConfirmarActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
pnome.setText("");
venda.setText("");
vqtd.setText("");
vtotal.setText("");
pnome1.setText("");
vcodigocli.setText("");
vendedor.setText("");

nt0 = 0;
}//GEN-LAST:event_jButton15ActionPerformed

    private void jButton15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton15FocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_jButton15FocusLost

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        dispose();
}//GEN-LAST:event_jButton14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConfirmar;
    private javax.swing.JTextField ccc1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pnome;
    private javax.swing.JTextField pnome1;
    private javax.swing.JTextField vcodigocli;
    private javax.swing.JTextField venda;
    private javax.swing.JTextField venda1;
    private javax.swing.JTextField vendedor;
    private javax.swing.JTextField vqtd;
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


 String sql_insrt ="INSERT INTO venda_produto(venda_nome, venda_codpe, venda_codcli, venda_qtd, venda_valor, venda_toal, venda_nomePeca, dataVenda, vendedor ) values ('"+pnome1.getText()+"','"+venda.getText()+"','"+vcodigocli.getText()+"','"+vqtd.getText()+"','"+vvalor.getText()+"','"+vtotal.getText()+"','"+pnome.getText()+"','"+venda1.getText()+"','"+vendedor.getText()+"')";
softwaresokkyo.statement.executeUpdate(sql_insrt);
JOptionPane.showMessageDialog(null,"Venda Efetuada e Cadastrada Com Sucesso!");

}

 catch(SQLException erros){
     JOptionPane.showMessageDialog(null,"Erro Ao Gravar Dados! Por Favor Digite Novamente:  "+erros);
 }
}
}