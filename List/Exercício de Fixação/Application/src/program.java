import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> Identificacao = new ArrayList<>();
		List<String> Nome = new ArrayList<>();
		List<Double> Salario = new ArrayList<>();

		System.out.println("Quantos funcion�rios ser�o cadastrados?");
		int tamanho_cadastro = sc.nextInt();

		for (int i = 0; i < tamanho_cadastro; i++) {

			System.out.println("Funcion�rio #" + i);

			System.out.println("Identifica��o do Funcion�rio:");
			Identificacao.add(sc.nextInt());

			String quebra_linha_2 = sc.nextLine();
			System.out.println("Nome do Funcion�rio:");
			Nome.add(sc.nextLine());

			System.out.println("Sal�rio do Funcion�rio:");
			Salario.add(sc.nextDouble());

		}
		double aumento=0;
		System.out.println("Digite a Identifica��o do usu�rio a ter um aumento no sal�rio:");
		int procura = sc.nextInt();
		int count = 0;
		for (Integer x : Identificacao) {
			if (x == procura) {
				System.out.println("Digite a porcentagem do aumento:");
				 aumento = sc.nextDouble();
			} else
				count++;
		}

		if (count == Identificacao.size()) {
			System.out.println("Identifica��o n�o encontrada!");
		}

		System.out.println("---------------------");

		for (int i = 0; i < tamanho_cadastro; i++) {
			System.out.println("Funcion�rio #" + i);
			System.out.printf("Identifica��o: %d \n", Identificacao.get(i));
			System.out.printf("Nome do Funcion�rio: %s \n", Nome.get(i));
			if (Identificacao.get(i) == procura) {
				double new_salario=Salario.get(i)*aumento;
				System.out.printf("Salario do Funcion�rio: %.2f \n",new_salario+Salario.get(i));
			}else
				System.out.printf("Salario do Funcion�rio: %.2f \n",Salario.get(i));
		}

	}

}
