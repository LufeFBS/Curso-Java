package je13_Enums;

public enum EstadoBrasileiro {

    PI ("Piaui", "PI"),
    MA ("Maranhao", "MA"),
    SP ("Sao Paulo", "SP"),
    RJ ("Rio de Janeiro", "RJ"),
    MG ("Minas Gerais", "MG"),

    ;

    private String nome;
    private String sigla;
    private EstadoBrasileiro (String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }
}
