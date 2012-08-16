package br.com.sokkyo.comum.util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LookAndFeel {

    private String seta_look = "com.jtattoo.plaf.noire.NoireLookAndFeel";
     
    public void lookandfeel(JFrame frame) {
        try {
            atualizaLook(frame);
        } catch (Exception erro) {
          JOptionPane.showMessageDialog(frame, erro.getMessage());
        }
    }

    public void lookAndFeelAcry(JFrame frame) {
        try {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
            atualizaLook(frame);
        } catch (Exception ex) {
        }
    }

    public void lookAndFeelAcryRed(JFrame frame) {
        try {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Red", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
            atualizaLook(frame);
        } catch (Exception ex) {
              JOptionPane.showMessageDialog(frame, ex.getMessage());
              System.out.println(ex);
        }
    }

    public void lookAndFeelSmart(JFrame frame) {
        try {
            com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme("Gray", "INSERT YOUR LICENSE KEY HERE",  "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.smart.SmartLookAndFeel";
            atualizaLook(frame);
        } catch (Exception ex) {
              JOptionPane.showMessageDialog(frame, ex.getMessage());
              System.out.println(ex);
        }
    }

    public void lookAndFeelHifi(JFrame frame) {
        try {
            com.jtattoo.plaf.hifi.HiFiLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
            atualizaLook(frame);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(frame, e.getMessage());
              System.out.println(e);
        }
    }

    public void lookAndFeelNoire(JFrame frame) {
        try {
            com.jtattoo.plaf.noire.NoireLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.noire.NoireLookAndFeel";
            atualizaLook(frame);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(frame, e.getMessage());
              System.out.println(e);
        }
    }

    public void lookAndFeelLuna(JFrame frame) {
        try {
            com.jtattoo.plaf.luna.LunaLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "Nokys Sistemas");
            seta_look = "com.jtattoo.plaf.luna.LunaLookAndFeel";
            atualizaLook(frame);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(frame, e.getMessage());
              System.out.println(e);
        }
    }

    public void lookAndFeelNimROD(JFrame frame) {
        try {
            seta_look = "com.nilo.plaf.nimrod.NimRODLookAndFeel";
            atualizaLook(frame);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(frame, e.getMessage());
              System.out.println(e);
        }
    }

    public void lookAndFeelLiquid(JFrame frame) {
        try {
            seta_look = "com.birosoft.liquid.LiquidLookAndFeel";
            atualizaLook(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
            System.out.println(e);
        }
    }

    private void atualizaLook(JFrame frame) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(seta_look);
        SwingUtilities.updateComponentTreeUI(frame);
    }
}
