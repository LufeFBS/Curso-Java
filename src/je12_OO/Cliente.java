package je12_OO;

public class Cliente {

    String nome;
    Double limiteCredito = 10.0;

    public void solicitarlimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }
    public void compra (Double valorProduto){
        limiteCredito = limiteCredito - valorProduto;
    }
}
