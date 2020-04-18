
public abstract class Animal {
	protected String nome;
	protected String cor;
	protected String ambiente;
	protected int numeroPatas;
	protected double comprimento;
	protected double velocidade;
	
	public Animal(String nome, String cor, String ambiente, int numeroPatas, double comprimento, double velocidade) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.numeroPatas = numeroPatas;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void mostraAnimal() {
		System.out.println("--------------------------");
		System.out.println("Animal: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento+" cm");
		System.out.println("Patas: "+this.numeroPatas);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+String.format("%.1f", this.velocidade)+" m/s");	
	}
	
}
