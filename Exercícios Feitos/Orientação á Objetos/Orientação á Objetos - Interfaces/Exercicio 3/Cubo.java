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
		System.out.println("      FIGURA GEOM�TRICA        ");
		System.out.println("==============================");
		System.out.println("Nome da figura geom�trica: "+this.nome);
		System.out.println("Cor da figura geom�trica: "+this.cor);
		System.out.println("N�mero de Arestas: "+this.aresta);
		System.out.println("N�mero de Vertices: "+this.vertices);
		System.out.println("N�mero de Faces: "+this.faces);
		System.out.println("Volume em dm�: "+area);
		System.out.println("==============================");
	}
	
}
