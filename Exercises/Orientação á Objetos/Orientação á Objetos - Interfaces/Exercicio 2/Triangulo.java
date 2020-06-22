package interfaces1;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
	private double base;

	public Triangulo(String nome, String cor, double altura, double largura, double base) {
		super(nome, cor, altura, largura);
		setBase(base);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void calculaArea() {
		double area = 0;
		area = 1/2* this.altura*this.base;
		System.out.println("==============================");
		System.out.println("      FIGURA GEOM�TRICA        ");
		System.out.println("==============================");
		System.out.println("Nome da figura geom�trica: "+this.nome);
		System.out.println("Cor da figura geom�trica: "+this.cor);
		System.out.println("Tamanho da Altura: "+this.altura);
		System.out.println("Tamanho da Base: "+this.base);
		System.out.println("Volume em cm�: "+area);
		System.out.println("==============================");
	}

	
	
	
}
