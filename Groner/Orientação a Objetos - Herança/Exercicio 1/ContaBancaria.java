
public abstract class ContaBancaria {
	// ATRIBUTOS
	protected String nomeCliente;
	protected int numCliente;
	protected double saldo;
	
	// CONSTRUTORES
	public ContaBancaria(String nomeCliente, int numCliente, double saldo) {
		setNomeCliente(nomeCliente);
		setNumCliente(numCliente);
		setSaldo(saldo);
	}

	
	// SETS
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumCliente() {
		return numCliente;
	}

	// 	GETS
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}

	
	// MÉTODOS
	protected void RealizarSaque(double valorSacado) {
		if(this.saldo >= valorSacado) {
			this.saldo -= valorSacado;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saque negado!");
		}
	}
	
	protected void RealizarDeposito (double valorDepositado) {
		if(valorDepositado > 0) {
			this.saldo += valorDepositado;
			System.out.println("Depósito realizado com sucesso!");
		}else {
			System.out.println("Depósito negado!");
		}
	}
	
	protected void mostraSaldo() {
		System.out.println("A conta "+this.numCliente+" Possui de Saldo: R$"+String.format("%.2f", this.saldo));
	}
	
}
