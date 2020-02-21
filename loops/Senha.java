import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int senha;
		System.out.println("digite a senha:");
		senha=sc.nextInt();
		
		while(senha!=2002) {
			System.out.println("SENHA INVÁLIDA!");
			System.out.println("\n digite a senha novamente!");
			senha=sc.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO!");
		System.out.println("OLÁ SENHOR USUÁRIO!");
		sc.close();
	}
}
