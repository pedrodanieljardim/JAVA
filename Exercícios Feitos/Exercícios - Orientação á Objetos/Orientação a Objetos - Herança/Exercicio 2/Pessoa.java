
public abstract class Pessoa {
	protected String nome;
	
	public Pessoa(String nome) {
		setName(nome);
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}	
	
}
