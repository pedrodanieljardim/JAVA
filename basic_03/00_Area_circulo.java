import java.util.Scanner;

// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		double raio,area;
		
		System.out.println("valor do raio de um círculo:");
		
		raio=sc.nextInt();
		
		area=3.14159*(raio*raio);
				
		System.out.printf("o valor da área deste círculo eh %.4f",area);
		
		sc.close();
	}
}