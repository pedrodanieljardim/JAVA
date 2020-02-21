import java.util.Scanner;

// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		double x,y,calcula_potencia;
		
		System.out.println("digite a base da potenciação e potencia:");
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		calcula_potencia=Math.pow(x, y);
		
		System.out.printf("a potencia de %.0f^%.0f eh %.0f",x,y,calcula_potencia);
		
		sc.close();
	}
}
