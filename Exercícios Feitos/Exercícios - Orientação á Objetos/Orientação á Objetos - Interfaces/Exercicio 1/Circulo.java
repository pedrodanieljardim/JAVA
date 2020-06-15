package interfaces1;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	private double raio;
	
	public Circulo(String nome, String cor, double altura, double largura,double raio) {
		super(nome, cor, altura, largura);
		setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calculaArea() {
		double area = 0;
		area = (this.raio*4*3.14)/3;
		System.out.println("==============================");
		System.out.println("      FIGURA GEOMÉTRICA        ");
		System.out.println("==============================");
		System.out.println("Nome da figura geométrica: "+this.nome);
		System.out.println("Cor da figura geométrica: "+this.cor);
		System.out.println("Tamanho do raio "+this.raio);
		System.out.println("Volume em cm³: "+area);
		System.out.println("==============================");
		
	}
	
}
