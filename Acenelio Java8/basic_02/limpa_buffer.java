import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int x;
		String s,s1,s2,s3,quebra_linha;
		x=sc.nextInt();
		
		quebra_linha=sc.nextLine();
		//uso de uma string como sacrifício para limpar o buffer, igual a função fflush na linguagem C 
		
		s=sc.nextLine();
		s1=sc.nextLine();
		s2=sc.nextLine();
		
	
		System.out.println(x);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		sc.close();
		//desaloca o objeto ao término do programa
	}
}