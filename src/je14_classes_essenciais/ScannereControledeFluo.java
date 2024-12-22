package je14_classes_essenciais;

import java.util.Scanner;

public class ScannereControledeFluo {
    public static void main(String[] args){
        String nome = null;
        Integer idade = null;
        Double peso = null;

        String stringLinhaArquivo = "gleyson sampaio|19|55.10";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter("\\|");

        int index = 0;
        while(scan.hasNext()) {
            if (index == 0)
                nome = scan.next();
            else if(index == 1)
                idade = Integer.valueOf(scan.next());
            else peso = Double.valueOf(scan.next());
            index ++;
        }

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);
    }
}
