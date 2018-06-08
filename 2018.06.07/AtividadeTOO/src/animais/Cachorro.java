package animais;

import classes.Mamifero;

public class Cachorro extends Mamifero {
	public Cachorro() {
		this("",0,0,0,"");
	}
	
	public Cachorro(String nome, int idade, int membros, double peso, String corPelo) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Correndo.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo ração.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo.");
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando Osso.");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o Rabo.");
	}
	
	// Sobrecarga
	public void reagir(String frase) {
		if(frase == "Olá") {
			System.out.println("Abanar o rabo e Latir.");
		} else {
			System.out.println("Rosnar.");
		}
	}
	
	public void reagir(int hora) {
		if(hora < 12) {
			System.out.println("Abanar o rabo.");
		} else if(hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar o rabo e Latir.");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("Abanar o rabo e Latir.");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}
	
	@Override
	public void ApresentarDados() {
		super.ApresentarDados(); 
		// Apresentar os dados da classe mamifero acrescentado os métodos a seguir.
		enterrarOsso();
		abanarRabo();
		System.out.println("-- SOBRECARGA --");
	}
}