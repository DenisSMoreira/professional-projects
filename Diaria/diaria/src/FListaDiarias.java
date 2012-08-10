import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.lang.Integer;
/*
 * tabela.java
 *
 * Created on 9 de Novembro de 2005, 14:11
 */

/**
 *
 * @author  rodrigo.tavares
 */
import java.sql.*;
public class FListaDiarias extends javax.swing.JFrame {
    
    /** Creates new form tabela */
    public FListaDiarias() {
        initComponents();
        setBounds(150,150,750,420);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        btnEntregaRel = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCancelDiaria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBSituacao = new javax.swing.JComboBox();
        btnListar = new javax.swing.JButton();
        CBSetor = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MemoDestino = new javax.swing.JTextArea();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciador de Di\u00e1rias ASTEC-PB v1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntregaRel.setText("Entrega Relat\u00f3rio");
        btnEntregaRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregaRelActionPerformed(evt);
            }
        });

        jPanel1.add(btnEntregaRel);
        btnEntregaRel.setBounds(270, 10, 150, 23);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel1.add(btnSair);
        btnSair.setBounds(420, 10, 160, 23);

        btnCancelDiaria.setText("Cancelar Di\u00e1ria");
        btnCancelDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDiariaActionPerformed(evt);
            }
        });

        jPanel1.add(btnCancelDiaria);
        btnCancelDiaria.setBounds(120, 10, 150, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 330, 720, 40);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Nome", "Sa�da", "Chegada", "Destino", "Relat�rio"
            }
        ));
        tabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(tabela);
        tabela.getAccessibleContext().setAccessibleName("tabela");

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 720, 190);

        jPanel2.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setText("Escolha um Setor para ser Listado:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 220, 15);

        jLabel4.setText("Escolha uma op\u00e7\u00e3o de Relat\u00f3rio:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 50, 200, 15);

        CBSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEVENDO", "ENTREGUE", "CANCELADA" }));
        CBSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSituacaoActionPerformed(evt);
            }
        });

        jPanel2.add(CBSituacao);
        CBSituacao.setBounds(10, 70, 160, 19);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jPanel2.add(btnListar);
        btnListar.setBounds(351, 80, 90, 23);

        jPanel2.add(CBSetor);
        CBSetor.setBounds(10, 30, 160, 19);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 210, 450, 110);

        jPanel3.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setText("Destino do Servidor:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 10, 220, 15);

        MemoDestino.setColumns(20);
        MemoDestino.setRows(5);
        MemoDestino.setEnabled(false);
        jScrollPane2.setViewportView(MemoDestino);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 240, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(470, 210, 260, 110);

        pack();
    }
    // </editor-fold>//GEN-END:initComponents

    private void CBSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSituacaoActionPerformed
// TODO add your handling code here:
        
    }//GEN-LAST:event_CBSituacaoActionPerformed

    private void btnCancelDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDiariaActionPerformed
// TODO add your handling code here:
                  //V�riaveis para pegar o valor da linha selecionada
          int linha = tabela.getSelectedRow();
          int coluna = tabela.getSelectedColumn(); 
          if(linha == -1){//para saber se existe uma linha selecionada
          JOptionPane.showMessageDialog(null,"Escolha uma linha","ATEN��O",JOptionPane.WARNING_MESSAGE);              
          }else{
          //Vari�veis para pegar os valores das colunas da jTable
          String codigo = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,0).toString();
          String nome = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,1).toString();
          String dataSaida = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,2).toString();
          String dataChegada = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,3).toString();
          String destino = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,4).toString();          
          String situacao = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,5).toString();
          int  pegaCod = Integer.parseInt(codigo);   
          
          if(situacao.trim().equals("CANCELADA")){
           JOptionPane.showMessageDialog(null,"Di�ria j� Cancelada","ATEN��O",JOptionPane.WARNING_MESSAGE);
          }else{
          ClassDiaria diaria = new ClassDiaria();          
          diaria.setCodigo(pegaCod);          
          diaria.setDeletaDiaria(nome, dataSaida, dataChegada, destino);
          diaria.DeletaDiaria();
          ((DefaultTableModel)tabela.getModel()).setValueAt("CANCELADA", linha,5);           
          }     
          //Depois de Atualizada a jTable recebe o Valor de CANCELADA
        }
    }//GEN-LAST:event_btnCancelDiariaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
// TODO add your handling code here:
      int  linha = tabela.getRowCount();
      int i =0;  
      if(linha > 0){
      while(i < linha){
         ((DefaultTableModel)tabela.getModel()).removeRow(0);
         i++;
       }
      }else{
   try{
         String setor = CBSetor.getSelectedItem().toString();
         String situacao =  CBSituacao.getSelectedItem().toString();
         //ClassDiaria diaria = new ClassDiaria();
         ClassConecta conexao = new ClassConecta();
         Connection con = conexao.conecta();
         Statement stmt = conexao.con.createStatement();        
         ResultSet rs = stmt.executeQuery("Select * from TabCadDiaria where setor='" + 
                                          setor + "' and situacao='" + 
                                          situacao + "'");
         while(rs.next()){     
              //Adicionando os Dados da tabela na jTable              
             ((DefaultTableModel)tabela.getModel()).addRow(new Object[] {rs.getObject(1),
              rs.getObject(2),rs.getObject(3), rs.getObject(4), rs.getObject(5),rs.getObject(6)});                         
            }
          
         //para os bot�es n�o ficarem ativos
         if(CBSituacao.getSelectedIndex() == 0){ //Devendo
            btnCancelDiaria.setEnabled(true);
            btnEntregaRel.setEnabled(true);             
         }else{
         if(CBSituacao.getSelectedIndex() == 1){ //Entregue            
            btnCancelDiaria.setEnabled(false);
            btnEntregaRel.setEnabled(true);
        }else{
            if(CBSituacao.getSelectedIndex() == 2){  //Cancelada                      
            btnEntregaRel.setEnabled(false);
            btnCancelDiaria.setEnabled(true);  
             }
           }
         }  
         //====================================================
         if(tabela.getRowCount() == 0 ){
          JOptionPane.showMessageDialog(null,"Nenhum Servidor encontrado","ATEN��O",JOptionPane.WARNING_MESSAGE);
            }
       }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATEN��O",JOptionPane.WARNING_MESSAGE);          
       }
      }
    }//GEN-LAST:event_btnListarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
// TODO add your handling code here:
          int linha = tabela.getSelectedRow();
          int coluna = tabela.getSelectedColumn();   
          MemoDestino.setText( ((DefaultTableModel)tabela.getModel()).getValueAt(linha,4).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
                   
          //Personalizando a largura das Colunas
              tabela.getColumnModel().getColumn(0).setPreferredWidth(70); //Tamanho Inicial
              tabela.getColumnModel().getColumn(0).setMaxWidth(70);//Tamanho Maximo
              tabela.getColumnModel().getColumn(0).setMinWidth(70);//Tamanho M�nimo
              tabela.getColumnModel().getColumn(1).setPreferredWidth(350);
              tabela.getColumnModel().getColumn(1).setMaxWidth(350);
              tabela.getColumnModel().getColumn(1).setMinWidth(350);
              tabela.getColumnModel().getColumn(2).setPreferredWidth(70); 
              tabela.getColumnModel().getColumn(2).setMaxWidth(70);
              tabela.getColumnModel().getColumn(2).setMinWidth(70);
              tabela.getColumnModel().getColumn(3).setPreferredWidth(70); 
              tabela.getColumnModel().getColumn(3).setMaxWidth(70);
              tabela.getColumnModel().getColumn(3).setMinWidth(70);
              
          //================================================================

    }//GEN-LAST:event_formWindowActivated

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntregaRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregaRelActionPerformed
// TODO add your handling code here: 
          //V�riaveis para pegar o valor da linha selecionada
          int linha = tabela.getSelectedRow();
          int coluna = tabela.getSelectedColumn(); 
          if(linha == -1){//para saber se existe uma linha selecionada
           JOptionPane.showMessageDialog(null,"Selecione uma linha","ATEN��O",JOptionPane.WARNING_MESSAGE);              
          }else{
          //Vari�veis para pegar os valores das colunas da jTable
          String codigo = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,0).toString();
          String situacao = ((DefaultTableModel)tabela.getModel()).getValueAt(linha,5).toString();
          
          int  pegaCod = Integer.parseInt(codigo); 
          ClassMessage msg = new ClassMessage();
          if(situacao.trim().equals("ENTREGUE")){
            JOptionPane.showMessageDialog(null,"Di�ria j� Entregue","ATEN��O",JOptionPane.WARNING_MESSAGE);
              }else{
          ClassDiaria diaria = new ClassDiaria();          
          diaria.setCodigo(pegaCod);
          //System.out.println(diaria.getCodigo());
          diaria.EntregaRel();
          //Depois de Atualizada a jTable recebe o Valor de Entregue
          ((DefaultTableModel)tabela.getModel()).setValueAt("ENTREGUE", linha,5);
              }
          }
    }//GEN-LAST:event_btnEntregaRelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
        btnCancelDiaria.setEnabled(false);
        btnEntregaRel.setEnabled(false);
       Statement stmt= null;
       Connection  con = null;
     try{         
         //ClassDiaria CDiaria = new ClassDiaria();
         ClassConecta conexao = new ClassConecta();
         conexao.conecta();
         stmt = conexao.con.createStatement();
         ResultSet rs = stmt.executeQuery("Select * from TabCadDiaria");
         // ==> retorna o n�mero de colunas de uma tabela "rs.getMetaData().getColumnCount();"
         while(rs.next()){     
              //Adicionando os Dados da tabela na jTable              
             ((DefaultTableModel)tabela.getModel()).addRow(new Object[] {rs.getObject(1),
              rs.getObject(2),rs.getObject(3), rs.getObject(4), rs.getObject(5),rs.getObject(6)});           
            }         
         rs.close();
         //Selecionando os valores da Tabela de Setor  epreenchendo o jComboBox
         ResultSet rsSetor = stmt.executeQuery("select * from TabCadSetor");
          while(rsSetor.next()){
              CBSetor.addItem(rsSetor.getString("nome"));
          }          
          rsSetor.close();
          stmt.close();
         }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Ocorreu um erro no sistema, se o problema persistir contate o administrador: '" + e + "'","ATEN��O",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FListaDiarias().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBSetor;
    private javax.swing.JComboBox CBSituacao;
    private javax.swing.JTextArea MemoDestino;
    private javax.swing.JButton btnCancelDiaria;
    private javax.swing.JButton btnEntregaRel;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    
}
