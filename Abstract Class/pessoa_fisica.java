package entities;

public class pessoa_fisica extends pagador_imposto {
	public Double imposto_pago;
	private Double gastos_saude;
	
	public pessoa_fisica() {
		
	}

	public pessoa_fisica(String nome, double gastos_anuais,Double gastos_saude) {
		super(nome, gastos_anuais);
		this.gastos_saude = gastos_saude;
	}

	public Double getGastos_saude() {
		return gastos_saude;
	}

	public void setGastos_saude(Double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}

	@Override
	public Double imposto() {
		if(gastos_anuais<=20000) {
			if(gastos_saude>0) {
				imposto_pago=gastos_anuais*0.15;
				imposto_pago= imposto_pago-(gastos_saude*0.50);
			}
			if(gastos_saude==0) {
				imposto_pago=gastos_anuais*0.15;
				}
		}
		
		if(gastos_anuais>20000) {
			if(gastos_saude>0) {
				imposto_pago=gastos_anuais*0.25;
					imposto_pago= imposto_pago-(gastos_saude*0.50);
			}
			if(gastos_saude==0) {
				imposto_pago=gastos_anuais*0.25;
		
			}
		}

		return imposto_pago;
	}
	
	
}
