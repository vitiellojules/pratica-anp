package praticaspooifsc;

public class Ave extends Animal{
	
	public Ave(String nome, String classe) {
		super.setNome(nome);
		super.setClasse(classe);
	}
	
	public void falar() {
		System.out.println(" ave falar | ");
		
	}
	
	public void voar() {
		System.out.println(" voar ");

	}
}


