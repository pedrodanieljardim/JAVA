package interfaces1;

public class Cilindro extends Figura3D{
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
	
}