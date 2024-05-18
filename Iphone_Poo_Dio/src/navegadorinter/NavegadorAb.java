package Iphone_Poo_Dio.src.navegadorinter;

public abstract class NavegadorAb implements NavegadorInt{
	public void exibirPagina() {
		System.out.println("Exibindo página.");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova aba.");
	}
	public void atualizarAba() {
		System.out.println("Aba atualizada.");
	}
}
