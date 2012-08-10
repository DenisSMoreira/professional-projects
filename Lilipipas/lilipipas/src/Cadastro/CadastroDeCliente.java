/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroDeCliente.java
 *
 * Created on 09/02/2011, 10:32:31
 */

package Cadastro;

import conexão.conectarBanco;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class CadastroDeCliente extends javax.swing.JInternalFrame {

conectarBanco con;
 Date data = new Date();

 
 private  String sexualidade = "";
 public String ordenaçao = "cadastro_nome";
 private int navega = 0;
 
    public CadastroDeCliente() {
        initComponents();
        con = new conectarBanco();
        con.conecta();

     try{
con.executeSQL("select * from cliente");
calcularNumero();
PreencherTable();
con.resultset.first();
mostrar_dados();
navega = 1;
//con.desconecta();
         }
     catch(Exception e){

     }
    }

     public void geraRelatorio() throws JRException, SQLException, ClassNotFoundException {
         HashMap map = new HashMap();
         String arquivo = "F:\\lilipipas\\software\\lilipipas\\src\\Relatorios\\RelatorioDeClientes.jasper";
         JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,con.getConnection());
          JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
         jrviewer.setTitle("Relatorio de Clientes");
         jrviewer.setIconImage(new ImageIcon("F:/lilipipas/software/lilipipas/src/icones/AirIcon12x12.gif").getImage());
         jrviewer.setSize(600, 500);
         jrviewer.setVisible(false);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        WWW = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        BuscaNome = new javax.swing.JTextField();
        buscaCPF = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        cep = new javax.swing.JFormattedTextField();
        numero = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        celular = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        rg = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        nascimento = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        registro = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        uf = new javax.swing.JComboBox();
        endereco = new javax.swing.JTextField();
        cpf = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        Ultimo1 = new javax.swing.JButton();
        Proximo1 = new javax.swing.JButton();
        Anterior1 = new javax.swing.JButton();
        Primeiro1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        numerodecliente = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Cadatro de clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/AirIcon12x12.gif"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WWW.setFont(new java.awt.Font("BankGothic Md BT", 1, 10));
        WWW.setForeground(new java.awt.Color(102, 102, 102));
        WWW.setText("Noky's Sistemas");
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
        jPanel2.add(WWW, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 100, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 820, 20));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel23.setText("RG:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 30, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel24.setText("Nome:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        BuscaNome.setFont(new java.awt.Font("Tahoma", 1, 11));
        BuscaNome.setToolTipText("Digite o nome do cliente e aperte 'Enter' para efetuar a busca");
        BuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaNomeActionPerformed(evt);
            }
        });
        jPanel3.add(BuscaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, -1));

        buscaCPF.setFont(new java.awt.Font("Tahoma", 1, 11));
        buscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCPFActionPerformed(evt);
            }
        });
        jPanel3.add(buscaCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setToolTipText("Escolha o Sexo do cliente");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(masculino);
        masculino.setFont(new java.awt.Font("Tahoma", 1, 12));
        masculino.setText("Masculino");
        masculino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                masculinoItemStateChanged(evt);
            }
        });
        jPanel4.add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        buttonGroup1.add(feminino);
        feminino.setFont(new java.awt.Font("Tahoma", 1, 12));
        feminino.setText("Feminino");
        feminino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                femininoItemStateChanged(evt);
            }
        });
        feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femininoActionPerformed(evt);
            }
        });
        jPanel4.add(feminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 190, 50));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setText("Celular:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 50, 20));

        nome.setFont(new java.awt.Font("Tahoma", 1, 11));
        nome.setToolTipText("Digite o nome completo do cliente ");
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel7.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setText("Nome:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 20));

        codigo1.setFont(new java.awt.Font("Tahoma", 1, 11));
        codigo1.setToolTipText("Codigo do Cliente");
        codigo1.setRequestFocusEnabled(false);
        jPanel7.add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel19.setText("Endereço:");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel21.setText("Codigo:");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 50, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel26.setText("UF:");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 20, 20));

        bairro.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, -1));

        cep.setToolTipText("");
        cep.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 100, -1));

        numero.setFont(new java.awt.Font("Tahoma", 1, 11));
        numero.setToolTipText("Numero da Residencia");
        jPanel7.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 50, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel28.setText("CEP:");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 30, 20));

        cidade.setFont(new java.awt.Font("Tahoma", 1, 11));
        cidade.setToolTipText("Cidade onde o cliente mora");
        jPanel7.add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 100, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel29.setText("Bairro:");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 20));

        telefone.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel30.setText("Cidade:");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 50, 20));

        celular.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 100, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel31.setText("Telefone:");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, 20));

        rg.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel32.setText("RG:");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 30, 20));

        nascimento.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 100, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel33.setText("Data de Nascimento:");
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 130, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel34.setText("Registro:");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 20));

        registro.setFont(new java.awt.Font("Tahoma", 1, 11));
        registro.setRequestFocusEnabled(false);
        jPanel7.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel35.setText("Numero:");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, 20));

        uf.setFont(new java.awt.Font("Tahoma", 1, 11));
        uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "PA", "PB", "PR", "TO", "AM", "BA", "SC" }));
        uf.setToolTipText("Estado ");
        jPanel7.add(uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 50, -1));

        endereco.setFont(new java.awt.Font("Tahoma", 1, 11));
        endereco.setToolTipText("Digite o endereço do cliente ");
        jPanel7.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 280, 20));

        cpf.setToolTipText("CPF do Cliente");
        cpf.setFont(new java.awt.Font("Tahoma", 1, 11));
        jPanel7.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 100, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel38.setText("CPF:");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, 20));

        email.setFont(new java.awt.Font("Tahoma", 1, 11));
        email.setToolTipText("Digite o endereço do cliente ");
        jPanel7.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel50.setText("Email:");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 40, 20));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, 240));

        Ultimo1.setFont(new java.awt.Font("Tahoma", 1, 11));
        Ultimo1.setText("|>");
        Ultimo1.setToolTipText("Ultimo");
        Ultimo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ultimo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ultimo1MouseExited(evt);
            }
        });
        Ultimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ultimo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ultimo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 60, 30));

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
        jPanel1.add(Proximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 60, 30));

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
        jPanel1.add(Anterior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 30));

        Primeiro1.setFont(new java.awt.Font("Tahoma", 1, 11));
        Primeiro1.setText("<|");
        Primeiro1.setToolTipText("Primeiro");
        Primeiro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Primeiro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Primeiro1MouseExited(evt);
            }
        });
        Primeiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Primeiro1ActionPerformed(evt);
            }
        });
        jPanel1.add(Primeiro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 60, 30));

        jTabbedPane1.addTab("Clientes", jPanel1);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
                "Codigo", "Nome", "Telefone", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenação:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 11));
        jRadioButton2.setText("Codigo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 20));

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 11));
        jRadioButton1.setText("Nome");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel16.setText("  Numero de cliente Cadastrados:   ");

        numerodecliente.setFont(new java.awt.Font("Tahoma", 1, 10));
        numerodecliente.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numerodecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numerodecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Clientes Cadastrados", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 640, 380));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setMnemonic('N');
        jButton3.setText(" Novo");
        jButton3.setToolTipText("Novo Cadastro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton3FocusLost(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 100, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton4.setMnemonic('E');
        jButton4.setText(" Editar");
        jButton4.setToolTipText("Editar o Cadastro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 6, 110, 40));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton7.setMnemonic('x');
        jButton7.setText(" Excluir");
        jButton7.setToolTipText("Excluir Cadastro");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 6, 110, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jButton5.setMnemonic('s');
        jButton5.setText(" Sair");
        jButton5.setToolTipText("Sair do Menu Cadastro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 6, 110, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText(" Confirmar");
        jButton1.setToolTipText("Confirmar cadastro de Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 140, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton6.setMnemonic('c');
        jButton6.setText(" Cancelar");
        jButton6.setToolTipText("Cancelar Cadastro de Cliente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 140, 40));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton10.setText("Gerenciar");
        jButton10.setToolTipText("Efetuar Busca mais detalhada do cliente");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 140, 40));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton11.setText("Gerar Relatorio");
        jButton11.setToolTipText("Efetuar Busca mais detalhada do cliente");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 140, 40));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-822)/2, (screenSize.height-487)/2, 822, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void WWWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe www.nokys.com.br");
        } catch (IOException ex) {
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_WWWMouseClicked

    private void WWWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseEntered
        WWW.setForeground(new java.awt.Color(0, 153, 255));
}//GEN-LAST:event_WWWMouseEntered

    private void WWWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WWWMouseExited
        WWW.setForeground(new java.awt.Color(102, 102, 102));
}//GEN-LAST:event_WWWMouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTabbedPane1.getSelectedIndex() == (0)){
            
            BuscaNome.setText("");
            buscaCPF.setText("");
            nome.setText("");
            codigo1.setText("");
            endereco.setText("");
            cep.setText("");
            bairro.setText("");
            numero.setText("");
            cidade.setText("");
            telefone.setText("");
            celular.setText("");
            rg.setText("");
            cpf.setText("");
            nascimento.setText("");
            email.setText("");
           registro.setText(""+data.getDate()+"/"+(data.getMonth()+1)+"/"+(data.getYear()+1900));
            
        }
      
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusLost
        
}//GEN-LAST:event_jButton3FocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTabbedPane1.getSelectedIndex() == (0)){
            if(Verificar().equals("No")){
                try{
                    String sql = "UPDATE cliente SET `nome` = '"+nome.getText()+"', `rg` = '"+rg.getText()+"', `cpf` = '"+cpf.getText()+"', `endereco` = '"+endereco.getText()+"', `numero` = '"+numero.getText()+"', `bairro` = '"+bairro.getText()+"', `cidade` = '"+cidade.getText()+"', `estado` = '"+uf.getSelectedItem()+"', `telefone` = '"+telefone.getText()+"', `celular` = '"+celular.getText()+"', `sexo` = '"+sexualidade+"', `email` = '"+email.getText()+"', `datacadastro` = '"+registro.getText()+"', `datanascimento` = '"+nascimento.getText()+"', `cep` = '"+cep.getText()+"' WHERE codigo = "+codigo1.getText();
                    con.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Alteraçao do cliente realizada com sucesso!");
                    con.executeSQL("select * from cliente");
                    PreencherTable();
                    con.resultset.first();
                    mostrar_dados();
                    navega = 1;
                    
                    
                }
                
                catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null,"Erro a tentar alterar o registro..");
                }
            }
        }
      
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
            
            try{
                String sql ="select * FROM cliente WHERE `codigo` = "+codigo1.getText();
                con.executeSQL(sql);
                con.resultset.first();
                String nome = "Tem Certeza Deseja Excluir o Cliente:  "+con.resultset.getString("nome")+" ?";
                int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome," Exclusão",JOptionPane.YES_NO_OPTION);
                
                if ( opcao_escolhida == JOptionPane.YES_OPTION){
                    
                    sql = "DELETE FROM cliente WHERE `codigo` = "+codigo1.getText();
                    int conseguiu_excluir = con.statement.executeUpdate(sql);
                    if (conseguiu_excluir == 1){
                        
                        JOptionPane.showMessageDialog(null,"Exclusão do cliente realizada com sucesso! ");
                       con.executeSQL("select * from cliente");
                        calcularNumero();
                        PreencherTable();
                       con.resultset.first();
                        mostrar_dados();
                        navega = 1;
                        
                    }
                }
                
                else{
                    return;
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro ao excluir o registro");
            }
     
     
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
dispose();
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
            con.executeSQL("select * from cliente");
            if(Verificar().equals("No")){
                if(validate(email.getText()).equals("Valido")){
                    try{
                        String sql_insrt ="INSERT INTO cliente(nome, rg, cpf, endereco, numero, bairro, cidade, estado, telefone, celular, sexo, email, datacadastro, datanascimento, cep) values ('"+nome.getText()+"','"+rg.getText()+"','"+cpf.getText()+"','"+endereco.getText()+"','"+numero.getText()+"','"+bairro.getText()+"','"+cidade.getText()+"','"+uf.getSelectedItem()+"','"+telefone.getText()+"','"+celular.getText()+"','"+sexualidade+"','"+email.getText()+"','"+registro.getText()+"','"+nascimento.getText()+"','"+cep.getText()+"')";
                         con.statement.executeUpdate(sql_insrt);
                        JOptionPane.showMessageDialog(this,"Cliente Cadastrado Com Sucesso!");
                         con.executeSQL("select * from cliente");
                        calcularNumero();
                        PreencherTable();
                         con.resultset.last();
                        mostrar_dados();
                        navega = 2;
                    }
                    
                    catch(SQLException erros){
                        JOptionPane.showMessageDialog(null,"Erro Ao Gravar Dados! Por Favor Digite Novamente!  "+erros);
                    }
                } else
                    JOptionPane.showMessageDialog(null,"Digite um Email Valido!");
                return;
                
                
            }
        
        
  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
            
            BuscaNome.setText("");
            buscaCPF.setText("");
            nome.setText("");
            codigo1.setText("");
            endereco.setText("");
            cep.setText("");
            bairro.setText("");
            numero.setText("");
            cidade.setText("");
            telefone.setText("");
            celular.setText("");
            rg.setText("");
            cpf.setText("");
            nascimento.setText("");
            email.setText("");
       //            registro.setText(""+data.getDate()+"/"+(data.getMonth()+1)+"/"+(data.getYear()+1900));
            
       
     
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
//        new Consulta_Cliente().show();
//        dispose();
}//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            geraRelatorio();
        } catch (JRException ex) {
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroDeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}//GEN-LAST:event_jButton11ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
}//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        Visualizao("nome");
}//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Visualizao("codigo");
}//GEN-LAST:event_jRadioButton2ActionPerformed

    private void Primeiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Primeiro1ActionPerformed
        try{
            con.resultset.first();
            mostrar_dados();
            navega =1;
            
            
            
        } catch(SQLException erro){
            
        }
}//GEN-LAST:event_Primeiro1ActionPerformed

    private void Primeiro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Primeiro1MouseExited
        
}//GEN-LAST:event_Primeiro1MouseExited

    private void Primeiro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Primeiro1MouseEntered
        
}//GEN-LAST:event_Primeiro1MouseEntered

    private void Anterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anterior1ActionPerformed
        try{
            con.resultset.previous();
            mostrar_dados();
            navega =1;
            
        } catch(SQLException erro) {
            
        }
}//GEN-LAST:event_Anterior1ActionPerformed

    private void Anterior1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anterior1MouseExited
        
}//GEN-LAST:event_Anterior1MouseExited

    private void Anterior1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anterior1MouseEntered
        
}//GEN-LAST:event_Anterior1MouseEntered

    private void Proximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proximo1ActionPerformed
        try{
            con.resultset.next();
            mostrar_dados();
            navega =2;
            
        } catch(SQLException erro) {
            
            
        }
}//GEN-LAST:event_Proximo1ActionPerformed

    private void Proximo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proximo1MouseExited
        
}//GEN-LAST:event_Proximo1MouseExited

    private void Proximo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proximo1MouseEntered
        
}//GEN-LAST:event_Proximo1MouseEntered

    private void Ultimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ultimo1ActionPerformed
        try {
            con.resultset.last();
            mostrar_dados();
            navega = 2;
            
        } catch(SQLException erro) {
            
        }
}//GEN-LAST:event_Ultimo1ActionPerformed

    private void Ultimo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ultimo1MouseExited
        
}//GEN-LAST:event_Ultimo1MouseExited

    private void Ultimo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ultimo1MouseEntered
        
}//GEN-LAST:event_Ultimo1MouseEntered

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_nomeActionPerformed

    private void femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femininoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_femininoActionPerformed

    private void femininoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_femininoItemStateChanged
        sexualidade = "Feminino";
}//GEN-LAST:event_femininoItemStateChanged

    private void masculinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_masculinoItemStateChanged
        sexualidade = "Masculino";
}//GEN-LAST:event_masculinoItemStateChanged

    private void buscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCPFActionPerformed
        con.executeSQL("select * from cliente");
        if (buscaCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor digite o RG do cliente desejado!");
            return;
        } else
            
            
            
            try	{
                
                con.resultset.first();
                
                String igual ="n";
                
                int tamanho_pesquisa = buscaCPF.getText().length();
                
                while ( igual == "n") {
                    
                    String pesquisando = con.resultset.getString("rg").substring(0,(tamanho_pesquisa));
                    
                    if(pesquisando.equals(buscaCPF.getText()))
                        
                    {
                        igual = "s";
                    }
                    
                    else
                        
                        con.resultset.next();
                    
                }
                
                
                codigo1.setText(con.resultset.getString("codigo"));
                mostrar_dados();
                
                
                
            } catch(SQLException erro) {
                JOptionPane.showMessageDialog(null,"Nao foi localizado os dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
            }
}//GEN-LAST:event_buscaCPFActionPerformed

    private void BuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaNomeActionPerformed
        con.executeSQL("select * from cliente");
        if (BuscaNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor digite o nome do cliente desejado!");
            return;
        } else
            
            
            
            try	{
                
                con.resultset.first();
                
                String igual ="n";
                
                int tamanho_pesquisa = BuscaNome.getText().length();
                
                while ( igual == "n") {
                    
                    String pesquisando = con.resultset.getString("nome").substring(0,(tamanho_pesquisa));
                    
                    if(pesquisando.equals(BuscaNome.getText()))
                        
                    {
                        igual = "s";
                    }
                    
                    else
                        
                        con.resultset.next();
                    
                }
                
                
                codigo1.setText(con.resultset.getString("codigo"));
                mostrar_dados();
                
                
                
            } catch(SQLException erro) {
                JOptionPane.showMessageDialog(null,"Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro","Erro na Busca",JOptionPane.INFORMATION_MESSAGE);
            }
}//GEN-LAST:event_BuscaNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior1;
    private javax.swing.JTextField BuscaNome;
    private javax.swing.JButton Primeiro1;
    private javax.swing.JButton Proximo1;
    private javax.swing.JButton Ultimo1;
    private javax.swing.JLabel WWW;
    private javax.swing.JTextField bairro;
    private javax.swing.JFormattedTextField buscaCPF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField codigo1;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JFormattedTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JLabel numerodecliente;
    private javax.swing.JTextField registro;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JComboBox uf;
    // End of variables declaration//GEN-END:variables
public void mostrar_dados() throws SQLException{
   try{
     codigo1.setText(con.resultset.getString("codigo"));
nome.setText(con.resultset.getString("nome"));
endereco.setText(con.resultset.getString("endereco"));
cep.setText(con.resultset.getString("cep"));
bairro.setText(con.resultset.getString("bairro"));
numero.setText(con.resultset.getString("numero"));
cidade.setText(con.resultset.getString("cidade"));
 telefone.setText(con.resultset.getString("telefone"));
 celular.setText(con.resultset.getString("celular"));
 rg.setText(con.resultset.getString("rg"));
 cpf.setText(con.resultset.getString("cpf"));
 nascimento.setText(con.resultset.getString("datanascimento"));
 email.setText(con.resultset.getString("email"));
 uf.setSelectedItem(con.resultset.getString("estado"));
 registro.setText(con.resultset.getString("datacadastro"));
sexualidade= con.resultset.getString("sexo");
//clienteV.setText(nome.getText());
if ( sexualidade.equals("Feminino")){
    feminino.setSelected(rootPaneCheckingEnabled);
}
 else {
    masculino.setSelected(rootPaneCheckingEnabled);
 }
   }

 catch(SQLException erro){
 if (navega == 1){
                    JOptionPane.showMessageDialog(null, "Voçê jà Está no Primeiro Registro.");
                    con.resultset.next();
                  }
                else if(navega == 2){
                    JOptionPane.showMessageDialog(null, "Voçê jà Está no Ultimo Registro.");
                     con.resultset.previous();
                  }
                else
             
              navega = 0;

 }}



  public void PreencherTable(){

    DefaultTableModel mo = (DefaultTableModel)jTable1.getModel();
    mo.setNumRows(0);
    try{
        while (con.resultset.next())
            mo.addRow(new Object[]{con.resultset.getString("codigo"),con.resultset.getString("nome"),con.resultset.getString("telefone"),con.resultset.getString("rg")});

        }
    catch (SQLException erro){
        JOptionPane.showMessageDialog(null,"Erro Ao Aprensentar Dados na Tabela");
    }

}

        


public String Verificar(){
    String yes;
    if (nome.getText().equals("") || endereco.equals("") || bairro.equals("") || numero.equals("") || cidade.equals("") || sexualidade.equals("") ){
        JOptionPane.showMessageDialog(null,"Por Favor digite os dados do cliente !");
      yes  = "Yes";
 return yes;


    }
     else{
         yes = "No";
  return yes;
    }

}
 public void Visualizao(String ordem){
     ordenaçao = ordem;
     con.executeSQL("select * from cliente order by "+ordenaçao);
     PreencherTable();
        try {

 con.executeSQL("select * from cliente");
 con.resultset.first();
 mostrar_dados();
 navega = 1;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Nao Foi Possivel alterar a ordenação!");
        }


 }


public String validate(String arg) {
    String resposta = "Valido";
        if ((arg.length() < 4) || !arg.contains("@") || !arg.contains(".")) {
            return resposta = "Invalido";
        }
        return resposta;
    }

 public void calcularNumero() throws SQLException{
con.resultset.first();
 int i = 1;
     while(con.resultset.next()){
       i++;

  }
   numerodecliente.setText(""+i);
   con.executeSQL("select * from cliente");
 }


}
