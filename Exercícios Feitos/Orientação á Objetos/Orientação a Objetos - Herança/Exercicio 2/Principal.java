
public class Principal {
	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica("Pedro",2324,133049403);
		p1.CalculaImposto();
		
		PessoaFisica p2 = new PessoaFisica("Mateus",6000,1330349403);
		p2.CalculaImposto();
		
		PessoaFisica p3 = new PessoaFisica("Jordan",3500,104940213);
		p3.CalculaImposto();
		
		PessoaJuridica p4 = new PessoaJuridica("Netflix",325434309,1000000);
		p4.CalculaImposto();
		
		PessoaJuridica p5 = new PessoaJuridica("Amazon",12234309,5321000);
		p5.CalculaImposto();
	}
}
