
public final class ContaCorrente extends ContaBancaria{
	private double limite;

	public ContaCorrente(String nomeCliente, int numCliente, double saldo, double limite) {
		super(nomeCliente, numCliente, saldo);
		setLimite(limite);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void RealizarSaque(double valorSacado) {
		if(this.saldo >= valorSacado+5 && valorSacado<limite) {
			this.saldo -= valorSacado+5;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saque negado!");
		}
	}
}
