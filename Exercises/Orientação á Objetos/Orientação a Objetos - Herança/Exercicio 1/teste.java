
public class Teste {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca("Pedro",300321,2000.20,0.10);
		ContaCorrente c2 = new ContaCorrente("Pedro",300322,2010.20,5000);
		
		c1.calculaNovoSaldo();
		c1.mostraSaldo();
		
		c2.RealizarSaque(200);
		c2.mostraSaldo();
	}
}
