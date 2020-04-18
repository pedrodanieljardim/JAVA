
public class PessoaFisica extends Pessoa{
	private double renda;
	private int cpf;
	
	public PessoaFisica(String nome,double renda,int cpf) {
		super(nome);
		setRenda(renda);
		setCpf(cpf);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public void CalculaImposto() {
		double ImpostoCalculado = 0;
		if(this.renda <= 1400) {
			ImpostoCalculado = 0;
			System.out.println("=============================");
			System.out.println("Nome do Contribuinte: "+this.nome);
			System.out.println("CPF: "+this.cpf);
			System.out.println("Renda: R$"+String.format("%.2f", this.renda));
			System.out.println("=============================");
			System.out.println("Imposto a Pagar: R$"+String.format("%.2f", ImpostoCalculado));
		}
		if(this.renda >= 1400.01 && this.renda <= 2100 ) {
			ImpostoCalculado += (this.renda*0.1);
			System.out.println("=============================");
			System.out.println("Nome do Contribuinte: "+this.nome);
			System.out.println("CPF: "+this.cpf);
			System.out.println("Renda: R$"+String.format("%.2f", this.renda));
			System.out.println("=============================");
			System.out.println("Imposto a Pagar: R$"+String.format("%.2f", ImpostoCalculado));
		}
		if(this.renda >= 2100.01 && this.renda <= 2800 ) {
			ImpostoCalculado += (this.renda*0.15);
			System.out.println("=============================");
			System.out.println("Nome do Contribuinte: "+this.nome);
			System.out.println("CPF: "+this.cpf);
			System.out.println("Renda: R$"+String.format("%.2f", this.renda));
			System.out.println("=============================");
			System.out.println("Imposto a Pagar: R$"+String.format("%.2f", ImpostoCalculado));
		}
		if(this.renda >= 2800.01 && this.renda <= 3600 ) {
			ImpostoCalculado += (this.renda*0.25);
			System.out.println("=============================");
			System.out.println("Nome do Contribuinte: "+this.nome);
			System.out.println("CPF: "+this.cpf);
			System.out.println("Renda: R$"+String.format("%.2f", this.renda));
			System.out.println("=============================");
			System.out.println("Imposto a Pagar: R$"+String.format("%.2f", ImpostoCalculado));
		}
		if(this.renda >= 3600.01 ) {
			ImpostoCalculado += (this.renda*0.30);
			System.out.println("=============================");
			System.out.println("Nome do Contribuinte: "+this.nome);
			System.out.println("CPF: "+this.cpf);
			System.out.println("Renda: R$"+String.format("%.2f", this.renda));
			System.out.println("=============================");
			System.out.println("Imposto a Pagar: R$"+String.format("%.2f", ImpostoCalculado));
		}
	}
}
