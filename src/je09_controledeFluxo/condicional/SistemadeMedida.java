package je09_controledeFluxo.condicional;

public class SistemadeMedida {
    public static void main(String[] args) {
        String sigla = "P";

        switch (sigla){
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
