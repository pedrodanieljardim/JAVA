package groner27;

public class contaBancaria {
	int numberAccount;
	double balance;
	double specialCheck = 0;
	boolean isSpecial = false;
	
	
	public void withdrawAccount(double valueWithdraw) {
		if(valueWithdraw>this.balance) {
			isSpecial = true;
			valueWithdraw -= this.balance;
			this.balance = 0;
			specialCheck = valueWithdraw;
			System.out.println("Saque maior que saldo da conta. Cheque especial ativado!");
		}else{
			this.balance -= valueWithdraw;
			System.out.println("Saque feito com sucesso!");
		}
	}
	
	public void depositAccount(double valueDeposit) {
		if(valueDeposit>0) {
			this.balance += valueDeposit;
			System.out.println("Depósito feito com sucesso!");
		}else {
			System.out.println("Valor inválido a ser depositado!");
		}
		
	}
	
	public void showBalance() {
		System.out.println("Saldo");
		System.out.println("R$ "+String.format("%.2f", this.balance));
	}
	
	public void verifySpecialCheck() {
		if(isSpecial == true) {
			System.out.println("O Cliente está usando cheque especial...");
			System.out.println("Está devendo R$"+String.format("%.2f", this.specialCheck));
		}else {
			System.out.println("O Cliente não está usando cheque especial...");
		}
	}
	
	
}
