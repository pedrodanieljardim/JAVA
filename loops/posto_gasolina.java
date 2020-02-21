import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int tipo_combustivel,contador_gasolina,contador_alcool,contador_diesel;
		
		System.out.println("digite o tipo de combustível escolhido:");
		tipo_combustivel=sc.nextInt();
		
		contador_gasolina=0;
		contador_alcool=0;
		contador_diesel=0;
		
		while(x!=4){
			if(x==1) {
				contador_alcool++;
			}
			if(x==2) {
				contador_gasolina++;
			}
			if(x==3) {
				contador_diesel++;
			}
			System.out.println("digite o tipo de combustível escolhido:");
			tipo_combustivel=sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool:%d",contador_alcool);
		System.out.printf("Gasolina:%d",contador_gasolina);
		System.out.printf("Diesel:%d",contador_diesel);
		
		sc.close();
	}
}
