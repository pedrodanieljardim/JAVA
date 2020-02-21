import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		
		String x;
		
		x=sc.next();
		// x recebe o valor do teclado
		
		System.out.println("sua string digitada foi:"+x);
		//sysout mais CRTL+ESPAÇO forma system
		
		sc.close();
		//desaloca o objeto ao término do programa
	}
}

