
public class Teste {
	public static void main(String[] args) {
		try {
			int vetor [] = new int [4];
			System.out.println("antes da exception...");
			vetor[4] = 1;
		}catch(java.lang.ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção do Posicao do array inválida...");
		}
		System.out.println("Depois da exception");
	}
}
