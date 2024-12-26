package je19_expressoes;

import java.time.LocalDate;

public class exSimples2 {
    public static void main(String[] args) {
        String nome = "Ana Julia Ferraz";
        Integer matricula = 123;
        Double salario = 2522.25;
        LocalDate dataAdmissao = LocalDate.now();
        System.out.println(dataAdmissao);
        //s, d, f, t
        String dadosFuncionario = String.format("Data: %td/%<tm/%<ty", dataAdmissao);
        /*String dadosFuncionario = String.format("Mat.: %05d - Nome: %s - Sal.: %f",
                matricula, nome, salario);

         */
        System.out.println(dadosFuncionario);
    }
}

