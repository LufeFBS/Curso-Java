package je15_pilares_poo.Encapsulamento;

public class FacebookMessager  extends SistemadeMensagemInstantanea{
    public void enviarMensagem() {
        System.out.println("ENviando Mensagem pelo FacebookMensseger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo FacebookMensseger");
    }
}
