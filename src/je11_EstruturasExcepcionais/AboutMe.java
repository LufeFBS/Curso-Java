package je11_EstruturasExcepcionais;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome ");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura");
        double altura = 0;
        try {
           altura = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.err.println("A Altura deve ser digitada no padrão americano 0.00");
        }
        System.out.println("Olá, me chamo " + nome.toUpperCase()+ "" + sobrenome.toUpperCase());
        System.out.println("Tenhou " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();

    }
}
