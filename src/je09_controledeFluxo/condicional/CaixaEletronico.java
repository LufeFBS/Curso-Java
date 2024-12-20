package je09_controledeFluxo.condicional;

public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 14.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque foi realizado com Sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(saldo);
    }
}
