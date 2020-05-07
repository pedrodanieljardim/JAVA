import entities.Bank_account;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		double balance=0;
		String breaking;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number:");
		int number= sc.nextInt();
		
		breaking=sc.nextLine();
		
		System.out.println("Enter account houlder:");
		String houlder=sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char choice=sc.next().charAt(0);
		
		if(choice=='y'){
			System.out.println("Enter the initial deposit value:");
			balance=sc.nextDouble();
		}

		
		Bank_account account = new Bank_account(number,houlder,balance);
		
		System.out.println("Account data:");
		System.out.printf("Account:%d | Holder: %s | Balance:R$%.2f. \n",account.getNumber(),account.name,account.balance);
		
		System.out.println("\nEnter a deposit value:");
		double entry=sc.nextDouble();
		account.deposit(account.balance,entry);
		System.out.printf("Account:%d | Holder: %s | Balance:R$%.2f. \n",account.getNumber(),account.name,account.balance);
		
		System.out.println("\nEnter a whidraw value:");
		double whidraw=sc.nextDouble();
		account.whidraw(account.balance,whidraw);
		System.out.printf("Account:%d | Holder: %s | Balance:R$%.2f. \n",account.getNumber(),account.name,account.balance);
	}
}
