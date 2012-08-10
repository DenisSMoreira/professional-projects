package Login;

import conexão.conectarBanco;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import telaPrincipal.TelaPrincipal;


public class Usuarios {

    conectarBanco con = new conectarBanco();

    public int Conta;

    public void cadastrar(){



    }
    public int verificiar(String Login, String Senha){
        // Verifica se algum campo está vazio
        if (Login.equals("") || (Senha.equals(""))) {
            JOptionPane.showMessageDialog(null, "Os Campos não Podem ser vazio!");

            return Conta;
        }

        //Verifica se o usuario está cadastrado e da 3 chances para o usuario
        if (Conta <= 3) {
            try {
                String sql = "select * from usuarios Where nome like '" + Login + "' and senha like '" + Senha + "'";

               con.executeSQL(sql);

                if (con.resultset.first()) {
                    new TelaPrincipal().show();
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

   public void conectar(){
 con.conecta();
 con.executeSQL("select * from usuarios");
   }

   public static void main (String args[]){
       new TelaLogin().show();
   }
}
