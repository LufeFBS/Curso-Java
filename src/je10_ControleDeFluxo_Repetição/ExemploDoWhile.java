package je10_ControleDeFluxo_Repetição;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args){
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando - trim trim");
        } while (tocando());
        if(numeroTentativas <=5)
        System.out.println("Alô!!!");
        else
            System.out.println("Não atendeu");
    }
    private static boolean tocando(){
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(5)==1;
        if(numeroTentativas == 5)
            return false;
            else
                return !atendeu;
    }
}
