package entities;

public abstract class pagador_imposto {
	private String nome;
	protected double gastos_anuais;
	
	public pagador_imposto() {
		
	}

	public pagador_imposto(String nome, double gastos_anuais) {
		this.nome = nome;
		this.gastos_anuais = gastos_anuais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGastos_anuais() {
		return gastos_anuais;
	}

	public void setGastos_anuais(double gastos_anuais) {
		this.gastos_anuais = gastos_anuais;
	}
	
	public abstract Double imposto();
}
