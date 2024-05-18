package Iphone_Poo_Dio.src.reprodutormus;

public abstract class ReprodutorAbs implements ReprodutorInter{
	protected String musica;
	
	public ReprodutorAbs(String musica) {
		this.musica = musica;
	}
	
	
	public void tocar() {
		System.out.println(musica + " está tocando.");
	}
	
	public void pausar() {
		System.out.println(musica + "pausada!");
	}
	
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println(musica + " selecionada.");
	}
	
	public String getMusica() {
		return musica;
	}
}
