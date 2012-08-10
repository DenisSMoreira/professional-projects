package br.com.mectex.configuração;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookAndFeel {
    public String seta_look = "com.jtattoo.plaf.noire.NoireLookAndFeel";

    public void lookandfeel(JFrame frame) {
        try {
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    public void LookAndFeelAcry(JFrame frame) {
        try {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE",
                    "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (Exception ex) {}
    }
    
      public void LookAndFeelAcryRed(JFrame frame) {
        try {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Red", "INSERT YOUR LICENSE KEY HERE",
                    "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (Exception ex) {}
    }
        public void LookAndFeelSmart(JFrame frame) {
        try {
            com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme("Gray", "INSERT YOUR LICENSE KEY HERE",
                    "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.smart.SmartLookAndFeel";
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (Exception ex) {}
    }
   
        public void LookAndFeelHifi(JFrame frame){
            try{
              com.jtattoo.plaf.hifi.HiFiLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
          seta_look="com.jtattoo.plaf.hifi.HiFiLookAndFeel";
          UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
            }
            catch(Exception e){
                
            }
        }
        public void LookAndFeelNoire(JFrame frame){
            try{
              com.jtattoo.plaf.noire.NoireLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look="com.jtattoo.plaf.noire.NoireLookAndFeel";
          UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
            }
            catch(Exception e){
                
            }
        }
        public void LookAndFeelFast(JFrame frame){
            try{
              com.jtattoo.plaf.fast.FastLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look="com.jtattoo.plaf.fast.FastLookAndFeel";
          UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
            }
            catch(Exception e){
                
            }
        }
         
         public void LookAndFeelLuna(JFrame frame){
            try{
                  com.jtattoo.plaf.luna.LunaLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
        seta_look="com.jtattoo.plaf.luna.LunaLookAndFeel";
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
            }
            catch(Exception e){
                
            }
        }
         public void LookAndFeelNimROD(JFrame frame){
            try{
            seta_look="com.nilo.plaf.nimrod.NimRODLookAndFeel";
         
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
            }
            catch(Exception e){
                
            }
        }
          public void LookAndFeelLiquid(JFrame frame){
            try{
         seta_look="com.birosoft.liquid.LiquidLookAndFeel";
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(frame);
            }
            catch(Exception e){
                
            }
        }
}



