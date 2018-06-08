package classes;

import animal.Animal;

public class Peixe extends Animal {
	// Variável que estava no vídeo.
	protected String corEscama;
	
	// Método construtor herdando os atributos da classe Animal.
	// Inicialização dos atributos de um objeto no momento de sua criação.
	public Peixe() {
		this("",0,0,0,"");
		/*
		 *  Este construtor, sem parâmetros, adiciona zero em cada um dos atributos, 
		 *  já que dois atributos são do tipo inteiro e o outro é do tipo double;
		 *  
		 */
	}

	public Peixe(String nome, int idade, int membros, double peso, String corEscama) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.corEscama = corEscama;
	}
	
	// Get e Set para acessarmos os atributos.
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	// Sobreposição dos métodos que foram criados na classe abstrata Animal.
	@Override // Sobrepor
	public void locomover() {
		System.out.println("Locomovendo-se como um peixe.");
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando-se como um peixe.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som como um peixe.");
	}

	// Método único para classe Peixe.
	public void soltarBolha() {
		System.out.println("Soltou uma bolha.");
	}
	
	public void ApresentarDados() {
		System.out.println("-------------------");
		System.out.println("Animal: " + this.nome);
		System.out.println("  Idade: " + this.idade);
		System.out.println("  Membros: " + this.membros);
		System.out.println("  Peso: " + this.peso);
		System.out.println("  Cor Escama: " + this.corEscama);
		locomover();
		alimentar();
		emitirSom();
		soltarBolha();
	}
}