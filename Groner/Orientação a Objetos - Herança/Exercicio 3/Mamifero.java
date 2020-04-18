
public class Mamifero extends Animal{
	private String alimento;

	public Mamifero(String nome, String cor, String ambiente, int numeroPatas, double comprimento, double velocidade,String alimento) {
		super(nome, cor, ambiente, numeroPatas, comprimento, velocidade);
		setAlimento(alimento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public void mostraAnimal() {
		System.out.println("--------------------------");
		System.out.println("Animal: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento+" cm");
		System.out.println("Patas: "+this.numeroPatas);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+String.format("%.1f", this.velocidade)+" m/s");
		System.out.println("Alimento: "+this.alimento);
	}
}
