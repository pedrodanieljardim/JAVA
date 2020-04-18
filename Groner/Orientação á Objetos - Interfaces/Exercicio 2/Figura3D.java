package interfaces1;

public class Figura3D extends FiguraGeometrica{
	protected double aresta;
	protected double vertices;
	
	public Figura3D(String nome, String cor, double aresta, double vertices) {
		super(nome, cor);
		setAresta(aresta);
		setVertices(vertices);
	}
	
	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	public double getVertices() {
		return vertices;
	}
	public void setVertices(double vertices) {
		this.vertices = vertices;
	}
	
	
}
