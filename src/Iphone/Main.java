package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("veigh-artista generico ");

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();

        iphone.ligar("3333-9999");
        iphone.atender();
        iphone.iniciandoCorreioVoz();
    }
}
