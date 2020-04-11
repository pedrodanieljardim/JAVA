import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		
		String s;

		s=sc.nextLine();
		// sc.next pega apenas até o espaço, se queremos colocar uma string como uma frase por exemplo, devemos usar o sc.nextLine
		
		System.out.println("\n sua string digitada foi "+s);
		
		sc.close();
		//desaloca o objeto ao término do programa
	}
}

