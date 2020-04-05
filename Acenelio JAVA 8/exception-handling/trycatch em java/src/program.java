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
				System.out.println("Digite um valor para a posi��o #"+i);
				vetor[i]=sc.nextInt();
			}
			System.out.println("Digite um numero:");
			int numero = sc.nextInt();
			System.out.println(vetor[numero]);
		}
		catch(ArrayIndexOutOfBoundsException error) {
			// erro de posi��o de array
			System.out.println("Posi��o do Array Inv�lida!");
		}
		catch(InputMismatchException error) {
			// tipo de dado incompat�vel com o da vari�vel
			System.out.println("Tipo de dado inv�lido!");
		}
		
		System.out.println("Sem exce��es!");
		sc.close();
	}

}
