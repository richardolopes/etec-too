package animais;

import classes.Mamifero;

public class Canguru extends Mamifero {
	public Canguru() {
		this("",0,0,0,"");
	}
	
	public Canguru(String nome, int idade, int membros, double peso, String corPelo) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.corPelo = corPelo;
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de canguru (NÃO SEI)");
	}
	
	public void usarBolsa() {
		System.out.println("Usando a Bolsa.");
	}
	
	@Override
	public void ApresentarDados() {
		super.ApresentarDados();
		usarBolsa();
	}
}