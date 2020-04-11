package entities;

public class calcula_dolar {
	public static double imposto = 0.06;
	public double dolar_comprado,cotacao_dia;
	
	public double imposto_calculado(double cotacao_dia,double dolar_comprado) {
		return (cotacao_dia*dolar_comprado)*imposto;
	}
	
	public double conversao(double cotacao_dia,double dolar_comprado,double imposto_calculado){
		return (cotacao_dia*dolar_comprado)+imposto_calculado;
	}
}
