import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		
		char x;
		
		x=sc.next().charAt(0);
		// x recebe o valor do teclado e fun��o charAT(0) pega o primeiro valor da string, logo o caracter digitado
		
		System.out.println("seu char digitado foi:"+x);
		//sysout mais CRTL+ESPA�O forma system
		
		sc.close();
		//desaloca o objeto ao t�rmino do programa
	}
}

