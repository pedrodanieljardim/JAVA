import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		
		int x;
		
		x=sc.nextInt();
		// x recebe o valor do teclado
		
		System.out.println("seu numero digitado foi:"+x);
		//sysout mais CRTL+ESPA�O forma system
		
		sc.close();
		//desaloca o objeto ao t�rmino do programa
	}
}