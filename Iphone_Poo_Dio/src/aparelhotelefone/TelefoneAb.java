package Iphone_Poo_Dio.src.aparelhotelefone;

public abstract class TelefoneAb implements TelefoneInt {
	
	
	public void ligar(int numero) {
		System.out.println("Ligando para" + numero);
	}
	
	
	
	public void atender() {
		System.out.println("Atendendo a ligação.");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz ativado.");
	}
	
	
}
