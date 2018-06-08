package animal;

import animais.Cachorro;

import animais.Canguru;
import animais.Cobra;
public class Program {	
	@SuppressWarnings("unused")
	public static void main(String []args) {
		/*
		Animal animal = new Animal();
		Não podemos criar um objeto Animal pois o mesmo é uma classe abstrata.
		
		Mamifero m = new Mamifero("Mamifero",12,4,23.5,"Preto");
		m.ApresentarDados();
		
		Reptil r = new Reptil("Reptil",12,4,23.5,"Verde");
		r.ApresentarDados();
		
		Peixe p = new Peixe("Peixe",12,4,23.5,"Laranja");
		p.ApresentarDados();
		
		Ave a = new Ave("Ave",12,4,23.5,"Azul");
		a.ApresentarDados();
		*/
		
		Cachorro cachorro = new Cachorro("Cachorro",11,4,34,"Cinza");
		cachorro.ApresentarDados();
		// Sobrecarga
		cachorro.reagir("Olá");
		cachorro.reagir(true);
		cachorro.reagir(18);
		
		Canguru canguru = new Canguru("Canguru",11,11,11,"Marrom");
		canguru.ApresentarDados();
		
		Cobra cobra = new Cobra("Cobra",10,0,10,"Verde");
		cobra.ApresentarDados();
	}
}