package interfaces1;

public class Piramide extends Figura3D implements DimensaoVolumetrica{
	private double altura;
	private double base;
	
	public Piramide(String nome, String cor, double aresta, double vertices, double altura, double base) {
		super(nome, cor, aresta, vertices);
		setAltura(altura);
		setBase(base);
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void calculaVolume() {
		double area = 0;
		area = 1/3*this.altura*this.base;
		System.out.println("==============================");
		System.out.println("      FIGURA GEOMÉTRICA        ");
		System.out.println("==============================");
		System.out.println("Nome da figura geométrica: "+this.nome);
		System.out.println("Cor da figura geométrica: "+this.cor);
		System.out.println("Tamanho da Altura: "+this.altura);
		System.out.println("Tamanho da Base: "+this.base);
		System.out.println("Volume em cm³: "+area);
		System.out.println("==============================");
		
	}
	
	
}
