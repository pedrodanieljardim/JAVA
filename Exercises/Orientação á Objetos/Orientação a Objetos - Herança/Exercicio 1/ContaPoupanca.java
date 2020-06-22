
public final class ContaPoupanca extends ContaBancaria{
	private double diaRendimento;

	public ContaPoupanca(String nomeCliente,int numCliente, double saldo,double diaRendimento) {
		super(nomeCliente,numCliente,saldo);
		setDiaRendimento(diaRendimento);
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calculaNovoSaldo() {
		this.saldo += (diaRendimento*this.saldo);
	}

}
