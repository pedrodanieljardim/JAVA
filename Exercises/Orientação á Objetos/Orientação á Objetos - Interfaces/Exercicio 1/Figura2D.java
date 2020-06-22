package interfaces1;

public class Figura2D extends FiguraGeometrica{
	protected double altura;
	protected double largura;
	
	public Figura2D(String nome, String cor, double altura, double largura) {
		super(nome, cor);
		setAltura(altura);
		setLargura(largura);
	}
	
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	
}
