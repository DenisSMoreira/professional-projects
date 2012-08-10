

package com.Sokkyo.Cadastros;
import com.Sokkyo.Consulta.Consulta_Pecas;
import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public final class Cadastro_Peça extends javax.swing.JFrame {


public int navega = 0; //Variavel para Saber qual botao é o que ta dando problema
Conexão softwaresokkyo;
double total, precoVenda,outro,porce2;
String porce;


    public Cadastro_Peça() {
        initComponents();
        softwaresokkyo = new Conexão();
        softwaresokkyo.conecta();
      try{
PreencherDados();
calcularNumero();
 softwaresokkyo.resultset.first();
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

        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pqtd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        plocaliza = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pcp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnome = new javax.swing.JTextField();
        fornecedor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cf = new javax.swing.JTextField();
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
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        numerodecliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BuscaProduto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        BuscarCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Peças");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/fechar_32x32.png"))); // NOI18N
        jButton14.setMnemonic('s');
        jButton14.setText(" Sair");
        jButton14.setToolTipText("Sair do Menu Cadastro");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 11, 110, 40));

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/12594410.png"))); // NOI18N
        jButton13.setMnemonic('x');
        jButton13.setText(" Excluir");
        jButton13.setToolTipText("Excluir Cadastro");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 110, 40));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/gtk_edit.png"))); // NOI18N
        jButton9.setMnemonic('E');
        jButton9.setText(" Editar");
        jButton9.setToolTipText("Editar o Cadastro");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 11, 110, 40));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/4970_32x32.png"))); // NOI18N
        jButton15.setMnemonic('N');
        jButton15.setText(" Novo");
        jButton15.setToolTipText("Novo Cadastro");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 100, 40));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/6155_32x32.png"))); // NOI18N
        jButton16.setMnemonic('c');
        jButton16.setText(" Cancelar");
        jButton16.setToolTipText("Cancelar Cadastro de Cliente");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 135, 130, 40));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/ok-32x32.png"))); // NOI18N
        jButton17.setText(" Confirmar");
        jButton17.setToolTipText("Confirmar cadastro de Cliente");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 85, 130, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Peça", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pqtd.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel1.add(pqtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 90, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel14.setText("Preço");
        jLabel14.setToolTipText("Preço de Venda");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 40, 20));

        plocaliza.setFont(new java.awt.Font("Tahoma", 1, 12));
        plocaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plocalizaActionPerformed(evt);
            }
        });
        jPanel1.add(plocaliza, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 80, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel13.setText("Localizao");
        jLabel13.setToolTipText("Local onde Está Guardada Ex: Sessao x , Prateleira y");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, 20));

        pcp.setFont(new java.awt.Font("Tahoma", 1, 12));
        pcp.setNextFocusableComponent(pqtd);
        pcp.setRequestFocusEnabled(false);
        pcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcpActionPerformed(evt);
            }
        });
        jPanel1.add(pcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 80, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel10.setText("Codigo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 40, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel12.setText("Quantidade");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 20));

        pnome.setFont(new java.awt.Font("Tahoma", 1, 12));
        pnome.setNextFocusableComponent(pqtd);
        jPanel1.add(pnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 20));

        fornecedor.setFont(new java.awt.Font("Tahoma", 1, 12));
        fornecedor.setToolTipText("Digite o exatamente o nome do Fornecedor que procura !");
        fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel16.setText("Codigo ");
        jLabel16.setToolTipText("Local onde Está Guardada Ex: Sessao x , Prateleira y");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 50, 20));

        cf.setFont(new java.awt.Font("Tahoma", 1, 12));
        cf.setRequestFocusEnabled(false);
        cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfActionPerformed(evt);
            }
        });
        jPanel1.add(cf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 80, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Estoque Minimo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 90, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Valor para Venda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, 20));

        pdiscri.setColumns(20);
        pdiscri.setFont(new java.awt.Font("Tahoma", 1, 12));
        pdiscri.setRows(5);
        jScrollPane2.setViewportView(pdiscri);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 500, 80));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("Descriçao");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        porcentagem.setFont(new java.awt.Font("Tahoma", 1, 11));
        porcentagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "200", "300", "400", "500", "600", "700", "800", "900", "1000", "Outro" }));
        porcentagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                porcentagemItemStateChanged(evt);
            }
        });
        jPanel1.add(porcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 50, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("  %");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 30, 20));

        valorVenda.setFont(new java.awt.Font("Tahoma", 1, 12));
        valorVenda.setText(null);
        jPanel1.add(valorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 80, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("% para Venda !");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 20));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 510, 110));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel6.setText("Fornecedor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        estoqueMinimo.setFont(new java.awt.Font("Tahoma", 1, 12));
        estoqueMinimo.setText(null);
        jPanel1.add(estoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 80, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel18.setText("Produto");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        Anterior1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Anterior1.setForeground(new java.awt.Color(153, 153, 153));
        Anterior1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/anterior_32x32.png"))); // NOI18N
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
        jPanel1.add(Anterior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 40, -1));

        Primeiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
        jPanel1.add(Primeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 40, -1));

        Proximo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Proximo1.setForeground(new java.awt.Color(153, 153, 153));
        Proximo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/proximo_32x32.png"))); // NOI18N
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
        jPanel1.add(Proximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 40, -1));

        Ultimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
        jPanel1.add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 40, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/icon_16x16_help.png"))); // NOI18N
        jLabel7.setToolTipText("Buscar Fornecedor só com as Primeiras Iniciais dele!");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 30, 20));

        ppreço.setFont(new java.awt.Font("Tahoma", 1, 12));
        jPanel1.add(ppreço, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 530, 450));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/1408_32x32.png"))); // NOI18N
        jButton11.setText("Pesquisar");
        jButton11.setToolTipText("Efetuar Busca de Peça");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 181, 130, -1));

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
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 0, 110, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 603, 710, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Peça", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel11.setText("Nome do produto");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 20));

        BuscaProduto.setFont(new java.awt.Font("Tahoma", 1, 11));
        BuscaProduto.setToolTipText("Digite o exatamente o nome da peça que procura !");
        BuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(BuscaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel19.setText("Codigo");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 50, 20));

        BuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12));
        BuscarCodigo.setNextFocusableComponent(pqtd);
        BuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(BuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 80, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/icon_16x16_help.png"))); // NOI18N
        jLabel9.setToolTipText("Buscar Peça só com as Primeiras Iniciais de peça");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 20, 20, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/LogoNoky.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -20, 380, 350));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-701)/2, (screenSize.height-650)/2, 701, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void plocalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plocalizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plocalizaActionPerformed

    private void pcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcpActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
new Consulta_Pecas().show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfActionPerformed

    private void porcentagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_porcentagemItemStateChanged
   if (ppreço.getText().equals("")){
       JOptionPane.showMessageDialog(null,"Por Favor Digite um Preço !");
       return;
   }
    if(porcentagem.getSelectedItem().equals("Outro")){
    setoutro(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Porcentagem desejada: %")));
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

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
dispose();
}//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       try{
        String sql ="select * FROM softwaresokkyo.cadastro_peca WHERE `cadastroProd` = "+pcp.getText();
softwaresokkyo.executeSQL(sql);
softwaresokkyo.resultset.first();
String nome = "Tem Certeza que gostaria de Deletar a Peça:  "+softwaresokkyo.resultset.getString("cadastroProdnome")+" ?";
int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome," Exclusão",JOptionPane.YES_NO_OPTION);

if ( opcao_escolhida == JOptionPane.YES_OPTION){

sql = "DELETE FROM softwaresokkyo.cadastro_peca WHERE `cadastroProd` = "+pcp.getText();
int conseguiu_excluir = softwaresokkyo.statement.executeUpdate(sql);
if (conseguiu_excluir == 1){

JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso! ");
 PreencherDados();
 calcularNumero();
 softwaresokkyo.resultset.first();
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
}//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     try{
    String sql = "UPDATE softwaresokkyo.cadastro_peca SET `cadastroProdnome` = '"+pnome.getText()+"', `cadastroProd_qtd` = '"+pqtd.getText()+"', `cadastroProd_preco` = '"+ppreço.getText()+"', `cadastroProd_local` =  '"+plocaliza.getText()+"', `cadastroProd_fornecedor` = '"+fornecedor.getText()+"', `cadastroProd_descri` = '"+pdiscri.getText()+"', cadastro_cf = '"+cf.getText()+"', `porcentagemVenda` = '"+porcentagem.getSelectedItem()+"', `valorVenda` = '"+valorVenda.getText()+"',`estoqueMinimo` = '"+estoqueMinimo.getText()+"' WHERE `cadastroProd` = "+pcp.getText();
 softwaresokkyo.statement.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Alteraçao realizada com sucesso!");
 PreencherDados();
 softwaresokkyo.resultset.first();
 mostrar_dados();
 navega = 1;
  
}

catch (SQLException erro)
{
JOptionPane.showMessageDialog(null,"Erro a Tentar Alterar o registro..");
        }
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       pnome.setText(String.valueOf(""));
        pcp.setText(String.valueOf(""));
        pqtd.setText(String.valueOf(""));
        ppreço.setText(String.valueOf(""));
        plocaliza.setText(String.valueOf(""));
        pdiscri.setText(String.valueOf(""));
        fornecedor.setText(String.valueOf(""));
        cf.setText("");
        estoqueMinimo.setText("");
        valorVenda.setText("");
}//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
     try {
 String sqlinsert ="INSERT INTO cadastro_peca(cadastroProdnome,cadastroProd_qtd,cadastroProd_preco,cadastroProd_local,cadastroProd_fornecedor,cadastroProd_descri, cadastro_cf, porcentagemVenda, valorVenda, estoqueMinimo ) values ('"+pnome.getText()+"','"+pqtd.getText()+"','"+ppreço.getText()+"','"+plocaliza.getText()+"','"+fornecedor.getText()+"','"+pdiscri.getText()+"','"+cf.getText()+"','"+porcentagem.getSelectedItem()+"','"+valorVenda.getText()+"','"+estoqueMinimo.getText()+"')";
softwaresokkyo.statement.executeUpdate(sqlinsert);
JOptionPane.showMessageDialog(null,"Peça Cadastrada Com Sucesso!");
softwaresokkyo.executeSQL("select * from cadastro_peca");
 PreencherDados();
 calcularNumero();
 softwaresokkyo.resultset.last();
 mostrar_dados();
 navega = 2;

}

 catch(SQLException erros){
     JOptionPane.showMessageDialog(null,"Erro Ao Gravar Dados! Por Favor Digite Novamente:  "+erros);
 }
}//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void BuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaProdutoActionPerformed
   softwaresokkyo.executeSQL("select * from cadastro_peca");
        if (BuscaProduto.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Digite o Nome Do Cliente Desejado!");
return;
        }

        try	{

softwaresokkyo.resultset.first();

String igual ="n";


while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastroProdnome");

if(pesquisando.equals(BuscaProduto.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}


	pcp.setText(softwaresokkyo.resultset.getString("cadastroProd"));
	mostrar_dados();
      

}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
}


    }//GEN-LAST:event_BuscaProdutoActionPerformed

    private void Anterior1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anterior1MouseEntered

}//GEN-LAST:event_Anterior1MouseEntered

    private void Anterior1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anterior1MouseExited

}//GEN-LAST:event_Anterior1MouseExited

    private void Anterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior1ActionPerformed
        try{
                softwaresokkyo.resultset.previous();
               mostrar_dados();

               navega = 1;
            }
            catch(SQLException erro){
              JOptionPane.showMessageDialog(null,"Nao Foi Possivel ir para o Registro Anterior"+erro);
            }
    }//GEN-LAST:event_Anterior1ActionPerformed

    private void PrimeiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimeiroMouseEntered

}//GEN-LAST:event_PrimeiroMouseEntered

    private void PrimeiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimeiroMouseExited
  
}//GEN-LAST:event_PrimeiroMouseExited

    private void PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeiroActionPerformed
      try{
            softwaresokkyo.resultset.first();
            mostrar_dados();
 navega = 1;

        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Nao localizou dados: "+erro);
        }
}//GEN-LAST:event_PrimeiroActionPerformed

    private void Proximo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proximo1MouseEntered

}//GEN-LAST:event_Proximo1MouseEntered

    private void Proximo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proximo1MouseExited

}//GEN-LAST:event_Proximo1MouseExited

    private void Proximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proximo1ActionPerformed
    try{
                softwaresokkyo.resultset.next();
                mostrar_dados();
                navega =2;
            }
            catch(SQLException erro){
              
            }
    }//GEN-LAST:event_Proximo1ActionPerformed

    private void UltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltimoMouseEntered

}//GEN-LAST:event_UltimoMouseEntered

    private void UltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltimoMouseExited

}//GEN-LAST:event_UltimoMouseExited

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
          try{
            softwaresokkyo.resultset.last();
            mostrar_dados();
 navega = 2;
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Nao localizou dados: "+erro);
        }
}//GEN-LAST:event_UltimoActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
softwaresokkyo.executeSQL("select * from cadastro_fornecedor");
        if (fornecedor.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Digite o Nome Do Cliente Desejado!");
return;
}
else



        try	{

softwaresokkyo.resultset.first();

String igual ="n";

while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastroFor_nome");

if(pesquisando.equals(fornecedor.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}


	cf.setText(softwaresokkyo.resultset.getString("cadastroFor_codig"));
        fornecedor.setText(softwaresokkyo.resultset.getString("cadastroFor_nome"));
	PreencherDados();
        softwaresokkyo.executeSQL("select * from cadastro_peca");


}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
}

    }//GEN-LAST:event_jLabel7MouseClicked

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
      softwaresokkyo.executeSQL("select * from cadastro_fornecedor");
        if (fornecedor.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Digite o Nome Do Cliente Desejado!");
return;
}
else



        try	{

softwaresokkyo.resultset.first();

String igual ="n";

int tamanho_pesquisa = fornecedor.getText().length();

while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastroFor_nome").substring(0,(tamanho_pesquisa));

if(pesquisando.equals(fornecedor.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}


	cf.setText(softwaresokkyo.resultset.getString("cadastroFor_codig"));
        fornecedor.setText(softwaresokkyo.resultset.getString("cadastroFor_nome"));
	PreencherDados();
         softwaresokkyo.executeSQL("select * from cadastro_peca");

}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
}
    }//GEN-LAST:event_fornecedorActionPerformed

    private void BuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCodigoActionPerformed
 softwaresokkyo.executeSQL("select * from cadastro_peca");
        if (BuscarCodigo.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Digite o Codigo da Peça");
          return;
        }

        try	{

softwaresokkyo.resultset.first();

String igual ="n";

while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastroProd");

if(pesquisando.equals(BuscarCodigo.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}
	pcp.setText(softwaresokkyo.resultset.getString("cadastroProd"));
	mostrar_dados();

}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados !");
}

    }//GEN-LAST:event_BuscarCodigoActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       softwaresokkyo.executeSQL("select * from cadastro_peca");
        if (BuscaProduto.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Por Favor Digite o Nome Do Cliente Desejado!");
return;
        }

        try	{

softwaresokkyo.resultset.first();

String igual ="n";

int tamanho_pesquisa = BuscaProduto.getText().length();

while ( igual == "n")
{

String pesquisando = softwaresokkyo.resultset.getString("cadastroProdnome").substring(0,(tamanho_pesquisa));

if(pesquisando.equals(BuscaProduto.getText()))

{
igual = "s";
}

else

softwaresokkyo.resultset.next();

}


	pcp.setText(softwaresokkyo.resultset.getString("cadastroProd"));
	mostrar_dados();


}
	catch(SQLException erro)
{
JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
}
    }//GEN-LAST:event_jLabel9MouseClicked





    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        
            public void run() {
                new Cadastro_Peça().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior1;
    private javax.swing.JTextField BuscaProduto;
    private javax.swing.JTextField BuscarCodigo;
    private javax.swing.JButton Primeiro;
    private javax.swing.JButton Proximo1;
    private javax.swing.JButton Ultimo;
    private javax.swing.JTextField cf;
    private javax.swing.JTextField estoqueMinimo;
    private javax.swing.JTextField fornecedor;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numerodecliente;
    private javax.swing.JTextField pcp;
    private javax.swing.JTextArea pdiscri;
    private javax.swing.JTextField plocaliza;
    private javax.swing.JTextField pnome;
    private javax.swing.JComboBox porcentagem;
    private javax.swing.JTextField ppreço;
    private javax.swing.JTextField pqtd;
    private javax.swing.JTextField valorVenda;
    // End of variables declaration//GEN-END:variables

    public void mostrar_dados() throws SQLException{
        try{
             pcp.setText(softwaresokkyo.resultset.getString("cadastroProd"));
             pnome.setText(softwaresokkyo.resultset.getString("cadastroProdnome"));
             pqtd.setText(softwaresokkyo.resultset.getString("cadastroProd_qtd"));
             ppreço.setText(softwaresokkyo.resultset.getString("cadastroProd_preco"));
             plocaliza.setText(softwaresokkyo.resultset.getString("cadastroProd_local"));
             fornecedor.setText(softwaresokkyo.resultset.getString("cadastroProd_fornecedor"));
             pdiscri.setText(softwaresokkyo.resultset.getString("cadastroProd_descri"));
             cf.setText(softwaresokkyo.resultset.getString("cadastro_cf"));
             porcentagem.setSelectedItem(softwaresokkyo.resultset.getString("porcentagemVenda"));
             valorVenda.setText(softwaresokkyo.resultset.getString("valorVenda"));
             estoqueMinimo.setText(softwaresokkyo.resultset.getString("estoqueMinimo"));
            }
            catch(SQLException erro){
               if (navega == 1){
                    JOptionPane.showMessageDialog(null, "Voçê jà Está no Primeiro Registro");
                   softwaresokkyo.resultset.next();
               }
                else if(navega == 2){
                    JOptionPane.showMessageDialog(null, "Voçê jà Está no Ultimo Registro");
                  softwaresokkyo.resultset.previous();
                }
                else
                     navega = 0;
            }
    }

     public void PreencherDados(){
    softwaresokkyo.executeSQL("select * from cadastro_peca");
    DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
    modelo.setNumRows(0);
    try{
        while (softwaresokkyo.resultset.next())
            modelo.addRow(new Object[]{softwaresokkyo.resultset.getString("cadastroProd"),softwaresokkyo.resultset.getString("cadastroProdnome"),softwaresokkyo.resultset.getString("cadastroProd_qtd"),softwaresokkyo.resultset.getString("valorVenda")});

        }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null,"Erro Ao Aprensentar Dados na Tabela");
    }
    
}
      public void calcularNumero() throws SQLException{
softwaresokkyo.resultset.first();
 int i = 1;
     while(softwaresokkyo.resultset.next()){
       i++;

  }
   numerodecliente.setText(""+i);
   softwaresokkyo.executeSQL("select * from cadastro_peca");
 }

    
}
