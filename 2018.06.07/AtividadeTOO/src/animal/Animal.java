package animal;

// Classe abstrata já que nas outras classes serão alteradas.
public abstract class Animal {
	// Variáveis que estavam nos vídeos.
	protected int idade, membros;
	protected double peso;
	protected String nome;
	
	// Método construtor.
	// Inicialização dos atributos de um objeto no momento de sua criação.
	public Animal() {
		this("",0,0,0);
		/*
		 *  Este construtor, sem parâmetros, adiciona zero em cada um dos atributos, 
		 *  já que dois atributos são do tipo inteiro e o outro é do tipo double;
		 *  
		 */
	}
	
	public Animal(String nome, int idade, int membros, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.membros = membros;
		this.peso = peso;
	}

	// Get e Set para acessarmos os atributos.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Métodos que estavam nos vídeos.
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
}