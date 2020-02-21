import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int n,n2,contador_dentro,contador_fora;

		System.out.println("digite um numero:");
		n = sc.nextInt();
		
		contador_dentro=0;
		contador_fora=0;
		
		for (i = 0; i < n; i++) {
			System.out.println("digite um numero:");
			n2=sc.nextInt();
			if (n2>=10 && n2<=20){
				contador_dentro++;
			}else
				contador_fora++;
		}
		
		System.out.println("dentro do intervalo:"+contador_dentro);
		System.out.println("fora do intervalo:"+contador_fora);
		
		sc.close();
	}
}
