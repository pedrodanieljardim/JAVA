import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int i,n;
		double n1,n2,n3,nota_final;

		System.out.println("digite um numero:");
		n = sc.nextInt();
		
		nota_final=0;
		
		for (i = 0; i < n; i++) {
			System.out.println("digite a nota da p1:");
			n1=sc.nextDouble();
			System.out.println("digite a nota da p2:");
			n2=sc.nextDouble();
			System.out.println("digite a nota da p3:");
			n3=sc.nextDouble();
			nota_final=((n1*2)+(n2*3)+(n3*5))/10;
			System.out.printf("\n a nota final foi %.2f",nota_final);
		}
		
		sc.close();
	}