package Iphone;

import IphoneInterfaces.aparelhoTelefonico;
import IphoneInterfaces.NavegadorNaInternet;
import IphoneInterfaces.reprodutorMusical;
	public class Iphone implements reprodutorMusical,aparelhoTelefonico,NavegadorNaInternet	{
		 public void tocar() {
		        System.out.println("Tocando música...");
		    }
		    public void pausar() {
		        System.out.println("Pausando música...");
		    }
		    public void selecionarMusica(String musica) {
		        System.out.println("Selecionando música: " + musica);
		    }
		    public void exibirPagina(String url) {
		        System.out.println("Exibindo página: " + url);
		    }
		    public void adicionarNovaPagina() {
		        System.out.println("Adicionando nova aba...");
		    }
		    public void atualizarPagina() {
		        System.out.println("Atualizando página...");
		    }
		    public void ligar(String numero) {
		        System.out.println("Ligando para: " + numero);
		    }
		    public void atender() {
		        System.out.println("Atendendo ligação...");
		    }
		    public void iniciandoCorreioVoz() {
		        System.out.println("Iniciando correio de voz...");
		    }
}
