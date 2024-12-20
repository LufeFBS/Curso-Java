package je06_operadores;

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        int idadeIza = 1;
        boolean maiorIdade = idadeIza >= 18;
        //System.out.println("Iza é maior de idade? " + maiorIdade);
        System.out.println("Iza é maior de idade? " + (maiorIdade ? "Sim" : "Não"));
       /* if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");
        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");
        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");
        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");
        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        */
    }
}
