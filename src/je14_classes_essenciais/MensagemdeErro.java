package je14_classes_essenciais;

public class MensagemdeErro {

    public static void main(String[] args){
        try {
            System.out.println("Dividindo 1/0");
            System.out.println(1/0);
        } catch (Exception ex){
            System.err.println("Houve um erro na tentativa de divisao.");
        }
    }
}
