package br.com.mectex.cadastros.cliente;







public class Validação {
    
    private String atentica;
    private String resposta;
    
    
    
    
    //Verifica dados com campo vazio
    public String Verificação(String nome, String end, String bairro, String numero, String cidade, String sexo)
    {
    
    if (nome.equals("") || end.equals("") || bairro.equals("") || numero.equals("") || cidade.equals("") || sexo.equals(""))
    {
        
        atentica  = "No";
        return atentica;
    }
       else{
            atentica = "Yes";
            return atentica;
           }

    }
    
    //Verifica se o email é valido
    public String validate(String arg)
    {
        resposta = "Valido";
        
        if(arg.equals("")){
            return resposta = "Valido";
        }
        if ((arg.length() < 4) || !arg.contains("@") || !arg.contains(".")) 
        {
            return resposta = "Invalido";
        }
        
        return resposta;
    }
}
