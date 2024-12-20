package je06_operadores;

public class Ternario {
    public static void main(String[] args){
        String nome = "Iza";
        int idade = 1;
        int maior_Idade = 18;
        boolean maior_idade = idade >= maior_Idade;
        String mensagem = nome + (maior_idade ? "é de maior" : "não é de maior.");
        System.out.println(mensagem);
    }
}
