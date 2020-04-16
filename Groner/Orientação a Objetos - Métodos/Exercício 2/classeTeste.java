
public class classeTeste {
	public static void main(String[] args) {
		contaBancaria c1 = new contaBancaria();
		c1.balance = 2000.00;
		c1.withdrawAccount(500);
		c1.showBalance();
		c1.depositAccount(200);
		c1.showBalance();
		c1.withdrawAccount(2200);
		c1.verifySpecialCheck();
	}
}
