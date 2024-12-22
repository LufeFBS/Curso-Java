package je12_OO.comparacao;

public class FabricadeCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro ("branca", "fiat", "palio");
        Carro carro2 = new Carro ("branca", "fiat", "palio");
        Carro carro3 = new Carro ("branca", "fiat", "palio");
        Carro carro4 = new Carro ("branca", "fiat", "palio");
        Carro carro5 = new Carro ("branca", "fiat", "palio");
        Carro carro6 = carro1;

        System.out.println(carro1 == carro2);
        System.out.println(carro1.equals(carro2));
    }
}
