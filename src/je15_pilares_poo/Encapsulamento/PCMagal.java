package je15_pilares_poo.Encapsulamento;

public class PCMagal {
    public static void main(String[] args) {
        SistemadeMensagemInstantanea smi = null;
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSN();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessager();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
