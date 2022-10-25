package praticaspooifsc;

import java.util.LinkedList;

public class Main {

	
public static void main(String[] args) {
		
		Papagaio p = new Papagaio(" nome xxx", "classe yyyy", " vocaburario -----");
		BemTeVi bemTeVi = new BemTeVi("nome aaaaa ", "ave ");
		Cachorro c = new Cachorro ("micky"," animal domestico", 4, true);
		Vaca v = new Vaca("vaca ", "Animal", 10, false);
		
		LinkedList<BemTeVi>BemTeVi = new LinkedList<>();
		LinkedList<Papagaio>Papagaio = new LinkedList<>();
		LinkedList<Vaca>Vaca = new LinkedList<>();
		LinkedList<Cachorro>Cachorro = new LinkedList<>();
		
		Papagaio.add(p);
		BemTeVi.add(bemTeVi);
		Cachorro.add(c);
		Vaca.add(v);
		
		System.out.println(p.getNome());
		System.out.println(p.getClasse());
		p.falar();
		
		System.out.println(bemTeVi.getNome());
		System.out.println(bemTeVi.getClasse());
		bemTeVi.falar();
		
		
		System.out.println(c.getNome());
		System.out.println(c.getClasse());
		c.correr();
		c.falar();
		
		System.out.println(v.getNome());
		System.out.println(v.getClasse());
		v.correr();
		v.ordenhar();
		v.falar();
		
		

	}

}


