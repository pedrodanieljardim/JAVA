package entities;

public class Bank_account {
	// atributos do objeto
	private int number;
	public String name;
	public double balance;
	
	// métodos:
	// encapsulação do numero da conta
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	// primeiro construtor;
	public Bank_account() {
		
	}
	// sobrecarga no construtor
	public Bank_account(int number,String name,double balance) {
		this.number=number;
		this.name=name;
		this.balance=balance;
	}
	// operação de movimentação na conta
	public void deposit (double balance, double deposit) {
			this.balance=this.balance+deposit;
	}
	
	public void whidraw(double balance, double whidraw) {
		this.balance=this.balance-whidraw-5;
	}
	
}
