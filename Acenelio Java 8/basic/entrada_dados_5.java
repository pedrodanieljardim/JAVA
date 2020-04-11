import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		
		char c;
		int i;
		double d;
		String s;
		
		i=sc.nextInt();
		d=sc.nextDouble();
		c=sc.next().charAt(0);
		s=sc.next();
		
		// x recebe o valor do teclado e função charAT(0) pega o primeiro valor da string, logo o caracter digitado
		
		System.out.println("seu char digitado foi:"+c);
		//sysout mais CRTL+ESPAÇO forma system
		System.out.println("\n seu inteiro digitado foi "+i);
		System.out.println("\n seu double digitado foi "+d);
		System.out.println("\n sua string digitada foi "+s);
		sc.close();
		//desaloca o objeto ao término do programa
	}
}

