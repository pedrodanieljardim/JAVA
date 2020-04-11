import java.util.Scanner;

// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		int x,y,soma;
		
		System.out.println("digite dois numeros a serem somados:");
		
		x=sc.nextInt();
		
		y=sc.nextInt();
	
		soma=x+y;
		
		System.out.printf("%d+%d=%d",x,y,soma);
		
		sc.close();
	}
}