package Iphone_Poo_Dio.src;

public class Main {

	public static void main(String[] args) {
		AparelhoMultiuso aparelho = new AparelhoMultiuso();
		
		   aparelho.selecionarMusica("Musica");
		   aparelho.tocar();
		   aparelho.pausar();
		   

		   aparelho.atender();
		   aparelho.iniciarCorreioDeVoz();
		   aparelho.ligar(457798952);

		   aparelho.exibirPagina();
		   aparelho.atualizarAba();
		   aparelho.adicionarNovaAba();
	}
}
