package entities;

public class produto_usado extends produto{
	private int dia,mes,ano;
	
	public produto_usado () {
		
	}

	public produto_usado(String name, Double price,int dia, int mes, int ano) {
		super(name, price);
		this.dia=dia;
		this.mes=mes;
		this.ano= ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String tipo () {
		return "tipo usado";
	}

	@Override
	public String toString() {
		return  dia + "/" + mes + "/" + ano  ;
	}


}
