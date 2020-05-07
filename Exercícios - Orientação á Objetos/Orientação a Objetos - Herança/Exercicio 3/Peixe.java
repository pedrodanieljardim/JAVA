
public class Peixe extends Animal{
	private String caracteristicas;
	
	
	public Peixe(String nome, String cor, String ambiente, int numeroPatas, double comprimento, double velocidade,String caracteristicas) {
		super(nome, cor, ambiente, numeroPatas, comprimento, velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
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
		System.out.println("Caracteristicas: "+this.caracteristicas);
	}
	
	
}
