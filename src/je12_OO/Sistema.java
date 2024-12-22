package je12_OO;

public class Sistema {

    public static void main(String[] args){
        Cliente gleyson = new Cliente();
        gleyson.nome = "Gleyson Silva ";
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarlimiteCredito(200.0);
        System.out.println(gleyson.limiteCredito);

        Cliente izabelly = new Cliente();
        izabelly.nome = "Izabelly Arruda ";
        System.out.println(izabelly.limiteCredito);
        izabelly.solicitarlimiteCredito(80.0);
        System.out.println(gleyson.limiteCredito);

        System.out.println("Limite do(a) " + izabelly.nome + "é " + izabelly.limiteCredito);
        System.out.println("Limite do(a) " + gleyson.nome + "é " + gleyson.limiteCredito);

    }
}
