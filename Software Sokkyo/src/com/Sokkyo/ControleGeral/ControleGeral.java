
package com.Sokkyo.ControleGeral;


import com.Sokkyo.ControleGeral.CriarAtalho.CriarAtalho;
import com.Sokkyo.Login.Acesso.Login;
import com.Sokkyo.Ajuda.Ajuda;
import com.Sokkyo.Ajuda.Reportar;
import com.Sokkyo.Cadastros.Cadasto_Funcionario;
import com.Sokkyo.Cadastros.Cadastro_Fornecedor;
import com.Sokkyo.Cadastros.Cadastro_Orcamento;
import com.Sokkyo.Cadastros.Cadastro_Peça;
import com.Sokkyo.Cadastros.Cadastro_de_Clientes;
import com.Sokkyo.Consulta.Consulta_Cliente;
import com.Sokkyo.Consulta.Consulta_Fornecedor;
import com.Sokkyo.Consulta.Consulta_Orcamento;
import com.Sokkyo.Consulta.Consulta_Pecas;
import com.Sokkyo.FecharCaixa.Fechar_Caixa;
import com.Sokkyo.Utilitarios.LookAndFeel.LookAndFeel;
import com.Sokkyo.Utilitarios.Data.data;
import com.Sokkyo.Venda.Venda_ProdServ;
import com.Sokkyo.Venda.Venda_Produto;
import com.Sokkyo.Venda.Venda_Servico;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Denis
 */
public class ControleGeral extends javax.swing.JFrame {
  LookAndFeel L = new LookAndFeel();
  ControleGeral_Metodos C = new ControleGeral_Metodos();
  data mostra_data = new data();

  public ControleGeral(String text) {

          initComponents();
          nome.setText(text);
          acesso();
          L.LookAndFeelHifi(this);
       jInternalFrame1.setLocation(getSize().width-250, getSize().height-400);
       mostra_data.le_data();
       Label_Data1.setText(""+mostra_data.dia_semana+",  "+mostra_data.dia+"  de  "+mostra_data.mes+"  de  "+mostra_data.ano);
       timer1.start();
       jInternalFrame1.setVisible(true);
    
    }


  public void acesso(){
      if(nome.getText().equals("vendedor")){
    cadastrar_clie.setEnabled(false);
    cadastrar_for.setEnabled(false);
    cadastrar_fun.setEnabled(false);
    cadastrar_peca.setEnabled(false);
    jMenuItem28.setEnabled(false);
    consultar_fornecedor.setEnabled(false);
    menu_clie.setEnabled(false);
    menu_peca.setEnabled(false);
    menu_fun.setEnabled(false);
    menu_for.setEnabled(false);
    jMenuItem37.setEnabled(false);
      }

      if(nome.getText().equals("admin")){
    cadastrar_clie.setEnabled(true);
    consultar_cliente.setEnabled(true);
    cadastrar_for.setEnabled(true);
    cadastrar_fun.setEnabled(true);
    cadastrar_peca.setEnabled(true);
    cadastrarrrr.setEnabled(true);
    OMenuCadastro.setEnabled(true);
    jMenuItem28.setEnabled(true);
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    jButton7.setEnabled(true);
    jMenu5.setEnabled(true);
    consultar_fornecedor.setEnabled(true);
    menu_clie.setEnabled(true);
    menu_peca.setEnabled(true);
    menu_fun.setEnabled(true);
    menu_for.setEnabled(true);
    jMenuItem37.setEnabled(true);
      }
      if(nome.getText().equals("mecanico")){
    cadastrar_clie.setEnabled(false);
    menu_clie.setEnabled(false);
    menu_peca.setEnabled(false);
    menu_fun.setEnabled(false);
    menu_for.setEnabled(false);
    cadastrar_for.setEnabled(false);
    cadastrar_fun.setEnabled(false);
    cadastrar_peca.setEnabled(false);
    jMenuItem28.setEnabled(false);
    jButton5.setEnabled(false);
    jButton6.setEnabled(false);
    jButton7.setEnabled(false);
    jMenu5.setEnabled(false);
    consultar_cliente.setEnabled(false);
    consultar_fornecedor.setEnabled(false);
    jMenuItem19.setEnabled(false);
    jMenuItem37.setEnabled(false);
      }
 else
 {
 return;
 }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        WWW = new javax.swing.JLabel();
        Label_Data1 = new javax.swing.JLabel();
        Label_hora = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        Fotu = new javax.swing.JLabel();
        consultar_cliente = new javax.swing.JButton();
        cadastrar_fun = new javax.swing.JButton();
        consultar_Peca = new javax.swing.JButton();
        consultar_fornecedor = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        consultar_OS = new javax.swing.JButton();
        cadastrar_clie = new javax.swing.JButton();
        cadastrar_peca = new javax.swing.JButton();
        cadastrar_for = new javax.swing.JButton();
        cadastrarrrr = new javax.swing.JButton();
        consultar_fornecedor1 = new javax.swing.JButton();
        consultar_fornecedor2 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        OMenuCadastro = new javax.swing.JMenu();
        menu_clie = new javax.swing.JMenuItem();
        menu_peca = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menu_fun = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menu_for = new javax.swing.JMenuItem();
        menu_orc = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem25 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem29 = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8414_16x16.png"))); // NOI18N
        jMenuItem3.setMnemonic('a');
        jMenuItem3.setText("Adcionar Novo Atalho");
        jMenuItem3.setToolTipText("Adcionar um novo atalho na tela principal");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8457_16x16.png"))); // NOI18N
        jMenuItem2.setMnemonic('m');
        jMenuItem2.setText("Mudar Protetor de Tela");
        jMenuItem2.setToolTipText("Alterar a imagen de fundo da tela principal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);
        jPopupMenu1.add(jSeparator6);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/icon_16x16_help.png"))); // NOI18N
        jMenuItem12.setMnemonic('u');
        jMenuItem12.setText("Ajuda");
        jMenuItem12.setToolTipText("Abrir menu de ajuda");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem12);
        jPopupMenu1.add(jSeparator10);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/x.png"))); // NOI18N
        jMenuItem4.setMnemonic('f');
        jMenuItem4.setText("Fechar Programa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Software Sokkyo");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        jLabel4.setText("Usuario:");

        WWW.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        WWW.setText("www.nokys.com.br");
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

        Label_Data1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        Label_Data1.setText("Data");

        Label_hora.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        Label_hora.setText("Hora");

        nome.setFont(new java.awt.Font("BankGothic Md BT", 3, 12));
        nome.setText("Admnistrador");

        Fotu.setFont(new java.awt.Font("Vijaya", 0, 1));
        Fotu.setForeground(new java.awt.Color(204, 204, 204));
        Fotu.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Label_Data1)
                .addGap(51, 51, 51)
                .addComponent(Fotu)
                .addGap(18, 18, 18)
                .addComponent(Label_hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(WWW)
                .addGap(160, 160, 160))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nome)
                .addComponent(jLabel4))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Label_Data1)
                .addComponent(Fotu, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Label_hora)
                .addComponent(WWW))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 660, 1010, 20);

        consultar_cliente.setFont(new java.awt.Font("Tahoma", 1, 11));
        consultar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/people(2).png"))); // NOI18N
        consultar_cliente.setMnemonic('N');
        consultar_cliente.setText("Consultar Cliente");
        consultar_cliente.setToolTipText("Consultar Cliente");
        consultar_cliente.setBorderPainted(false);
        consultar_cliente.setContentAreaFilled(false);
        consultar_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultar_cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_clienteActionPerformed(evt);
            }
        });
        consultar_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                consultar_clienteFocusLost(evt);
            }
        });
        getContentPane().add(consultar_cliente);
        consultar_cliente.setBounds(180, 10, 160, 60);

        cadastrar_fun.setFont(new java.awt.Font("Tahoma", 1, 11));
        cadastrar_fun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7797_32x32.png"))); // NOI18N
        cadastrar_fun.setText("Cadastrar Funcionario");
        cadastrar_fun.setToolTipText("Cadastro de Funcionario");
        cadastrar_fun.setBorderPainted(false);
        cadastrar_fun.setContentAreaFilled(false);
        cadastrar_fun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar_fun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar_fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_funActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar_fun);
        cadastrar_fun.setBounds(10, 80, 160, 60);

        consultar_Peca.setFont(new java.awt.Font("Tahoma", 1, 11));
        consultar_Peca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8404_32x32.png"))); // NOI18N
        consultar_Peca.setText("Consultar Peça");
        consultar_Peca.setToolTipText("Consultar Peça");
        consultar_Peca.setBorderPainted(false);
        consultar_Peca.setContentAreaFilled(false);
        consultar_Peca.setFocusable(false);
        consultar_Peca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultar_Peca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultar_Peca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_PecaActionPerformed(evt);
            }
        });
        getContentPane().add(consultar_Peca);
        consultar_Peca.setBounds(180, 150, 160, 60);

        consultar_fornecedor.setFont(new java.awt.Font("Tahoma", 1, 11));
        consultar_fornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7813_32x32.png"))); // NOI18N
        consultar_fornecedor.setText("Consultar Fornecedor");
        consultar_fornecedor.setToolTipText("Consultar Fornecedor");
        consultar_fornecedor.setBorderPainted(false);
        consultar_fornecedor.setContentAreaFilled(false);
        consultar_fornecedor.setFocusable(false);
        consultar_fornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultar_fornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultar_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_fornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(consultar_fornecedor);
        consultar_fornecedor.setBounds(180, 290, 160, 60);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/4970_32x32.png"))); // NOI18N
        jButton5.setText("Vender Produto");
        jButton5.setToolTipText("Venda de Peça");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 10, 150, 60);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_32x32.png"))); // NOI18N
        jButton6.setText("Venda de Serviço");
        jButton6.setToolTipText("Venda de Serviço");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(350, 80, 150, 60);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/5951_32x32.png"))); // NOI18N
        jButton7.setText("V. Prod. e Serviço");
        jButton7.setToolTipText("Venda de Serviço e Peça");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(350, 150, 150, 60);

        consultar_OS.setFont(new java.awt.Font("Tahoma", 1, 11));
        consultar_OS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_32x32.png"))); // NOI18N
        consultar_OS.setText("Consultar O.S");
        consultar_OS.setToolTipText("Consultar O.S");
        consultar_OS.setBorderPainted(false);
        consultar_OS.setContentAreaFilled(false);
        consultar_OS.setFocusable(false);
        consultar_OS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultar_OS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultar_OS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_OSActionPerformed(evt);
            }
        });
        getContentPane().add(consultar_OS);
        consultar_OS.setBounds(180, 80, 160, 60);

        cadastrar_clie.setFont(new java.awt.Font("Tahoma", 1, 11));
        cadastrar_clie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/people(2).png"))); // NOI18N
        cadastrar_clie.setMnemonic('N');
        cadastrar_clie.setText("Cadastrar Cliente");
        cadastrar_clie.setToolTipText("Novo Cadastro");
        cadastrar_clie.setBorderPainted(false);
        cadastrar_clie.setContentAreaFilled(false);
        cadastrar_clie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar_clie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar_clie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrar_clieMousePressed(evt);
            }
        });
        cadastrar_clie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_clieActionPerformed(evt);
            }
        });
        cadastrar_clie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cadastrar_clieFocusLost(evt);
            }
        });
        getContentPane().add(cadastrar_clie);
        cadastrar_clie.setBounds(10, 10, 160, 60);

        cadastrar_peca.setFont(new java.awt.Font("Tahoma", 1, 11));
        cadastrar_peca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8404_32x32.png"))); // NOI18N
        cadastrar_peca.setText("Cadastrar Peça");
        cadastrar_peca.setToolTipText("Cadastro de Peça");
        cadastrar_peca.setBorderPainted(false);
        cadastrar_peca.setContentAreaFilled(false);
        cadastrar_peca.setFocusable(false);
        cadastrar_peca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar_peca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar_peca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_pecaActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar_peca);
        cadastrar_peca.setBounds(10, 290, 160, 60);

        cadastrar_for.setFont(new java.awt.Font("Tahoma", 1, 11));
        cadastrar_for.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7837_32x32.png"))); // NOI18N
        cadastrar_for.setText("Cadastrar Fornecedor");
        cadastrar_for.setToolTipText("Cadastro de Fornecedor");
        cadastrar_for.setBorderPainted(false);
        cadastrar_for.setContentAreaFilled(false);
        cadastrar_for.setFocusable(false);
        cadastrar_for.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar_for.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_forActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar_for);
        cadastrar_for.setBounds(10, 150, 160, 60);

        cadastrarrrr.setFont(new java.awt.Font("Tahoma", 1, 11));
        cadastrarrrr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_32x32.png"))); // NOI18N
        cadastrarrrr.setText("Cadastrar O.S");
        cadastrarrrr.setToolTipText("Venda de Serviço");
        cadastrarrrr.setBorderPainted(false);
        cadastrarrrr.setContentAreaFilled(false);
        cadastrarrrr.setFocusable(false);
        cadastrarrrr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrarrrr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrarrrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarrrrActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarrrr);
        cadastrarrrr.setBounds(10, 220, 160, 60);

        consultar_fornecedor1.setFont(new java.awt.Font("Tahoma", 1, 11));
        consultar_fornecedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png"))); // NOI18N
        consultar_fornecedor1.setText("Fechar Caixa");
        consultar_fornecedor1.setToolTipText("Fechar Caixa");
        consultar_fornecedor1.setBorderPainted(false);
        consultar_fornecedor1.setContentAreaFilled(false);
        consultar_fornecedor1.setFocusable(false);
        consultar_fornecedor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultar_fornecedor1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultar_fornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_fornecedor1ActionPerformed(evt);
            }
        });
        getContentPane().add(consultar_fornecedor1);
        consultar_fornecedor1.setBounds(350, 220, 150, 60);

        consultar_fornecedor2.setFont(new java.awt.Font("Tahoma", 1, 11));
        consultar_fornecedor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1408_32x32.png"))); // NOI18N
        consultar_fornecedor2.setText("Consultar Veiculo");
        consultar_fornecedor2.setToolTipText("Consultar Veiculo");
        consultar_fornecedor2.setBorderPainted(false);
        consultar_fornecedor2.setContentAreaFilled(false);
        consultar_fornecedor2.setFocusable(false);
        consultar_fornecedor2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultar_fornecedor2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultar_fornecedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_fornecedor2ActionPerformed(evt);
            }
        });
        getContentPane().add(consultar_fornecedor2);
        consultar_fornecedor2.setBounds(180, 220, 160, 60);

        jInternalFrame1.setTitle("Lembrete");
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "nº", "Nivel"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(1).setMinWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 240));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png"))); // NOI18N
        jButton1.setText("Novo");
        jInternalFrame1.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6155_32x32.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 40));

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(750, 330, 240, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/amanecer-hd-wallpaper-1280x800.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 660);

        jMenu1.setMnemonic('A');
        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/print_icon.gif"))); // NOI18N
        jMenuItem11.setMnemonic('i');
        jMenuItem11.setText("Gerar Relatorios");
        jMenuItem11.setToolTipText("Imprimir Relatorio de Vendas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8406_16x16.png"))); // NOI18N
        jMenuItem8.setText("Copiar");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8414_16x16.png"))); // NOI18N
        jMenuItem9.setText("Colar");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/6239_16x16.png"))); // NOI18N
        jMenuItem10.setText("Excluir");
        jMenu1.add(jMenuItem10);
        jMenu1.add(jSeparator2);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/x.png"))); // NOI18N
        jMenuItem13.setMnemonic('s');
        jMenuItem13.setText("Sair");
        jMenuItem13.setToolTipText("Fechar Programa");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8457_16x16.png"))); // NOI18N
        jMenuItem1.setText("Trocar Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setMnemonic('x');
        jMenu3.setText("Exibir");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/web.png"))); // NOI18N
        jMenuItem5.setText("Desenvolvedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8457_16x16.png"))); // NOI18N
        jMenuItem6.setText("Tela Cheia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/4958_16x16.png"))); // NOI18N
        jMenuItem7.setText("Calculadora");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        OMenuCadastro.setMnemonic('c');
        OMenuCadastro.setText("Cadastro");
        OMenuCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12));

        menu_clie.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menu_clie.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu_clie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7837_16x16.png"))); // NOI18N
        menu_clie.setMnemonic('i');
        menu_clie.setText("Cliente");
        menu_clie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clieActionPerformed(evt);
            }
        });
        OMenuCadastro.add(menu_clie);

        menu_peca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menu_peca.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu_peca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8404_16x16.png"))); // NOI18N
        menu_peca.setMnemonic('e');
        menu_peca.setText("Peça");
        menu_peca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pecaActionPerformed(evt);
            }
        });
        OMenuCadastro.add(menu_peca);
        OMenuCadastro.add(jSeparator4);

        menu_fun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menu_fun.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu_fun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7797_16x16_1.png"))); // NOI18N
        menu_fun.setMnemonic('u');
        menu_fun.setText("Funcionario");
        menu_fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_funActionPerformed(evt);
            }
        });
        OMenuCadastro.add(menu_fun);
        OMenuCadastro.add(jSeparator5);

        menu_for.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menu_for.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu_for.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7813_16x16.png"))); // NOI18N
        menu_for.setMnemonic('r');
        menu_for.setText("Fornecedor");
        menu_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_forActionPerformed(evt);
            }
        });
        OMenuCadastro.add(menu_for);

        menu_orc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menu_orc.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu_orc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_16x16.png"))); // NOI18N
        menu_orc.setMnemonic('n');
        menu_orc.setText("Orçamento");
        menu_orc.setToolTipText("Cadastre um Novo Orçamento");
        menu_orc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_orcActionPerformed(evt);
            }
        });
        OMenuCadastro.add(menu_orc);

        jMenuBar1.add(OMenuCadastro);

        jMenu5.setMnemonic('v');
        jMenu5.setText("Venda");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_16x16.png"))); // NOI18N
        jMenuItem14.setMnemonic('\u00e7');
        jMenuItem14.setText("Serviço");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8404_16x16.png"))); // NOI18N
        jMenuItem15.setMnemonic('p');
        jMenuItem15.setText("Peça");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/5951_16x16.png"))); // NOI18N
        jMenuItem16.setMnemonic('s');
        jMenuItem16.setText("Produto e Serviços");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu6.setMnemonic('o');
        jMenu6.setText("Consulta");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8404_16x16.png"))); // NOI18N
        jMenuItem17.setText("Peça");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);
        jMenu6.add(jSeparator7);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1588_16x16.png"))); // NOI18N
        jMenuItem18.setMnemonic('o');
        jMenuItem18.setText("Orçamento");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem37.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7813_16x16.png"))); // NOI18N
        jMenuItem37.setMnemonic('f');
        jMenuItem37.setText("Fornecedor");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem37);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/7837_16x16.png"))); // NOI18N
        jMenuItem19.setText("Cliente");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuBar1.add(jMenu6);

        jMenu7.setMnemonic('u');
        jMenu7.setText("Utilitarios");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/tooltip.png"))); // NOI18N
        jMenu10.setText("Aparencia");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem26.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem26.setText("Acryl");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem26);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem30.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem30.setText("Acryl-Red");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem30);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem33.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem33.setMnemonic('s');
        jMenuItem33.setText("Smart");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem33);
        jMenu10.add(jSeparator15);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem34.setMnemonic('h');
        jMenuItem34.setText("Hifi");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem34);

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem35.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem35.setText("Noire");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem35);
        jMenu10.add(jSeparator14);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem36.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem36.setText("Luna");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem36);

        jMenu2.setText("Outras...");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem32.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem32.setText("NimRof(Orange)");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem32);
        jMenu2.add(jSeparator12);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem25.setText("Liquid");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem25);

        jMenu10.add(jMenu2);

        jMenu7.add(jMenu10);
        jMenu7.add(jSeparator11);

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem31.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/8457_16x16.png"))); // NOI18N
        jMenuItem31.setMnemonic('i');
        jMenuItem31.setText("Carregar Imagen de Fundo");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem31);

        jMenuBar1.add(jMenu7);

        jMenu8.setMnemonic('u');
        jMenu8.setText("Ajuda");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12));

        jMenuItem27.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem27.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/icon_16x16_help.png"))); // NOI18N
        jMenuItem27.setMnemonic('a');
        jMenuItem27.setText("Ajuda");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem27);

        jMenuItem28.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/icon.gif"))); // NOI18N
        jMenuItem28.setMnemonic('d');
        jMenuItem28.setText("Reportar");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem28);
        jMenu8.add(jSeparator8);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem29.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/16x16_smiley-wink.gif"))); // NOI18N
        jMenuItem29.setMnemonic('g');
        jMenuItem29.setText("Registrar");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem29);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1015)/2, (screenSize.height-730)/2, 1015, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clieActionPerformed
   new Cadastro_de_Clientes().show();
    }//GEN-LAST:event_menu_clieActionPerformed

    private void menu_pecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pecaActionPerformed
    new Cadastro_Peça().show();
    }//GEN-LAST:event_menu_pecaActionPerformed

    private void menu_funActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_funActionPerformed
        new Cadasto_Funcionario().show();
    }//GEN-LAST:event_menu_funActionPerformed

    private void cadastrar_funActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_funActionPerformed
       new Cadasto_Funcionario().show();
    }//GEN-LAST:event_cadastrar_funActionPerformed

    private void consultar_PecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_PecaActionPerformed
  new Consulta_Pecas().show();        // TODO add your handling code here:
    }//GEN-LAST:event_consultar_PecaActionPerformed

    private void consultar_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_fornecedorActionPerformed
 new Consulta_Fornecedor().show();
    }//GEN-LAST:event_consultar_fornecedorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 new Venda_Produto(nome.getText()).show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 new Venda_Servico().show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      new Venda_ProdServ().show();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
new com.Sokkyo.Utilitarios.Calculadora.Calculadora().show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
 setExtendedState(MAXIMIZED_BOTH);
 System.out.print(getSize().height);
 jPanel2.setSize(getSize().width,20);
jPanel2.setLocation(0, getSize().height-66);
 jLabel1.setSize(getSize().width,getSize().height-67);
 jInternalFrame1.setLocation(getSize().width-250, getSize().height-396);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
           try {
            Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe www.nokys.com.br");
        } catch (IOException ex) {
            Logger.getLogger(ControleGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
           //Multiplataforma
//           File file = new File("/caminho/nomeDoArquivo.ppt"); // arquivo a ser aberto  
//if (Desktop.isDesktopSupported()) {  
//    Desktop desktop = Desktop.getDesktop();// recebe uma instância da classe Desktop referente ao seu sistema  
//    desktop.open(file); // abre o arquivo  
//}
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void menu_forActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_forActionPerformed
 new Cadastro_Fornecedor().show();       
    }//GEN-LAST:event_menu_forActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
 new Venda_Servico().show();      
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
  new Venda_Produto(nome.getText()).show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
  new Venda_ProdServ().show();       
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
  new Consulta_Pecas().show();      
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
  new Consulta_Orcamento().show();      
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
 new Ajuda().show();    
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
         
  new Reportar().show();     
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
   try {
            Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe www.nokys.com.br/registrar");
        } catch (IOException ex) {
            Logger.getLogger(ControleGeral.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        new Consulta_Cliente().show();      
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem29ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed1
      
    }//GEN-LAST:event_jMenuItem29ActionPerformed1

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
mostra_data.le_hora();
Label_hora.setText("Hora: "+mostra_data.hora);
   
    }//GEN-LAST:event_timer1OnTime

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
L.LookAndFeelLiquid(this);
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/pinguins.jpg")));

    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
jLabel1.setIcon(new ImageIcon(""+C.ChamarImagenDeFundo(this)));
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
L.LookAndFeelNimROD(this); 
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/Wallpaper_1280x800_001_by_CCC_pictuning.jpg")));
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
L.LookAndFeelAcryRed(this);       
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
L.LookAndFeelSmart(this);
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/machhaus.jpg")));

    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
L.LookAndFeelAcry(this);
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/8686rock.jpg")));
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
      L.LookAndFeelHifi(this);
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/amanecer-hd-wallpaper-1280x800.jpeg")));
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
   L.LookAndFeelNoire(this); 
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6166anjo.jpg")));
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
      L.LookAndFeelLuna(this);
       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/10002abandonada.jpg")));
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
      new Consulta_Fornecedor().show();        
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void menu_orcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_orcActionPerformed
        new Cadastro_Orcamento().show();
    }//GEN-LAST:event_menu_orcActionPerformed

    private void WWWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseEntered
WWW.setForeground(new java.awt.Color(0, 153, 255));
    }//GEN-LAST:event_WWWMouseEntered

    private void WWWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseExited
WWW.setForeground(Color.WHITE);
    }//GEN-LAST:event_WWWMouseExited

    private void WWWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseClicked
      try {
            Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe www.nokys.com.br");
        } catch (IOException ex) {
            Logger.getLogger(ControleGeral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_WWWMouseClicked

    private void consultar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_clienteActionPerformed
   new Consulta_Cliente().show();
    }//GEN-LAST:event_consultar_clienteActionPerformed

    private void consultar_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consultar_clienteFocusLost

}//GEN-LAST:event_consultar_clienteFocusLost

    private void consultar_OSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_OSActionPerformed
  new Consulta_Orcamento().show();   
    }//GEN-LAST:event_consultar_OSActionPerformed

    private void cadastrar_clieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_clieActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_clieActionPerformed

    private void cadastrar_clieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cadastrar_clieFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_clieFocusLost

    private void cadastrar_pecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_pecaActionPerformed
     new Cadastro_Peça().show();
    }//GEN-LAST:event_cadastrar_pecaActionPerformed

    private void cadastrar_forActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_forActionPerformed
  new Cadastro_Fornecedor().show();
    }//GEN-LAST:event_cadastrar_forActionPerformed

    private void cadastrarrrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarrrrActionPerformed
 new Cadastro_Orcamento().show();        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarrrrActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 new Login().setVisible(true);
dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void consultar_fornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_fornecedor1ActionPerformed
 new Fechar_Caixa().show();
    }//GEN-LAST:event_consultar_fornecedor1ActionPerformed

    private void consultar_fornecedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_fornecedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultar_fornecedor2ActionPerformed

    private void cadastrar_clieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_clieMousePressed
new Cadastro_de_Clientes().show();
    }//GEN-LAST:event_cadastrar_clieMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
  if(evt.isPopupTrigger())
        jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
      
    }//GEN-LAST:event_formMouseReleased

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
      new Ajuda().show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
jLabel1.setIcon(new ImageIcon(""+C.ChamarImagenDeFundo(this))); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
   new CriarAtalho().show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jInternalFrame1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fotu;
    private javax.swing.JLabel Label_Data1;
    private javax.swing.JLabel Label_hora;
    public javax.swing.JMenu OMenuCadastro;
    private javax.swing.JLabel WWW;
    public javax.swing.JButton cadastrar_clie;
    public javax.swing.JButton cadastrar_for;
    public javax.swing.JButton cadastrar_fun;
    public javax.swing.JButton cadastrar_peca;
    public javax.swing.JButton cadastrarrrr;
    public javax.swing.JButton consultar_OS;
    public javax.swing.JButton consultar_Peca;
    public javax.swing.JButton consultar_cliente;
    public javax.swing.JButton consultar_fornecedor;
    public javax.swing.JButton consultar_fornecedor1;
    public javax.swing.JButton consultar_fornecedor2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    public javax.swing.JMenuItem jMenuItem14;
    public javax.swing.JMenuItem jMenuItem15;
    public javax.swing.JMenuItem jMenuItem16;
    public javax.swing.JMenuItem jMenuItem17;
    public javax.swing.JMenuItem jMenuItem18;
    public javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    public javax.swing.JMenuItem jMenuItem27;
    public javax.swing.JMenuItem jMenuItem28;
    public javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    public javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    public javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JTable jTable1;
    public javax.swing.JMenuItem menu_clie;
    public javax.swing.JMenuItem menu_for;
    public javax.swing.JMenuItem menu_fun;
    public javax.swing.JMenuItem menu_orc;
    public javax.swing.JMenuItem menu_peca;
    public javax.swing.JLabel nome;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
 

}
