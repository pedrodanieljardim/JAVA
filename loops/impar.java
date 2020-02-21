import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int n, i;

		System.out.println("digite um numero:");
		n = sc.nextInt();

		for (i = 1; i < n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
