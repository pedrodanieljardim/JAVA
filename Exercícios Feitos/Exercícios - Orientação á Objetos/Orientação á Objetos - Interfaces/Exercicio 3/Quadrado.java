package interfaces1;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	private double lado;
	
	public Quadrado(String nome, String cor, double altura, double largura,double lado) {
		super(nome, cor, altura, largura);
		setLado(lado);
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calculaArea() {
		double area = 0;
		area = Math.pow(this.lado, 2);
		System.out.println("==============================");
		System.out.println("      FIGURA GEOMÉTRICA        ");
		System.out.println("==============================");
		System.out.println("Nome da figura geométrica: "+this.nome);
		System.out.println("Cor da figura geométrica: "+this.cor);
		System.out.println("Tamanho dos lados: "+this.lado);
		System.out.println("Volume em cm²: "+area);
		System.out.println("==============================");		
	}

	
}
