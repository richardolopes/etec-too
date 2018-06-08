package animal;

// Classe abstrata j� que nas outras classes ser�o alteradas.
public abstract class Animal {
	// Vari�veis que estavam nos v�deos.
	protected int idade, membros;
	protected double peso;
	protected String nome;
	
	// M�todo construtor.
	// Inicializa��o dos atributos de um objeto no momento de sua cria��o.
	public Animal() {
		this("",0,0,0);
		/*
		 *  Este construtor, sem par�metros, adiciona zero em cada um dos atributos, 
		 *  j� que dois atributos s�o do tipo inteiro e o outro � do tipo double;
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
	
	// M�todos que estavam nos v�deos.
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
}