package je12_OO.comparacao;

public class comparacaoApp {
    public static void main(String[] args){
    //stack vs heap

    Integer i1 = 128;
    Integer i2 = Integer.parseInt("129");

    System.out.println(i1.equals(i2));
}
}