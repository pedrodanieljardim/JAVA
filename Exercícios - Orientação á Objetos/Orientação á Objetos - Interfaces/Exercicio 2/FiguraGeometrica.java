package interfaces1;

public class FiguraGeometrica {
	protected String nome;
	protected String cor;
	
	public FiguraGeometrica(String nome, String cor) {
		setNome(nome);
		setCor(cor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
