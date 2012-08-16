/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Consulta_Orcamento.java
 *
 * Created on 06/09/2010, 13:52:37
 */

package com.Sokkyo.Consulta;

import com.Sokkyo.Cadastros.Cadastro_Orcamento;
import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Consulta_Orcamento extends javax.swing.JFrame {
     Conexão softwaresokkyo;
    /** Creates new form Consulta_Orcamento */
    public Consulta_Orcamento() {
        initComponents();
         softwaresokkyo = new Conexão();
        softwaresokkyo.conecta();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        buscFor = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        vvalor = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        vqtd = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        vendedor = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        vtotal = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        pnome = new javax.swing.JTextField();
        cod_peca = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        datae = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        dias = new javax.swing.JComboBox();
        placa = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        vspreço = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        vspreço1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descrição = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        codigOS = new javax.swing.JTextField();
        vscodigocli = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        nome11 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        EstoqueMinimo = new javax.swing.JLabel();

        setTitle("Consultar Orcamento");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_32x32.png"))); // NOI18N
        jButton9.setMnemonic('N');
        jButton9.setText(" Novo");
        jButton9.setToolTipText("Novo Cadastro");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton9FocusLost(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/gtk_edit.png"))); // NOI18N
        jButton8.setMnemonic('E');
        jButton8.setText("Limpar");
        jButton8.setToolTipText("Editar o Cadastro");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 40));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png"))); // NOI18N
        jButton7.setMnemonic('s');
        jButton7.setText(" Sair");
        jButton7.setToolTipText("Sair do Menu Cadastro");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 110, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel26.setText("Placa");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 40, 20));

        buscFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscForActionPerformed(evt);
            }
        });
        jPanel1.add(buscFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel27.setText("Cliente");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel28.setText("O.S");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 30, 20));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 80, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Adcionais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vvalor.setFont(new java.awt.Font("Tahoma", 1, 11));
        vvalor.setRequestFocusEnabled(false);
        jPanel7.add(vvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel44.setText("QTD Dejesada");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        vqtd.setFont(new java.awt.Font("Tahoma", 1, 11));
        vqtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vqtdFocusLost(evt);
            }
        });
        jPanel7.add(vqtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 90, 20));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel45.setText("Valor da Peça");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 20));

        vendedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 90, 20));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel54.setText("Vendedor");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 70, 20));

        vtotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        vtotal.setForeground(new java.awt.Color(255, 0, 0));
        jPanel7.add(vtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 90, 20));

        jLabel48.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel48.setForeground(new java.awt.Color(0, 153, 255));
        jLabel48.setText("VALOR");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 70, 20));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel43.setText("Nome da Peça");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 88, 20));

        pnome.setFont(new java.awt.Font("Tahoma", 1, 11));
        pnome.setToolTipText("Digite a Peça e Pressione Enter para Preencher");
        pnome.setMaximumSize(new java.awt.Dimension(20, 6));
        pnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnomeActionPerformed(evt);
            }
        });
        jPanel7.add(pnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 230, 22));

        cod_peca.setFont(new java.awt.Font("Tahoma", 1, 11));
        cod_peca.setFocusable(false);
        cod_peca.setRequestFocusEnabled(false);
        cod_peca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_pecaActionPerformed(evt);
            }
        });
        jPanel7.add(cod_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 90, 20));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel52.setText("Codigo da Peça");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 20, 100, 20));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 690, 110));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Orçamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datae.setFont(new java.awt.Font("Tahoma", 1, 11));
        datae.setRequestFocusEnabled(false);
        jPanel8.add(datae, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("Data de Entrada");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 20));

        dias.setFont(new java.awt.Font("Tahoma", 1, 11));
        dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoje", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "Mais" }));
        jPanel8.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 100, -1));

        placa.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel8.add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 90, 20));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel42.setText("Modelo");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 20));

        vspreço.setFont(new java.awt.Font("Tahoma", 1, 11));
        vspreço.setForeground(new java.awt.Color(255, 0, 51));
        vspreço.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vspreçoFocusLost(evt);
            }
        });
        jPanel8.add(vspreço, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 100, 20));

        modelo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel8.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel49.setText("Placa do Veiculo");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 20));

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel40.setForeground(new java.awt.Color(51, 153, 255));
        jLabel40.setText("VALOR");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 20));

        vspreço1.setFont(new java.awt.Font("Tahoma", 1, 11));
        vspreço1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel8.add(vspreço1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 100, 30));

        jLabel39.setFont(new java.awt.Font("Arial Black", 1, 18));
        jLabel39.setForeground(new java.awt.Color(0, 204, 204));
        jLabel39.setText("TOTAL");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Dias Previsto para Entrega");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 160, 20));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 690, 120));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descrição.setColumns(20);
        descrição.setFont(new java.awt.Font("Arial", 1, 12));
        descrição.setRows(5);
        jScrollPane2.setViewportView(descrição);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 90));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("CODIGO O.S");
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 100, 20));

        codigOS.setFont(new java.awt.Font("Tahoma", 1, 14));
        jPanel11.add(codigOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 110, -1));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 690, 140));

        vscodigocli.setFont(new java.awt.Font("Tahoma", 1, 11));
        vscodigocli.setRequestFocusEnabled(false);
        jPanel6.add(vscodigocli, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 90, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel41.setText("Codigo do Cliente");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 100, 20));

        nome11.setFont(new java.awt.Font("Tahoma", 1, 11));
        nome11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome11ActionPerformed(evt);
            }
        });
        jPanel6.add(nome11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 230, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel38.setText("Nome do Cliente");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 94, 20));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 430));

        jTabbedPane1.addTab("Busca", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ultimos Orçamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Peça", "Cod Peça", "qtd", "Preço Uni", "Sub-Total", "Descriçao", "valor O.S", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 390));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenação:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 11));
        jRadioButton2.setText("Em Aberto");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 20));

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 11));
        jRadioButton1.setText("Data");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        jPanel5.add(EstoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 276, 115, 10));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jTabbedPane1.addTab("Orçamentos", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 760, 530));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-797)/2, (screenSize.height-639)/2, 797, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void buscForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscForActionPerformed


    }//GEN-LAST:event_buscForActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed


}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton9FocusLost

}//GEN-LAST:event_jButton9FocusLost

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
}//GEN-LAST:event_jButton7ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      
}//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       
}//GEN-LAST:event_jRadioButton1ActionPerformed

    private void vqtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vqtdFocusLost

              // TODO add your handling code here:
}//GEN-LAST:event_vqtdFocusLost

    private void vspreçoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vspreçoFocusLost

}//GEN-LAST:event_vspreçoFocusLost

    private void pnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnomeActionPerformed

}//GEN-LAST:event_pnomeActionPerformed

    private void cod_pecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_pecaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cod_pecaActionPerformed

    private void nome11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome11ActionPerformed

}//GEN-LAST:event_nome11ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Consulta_Orcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstoqueMinimo;
    private javax.swing.JTextField buscFor;
    private javax.swing.JTextField cod_peca;
    private javax.swing.JTextField codigOS;
    private javax.swing.JFormattedTextField datae;
    private javax.swing.JTextArea descrição;
    private javax.swing.JComboBox dias;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
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
public void PreencherDados(){
    softwaresokkyo.executeSQL("select * from cadastro_orcamento WHERE codigoCliente = "+jTextField3.getText()+"");

    DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
    modelo.setNumRows(0);
    try{
        while (softwaresokkyo.resultset.next())
            modelo.addRow(new Object[]{softwaresokkyo.resultset.getString("nomePeca"),softwaresokkyo.resultset.getString("quantidade"),softwaresokkyo.resultset.getString("valor"),softwaresokkyo.resultset.getString("total"),softwaresokkyo.resultset.getString("valorOrcamento")});

        }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null,"Erro Ao Aprensentar Dados na Tabela!");
    }
}
}
