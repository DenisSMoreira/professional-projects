package web.login.util;

/**
 * 
 * Enum para os status do usu�rio.
 * 
 */
public enum StatusEnum {

    /**
     * Status do usuario.
     */
    CADASTRADO((short) 1), PENDENTE((short) 2), ATIVADO((short) 3), BLOQUEADO((short) 4), DESATIVADO((short) 5);
    /**
     * Valor inteiro correspondente ao status.
     */
    private final short valor;

    /**
     * @param valor
     *            Valor inteiro correspondente ao status.
     */
    StatusEnum(short valor) {
        this.valor = valor;
    }

    /**
     * 
     * @return Retorna o valor inteiro correspondente ao status.
     */
    public short getValor() {
        return valor;
    }
}