import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, n;
		double n1, n2, divisao;

		System.out.println("digite um numero:");
		n = sc.nextInt();

		divisao=0;

		for (i = 0; i < n; i++) {
			System.out.println("digite o valor do denominador:");
			n1 = sc.nextDouble();
			System.out.println("digite o valor do divisor:");
			n2 = sc.nextDouble();
			divisao = n1 / n2;
			if (n2 == 0) {
				System.out.printf("\n Divisão Impossível!");
			}
			if (n2 != 0) {
				System.out.printf("\n valor da divisão: %.2f \n", divisao);
			}
		}

		sc.close();
	}

}