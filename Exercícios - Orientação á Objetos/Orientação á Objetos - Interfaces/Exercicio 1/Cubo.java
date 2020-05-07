package interfaces1;

public class Cubo extends Figura3D{
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
	
}
