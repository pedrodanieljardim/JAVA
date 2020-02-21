import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Digite o tamanho de um vetor:");
			int tamanho = sc.nextInt();
			int[] vetor = new int[tamanho];
			for(int i =0 ; i<tamanho;i++) {
				System.out.println("Digite um valor para a posição #"+i);
				vetor[i]=sc.nextInt();
			}
			System.out.println("Digite um numero:");
			int numero = sc.nextInt();
			System.out.println(vetor[numero]);
		}
		catch(ArrayIndexOutOfBoundsException error) {
			// erro de posição de array
			System.out.println("Posição do Array Inválida!");
		}
		catch(InputMismatchException error) {
			// tipo de dado incompatível com o da variável
			System.out.println("Tipo de dado inválido!");
		}
		
		System.out.println("Sem exceções!");
		sc.close();
	}

}
