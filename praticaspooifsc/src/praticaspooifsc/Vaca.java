package praticaspooifsc;

public class Vaca extends Mamifero {
	private Boolean permiteOrdenha;

	public Vaca(String nome, String classe, Integer velocidade, Boolean permiteOrdenha) {
		
		
		super(nome, classe, velocidade);
		this.permiteOrdenha = permiteOrdenha;
		
		
	}
	
	public void ordenhar() {
		
		if(permiteOrdenha = true ) {
			System.out.println("vaca  ordenhada");
		}
		else {
			System.out.println("Vaca não ordenhada");
		}
		
	}
	public void falar() {
		System.out.println(" vaca gritar ");
		
	}
	
	

}
