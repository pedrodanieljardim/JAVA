import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			// declara objeto 
		
		double x,raiz;
		
		System.out.println("digite um numero:");
		x=sc.nextDouble();
		
		raiz=Math.sqrt(x);
		
		System.out.printf("a raiz quadrada de %.2f é %.2f",x,raiz);
		
		sc.close();
	}
}


