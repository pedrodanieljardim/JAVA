package interfaces1;

public class Cubo extends Figura3D implements DimensaoVolumetrica{
	public double faces;

	public Cubo(String nome, String cor, double aresta, double vertices, double faces) {
		super(nome, cor, aresta, vertices);
		setFaces(faces);
	}

	public double getFaces() {
		return faces;
	}

	public void setFaces(double faces) {
		this.faces = faces;
	}

	@Override
	public void calculaVolume() {
		double area = 0;
		area = Math.pow(this.aresta, 3);
		System.out.println("==============================");
		System.out.println("      FIGURA GEOMÉTRICA        ");
		System.out.println("==============================");
		System.out.println("Nome da figura geométrica: "+this.nome);
		System.out.println("Cor da figura geométrica: "+this.cor);
		System.out.println("Número de Arestas: "+this.aresta);
		System.out.println("Número de Vertices: "+this.vertices);
		System.out.println("Número de Faces: "+this.faces);
		System.out.println("Volume em dm³: "+area);
		System.out.println("==============================");
	}
	
}
