package entities;

public class pessoa_juridica extends pagador_imposto{
	private Integer numero_funcionarios;
	public Double imposto_pago;
	
	public pessoa_juridica() {
		
	}
	
	public pessoa_juridica(String nome, double gastos_anuais,Integer numero_funcionarios) {
		super(nome, gastos_anuais);
		this.numero_funcionarios = numero_funcionarios;
	}
	public Integer getNumero_funcionarios() {
		return numero_funcionarios;
	}
	
	public void setNumero_funcionarios(Integer numero_funcionarios) {
		this.numero_funcionarios = numero_funcionarios;
	}
	
	@Override
	public Double imposto() {
		if(numero_funcionarios>10) {
			imposto_pago = gastos_anuais*0.14;
		}
		if(numero_funcionarios<=10) {
			imposto_pago = gastos_anuais*0.16;
		}
		return imposto_pago;
	}
}
