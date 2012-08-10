/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conexão;

import java.sql.*;
import javax.swing.*;



public class conectarBanco
{
    final public String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    final public String url = "jdbc:odbc:lilipipas";
     final public String usuarioBanco = "root";
      final public String senhaBanco = "root";

     public Connection Conexão;
     public Statement statement;
     public ResultSet resultset;
     public String sqlP;

             public boolean conecta(){
          boolean result = true;

          try
          {

              Class.forName(driver);
              Conexão = DriverManager.getConnection(url, usuarioBanco, senhaBanco);

          }
          catch(ClassNotFoundException Driver)
          {
              JOptionPane.showMessageDialog(null,"Driver Não Localizado: "+ Driver);
              result = false;

          }

          catch(SQLException Fonte)
          {
              JOptionPane.showMessageDialog(null,"Deu Erro na Conexão"+ "Com Fonte de Dados: "+Fonte);
              result = false;
          }

          return result;

      }

      public void desconecta()
      {
          boolean result = true ;

          try {

              Conexão.close();
              JOptionPane.showMessageDialog(null,"Banco de Dados Fexado");
          }

          catch (SQLException fecha)
          {
              JOptionPane.showMessageDialog(null,"Não Foi Possivel"+ "fechar o Banco de Dados "+fecha);

              result = false;

          }

      }
      public void executeSQL(String sql)
      {
          try
          { sqlP = sql;
              statement = Conexão.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);


          }
          catch(SQLException sqlex)
          {
              JOptionPane.showMessageDialog(null,"Nao Foi Possivel "+ "Executar o Comando Sql,"+sqlex+"o Sql passado foi: "+sql);
          }
      }


public static Connection getConnection() throws
         ClassNotFoundException, SQLException {
         String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
         String url = "jdbc:odbc:lilipipas";
         String user = "root";
         String password = "root";
            Class.forName(driver);
         Connection con = DriverManager.getConnection(url, user, password);
         return con;
    }

}
