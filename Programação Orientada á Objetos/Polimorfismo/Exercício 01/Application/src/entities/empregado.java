package entities;

public class empregado {
	private String nome;
	protected Integer horas;
	protected Double valor_hora;
	
	public empregado(){
		
	}
	
	public empregado(String nome, Integer horas, Double valor_hora) {
		this.nome = nome;
		this.horas = horas;
		this.valor_hora = valor_hora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	public Double salario () {
		return (double)this.horas*this.valor_hora;
	}

	
}
