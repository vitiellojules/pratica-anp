package praticaspooifsc;

public class Cachorro extends Mamifero {
	private Boolean tipoLatido;
	public Cachorro(String nome, String classe, Integer velocidade, Boolean tipoLatido) {
		super(nome, classe, velocidade);
		this.tipoLatido = tipoLatido;
	
	}
	public void setLateAlto() {
		this.tipoLatido = tipoLatido;
	}
	
	public void setLateBaixo() {
		this.tipoLatido = tipoLatido;
	}
	
	public void falar() {
		System.out.println("Cachorro late auau");
}
}