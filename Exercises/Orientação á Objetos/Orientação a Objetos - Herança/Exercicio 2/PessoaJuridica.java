
public class PessoaJuridica extends Pessoa{
	private int CNPJ;
	private double faturamento;
	public PessoaJuridica(String nome,int CNPJ, double faturamento) {
		super(nome);
		setCNPJ(CNPJ);
		setFaturamento(faturamento);
	}
	
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public double getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	public void CalculaImposto() {
		double ImpostoCalculado = 0;
		ImpostoCalculado += (this.faturamento*0.1);
		System.out.println("=============================");
		System.out.println("Nome da Razão Social: "+this.nome);
		System.out.println("CNPJ: "+this.CNPJ);
		System.out.println("Faturamento: R$"+String.format("%.2f", this.faturamento));
		System.out.println("=============================");
		System.out.println("Imposto a Pagar: R$"+String.format("%.2f", ImpostoCalculado));
		
	}
	
}
