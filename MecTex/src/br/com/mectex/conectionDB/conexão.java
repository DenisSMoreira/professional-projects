/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mectex.conectionDB;





import java.sql.*;
import javax.swing.*;



public class conexão
{
    final public String driver = "com.mysql.jdbc.Driver";
    final public String url = "jdbc:mysql://localhost:3306/mectex";
     final public String usuarioBanco = "root";
      final public String senhaBanco = "root";

     public Connection Conexão;
     public Statement statement;
     public PreparedStatement preparedStatement;
     public ResultSet resultset;
     public String sqlP;

             public Connection getConnection() {
		System.out.println("Conectando ao banco");
		 try {
		 return DriverManager.getConnection(url, usuarioBanco, senhaBanco);
                 } catch(SQLException e) {
                     JOptionPane.showMessageDialog(null, e);
		 throw new RuntimeException(e); }
		 }

      public void desconecta()
      {
          boolean result = true ;

          try {
              System.out.println("Fechando conexão...");
              Conexão.close();
               System.out.println("Conexão fechada.");
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
}