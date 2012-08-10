/*
 * FPrincipal.java
 *
 * Created on 8 de Novembro de 2005, 12:59
 */

/**
 *
 * @author  rodrigo.tavares
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import java.sql.*;
import java.io.*;
public class FPrincipal extends javax.swing.JFrame {
    
    /** Creates new form FPrincipal */
    public FPrincipal() {
        initComponents();
        setBounds(200,100,600,600); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblData = new javax.swing.JLabel();
        lblHoje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MArquivo = new javax.swing.JMenu();
        menuNovaDiaria = new javax.swing.JMenuItem();
        MCadServidor = new javax.swing.JMenuItem();
        MCadSetor = new javax.swing.JMenuItem();
        MCadFuncao = new javax.swing.JMenuItem();
        MDiaria = new javax.swing.JMenu();
        MListaDiaria = new javax.swing.JMenuItem();
        MListaServidor = new javax.swing.JMenuItem();
        MListas = new javax.swing.JMenu();
        MListServidor = new javax.swing.JMenuItem();
        MListSetor = new javax.swing.JMenuItem();
        MUsuario = new javax.swing.JMenu();
        MCadUser = new javax.swing.JMenuItem();
        MConfig = new javax.swing.JMenu();
        MLimpaTabDiaria = new javax.swing.JMenuItem();
        MAjuda = new javax.swing.JMenu();
        MHelp = new javax.swing.JMenuItem();
        MSobre = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);


        setTitle("Gerenciador de Di\u00e1rias ASTEC-PB v1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblData.setFont(new java.awt.Font("MS Sans Serif", 1, 24));
        lblData.setText("data");
        getContentPane().add(lblData);
        lblData.setBounds(80, 0, 200, 60);

        lblHoje.setFont(new java.awt.Font("MS Sans Serif", 1, 24));
        lblHoje.setText("Hoje:");
        getContentPane().add(lblHoje);
        lblHoje.setBounds(10, 0, 90, 60);

        jLabel1.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel1.setText("Desenvolvido em 2005  por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 530, 170, 15);

        jLabel2.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel2.setText("Rodrigo Fl\u00e1vio de Oliveira Tavares");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 530, 190, 15);

        jLabel3.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel3.setText("Todos os Direitos Reservados");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 530, 180, 15);

        MArquivo.setText("Arquivo");
        MArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MArquivoActionPerformed(evt);
            }
        });
        MArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MArquivoMouseClicked(evt);
            }
        });

        menuNovaDiaria.setText("Nova Di\u00e1ria");
        menuNovaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovaDiariaActionPerformed(evt);
            }
        });

        MArquivo.add(menuNovaDiaria);

        MCadServidor.setText("Cadastrar Servidor");
        MCadServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCadServidorActionPerformed(evt);
            }
        });

        MArquivo.add(MCadServidor);

        MCadSetor.setText("Cadastrar Setor");
        MCadSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCadSetorActionPerformed(evt);
            }
        });

        MArquivo.add(MCadSetor);

        MCadFuncao.setText("Cadastro de Fun\u00e7\u00f5es");
        MCadFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCadFuncaoActionPerformed(evt);
            }
        });

        MArquivo.add(MCadFuncao);

        jMenuBar1.add(MArquivo);

        MDiaria.setText("Di\u00e1rias");
        MDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDiariaActionPerformed(evt);
            }
        });

        MListaDiaria.setText("Listar Di\u00e1rias Completa");
        MListaDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MListaDiariaActionPerformed(evt);
            }
        });

        MDiaria.add(MListaDiaria);

        MListaServidor.setText("Por Servidor");
        MListaServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MListaServidorActionPerformed(evt);
            }
        });

        MDiaria.add(MListaServidor);

        jMenuBar1.add(MDiaria);

        MListas.setText("Listar");
        MListServidor.setText("Servidor");
        MListServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MListServidorActionPerformed(evt);
            }
        });

        MListas.add(MListServidor);

        MListSetor.setText("Setor");
        MListSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MListSetorActionPerformed(evt);
            }
        });

        MListas.add(MListSetor);

        jMenuBar1.add(MListas);

        MUsuario.setText("Usu\u00e1rios");
        MCadUser.setText("Cadastrar Usu\u00e1rio");
        MCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCadUserActionPerformed(evt);
            }
        });

        MUsuario.add(MCadUser);

        jMenuBar1.add(MUsuario);

        MConfig.setText("Configura\u00e7\u00f5es");
        MLimpaTabDiaria.setText("Excluir Di\u00e1rias Canceladas");
        MLimpaTabDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLimpaTabDiariaActionPerformed(evt);
            }
        });

        MConfig.add(MLimpaTabDiaria);

        jMenuBar1.add(MConfig);

        MAjuda.setText("Ajuda");
        MAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAjudaActionPerformed(evt);
            }
        });

        MHelp.setText("Help");
        MHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MHelpActionPerformed(evt);
            }
        });

        MAjuda.add(MHelp);

        MSobre.setText("Sobre");
        MSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSobreActionPerformed(evt);
            }
        });

        MAjuda.add(MSobre);

        jMenuBar1.add(MAjuda);

        setJMenuBar(jMenuBar1);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void MLimpaTabDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLimpaTabDiariaActionPerformed
// TODO add your handling code here:
        ClassConecta conexao = new ClassConecta();
        try{
         conexao.conecta();
         Connection con = conexao.conecta();
         Statement stmt = conexao.con.createStatement();        
         ResultSet rs = stmt.executeQuery("delete * from TabCadDiaria where situacao= 'CANCELADA'");
         JOptionPane.showMessageDialog(null,"Di�rias Exclu�das com Sucesso","ATEN��O",JOptionPane.WARNING_MESSAGE);
         stmt.close();   
         conexao.con.close();
        }catch(SQLException e){
         System.out.println(e);
        }
        
    }//GEN-LAST:event_MLimpaTabDiariaActionPerformed

    private void MCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCadUserActionPerformed
// TODO add your handling code here:
        FCadUser u = new FCadUser();
        u.show();
    }//GEN-LAST:event_MCadUserActionPerformed

    private void MHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHelpActionPerformed
// TODO add your handling code here:
    try {
            String cam = "C:\\Documents and Settings\\Rodrigo\\Meus documentos\\Projetos Help\\Diarias Help.htm";
            Process abri_help = Runtime.getRuntime().exec("C:\\Arquivos de programas\\Internet Explorer\\IEXPLORE "+ cam +"");
         } catch (IOException e) {// TODO Auto-generated catch block
 	e.printStackTrace();	}
    }//GEN-LAST:event_MHelpActionPerformed

    private void MListSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MListSetorActionPerformed
// TODO add your handling code here:
            FListaSetor setor = new FListaSetor();
            setor.show();
    }//GEN-LAST:event_MListSetorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
// TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosing

    private void MListServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MListServidorActionPerformed
// TODO add your handling code here:
        FListaServidor servidor = new FListaServidor();
        servidor.show();
    }//GEN-LAST:event_MListServidorActionPerformed

    private void MSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSobreActionPerformed
// TODO add your handling code here:
        FSobre sobre = new FSobre();
        sobre.show();
    }//GEN-LAST:event_MSobreActionPerformed

    private void MAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAjudaActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_MAjudaActionPerformed

    private void MListaServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MListaServidorActionPerformed
// TODO add your handling code here:
        FConsultServidor ListServidor = new FConsultServidor();
        ListServidor.show();
        
        

    }//GEN-LAST:event_MListaServidorActionPerformed

    private void MDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDiariaActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_MDiariaActionPerformed

    private void MCadFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCadFuncaoActionPerformed
// TODO add your handling code here:
         FCadFuncao funcao = new FCadFuncao();
         funcao.show();
    }//GEN-LAST:event_MCadFuncaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
        ClassDatas data = new ClassDatas();
        lblData.setText(data.PegaDataAtual().toString());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void MListaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MListaDiariaActionPerformed
// TODO add your handling code here:
       FListaDiarias lista = new FListaDiarias();
       lista.show();   
        
    }//GEN-LAST:event_MListaDiariaActionPerformed

    private void MCadSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCadSetorActionPerformed
// TODO add your handling code here:
        FCadSetor setor = new FCadSetor();
        setor.show();
                
    }//GEN-LAST:event_MCadSetorActionPerformed

    private void MArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MArquivoActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_MArquivoActionPerformed

    private void MCadServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCadServidorActionPerformed
// TODO add your handling code here: 
        FCadServidor servidor = new FCadServidor();
        servidor.show(); 
    }//GEN-LAST:event_MCadServidorActionPerformed

    private void menuNovaDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovaDiariaActionPerformed
// TODO add your handling code here: 
     FNovaDiaria d = new FNovaDiaria();
     d.show();
    }//GEN-LAST:event_menuNovaDiariaActionPerformed

    private void MArquivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MArquivoMouseClicked
    
    }//GEN-LAST:event_MArquivoMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAjuda;
    private javax.swing.JMenu MArquivo;
    private javax.swing.JMenuItem MCadFuncao;
    private javax.swing.JMenuItem MCadServidor;
    private javax.swing.JMenuItem MCadSetor;
    private javax.swing.JMenuItem MCadUser;
    private javax.swing.JMenu MConfig;
    private javax.swing.JMenu MDiaria;
    private javax.swing.JMenuItem MHelp;
    private javax.swing.JMenuItem MLimpaTabDiaria;
    private javax.swing.JMenuItem MListServidor;
    private javax.swing.JMenuItem MListSetor;
    private javax.swing.JMenuItem MListaDiaria;
    private javax.swing.JMenuItem MListaServidor;
    private javax.swing.JMenu MListas;
    private javax.swing.JMenuItem MSobre;
    private javax.swing.JMenu MUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHoje;
    private javax.swing.JMenuItem menuNovaDiaria;
    // End of variables declaration//GEN-END:variables
    
}
