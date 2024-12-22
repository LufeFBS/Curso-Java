package je14_classes_essenciais;
import java.util.Scanner;
import java.util.InputMismatchException;

public class In {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scan.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
    }
}
