package je19_expressoes;

public class exsimples {
    public static void main(String[] args) {
        String nome = "Ana";
        String sobrenome = "Ferras";
        String textoImpresso = String.format("Ola %s %s", nome, sobrenome);
        //s, d, f, t
        System.out.println(textoImpresso);
    }
}
