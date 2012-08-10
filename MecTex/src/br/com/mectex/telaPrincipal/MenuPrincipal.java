/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuPrincipal.java
 *
 * Created on 10/08/2011, 22:46:17
 */
package br.com.mectex.telaPrincipal;



import br.com.mectex.cadastros.cliente.cadastroCliente;
import br.com.mectex.configuração.configuracao;

import br.com.mectex.login.Login;
import javax.swing.UIManager;

/**
 *
 * @author Denis
 */
public class MenuPrincipal extends javax.swing.JFrame {
   Login ob2 = new Login(this,true);
     int n = 0;
    public MenuPrincipal() {
        
        initComponents();
        setLocation(0,0);



       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Arquivo = new org.jdesktop.swingx.JXPanel();
        menu = new javax.swing.JLabel();
        logoff = new javax.swing.JLabel();
        atualizacao = new javax.swing.JLabel();
        menuconfiguracao = new javax.swing.JLabel();
        backup = new javax.swing.JLabel();
        Sair = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        Exibir = new org.jdesktop.swingx.JXPanel();
        jLabel20 = new javax.swing.JLabel();
        TelaCheia = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Cadastro = new org.jdesktop.swingx.JXPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        CadastroDeClientes = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Lançamento = new org.jdesktop.swingx.JXPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Vendas = new org.jdesktop.swingx.JXPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Relatórios = new org.jdesktop.swingx.JXPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Graficos = new org.jdesktop.swingx.JXPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Consulta = new org.jdesktop.swingx.JXPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        Utilitarios = new org.jdesktop.swingx.JXPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        Ajuda = new org.jdesktop.swingx.JXPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        grade1 = new javax.swing.JPanel();
        grade2 = new javax.swing.JPanel();
        grade3 = new javax.swing.JPanel();
        grade5 = new javax.swing.JPanel();
        gradel6 = new javax.swing.JPanel();
        gradel7 = new javax.swing.JPanel();
        grade8 = new javax.swing.JPanel();
        grade9 = new javax.swing.JPanel();
        grade4 = new javax.swing.JPanel();
        grade10 = new javax.swing.JPanel();
        grade11 = new javax.swing.JPanel();
        grade12 = new javax.swing.JPanel();
        grade13 = new javax.swing.JPanel();
        grade14 = new javax.swing.JPanel();
        grade15 = new javax.swing.JPanel();
        grade16 = new javax.swing.JPanel();
        grade17 = new javax.swing.JPanel();
        grade18 = new javax.swing.JPanel();
        grade19 = new javax.swing.JPanel();
        grade20 = new javax.swing.JPanel();
        grade21 = new javax.swing.JPanel();
        grade22 = new javax.swing.JPanel();
        grade23 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MecTex - Versão PLUS 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        Arquivo.setAlpha(0.0F);
        Arquivo.setBackground(new java.awt.Color(255, 255, 255));
        Arquivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Tahoma", 1, 11));
        menu.setForeground(new java.awt.Color(255, 51, 0));
        menu.setText("Arquivo");
        Arquivo.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        logoff.setFont(new java.awt.Font("Tahoma", 1, 12));
        logoff.setText("Fazer logoff do usuario");
        logoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoffMouseExited(evt);
            }
        });
        Arquivo.add(logoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        atualizacao.setFont(new java.awt.Font("Tahoma", 1, 12));
        atualizacao.setText("Executar atualizão manual");
        atualizacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atualizacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atualizacaoMouseExited(evt);
            }
        });
        Arquivo.add(atualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        menuconfiguracao.setFont(new java.awt.Font("Tahoma", 1, 12));
        menuconfiguracao.setText("Menu de configuração");
        menuconfiguracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuconfiguracaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuconfiguracaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuconfiguracaoMouseExited(evt);
            }
        });
        Arquivo.add(menuconfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 20));

        backup.setFont(new java.awt.Font("Tahoma", 1, 12));
        backup.setText("Fazer backup manual");
        backup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backupMouseExited(evt);
            }
        });
        Arquivo.add(backup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        Sair.setFont(new java.awt.Font("Tahoma", 1, 12));
        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairMouseExited(evt);
            }
        });
        Arquivo.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 20));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu1.png"))); // NOI18N
        Arquivo.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Arquivo.setBounds(10, 0, 70, 50);
        jDesktopPane1.add(Arquivo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Exibir.setAlpha(0.0F);
        Exibir.setBackground(new java.awt.Color(255, 255, 255));
        Exibir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jLabel20.setText("Exibir");
        Exibir.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        TelaCheia.setFont(new java.awt.Font("Tahoma", 1, 12));
        TelaCheia.setText("Tela Cheia");
        TelaCheia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelaCheiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TelaCheiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelaCheiaMouseExited(evt);
            }
        });
        Exibir.add(TelaCheia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel22.setText("Menu de notícias ");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        Exibir.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu2.png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Exibir.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 150));

        Exibir.setBounds(90, 0, 70, 50);
        jDesktopPane1.add(Exibir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cadastro.setAlpha(0.0F);
        Cadastro.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel24.setForeground(new java.awt.Color(255, 51, 0));
        jLabel24.setText("Cadastro geral");
        Cadastro.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel25.setText("Cadastro de fornecedores");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        Cadastro.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel26.setText("Cadastro de produtos");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        Cadastro.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel27.setText("Cadastro de O.S");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        Cadastro.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        CadastroDeClientes.setFont(new java.awt.Font("Tahoma", 1, 12));
        CadastroDeClientes.setText("Cadastro de clientes");
        CadastroDeClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroDeClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CadastroDeClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CadastroDeClientesMouseExited(evt);
            }
        });
        Cadastro.add(CadastroDeClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel29.setText("Cadastro de moeda");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        Cadastro.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel30.setText("Cadastro de planejamento");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });
        Cadastro.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel31.setText("Cadastro de CEP");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });
        Cadastro.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel32.setText("Cadastro de perfil ");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        Cadastro.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel33.setText("Cadastrar noticia");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        Cadastro.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel34.setText("Cadastrar alerta");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });
        Cadastro.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel37.setText("Cadastro de categoria");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        Cadastro.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu.png"))); // NOI18N
        Cadastro.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        Cadastro.setBounds(150, 0, 80, 60);
        jDesktopPane1.add(Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Lançamento.setAlpha(0.0F);
        Lançamento.setBackground(new java.awt.Color(255, 255, 255));
        Lançamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel36.setForeground(new java.awt.Color(255, 51, 0));
        jLabel36.setText("Lançamentos");
        Lançamento.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel38.setText("Contas a pagar/receber");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        Lançamento.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel39.setText("Caixa do dia-a-dia");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });
        Lançamento.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel40.setText("2º via do recibo de venda");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });
        Lançamento.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel42.setText("Emitir nota fiscal de saída");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });
        Lançamento.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel41.setText("Pedidos de venda");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        Lançamento.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu1.png"))); // NOI18N
        Lançamento.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Lançamento.setBounds(240, 0, 110, 50);
        jDesktopPane1.add(Lançamento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Vendas.setAlpha(0.0F);
        Vendas.setBackground(new java.awt.Color(255, 255, 255));
        Vendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel44.setForeground(new java.awt.Color(255, 51, 0));
        jLabel44.setText("Venda");
        Vendas.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel45.setText("Realizar venda");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel45MouseExited(evt);
            }
        });
        Vendas.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel46.setText("Fechar caixa");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });
        Vendas.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel48.setText("Iniciar turno");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel48MouseExited(evt);
            }
        });
        Vendas.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu2.png"))); // NOI18N
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Vendas.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Vendas.setBounds(360, 0, 70, 50);
        jDesktopPane1.add(Vendas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Relatórios.setAlpha(0.0F);
        Relatórios.setBackground(new java.awt.Color(255, 255, 255));
        Relatórios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel49.setForeground(new java.awt.Color(255, 51, 0));
        jLabel49.setText("Relatórios ");
        Relatórios.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, 80, 20));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel50.setText("Relatório de clientes");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });
        Relatórios.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel51.setText("Relatório de vendas");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        Relatórios.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel52.setText("Comissão de vendedor");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });
        Relatórios.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel53.setText("Balancete financeiro");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel53MouseExited(evt);
            }
        });
        Relatórios.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel54.setText("Pagamento pedentes");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });
        Relatórios.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel55.setText("Peças em estoque");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel55MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel55MouseExited(evt);
            }
        });
        Relatórios.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel56.setText("Consignação em estoque");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        Relatórios.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel57.setText("Histórico de acesso");
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel57MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
        });
        Relatórios.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel58.setText("Compras do cliente");
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel58MouseExited(evt);
            }
        });
        Relatórios.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu3.png"))); // NOI18N
        Relatórios.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Relatórios.setBounds(450, 0, 90, 50);
        jDesktopPane1.add(Relatórios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Graficos.setAlpha(0.0F);
        Graficos.setBackground(new java.awt.Color(255, 255, 255));
        Graficos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel60.setForeground(new java.awt.Color(255, 51, 0));
        jLabel60.setText("Gráficos");
        Graficos.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel61.setText("Gráfico de venda(Mensal)");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel61MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel61MouseExited(evt);
            }
        });
        Graficos.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel62.setText("Gráfico de venda(Anual)");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel62MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel62MouseExited(evt);
            }
        });
        Graficos.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel63.setText("Gráfico de faturamento");
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel63MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel63MouseExited(evt);
            }
        });
        Graficos.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel64.setText("Gráfico de inadimplência");
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel64MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel64MouseExited(evt);
            }
        });
        Graficos.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel65.setText("Melhores vendedores");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel65MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel65MouseExited(evt);
            }
        });
        Graficos.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel66.setText("10 melhores clientes");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel66MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel66MouseExited(evt);
            }
        });
        Graficos.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel68.setText("Gráfico de venda(Diaria)");
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel68MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel68MouseExited(evt);
            }
        });
        Graficos.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu4.png"))); // NOI18N
        Graficos.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Graficos.setBounds(540, 0, 110, 50);
        jDesktopPane1.add(Graficos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Consulta.setAlpha(0.0F);
        Consulta.setBackground(new java.awt.Color(255, 255, 255));
        Consulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel69.setForeground(new java.awt.Color(255, 51, 0));
        jLabel69.setText("Consulta");
        Consulta.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel70.setText("Consultar clientes");
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel70MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });
        Consulta.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel71.setText("Consultar produtos");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel71MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel71MouseExited(evt);
            }
        });
        Consulta.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel72.setText("Consultar fornecedores");
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel72MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel72MouseExited(evt);
            }
        });
        Consulta.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel73.setText("Consultar O.S");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel73MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel73MouseExited(evt);
            }
        });
        Consulta.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel74.setText("Consulta geral");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel74MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel74MouseExited(evt);
            }
        });
        Consulta.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu1.png"))); // NOI18N
        jLabel67.setText("jLabel67");
        jLabel67.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Consulta.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Consulta.setBounds(630, 0, 100, 50);
        jDesktopPane1.add(Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Utilitarios.setAlpha(0.0F);
        Utilitarios.setBackground(new java.awt.Color(255, 255, 255));
        Utilitarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel76.setForeground(new java.awt.Color(255, 51, 0));
        jLabel76.setText("Utilitários");
        Utilitarios.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel77.setText("Importar lista de preço");
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel77MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel77MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel78.setText("Criar backup personalizado");
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel78MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel78MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel79.setText("Configuração do B.D");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel79MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel79MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel80.setText("Executar atualização");
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel80MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel80MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel81.setText("Dados da empresa");
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel81MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel81MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel82.setText("Informações & Avisos");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel82MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel82MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel83.setText("Restaurar versão");
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel83MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel83MouseExited(evt);
            }
        });
        Utilitarios.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu4.png"))); // NOI18N
        Utilitarios.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        Utilitarios.setBounds(710, 0, 90, 40);
        jDesktopPane1.add(Utilitarios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Ajuda.setAlpha(0.0F);
        Ajuda.setBackground(new java.awt.Color(255, 255, 255));
        Ajuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel84.setText("Reportar email");
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel84MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel84MouseExited(evt);
            }
        });
        Ajuda.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel85.setForeground(new java.awt.Color(255, 51, 0));
        jLabel85.setText("Ajuda");
        Ajuda.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel86.setText("Sobre o MecTex");
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel86MouseExited(evt);
            }
        });
        Ajuda.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel87.setText("Contrato de uso");
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel87MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel87MouseExited(evt);
            }
        });
        Ajuda.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel88.setText("Manual de utilização ");
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel88MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel88MouseExited(evt);
            }
        });
        Ajuda.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel89.setText("Verificar atualização");
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel89MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel89MouseExited(evt);
            }
        });
        Ajuda.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Menu1.png"))); // NOI18N
        Ajuda.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Ajuda.setBounds(800, 0, 70, 50);
        jDesktopPane1.add(Ajuda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade1.setBackground(new java.awt.Color(255, 255, 255));
        grade1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade1MouseEntered(evt);
            }
        });
        grade1.setBounds(210, 0, 30, 230);
        jDesktopPane1.add(grade1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade2.setBackground(new java.awt.Color(255, 255, 255));
        grade2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade2MouseEntered(evt);
            }
        });
        grade2.setBounds(10, 230, 440, 10);
        jDesktopPane1.add(grade2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade3.setBackground(new java.awt.Color(255, 255, 255));
        grade3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade3MouseEntered(evt);
            }
        });
        grade3.setBounds(0, 0, 10, 240);
        jDesktopPane1.add(grade3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade5.setBackground(new java.awt.Color(255, 255, 255));
        grade5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade5MouseEntered(evt);
            }
        });
        grade5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade5.setBounds(290, 0, 10, 150);
        jDesktopPane1.add(grade5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gradel6.setBackground(new java.awt.Color(255, 255, 255));
        gradel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradel6MouseEntered(evt);
            }
        });
        gradel6.setBounds(80, 0, 10, 140);
        jDesktopPane1.add(gradel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gradel7.setBackground(new java.awt.Color(255, 255, 255));
        gradel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradel7MouseEntered(evt);
            }
        });
        gradel7.setBounds(530, 0, 10, 370);
        jDesktopPane1.add(gradel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade8.setBackground(new java.awt.Color(255, 255, 255));
        grade8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade8MouseEntered(evt);
            }
        });
        grade8.setBounds(140, 360, 610, 10);
        jDesktopPane1.add(grade8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade9.setBackground(new java.awt.Color(255, 255, 255));
        grade9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade9MouseEntered(evt);
            }
        });
        grade9.setBounds(140, 0, 10, 360);
        jDesktopPane1.add(grade9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade4.setBackground(new java.awt.Color(255, 255, 255));
        grade4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade4MouseEntered(evt);
            }
        });
        grade4.setBounds(80, 140, 480, 10);
        jDesktopPane1.add(grade4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade10.setBackground(new java.awt.Color(255, 255, 255));
        grade10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade10MouseEntered(evt);
            }
        });
        grade10.setBounds(440, 0, 10, 360);
        jDesktopPane1.add(grade10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade11.setBackground(new java.awt.Color(255, 255, 255));
        grade11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade11MouseEntered(evt);
            }
        });
        grade11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade11.setBounds(560, 0, 10, 150);
        jDesktopPane1.add(grade11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade12.setBackground(new java.awt.Color(255, 255, 255));
        grade12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade12MouseEntered(evt);
            }
        });
        grade12.setBounds(350, 0, 10, 140);
        jDesktopPane1.add(grade12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade13.setBackground(new java.awt.Color(255, 255, 255));
        grade13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade13MouseEntered(evt);
            }
        });
        grade13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade13.setBounds(650, 0, 10, 360);
        jDesktopPane1.add(grade13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade14.setBackground(new java.awt.Color(255, 255, 255));
        grade14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade14MouseEntered(evt);
            }
        });
        grade14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade14.setBounds(740, 0, 10, 360);
        jDesktopPane1.add(grade14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade15.setBackground(new java.awt.Color(255, 255, 255));
        grade15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade15MouseEntered(evt);
            }
        });
        grade15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade15.setBounds(830, 0, 10, 230);
        jDesktopPane1.add(grade15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade16.setBackground(new java.awt.Color(255, 255, 255));
        grade16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade16MouseEntered(evt);
            }
        });
        grade16.setBounds(630, 230, 370, 10);
        jDesktopPane1.add(grade16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade17.setBackground(new java.awt.Color(255, 255, 255));
        grade17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade17MouseEntered(evt);
            }
        });
        grade17.setBounds(620, 0, 10, 240);
        jDesktopPane1.add(grade17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade18.setBackground(new java.awt.Color(255, 255, 255));
        grade18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade18MouseEntered(evt);
            }
        });
        grade18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade18.setBounds(910, 0, 10, 320);
        jDesktopPane1.add(grade18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade19.setBackground(new java.awt.Color(255, 255, 255));
        grade19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade19MouseEntered(evt);
            }
        });
        grade19.setBounds(710, 310, 200, 10);
        jDesktopPane1.add(grade19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade20.setBackground(new java.awt.Color(255, 255, 255));
        grade20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade20MouseEntered(evt);
            }
        });
        grade20.setBounds(700, 0, 10, 320);
        jDesktopPane1.add(grade20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade21.setBackground(new java.awt.Color(255, 255, 255));
        grade21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade21MouseEntered(evt);
            }
        });
        grade21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        grade21.setBounds(540, 310, 200, 10);
        jDesktopPane1.add(grade21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade22.setBackground(new java.awt.Color(255, 255, 255));
        grade22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade22MouseEntered(evt);
            }
        });
        grade22.setBounds(1000, 0, 10, 240);
        jDesktopPane1.add(grade22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        grade23.setBackground(new java.awt.Color(255, 255, 255));
        grade23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grade23MouseEntered(evt);
            }
        });
        grade23.setBounds(790, 0, 10, 230);
        jDesktopPane1.add(grade23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        logo.setFont(new java.awt.Font("Segoe Script", 1, 79));
        logo.setForeground(new java.awt.Color(255, 51, 0));
        logo.setText("Me©tex");
        logo.setBounds(680, 550, 360, 90);
        jDesktopPane1.add(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(0, 630, 1070, 10);
        jDesktopPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel93.setText("Login: ");
        jLabel93.setBounds(10, 630, 50, 20);
        jDesktopPane1.add(jLabel93, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel94.setForeground(new java.awt.Color(255, 51, 0));
        jLabel94.setText("Administrador");
        jLabel94.setBounds(50, 630, 90, 20);
        jDesktopPane1.add(jLabel94, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jXPanel1.setAlpha(0.0F);
        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setText("Relatorio");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 60, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("Cliente");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("Consulta");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setText("Venda");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setText("Estoque");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/SubMeni.png"))); // NOI18N
        jXPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 60));

        jXPanel1.setBounds(-30, 570, 440, 60);
        jDesktopPane1.add(jXPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 50, 1200, 800);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Exibir");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, -3, 38, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastros");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, -3, 70, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lançamentos");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, -3, 92, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Relatórios");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, -3, 69, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Arquivo");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, -3, 60, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consulta");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(620, -3, 61, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vendas");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, -3, 51, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ajuda");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(800, -3, 41, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gráficos");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, -3, 55, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Utilitários");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(710, -3, 64, 40);

        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel92MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel92);
        jLabel92.setBounds(860, 0, 80, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/mectex/imagens/Barra.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1220, 50);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1080)/2, (screenSize.height-726)/2, 1080, 726);
    }// </editor-fold>//GEN-END:initComponents

private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Lançamento.setAlpha(0.0F);
Vendas.setSize(0,0);
Lançamento.setSize(0,0);
Relatórios.setSize(0,0);
Relatórios.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Arquivo.setAlpha(1.0F);
Arquivo.setSize(197, 226);
Graficos.setAlpha(0.0F);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Graficos.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate(); 
}//GEN-LAST:event_jLabel2MouseEntered

private void grade1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade1MouseEntered
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
 Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
this.repaint();  
}//GEN-LAST:event_grade1MouseEntered

private void grade2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade2MouseEntered

    Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
 Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);

this.repaint();  
}//GEN-LAST:event_grade2MouseEntered

private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
    Arquivo.setAlpha(0.0F);
    Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Arquivo.setSize(0,0);
Exibir.setAlpha(1.0F);
Exibir.setSize(200, 142);
Relatórios.setSize(0,0);
Relatórios.setSize(0,0);
Vendas.setSize(0,0);
Vendas.setSize(0,0);
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
 Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate(); 
}//GEN-LAST:event_jLabel3MouseEntered

private void gradel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradel6MouseEntered
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
this.repaint();
}//GEN-LAST:event_gradel6MouseEntered

private void grade4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade4MouseEntered

    Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
  Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade4MouseEntered

private void grade5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade5MouseEntered
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade5MouseEntered

private void grade3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade3MouseEntered
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
this.repaint();  
}//GEN-LAST:event_grade3MouseEntered

private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
 Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setAlpha(1.0F);
Cadastro.setSize(380, 360);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
Vendas.setSize(0,0);
Relatórios.setSize(0,0);
Graficos.setSize(0,0);
Graficos.setAlpha(0.0F);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate(); 
}//GEN-LAST:event_jLabel4MouseEntered

private void gradel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradel7MouseEntered
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);

this.repaint();
}//GEN-LAST:event_gradel7MouseEntered

private void grade8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade8MouseEntered
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
 Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
 Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);
Graficos.setSize(0,0);
Graficos.setAlpha(0.0F);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade8MouseEntered

private void grade9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade9MouseEntered
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade9MouseEntered

private void grade10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade10MouseEntered
 Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
 Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade10MouseEntered

private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
Exibir.setAlpha(0.0F);
Cadastro.setAlpha(0.0F);
Lançamento.setAlpha(0.0F);
Vendas.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setSize(0,0);
Exibir.setSize(0,0);
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
Relatórios.setSize(0,0);
Vendas.setSize(0,0);
Lançamento.setAlpha(1.0F);
Lançamento.setSize(199, 228);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
 Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate(); 
}//GEN-LAST:event_jLabel5MouseEntered

private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Vendas.setAlpha(1.0F);
Vendas.setSize(200, 142);
Relatórios.setAlpha(0.0F);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
Relatórios.setSize(0,0);
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate(); 
}//GEN-LAST:event_jLabel8MouseEntered

private void grade11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade11MouseEntered
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade11MouseEntered

private void grade12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade12MouseEntered
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade12MouseEntered

private void grade13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade13MouseEntered
 Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade13MouseEntered

private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
 Relatórios.setAlpha(1.0F);
 Relatórios.setSize(200, 360);
Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate(); 
}//GEN-LAST:event_jLabel6MouseEntered

private void grade14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade14MouseEntered
Graficos.setSize(0,0);
Graficos.setAlpha(0.0F);
this.repaint();
}//GEN-LAST:event_grade14MouseEntered

private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
 Graficos.setAlpha(1.0F);
 Graficos.setSize(200, 310);
 Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate();
}//GEN-LAST:event_jLabel10MouseEntered

private void grade17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade17MouseEntered
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade17MouseEntered

private void grade16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade16MouseEntered
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);


this.repaint();
}//GEN-LAST:event_grade16MouseEntered

private void grade15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade15MouseEntered
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
this.repaint();
}//GEN-LAST:event_grade15MouseEntered

private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
Utilitarios.setAlpha(0.0F);
 Utilitarios.setSize(0,0);
 Consulta.setAlpha(1.0F);
 Consulta.setSize(200, 230);
Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint();  
this.validate();
}//GEN-LAST:event_jLabel7MouseEntered

private void grade18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade18MouseEntered
Utilitarios.setAlpha(0.0F);
Utilitarios.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade18MouseEntered

private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
 Utilitarios.setAlpha(1.0F);
 Utilitarios.setSize(200, 310);
 Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);

this.repaint();  
this.validate();
}//GEN-LAST:event_jLabel11MouseEntered

private void grade19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade19MouseEntered
Utilitarios.setAlpha(0.0F);
Utilitarios.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade19MouseEntered

private void grade20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade20MouseEntered
Utilitarios.setAlpha(0.0F);
Utilitarios.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade20MouseEntered

private void grade21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade21MouseEntered
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade21MouseEntered

private void grade23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade23MouseEntered
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade23MouseEntered

private void grade22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade22MouseEntered
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);

this.repaint();
}//GEN-LAST:event_grade22MouseEntered

private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered


Consulta.setAlpha(0.0F);
Consulta.setSize(0,0);
Utilitarios.setAlpha(0.0F);
Utilitarios.setSize(0,0);
 Ajuda.setAlpha(1.0F);
 Ajuda.setSize(200, 233);
Lançamento.setAlpha(0.0F);
Lançamento.setSize(0,0);
Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
Exibir.setAlpha(0.0F);
Exibir.setSize(0,0);
Arquivo.setAlpha(0.0F);
Arquivo.setSize(0,0);
Relatórios.setAlpha(0.0F);
Relatórios.setSize(0,0);
Vendas.setAlpha(0.0F);
Vendas.setSize(0,0);
Graficos.setAlpha(0.0F);
Graficos.setSize(0,0);
this.repaint();  
this.validate();
}//GEN-LAST:event_jLabel9MouseEntered

private void jLabel92MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseEntered
Ajuda.setAlpha(0.0F);
Ajuda.setSize(0,0);
this.repaint(); 
}//GEN-LAST:event_jLabel92MouseEntered

private void menuconfiguracaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuconfiguracaoMouseEntered
menuconfiguracao.setForeground(new java.awt.Color(255, 51, 0));

}//GEN-LAST:event_menuconfiguracaoMouseEntered

private void menuconfiguracaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuconfiguracaoMouseExited
menuconfiguracao.setForeground(new java.awt.Color(0, 0, 0));

}//GEN-LAST:event_menuconfiguracaoMouseExited

private void SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseEntered
Sair.setForeground(new java.awt.Color(255, 51, 0));

}//GEN-LAST:event_SairMouseEntered

private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
Sair.setForeground(new java.awt.Color(0, 0, 0));

}//GEN-LAST:event_SairMouseExited

private void atualizacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizacaoMouseEntered
atualizacao.setForeground(new java.awt.Color(255, 51, 0));

}//GEN-LAST:event_atualizacaoMouseEntered

private void atualizacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizacaoMouseExited
atualizacao.setForeground(new java.awt.Color(0,0, 0));

}//GEN-LAST:event_atualizacaoMouseExited

private void backupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupMouseEntered
backup.setForeground(new java.awt.Color(255, 51, 0));

}//GEN-LAST:event_backupMouseEntered

private void backupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupMouseExited
backup.setForeground(new java.awt.Color(0, 0, 0));

}//GEN-LAST:event_backupMouseExited

private void TelaCheiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaCheiaMouseEntered
TelaCheia.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_TelaCheiaMouseEntered

private void TelaCheiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaCheiaMouseExited
TelaCheia.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_TelaCheiaMouseExited

private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
jLabel22.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel22MouseEntered

private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
jLabel22.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel22MouseExited

private void logoffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoffMouseEntered
logoff.setForeground(new java.awt.Color(255, 51, 0));

}//GEN-LAST:event_logoffMouseEntered

private void logoffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoffMouseExited
logoff.setForeground(new java.awt.Color(0, 0, 0));

}//GEN-LAST:event_logoffMouseExited

private void jLabel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseEntered
jLabel45.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel45MouseEntered

private void jLabel45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseExited
jLabel45.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel45MouseExited

private void jLabel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseEntered
jLabel46.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel46MouseEntered

private void jLabel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseEntered
jLabel48.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel48MouseEntered

private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
jLabel46.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel46MouseExited

private void jLabel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseExited
jLabel48.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel48MouseExited

private void jLabel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseEntered
jLabel84.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel84MouseEntered

private void jLabel84MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseExited
jLabel84.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel84MouseExited

private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
jLabel86.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel86MouseEntered

private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
jLabel86.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel86MouseExited

private void jLabel87MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseEntered
jLabel87.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel87MouseEntered

private void jLabel87MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseExited
jLabel87.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel87MouseExited

private void jLabel88MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseEntered
jLabel88.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel88MouseEntered

private void jLabel88MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseExited
jLabel88.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel88MouseExited

private void jLabel89MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseEntered
jLabel89.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel89MouseEntered

private void jLabel89MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseExited
jLabel89.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel89MouseExited

private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
jLabel25.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel25MouseEntered

private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
jLabel25.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel25MouseExited

private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
jLabel26.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel26MouseEntered

private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
jLabel27.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel27MouseEntered

private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
jLabel26.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel26MouseExited

private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
jLabel27.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel27MouseExited

private void CadastroDeClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroDeClientesMouseEntered
CadastroDeClientes.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_CadastroDeClientesMouseEntered

private void CadastroDeClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroDeClientesMouseExited
CadastroDeClientes.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_CadastroDeClientesMouseExited

private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
jLabel29.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel29MouseEntered

private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
jLabel29.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel29MouseExited

private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
jLabel30.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel30MouseEntered

private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
jLabel30.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel30MouseExited

private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
jLabel31.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel31MouseEntered

private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
jLabel31.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel31MouseExited

private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
jLabel32.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel32MouseEntered

private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
jLabel32.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel32MouseExited

private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
jLabel33.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel33MouseEntered

private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
jLabel33.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel33MouseExited

private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
jLabel34.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel34MouseEntered

private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
jLabel34.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel34MouseExited

private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
jLabel37.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel37MouseEntered

private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
jLabel37.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel37MouseExited

private void jLabel77MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseEntered
jLabel77.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel77MouseEntered

private void jLabel77MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseExited
jLabel77.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel77MouseExited

private void jLabel78MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseEntered
jLabel78.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel78MouseEntered

private void jLabel78MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseExited
jLabel78.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel78MouseExited

private void jLabel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseEntered
jLabel79.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel79MouseEntered

private void jLabel79MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseExited
jLabel79.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel79MouseExited

private void jLabel80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseEntered
jLabel80.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel80MouseEntered

private void jLabel80MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseExited
jLabel80.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel80MouseExited

private void jLabel81MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseEntered
jLabel81.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel81MouseEntered

private void jLabel81MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseExited
jLabel81.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel81MouseExited

private void jLabel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseEntered
jLabel82.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel82MouseEntered

private void jLabel82MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseExited
jLabel82.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel82MouseExited

private void jLabel83MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseEntered
jLabel83.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel83MouseEntered

private void jLabel83MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseExited
jLabel83.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel83MouseExited

private void jLabel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseEntered
jLabel70.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel70MouseEntered

private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
jLabel70.setForeground(new java.awt.Color(0, 0, 0));
}//GEN-LAST:event_jLabel70MouseExited

private void jLabel71MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseEntered
jLabel71.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel71MouseEntered

private void jLabel71MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseExited
jLabel71.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel71MouseExited

private void jLabel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseEntered
jLabel72.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel72MouseEntered

private void jLabel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseExited
jLabel72.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel72MouseExited

private void jLabel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseEntered
jLabel73.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel73MouseEntered

private void jLabel73MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseExited
jLabel73.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel73MouseExited

private void jLabel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseEntered
jLabel74.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel74MouseEntered

private void jLabel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseExited
jLabel74.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel74MouseExited

private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
jLabel38.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel38MouseEntered

private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
jLabel38.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel38MouseExited

private void jLabel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseEntered
jLabel39.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel39MouseEntered

private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
jLabel39.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel39MouseExited

private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
jLabel40.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel40MouseEntered

private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
jLabel40.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel40MouseExited

private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
jLabel42.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel42MouseEntered

private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
jLabel42.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel42MouseExited

private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
jLabel41.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel41MouseEntered

private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
jLabel41.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel41MouseExited

private void jLabel61MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseEntered
jLabel61.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel61MouseEntered

private void jLabel62MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseEntered
jLabel62.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel62MouseEntered

private void jLabel63MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseEntered
jLabel63.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel63MouseEntered

private void jLabel64MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseEntered
jLabel64.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel64MouseEntered

private void jLabel65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseEntered
jLabel65.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel65MouseEntered

private void jLabel66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseEntered
jLabel66.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel66MouseEntered

private void jLabel68MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseEntered
jLabel68.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel68MouseEntered

private void jLabel61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseExited
jLabel61.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel61MouseExited

private void jLabel62MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseExited
jLabel62.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel62MouseExited

private void jLabel63MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseExited
jLabel63.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel63MouseExited

private void jLabel64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseExited
jLabel64.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel64MouseExited

private void jLabel65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseExited
jLabel65.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel65MouseExited

private void jLabel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseExited
jLabel66.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel66MouseExited

private void jLabel68MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseExited
jLabel68.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel68MouseExited

private void jLabel50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseEntered
jLabel50.setForeground(new java.awt.Color(255, 51, 0));
}//GEN-LAST:event_jLabel50MouseEntered

private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
jLabel50.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel50MouseExited

private void jLabel51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseEntered
jLabel51.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel51MouseEntered

private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
jLabel51.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel51MouseExited

private void jLabel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseEntered
jLabel52.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel52MouseEntered

private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
jLabel52.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel52MouseExited

private void jLabel53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseEntered
jLabel53.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel53MouseEntered

private void jLabel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseExited
jLabel53.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel53MouseExited

private void jLabel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseEntered
jLabel54.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel54MouseEntered

private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
jLabel54.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel54MouseExited

private void jLabel55MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseEntered
jLabel55.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel55MouseEntered

private void jLabel55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseExited
jLabel55.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel55MouseExited

private void jLabel56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseEntered
jLabel56.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel56MouseEntered

private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
jLabel56.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel56MouseExited

private void jLabel57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseEntered
jLabel57.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel57MouseEntered

private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
jLabel57.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel57MouseExited

private void jLabel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseEntered
jLabel58.setForeground(new java.awt.Color(255, 51, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel58MouseEntered

private void jLabel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseExited
jLabel58.setForeground(new java.awt.Color(0, 0, 0));// TODO add your handling code here:
}//GEN-LAST:event_jLabel58MouseExited

private void menuconfiguracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuconfiguracaoMouseClicked

configuracao o = new configuracao(this,true);
o.setLocationRelativeTo(null);  
//        o.setAlwaysOnTop(true); //Janela sempre a frente  
        //login.setModal(true); //  
 o.setVisible(true); 
}//GEN-LAST:event_menuconfiguracaoMouseClicked

private void CadastroDeClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroDeClientesMouseClicked
 Cadastro.setAlpha(0.0F);
Cadastro.setSize(0,0);
    cadastroCliente ob = new cadastroCliente(this,true);
ob.setLocationRelativeTo(null);  
//        o.setAlwaysOnTop(true); //Janela sempre a frente  
        //login.setModal(true); //  
 ob.setVisible(true);

}//GEN-LAST:event_CadastroDeClientesMouseClicked

private void TelaCheiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaCheiaMouseClicked
    setExtendedState(MAXIMIZED_BOTH);
//    setUndecorated(true);
 this.repaint();
 this.validate();
 jDesktopPane1.setSize(getSize().width+1650,getSize().height+1650);
jSeparator1.setLocation(0, getSize().height-95);
jSeparator1.setSize(2000,10); 
jLabel1.setSize(2000,50);
 logo.setLocation(getSize().width-360,getSize().height-173);
jLabel93.setLocation(3, getSize().height-94);
jLabel94.setLocation(39, getSize().height-94);


}//GEN-LAST:event_TelaCheiaMouseClicked

private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
System.exit(0);
}//GEN-LAST:event_SairMouseClicked


    public static void main(String args[]) {
       
         try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch(Exception e) {
      System.out.println("Error setting native LAF: " + e);
    }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXPanel Ajuda;
    private org.jdesktop.swingx.JXPanel Arquivo;
    private org.jdesktop.swingx.JXPanel Cadastro;
    private javax.swing.JLabel CadastroDeClientes;
    private org.jdesktop.swingx.JXPanel Consulta;
    private org.jdesktop.swingx.JXPanel Exibir;
    private org.jdesktop.swingx.JXPanel Graficos;
    private org.jdesktop.swingx.JXPanel Lançamento;
    private org.jdesktop.swingx.JXPanel Relatórios;
    private javax.swing.JLabel Sair;
    private javax.swing.JLabel TelaCheia;
    private org.jdesktop.swingx.JXPanel Utilitarios;
    private org.jdesktop.swingx.JXPanel Vendas;
    private javax.swing.JLabel atualizacao;
    private javax.swing.JLabel backup;
    private javax.swing.JLabel fundo;
    private javax.swing.JPanel grade1;
    private javax.swing.JPanel grade10;
    private javax.swing.JPanel grade11;
    private javax.swing.JPanel grade12;
    private javax.swing.JPanel grade13;
    private javax.swing.JPanel grade14;
    private javax.swing.JPanel grade15;
    private javax.swing.JPanel grade16;
    private javax.swing.JPanel grade17;
    private javax.swing.JPanel grade18;
    private javax.swing.JPanel grade19;
    private javax.swing.JPanel grade2;
    private javax.swing.JPanel grade20;
    private javax.swing.JPanel grade21;
    private javax.swing.JPanel grade22;
    private javax.swing.JPanel grade23;
    private javax.swing.JPanel grade3;
    private javax.swing.JPanel grade4;
    private javax.swing.JPanel grade5;
    private javax.swing.JPanel grade8;
    private javax.swing.JPanel grade9;
    private javax.swing.JPanel gradel6;
    private javax.swing.JPanel gradel7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoff;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menuconfiguracao;
    // End of variables declaration//GEN-END:variables
}
