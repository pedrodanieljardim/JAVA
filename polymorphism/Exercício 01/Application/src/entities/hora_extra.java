package entities;

public class hora_extra extends empregado{
	private Double percentual;
	
	public hora_extra() {
		
	}


	public hora_extra(String nome, Integer horas, Double valor_hora, Double percentual) {
		super(nome, horas, valor_hora);
		this.percentual=percentual;
		// TODO Auto-generated constructor stub
	}

	public Double getPercentual() {
		return percentual;
	}


	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	@Override
	public Double salario() {
		return super.salario()+ this.percentual+(this.percentual*0.10);
	}

}
