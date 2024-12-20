package je10_ControleDeFluxo_Repetição;

import java.util.List;
import java.util.Random;

public class ExemploFor {
    public static void main(String[] args) {
        boolean acordado = true;
        int carneirinhos = 0;
            while(acordado) {
                System.out.println("contando carneirinhos..." + (++carneirinhos));
                 acordado = !(new Random().nextInt(20) == carneirinhos);
                 if(carneirinhos==20)
                     carneirinhos = 0;
            }
        }
    }