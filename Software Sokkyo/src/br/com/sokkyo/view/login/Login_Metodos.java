package br.com.sokkyo.view.login;



import com.Sokkyo.Login.Acesso.*;
import com.Sokkyo.ControleGeral.ControleGeral;

import com.Sokkyo.Utilitarios.Conexão.Conexão;


import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Login_Metodos {
    //Objeto da Class Conexao
    Conexão softwaresokkyo = new Conexão();
    
    //Variaveis
    public int    Conta  =  0;
    public String Tipo   = "";
    public String codigo = "";

    public void Conectar() {
        //Conecta com o banco e seleciona a tabela Login
        softwaresokkyo.conecta();
        softwaresokkyo.executeSQL("select * from login");
    }

    public int VerificarUsuario(String Login, String Senha) {
       // Verifica se algum campo está vazio
        if (Login.equals("") || (Senha.equals(""))) {
            JOptionPane.showMessageDialog(null, "Os Campos não Podem ser vazio!");

            return Conta;
        }

        //Verifica se o usuario está cadastrado e da 3 chances para o usuario
        if (Conta <= 3) {
            try {
                String sql = "select * from login Where login like '" + Login + "' and Senha like '" + Senha + "'";

                softwaresokkyo.executeSQL(sql);

                if (softwaresokkyo.resultset.first()) {
                    //Verifica o tipo de acesso que o usuario terá e chama o ControleGeral
                    verficarTipoDeUsuario(Login);
                    new ControleGeral(Tipo).show();
                    return Conta = 4;
                } else {
                    Conta++;

                    if (Conta == 1) {
                        JOptionPane.showMessageDialog(null, "Senha Incorreta \nVoce Sò Tem Mais 2 Chance !");

                        return Conta;
                    }

                    if (Conta == 2) {
                        JOptionPane.showMessageDialog(null, "Senha Incorreta \nVoce Sò Tem Mais 1 Chance !");

                        return Conta;
                    }

                    if (Conta == 3) {
                        JOptionPane.showMessageDialog(null,
                                                      "Usuario Restrito ao Uso do Sistema \nO Aplicativo Será Fechado");

                        return Conta;
                    }
                }
            } catch (SQLException erro) {}
        }

        return Conta;
    }

    private void verficarTipoDeUsuario(String Login) {
        //Verifica novamente se o o usuario foi cadastrado e pega o tipo de acesso do usuario
        softwaresokkyo.executeSQL("select * from login");

        try {
            softwaresokkyo.resultset.first();

            String igual = "n";

            while (igual == "n") {
                String pesquisando = softwaresokkyo.resultset.getString("login");

                if (pesquisando.equals(Login)) {
                    igual = "s";
                } else {
                    softwaresokkyo.resultset.next();
                }
            }

            codigo = softwaresokkyo.resultset.getString("codigo");

            String b = softwaresokkyo.resultset.getString("Senha");

            Tipo = softwaresokkyo.resultset.getString("tipo");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Nao Foi Localizado os Dados !");
        }
    }

       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new Login().show();

            }
        });
    }
}




