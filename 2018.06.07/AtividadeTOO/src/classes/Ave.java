package classes;

import animal.Animal;

public class Ave extends Animal {
	// Variável que estava no vídeo.
	protected String corPena;
	
	// Método construtor herdando os atributos da classe Animal.
	// Inicialização dos atributos de um objeto no momento de sua criação.
	public Ave() {
		this("",0,0,0,"");
		/*
		 *  Este construtor, sem parâmetros, adiciona zero em cada um dos atributos, 
		 *  já que dois atributos são do tipo inteiro e o outro é do tipo double;
		 *  
		 */
	}
	
	public Ave(String nome, int idade, int membros, double peso, String corPena) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
		this.corPena = corPena;
	}
	
	// Get e Set para acessarmos os atributos.
	public String getCorPena() {
		return corPena;
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	// Sobreposição dos métodos que foram criados na classe abstrata Animal.
	@Override 
	public void locomover() {
		System.out.println("Locomovendo-se como uma ave.");
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando-se como uma ave.");
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som como uma ave.");
	}
	
	public void fazerNinho() {
		System.out.println("Construindo um ninho.");
	}
	
	public void ApresentarDados() {
		System.out.println("-------------------");
		System.out.println("Animal: " + this.nome);
		System.out.println("  Idade: " + this.idade);
		System.out.println("  Membros: " + this.membros);
		System.out.println("  Peso: " + this.peso);
		System.out.println("  Cor Pena: " + this.corPena);
		locomover();
		alimentar();
		emitirSom();
		fazerNinho();
	}
}