/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mectex.cadastros.cliente;

import br.com.mectex.conectionDB.conexão;
import com.mysql.jdbc.Connection;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ChamarRelatorio extends JDialog{
    
     Connection con = (Connection) new conexão().getConnection();
     String arquivo = "H:\\Projetos\\MecTex\\src\\br\\com\\mectex\\cadastros\\cliente\\RelatorioDeClientes.jasper";  
      HashMap map = new HashMap();
      
   public ChamarRelatorio(JFrame parent, boolean modal){
    
      this.setModal(true);
      this.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
      this.setLocation(100,100); 
      this.setResizable(true);
      this.setSize(900,600);
      this.setTitle("Relatório de Clientes");
       
      try {
         JasperReport  jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,con); 
            JasperViewer jrviewer = new JasperViewer(jasperPrint, true);
            jrviewer.setTitle("Relatório de Clientes");
            
                    this.getContentPane().add(jrviewer.getContentPane()); 
            this.setVisible(true); 
                
        } catch (JRException ex) {
            Logger.getLogger(ChamarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
           
       
         
   }
     
}
