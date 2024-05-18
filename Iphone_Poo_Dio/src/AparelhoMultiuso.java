package Iphone_Poo_Dio.src;

import Iphone_Poo_Dio.src.aparelhotelefone.TelefoneInt;
import Iphone_Poo_Dio.src.navegadorinter.NavegadorInt;
import Iphone_Poo_Dio.src.reprodutormus.ReprodutorInter;


public class AparelhoMultiuso implements TelefoneInt, NavegadorInt, ReprodutorInter{

	  public void tocar() {
	    System.out.println("Ouvindo a música.");
	  }
	  

	  public void pausar() {
	    System.out.println("Pausando a música.");
	  }

	  public void selecionarMusica(String musica) {
	    System.out.println(musica + " selecionada");
	  }

	  public void ligar(int numero) {
	    System.out.println("Ligando para " + numero);
	  }
	  
	  public void atender() {
	    System.out.println("Atendendo ligação.");
	  }

	 
	  public void iniciarCorreioDeVoz() {
	    System.out.println("Correio de voz.");
	  }

	  public void exibirPagina() {
	    System.out.println("Exibindo a página.");
	  }

	  public void adicionarNovaAba() {
	    System.out.println("Adicionando página.");
	  }

	  public void atualizarAba() {
	    System.out.println("Atualizando página.");
	  }
}
