package interfaces1;

public class Piramide extends Figura3D{
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
	
	
}
