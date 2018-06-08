package classes;

import animal.Animal;

public class Mamifero extends Animal {
	// Variável que estava no vídeo.
	protected String corPelo;
	
	// Método construtor herdando os atributos da classe Animal.
	// Inicialização dos atributos de um objeto no momento de sua criação.
	public Mamifero() {
		this("",0,0,0,"");
		/*
		 *  Este construtor, sem parâmetros, adiciona zero em cada um dos atributos, 
		 *  já que dois atributos são do tipo inteiro e o outro é do tipo double;
		 *  
		 */
	}
	
	public Mamifero(String nome, int idade, int membros, double peso, String corPelo) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.corPelo = corPelo;
	}

	// Get e Set para acessarmos os atributos.
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	// Sobreposição dos métodos que foram criados na classe abstrata Animal.
	@Override
	public void locomover() {
		System.out.println("Movendo-se como um mamifero.");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo como um mamifero.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som como um mamifero.");
	}
	
	public void ApresentarDados() {
		System.out.println("-------------------");
		System.out.println("Animal: " + this.nome);
		System.out.println("  Idade: " + this.idade);
		System.out.println("  Membros: " + this.membros);
		System.out.println("  Peso: " + this.peso);
		System.out.println("  Cor Pelo: " + this.corPelo);
		locomover();
		alimentar();
		emitirSom();
	}
}