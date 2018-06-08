package animais;

import classes.Reptil;

public class Cobra extends Reptil {
	public Cobra() {
		this("",0,0,0,"");
	}
	
	public Cobra(String nome, int idade, int membros, double peso, String corEscama) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.corEscama = corEscama;
	}
	
	@Override
	public void locomover() {
		System.out.println("Rastejando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo um esquilo.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("sssssss (SOM DE COBRA)");
	}
}