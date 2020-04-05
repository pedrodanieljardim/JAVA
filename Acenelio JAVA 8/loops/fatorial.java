import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, n,fatorial;

		System.out.println("digite um numero:");
		n = sc.nextInt();
		fatorial=1;
		
		for (i = 1; i <= n; i++) {
			fatorial=fatorial*i;
		}
		System.out.printf("\n %d! eh %d",n,fatorial);
		sc.close();
	}

}