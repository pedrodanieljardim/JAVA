import java.util.Scanner;

// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		int x,y,z,k,formula;
		
		System.out.println("digite quatro numeros:");
		
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		k=sc.nextInt();
		
		formula=(x*y)-(z*k);
		
		System.out.printf("%d",formula);
		
		sc.close();
	}
}