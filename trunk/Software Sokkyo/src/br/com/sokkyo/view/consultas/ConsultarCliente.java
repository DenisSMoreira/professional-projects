

package br.com.sokkyo.view.consultas;
import com.Sokkyo.Consulta.*;
import com.Sokkyo.Cadastros.Cadastro_de_Clientes;
import com.Sokkyo.Utilitarios.Conexão.Conexão;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public final class ConsultarCliente extends javax.swing.JFrame {
      Conexão software_sokkyo;
       private  String sexualidade = "";
  
    public ConsultarCliente()
    {
        initComponents();
         software_sokkyo = new Conexão();
        software_sokkyo.conecta();
        software_sokkyo.executeSQL("select * from cadastro_cliente");


        try
        {
       
       while(software_sokkyo.resultset.next())
       PesquiBox.addItem(software_sokkyo.resultset.getString("cadastro_nome"));

        }
        catch (SQLException e)
        {


        }
    
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        numerodecliente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PesquiBox = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
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
        jLabel36 = new javax.swing.JLabel();
        estadocivil = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        residencia = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        site = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        fotux = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        BuscaNome = new javax.swing.JTextField();
        buscaCPF = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setTitle("Consulta de Cliente");
        setResizable(false);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/people(2).png"))); // NOI18N
        jButton5.setMnemonic('N');
        jButton5.setText(" Novo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton5FocusLost(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/gtk_edit.png"))); // NOI18N
        jButton6.setMnemonic('E');
        jButton6.setText("Limpar");
        jButton6.setToolTipText("Editar o Cadastro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("  Numero de cliente Cadastrados:   ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        numerodecliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        numerodecliente.setText("0");
        jPanel2.add(numerodecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("   Nokys Sistemas");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 100, 20));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Efetuar Pesquisa por ComboBox", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PesquiBox.setEditable(true);
        PesquiBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PesquiBox.setToolTipText("Selecione um cliente para efetuar a busca mais detalhada sobre ele!");
        PesquiBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PesquiBoxItemStateChanged(evt);
            }
        });
        jPanel4.add(PesquiBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 20));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 440, 50));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Celular:");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 50, 20));

        nome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nome.setToolTipText("Digite o nome completo do cliente ");
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeFocusLost(evt);
            }
        });
        jPanel9.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 210, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Nome:");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 20));

        codigo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codigo1.setToolTipText("Codigo do Cliente");
        codigo1.setRequestFocusEnabled(false);
        jPanel9.add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Endereço:");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Codigo:");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 50, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("UF:");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 20, 20));

        bairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, -1));

        cep.setToolTipText("");
        cep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 100, -1));

        numero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        numero.setToolTipText("Numero da Residencia");
        jPanel9.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("CEP:");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 30, 20));

        cidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cidade.setToolTipText("Cidade onde o cliente mora");
        jPanel9.add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 100, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Bairro:");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 20));

        telefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Cidade:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 50, 20));

        celular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 100, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Telefone:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, 20));

        rg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("RG:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 30, 20));

        nascimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 100, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Data de Nascimento:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 130, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Registro:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 60, 20));

        registro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registro.setRequestFocusEnabled(false);
        jPanel9.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Numero");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 20));

        uf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "PA", "PB", "PR", "TO", "AM", "BA", "SC" }));
        uf.setToolTipText("Estado ");
        jPanel9.add(uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 50, -1));

        endereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        endereco.setToolTipText("Digite o endereço do cliente ");
        jPanel9.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 210, 20));

        cpf.setToolTipText("CPF do Cliente");
        cpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Web Site");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 60, 20));

        estadocivil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Viuvo(a)" }));
        estadocivil.setToolTipText("Estado Civil do Cliente");
        jPanel9.add(estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Tipo Residencia");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 20));

        residencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        residencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Propria", "Alugada", "Cedida", "Outra..." }));
        residencia.setToolTipText("Tipo de Residencia em que o cliente vive");
        jPanel9.add(residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 100, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("CPF:");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Estado civil");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 20));

        site.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        site.setToolTipText("Digite o endereço do cliente ");
        jPanel9.add(site, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 150, 20));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Email");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 20));

        email.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        email.setToolTipText("Digite o endereço do cliente ");
        jPanel9.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/16x16_smiley-wink.gif"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 30, 20));

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        fotux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/icones/people(3).png"))); // NOI18N
        fotux.setToolTipText("Foto do Cliente *Opcional");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotux, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotux, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 140, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Foto");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 50, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sokkyo/Icons/LogoNoky.png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 130, 200));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 630, 270));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel11.setToolTipText("Escolha o Sexo do cliente");
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masculino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        masculino.setText("Masculino");
        masculino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                masculinoItemStateChanged(evt);
            }
        });
        jPanel11.add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        feminino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jPanel11.add(feminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 190, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("RG:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Nome:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        BuscaNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BuscaNome.setToolTipText("Digite o nome do cliente e aperte 'Enter' para efetuar a busca");
        BuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaNomeActionPerformed(evt);
            }
        });
        jPanel3.add(BuscaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, -1));

        buscaCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCPFActionPerformed(evt);
            }
        });
        jPanel3.add(buscaCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 630, 50));

        jTabbedPane1.addTab("Buscar Dados do Cliente", jPanel5);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Peça", "Codigo Peça", "Qtd", "Valor Uni", "Total", "Data", "Vendedor"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Valor Peca");
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(35);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar vendas de Produto", jPanel6);

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descrição", "Mod. do Veiculo", "Placa", "Dias", "Valor", "Data"
            }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(49);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(35);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(35);
        jTable2.getColumnModel().getColumn(6).setPreferredWidth(50);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar as vendas de Serviços", jPanel7);

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Cod Peça", "qtd", "S.total", "Placa", "Dias", "Descricao", "Valor O.S", "Vendedor", "Total"
            }
        ));
        jTable3.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(35);
        jTable3.getColumnModel().getColumn(5).setPreferredWidth(35);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Compras Completas", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Dados do Cliente");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-741)/2, (screenSize.height-593)/2, 741, 593);
    }// </editor-fold>//GEN-END:initComponents

    private void PesquiBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PesquiBoxItemStateChanged
  software_sokkyo.executeSQL("select * from cadastro_cliente");
        try {
            software_sokkyo.resultset.first();

String igual ="n";
while ( igual == "n"){

if(software_sokkyo.resultset.getString("cadastro_nome").equals(PesquiBox.getSelectedItem()))

{
igual = "s";
}
else
software_sokkyo.resultset.next();
}
codigo1.setText(software_sokkyo.resultset.getString("codigo_cliente"));
mostrar_dados();
PreencherDados();
PreencherDados2();
PreencherDados3();
software_sokkyo.executeSQL("select * from cadastro_cliente");
        }
catch (SQLException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PesquiBoxItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String senha = JOptionPane.showInputDialog("Login","Digite a Senha:");
        if(senha.equals("admin")){
        new Cadastro_de_Clientes().show();
  dispose();}
 else{
    JOptionPane.showMessageDialog(null,"Acesso Negado");
 }
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton5FocusLost

}//GEN-LAST:event_jButton5FocusLost

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
 site.setText("");
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     dispose();
}//GEN-LAST:event_jButton7ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_nomeActionPerformed

    private void nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusLost

}//GEN-LAST:event_nomeFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

}//GEN-LAST:event_jLabel2MouseClicked

    private void masculinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_masculinoItemStateChanged
        sexualidade = "Masculino";
}//GEN-LAST:event_masculinoItemStateChanged

    private void femininoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_femininoItemStateChanged
        sexualidade = "Feminino";
}//GEN-LAST:event_femininoItemStateChanged

    private void femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femininoActionPerformed
       
}//GEN-LAST:event_femininoActionPerformed

    private void BuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaNomeActionPerformed
        software_sokkyo.executeSQL("select * from cadastro_cliente");
        if (BuscaNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por Favor Digite o Nome Do Cliente Desejado!");
            return;
        } else {
            try {

                software_sokkyo.resultset.first();

                String igual = "n";

                int tamanho_pesquisa = BuscaNome.getText().length();

                while (igual == "n") {

                    String pesquisando = software_sokkyo.resultset.getString("cadastro_nome").substring(0, (tamanho_pesquisa));

                    if (pesquisando.equals(BuscaNome.getText())) {
                        igual = "s";
                    } else {
                        software_sokkyo.resultset.next();
                    }

                }


                codigo1.setText(software_sokkyo.resultset.getString("codigo_cliente"));
                mostrar_dados();



            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Nao Foi Localizado os Dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
            }
        }
}//GEN-LAST:event_BuscaNomeActionPerformed

    private void buscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCPFActionPerformed
        software_sokkyo.executeSQL("select * from cadastro_cliente");
        if (buscaCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por Favor Digite o RG Do Cliente Desejado!");
            return;
        } else



            try	{

                software_sokkyo.resultset.first();

                String igual ="n";

                int tamanho_pesquisa = buscaCPF.getText().length();

                while ( igual == "n") {

                    String pesquisando = software_sokkyo.resultset.getString("cadastro_rg").substring(0,(tamanho_pesquisa));

                    if(pesquisando.equals(buscaCPF.getText()))

                    {
                        igual = "s";
                    }

                    else

                        software_sokkyo.resultset.next();

                }


                codigo1.setText(software_sokkyo.resultset.getString("codigo_cliente"));
                mostrar_dados();



            } catch(SQLException erro) {
                JOptionPane.showMessageDialog(null,"Nao foi localizado os dados ! \nDica: Caso Seja Um Usuario Nao Cadastrado Efetue Um novo Cadastro");
            }
}//GEN-LAST:event_buscaCPFActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscaNome;
    private javax.swing.JComboBox PesquiBox;
    private javax.swing.JTextField bairro;
    private javax.swing.JFormattedTextField buscaCPF;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField codigo1;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JComboBox estadocivil;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JLabel fotux;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JFormattedTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JLabel numerodecliente;
    private javax.swing.JTextField registro;
    private javax.swing.JComboBox residencia;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JTextField site;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JComboBox uf;
    // End of variables declaration//GEN-END:variables
 public void mostrar_dados() throws SQLException{
   try{
     codigo1.setText(software_sokkyo.resultset.getString("codigo_cliente"));
nome.setText(software_sokkyo.resultset.getString("cadastro_nome"));
endereco.setText(software_sokkyo.resultset.getString("cadastro_endereco"));
cep.setText(software_sokkyo.resultset.getString("cadastro_cep"));
bairro.setText(software_sokkyo.resultset.getString("cadastro_bairro"));
numero.setText(software_sokkyo.resultset.getString("cadastro_n"));
cidade.setText(software_sokkyo.resultset.getString("cadastro_cidade"));
 telefone.setText(software_sokkyo.resultset.getString("cadastro_tel"));
 celular.setText(software_sokkyo.resultset.getString("cadastro_celu"));
 rg.setText(software_sokkyo.resultset.getString("cadastro_rg"));
 cpf.setText(software_sokkyo.resultset.getString("cadastro_cpf"));
 nascimento.setText(software_sokkyo.resultset.getString("cadastro_data"));
 email.setText(software_sokkyo.resultset.getString("email"));
 site.setText(software_sokkyo.resultset.getString("site"));
 uf.setSelectedItem(software_sokkyo.resultset.getString("cadastro_estado"));
 estadocivil.setSelectedItem(software_sokkyo.resultset.getString("estado_civil"));
 residencia.setSelectedItem(software_sokkyo.resultset.getString("residencia"));
 registro.setText(software_sokkyo.resultset.getString("cadastro_dataReg"));
fotux.setIcon(new ImageIcon(""+software_sokkyo.resultset.getString("foto")));
sexualidade= software_sokkyo.resultset.getString("sexo");
if ( sexualidade.equals("Feminino")){
    feminino.setSelected(rootPaneCheckingEnabled);
}
 else {
    masculino.setSelected(rootPaneCheckingEnabled);
 }
   }
 catch(SQLException erro){



 }}
public void AtualizarCombo(){
     try {
            while (software_sokkyo.resultset.next())
            PesquiBox.addItem(software_sokkyo.resultset.getString("cadastro_nome"));

        } catch (SQLException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
}



public void PreencherDados(){
    software_sokkyo.executeSQL("select * from venda_produto WHERE venda_codcli = "+codigo1.getText()+"");

    DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
    modelo.setNumRows(0);
    try{
        while (software_sokkyo.resultset.next())
            modelo.addRow(new Object[]{software_sokkyo.resultset.getString("venda_codVenda"),software_sokkyo.resultset.getString("venda_nomePeca"),software_sokkyo.resultset.getString("venda_codpe"),software_sokkyo.resultset.getString("venda_qtd"),software_sokkyo.resultset.getString("venda_valor"),software_sokkyo.resultset.getString("venda_toal"),software_sokkyo.resultset.getString("dataVenda"),software_sokkyo.resultset.getString("vendedor")});

        }
    catch (SQLException erro){
       System.out.print(erro);
    }
}
public void PreencherDados2(){
    software_sokkyo.executeSQL("select * from venda_servico WHERE codicli = "+codigo1.getText()+"");

    DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
    model.setNumRows(0);
    try{
        while (software_sokkyo.resultset.next())
            model.addRow(new Object[]{software_sokkyo.resultset.getString("venda_codigo"),software_sokkyo.resultset.getString("descri"),software_sokkyo.resultset.getString("modelo"),software_sokkyo.resultset.getString("placa"),software_sokkyo.resultset.getString("dias"),software_sokkyo.resultset.getString("preco"),software_sokkyo.resultset.getString("data")});

        }
    catch (SQLException erro){
       JOptionPane.showMessageDialog(null,"Erro "+erro);
    }
}
public void PreencherDados3(){
    software_sokkyo.executeSQL("select * from venda_prodserv WHERE cod_cliente = "+codigo1.getText()+"");

    DefaultTableModel mod = (DefaultTableModel)jTable3.getModel();
    mod.setNumRows(0);
    try{
        while (software_sokkyo.resultset.next())
            mod.addRow(new Object[]{software_sokkyo.resultset.getString("codigo_VendaServProd"),software_sokkyo.resultset.getString("cod_peca"),software_sokkyo.resultset.getString("qtd"),software_sokkyo.resultset.getString("valor_peca"),software_sokkyo.resultset.getString("placa"),software_sokkyo.resultset.getString("previsao"),software_sokkyo.resultset.getString("descricao"),software_sokkyo.resultset.getString("valor_or"),software_sokkyo.resultset.getString("vendedor"),software_sokkyo.resultset.getString("total")});

        }
    catch (SQLException erro){
    System.out.print(erro);
    }
}
}
