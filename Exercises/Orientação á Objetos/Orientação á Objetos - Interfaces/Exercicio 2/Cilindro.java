package interfaces1;

public class Cilindro extends Figura3D implements DimensaoVolumetrica{
	private double base;
	private double altura;
	
	public Cilindro(String nome, String cor, double aresta, double vertices, double base, double altura) {
		super(nome, cor, aresta, vertices);
		setBase(base);
		setAltura(altura);
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public void calculaVolume() {
		double area = 0;
		area = this.altura*this.base;
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