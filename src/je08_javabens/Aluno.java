package je08_javabens;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String newNome){
        nome = newNome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int newIdade){
        if(newIdade <0)
            throw new IllegalArgumentException("Idade deve ser superior a 0");
        this.idade = newIdade;
    }
}
