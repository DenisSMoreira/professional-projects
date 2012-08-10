/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroDeProduto.java
 *
 * Created on 10/02/2011, 11:18:33
 */

package Cadastro;

import conexão.conectarBanco;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telaPrincipal.TelaPrincipal;

/**
 *
 * @author admin
 */
public class CadastroDeProduto extends javax.swing.JInternalFrame {
public int navega = 0;
public double total, precoVenda,outro,porce2;
public String porce;

conectarBanco con;
TelaPrincipal tela;
    public CadastroDeProduto() {
        initComponents();
           con = new conectarBanco();
           tela = new TelaPrincipal();
             con.conecta();

       try
        {
        con.executeSQL("select * from categorias");
       while(con.resultset.next())
      categoria.addItem(con.resultset.getString("nome"));

        }
        catch (SQLException e)
        {   }

  try{
con.executeSQL("select * from produtos");
PreencherDados();
calcularNumero();
con.resultset.first();
 mostrar_dados();
 navega = 1;
      }
      catch(Exception e){

      }
    }

    public double getoutro() {
	return outro;
}

public void setoutro(double outro) {
	this.outro = outro;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        BuscarCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pqtd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pcp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pdiscri = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        porcentagem = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        valorVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        estoqueMinimo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Anterior1 = new javax.swing.JButton();
        Primeiro = new javax.swing.JButton();
        Proximo1 = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ppreço = new javax.swing.JTextField();
        categoria = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        numerodecliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle(" Cadastro de produto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/AirIcon12x12.gif"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leitor de codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 26));
        jLabel19.setText("CODIGO");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        BuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 34));
        BuscarCodigo.setNextFocusableComponent(pnome);
        BuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCodigoActionPerformed(evt);
            }
        });
        BuscarCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarCodigoFocusLost(evt);
            }
        });
        jPanel3.add(BuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 240, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/barras.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 14, -1, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 70));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pqtd.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel1.add(pqtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 100, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel14.setText("Preço de compra");
        jLabel14.setToolTipText("Preço de Venda");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 20));

        pcp.setFont(new java.awt.Font("Tahoma", 1, 12));
        pcp.setRequestFocusEnabled(false);
        pcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcpActionPerformed(evt);
            }
        });
        jPanel1.add(pcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 120, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel10.setText("Codigo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 50, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel12.setText("Quantidade");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 70, 20));

        pnome.setFont(new java.awt.Font("Tahoma", 1, 12));
        pnome.setNextFocusableComponent(categoria);
        jPanel1.add(pnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Estoque minimo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Valor para venda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 110, 20));

        pdiscri.setColumns(20);
        pdiscri.setFont(new java.awt.Font("Tahoma", 1, 12));
        pdiscri.setRows(5);
        jScrollPane2.setViewportView(pdiscri);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 500, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("Descriçao do produto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));

        porcentagem.setFont(new java.awt.Font("Tahoma", 1, 11));
        porcentagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000", "Outro" }));
        porcentagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                porcentagemItemStateChanged(evt);
            }
        });
        jPanel1.add(porcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("  %");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 30, 20));

        valorVenda.setFont(new java.awt.Font("Tahoma", 1, 12));
        valorVenda.setText(null);
        jPanel1.add(valorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 100, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("% para venda");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Produto", "Quantidade", "Preço de Venda"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 510, 110));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel6.setText("Categoria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, 20));

        estoqueMinimo.setFont(new java.awt.Font("Tahoma", 1, 12));
        estoqueMinimo.setText(null);
        jPanel1.add(estoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 90, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel18.setText("Nome do produto");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        Anterior1.setFont(new java.awt.Font("Tahoma", 1, 11));
        Anterior1.setText("<");
        Anterior1.setToolTipText("Anterior");
        Anterior1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Anterior1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Anterior1MouseExited(evt);
            }
        });
        Anterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anterior1ActionPerformed(evt);
            }
        });
        jPanel1.add(Anterior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 50, 30));

        Primeiro.setFont(new java.awt.Font("Tahoma", 1, 11));
        Primeiro.setText("<|");
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
        jPanel1.add(Primeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, 30));

        Proximo1.setFont(new java.awt.Font("Tahoma", 1, 11));
        Proximo1.setText(">");
        Proximo1.setToolTipText("Proximo");
        Proximo1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Proximo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Proximo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Proximo1MouseExited(evt);
            }
        });
        Proximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proximo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Proximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 50, 30));

        Ultimo.setFont(new java.awt.Font("Tahoma", 1, 11));
        Ultimo.setText("|>");
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
        jPanel1.add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 50, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/AirIcon12x12.gif"))); // NOI18N
        jLabel7.setToolTipText("Buscar Fornecedor só com as Primeiras Iniciais dele!");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 20, 20));

        ppreço.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel1.add(ppreço, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, 20));

        categoria.setFont(new java.awt.Font("Tahoma", 1, 11));
        categoria.setToolTipText("Selecione uma categoria");
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 530, 410));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton15.setMnemonic('N');
        jButton15.setText(" Novo");
        jButton15.setToolTipText("Novo Cadastro");
        jButton15.setFocusable(false);
        jButton15.setNextFocusableComponent(BuscarCodigo);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton9.setMnemonic('E');
        jButton9.setText(" Editar");
        jButton9.setToolTipText("Editar o Cadastro");
        jButton9.setFocusable(false);
        jButton9.setVerifyInputWhenFocusTarget(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 40));

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton13.setMnemonic('x');
        jButton13.setText(" Excluir");
        jButton13.setToolTipText("Excluir Cadastro");
        jButton13.setFocusable(false);
        jButton13.setVerifyInputWhenFocusTarget(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 110, 40));

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton14.setMnemonic('s');
        jButton14.setText(" Sair");
        jButton14.setToolTipText("Sair do Menu Cadastro");
        jButton14.setFocusable(false);
        jButton14.setVerifyInputWhenFocusTarget(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, 40));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton17.setText(" Confirmar");
        jButton17.setToolTipText("Confirmar cadastro de Cliente");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 130, 40));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton16.setMnemonic('c');
        jButton16.setText(" Cancelar");
        jButton16.setToolTipText("Cancelar Cadastro de Cliente");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 130, 40));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton11.setText("Gerenciar");
        jButton11.setToolTipText("Efetuar Busca de Peça");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 130, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel17.setText("  Numero de Peças Cadastrados:   ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        numerodecliente.setFont(new java.awt.Font("Tahoma", 1, 10));
        numerodecliente.setText("0");
        jPanel2.add(numerodecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 30, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Noky's Sistemas");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 100, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCodigoActionPerformed
     pcp.setText(BuscarCodigo.getText());
     pnome.requestFocus();
    }//GEN-LAST:event_BuscarCodigoActionPerformed

    private void pcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcpActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_pcpActionPerformed

    private void porcentagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_porcentagemItemStateChanged
        if (ppreço.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Por Favor Digite um Preço !");
            return;
        }
        if(porcentagem.getSelectedItem().equals("Outro")){
            setoutro(Double.parseDouble(JOptionPane.showInputDialog(this,"Digite a Porcentagem desejada: %")));
            precoVenda = Double.parseDouble(ppreço.getText());
            porce2 = getoutro();
            total = ((porce2)/100)*precoVenda+precoVenda;
            valorVenda.setText(""+total);
            return;
        }

        precoVenda = Double.parseDouble(ppreço.getText());
        porce = (String) porcentagem.getSelectedItem();
        total = ((Double.parseDouble(porce)/100)*precoVenda)+precoVenda;
        valorVenda.setText(""+total);


    }//GEN-LAST:event_porcentagemItemStateChanged

    private void Anterior1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anterior1MouseEntered

}//GEN-LAST:event_Anterior1MouseEntered

    private void Anterior1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anterior1MouseExited

}//GEN-LAST:event_Anterior1MouseExited

    private void Anterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior1ActionPerformed
        try{
            con.resultset.previous();
            mostrar_dados();

            navega = 1;
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(this,"Nao Foi Possivel ir para o Registro Anterior"+erro);
        }
}//GEN-LAST:event_Anterior1ActionPerformed

    private void PrimeiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimeiroMouseEntered

}//GEN-LAST:event_PrimeiroMouseEntered

    private void PrimeiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimeiroMouseExited

}//GEN-LAST:event_PrimeiroMouseExited

    private void PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeiroActionPerformed
        try{
           con.resultset.first();
            mostrar_dados();
            navega = 1;

        } catch(SQLException erro){
            JOptionPane.showMessageDialog(this,"Nao localizou dados: "+erro);
        }
}//GEN-LAST:event_PrimeiroActionPerformed

    private void Proximo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proximo1MouseEntered

}//GEN-LAST:event_Proximo1MouseEntered

    private void Proximo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proximo1MouseExited

}//GEN-LAST:event_Proximo1MouseExited

    private void Proximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proximo1ActionPerformed
        try{
            con.resultset.next();
            mostrar_dados();
            navega =2;
        } catch(SQLException erro){

        }
}//GEN-LAST:event_Proximo1ActionPerformed

    private void UltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltimoMouseEntered

}//GEN-LAST:event_UltimoMouseEntered

    private void UltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltimoMouseExited

}//GEN-LAST:event_UltimoMouseExited

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        try{
           con.resultset.last();
            mostrar_dados();
            navega = 2;
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(this,"Nao localizou dados: "+erro);
        }
}//GEN-LAST:event_UltimoActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        pnome.setText(String.valueOf(""));
        pcp.setText(String.valueOf(""));
        pqtd.setText(String.valueOf(""));
        ppreço.setText(String.valueOf(""));
       pdiscri.setText(String.valueOf(""));
       estoqueMinimo.setText("");
       BuscarCodigo.setText("");
       valorVenda.setText("");
}//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{
            String sql = "UPDATE produtos SET `codigo` = '"+pcp.getText()+"', `descricao` = '"+pdiscri.getText()+"', `precovenda` = '"+valorVenda.getText()+"', `porcentagem` = '"+porcentagem.getSelectedItem()+"', `estoque` =  '"+pqtd.getText()+"', `estoqueminimo` = '"+estoqueMinimo.getText()+"', `categoria` = '"+categoria.getSelectedItem()+"', `nome` = '"+pnome.getText()+"' WHERE `codigo` = "+pcp.getText();
            con.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Alteraçao realizada com sucesso!");
            PreencherDados();
            con.resultset.first();
            mostrar_dados();
            navega = 1;

        }

        catch (SQLException erro) {
            JOptionPane.showMessageDialog(this,"Erro a Tentar Alterar o registro..");
        }
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try{
            String sql ="select * FROM produtos WHERE `codigo` = "+pcp.getText();
            con.executeSQL(sql);
           con.resultset.first();
            String nome = "Tem Certeza que gostaria de Deletar a Peça:  "+con.resultset.getString("nome")+" ?";
            int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome," Exclusão",JOptionPane.YES_NO_OPTION);

            if ( opcao_escolhida == JOptionPane.YES_OPTION){

                sql = "DELETE FROM produtos WHERE `codigo` = "+pcp.getText();
                int conseguiu_excluir = con.statement.executeUpdate(sql);
                if (conseguiu_excluir == 1){

                    JOptionPane.showMessageDialog(this,"Exclusão realizada com sucesso! ");
                    PreencherDados();
                    calcularNumero();
                    con.resultset.first();
                    mostrar_dados();
                    navega = 1;

                }
            }

            else{
                return;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this,"Erro ao Excluir o Registro");
        }
}//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
dispose();
}//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            String sqlinsert ="INSERT INTO produtos(codigo,descricao,precofornecedor,precovenda,porcentagem,estoque,estoqueminimo,categoria,nome) values ('"+pcp.getText()+"','"+pdiscri.getText()+"','"+ppreço.getText()+"','"+valorVenda.getText()+"','"+porcentagem.getSelectedItem()+"','"+pqtd.getText()+"','"+estoqueMinimo.getText()+"','"+categoria.getSelectedItem()+"','"+pnome.getText()+ "')";
           con.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
            con.executeSQL("select * from produtos");
            PreencherDados();
            calcularNumero();
            con.resultset.last();
            mostrar_dados();
            navega = 2;

        }

        catch(SQLException erros){
            JOptionPane.showMessageDialog(this,"Erro Ao Gravar Dados! Por Favor Digite Novamente:  "+erros);
        }
}//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
  pnome.setText(String.valueOf(""));
        pcp.setText(String.valueOf(""));
        pqtd.setText(String.valueOf(""));
        ppreço.setText(String.valueOf(""));
       pdiscri.setText(String.valueOf(""));
       estoqueMinimo.setText("");
       BuscarCodigo.setText("");
       valorVenda.setText("");
}//GEN-LAST:event_jButton16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//        new Consulta_Pecas().show();        // TODO add your handling code here:
}//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
tela.chamarCategoria();
}//GEN-LAST:event_jLabel7MouseClicked

    private void BuscarCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarCodigoFocusLost
    }//GEN-LAST:event_BuscarCodigoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior1;
    private javax.swing.JTextField BuscarCodigo;
    private javax.swing.JButton Primeiro;
    private javax.swing.JButton Proximo1;
    private javax.swing.JButton Ultimo;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextField estoqueMinimo;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numerodecliente;
    private javax.swing.JTextField pcp;
    private javax.swing.JTextArea pdiscri;
    private javax.swing.JTextField pnome;
    private javax.swing.JComboBox porcentagem;
    private javax.swing.JTextField ppreço;
    private javax.swing.JTextField pqtd;
    private javax.swing.JTextField valorVenda;
    // End of variables declaration//GEN-END:variables
    public void mostrar_dados() throws SQLException{
        try{
             pcp.setText(con.resultset.getString("codigo"));
             pnome.setText(con.resultset.getString("nome"));
             pqtd.setText(con.resultset.getString("estoque"));
             ppreço.setText(con.resultset.getString("precofornecedor"));
             pdiscri.setText(con.resultset.getString("descricao"));
             porcentagem.setSelectedItem(con.resultset.getString("porcentagem"));
             valorVenda.setText(con.resultset.getString("precovenda"));
             estoqueMinimo.setText(con.resultset.getString("estoqueminimo"));
             categoria.setSelectedItem(con.resultset.getString("categoria"));
            }
            catch(SQLException erro){
               if (navega == 1){
                    JOptionPane.showMessageDialog(this, "Voçê jà Está no Primeiro Registro");
                   con.resultset.next();
               }
                else if(navega == 2){
                    JOptionPane.showMessageDialog(this, "Voçê jà Está no Ultimo Registro");
                  con.resultset.previous();
                }
                else
                     navega = 0;
            }
    }

     public void PreencherDados(){
   con.executeSQL("select * from produtos");
    DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
    modelo.setNumRows(0);
    try{
        while (con.resultset.next())
            modelo.addRow(new Object[]{con.resultset.getString("codigo"),con.resultset.getString("nome"),con.resultset.getString("estoque"),con.resultset.getString("precovenda")});

        }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(this,"Erro Ao Aprensentar Dados na Tabela");
    }

}
      public void calcularNumero() throws SQLException{
con.resultset.first();
 int i = 1;
     while(con.resultset.next()){
       i++;

  }
   numerodecliente.setText(""+i);
   con.executeSQL("select * from produtos");
 }
}
