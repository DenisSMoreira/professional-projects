import java.sql.*;
public class ClassUsuario {
    

    public ClassUsuario() {    }
    //========================================================
    //========================================================
    //m�todos para receberem os valores do form usu�rio 
    //========================================================
    //========================================================
    private String usuario;
    private String senha;
    
    public void setUsuario(String _usuario, String _senha){
        this.usuario = _usuario;
        this.senha = _senha;
    }
    
    public String getusuario(){
        return this.usuario;
    }
    
    public String getsenha(){
        return this.senha;
    }
    
    //========================================================
    // Fim do m�todo
    //========================================================
    
    //========================================================
    // String de Conexao com o Banco
    //========================================================
    private String url = "jdbc:odbc:DBDiaria";
    private String driver ="sun.jdbc.odbc.JdbcOdbcDriver";
    private String user = "";
    private String pwd = "";
    //========================================================
    //Fun��o para conectar  no banco
    //========================================================
    Connection con = null;
    Statement stmt = null;
    
    public boolean conecta(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pwd);
            stmt = con.createStatement();
        }catch(ClassNotFoundException e){
            System.err.println("Driver n�o encontrado!\n"+ e);   
            return false;
        }catch(SQLException e){
            System.err.println("Erro na Conex�o com Banco\n"+e);
            return false;}
        System.out.println("Conectado");
        return true;
    }
    //========================================================
    
    //========================================================
    //fun��o para incluir usuario
    //========================================================
    
    void incluiUsuario(){
        conecta();
        try{
        String comando = "insert into TabUsuario(usuario, senha) values('"+ getusuario() +"','"+ getsenha() +"')";
        System.out.println("Inserindo Usu�rio");
        stmt.executeUpdate(comando);
        System.out.println("Inser��o Feita");
        }catch(Exception e){
            System.err.println("Erro na Inclus�o\n"+e);            
        }
    }
    //========================================================
    
    //========================================================
    //Este m�todo serve para fazer a autentica��o
    // do usu�rio, ele procura o Usu�rio pelo login e pela senha
    //========================================================
    void procuraUsuario(){        
        
        String procura = "select * from TabUsuario where usuario='"+ this.usuario +"' and senha = '"+ this.senha +"'";
        conecta();
        try{
            ResultSet rs = stmt.executeQuery(procura);
            while(rs.next()){
                try{
                  System.out.println(rs.getString("usuario"));    
                }catch(Exception e){
                  System.out.println(e);  
                }
            }
        }catch(SQLException e){
             System.out.println("Erro ao executar a sele��o");            
        }
    }
    //========================================================
    
    
    
    
    
    
}
