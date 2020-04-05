import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> Identificacao = new ArrayList<>();
		List<String> Nome = new ArrayList<>();
		List<Double> Salario = new ArrayList<>();

		System.out.println("Quantos funcionários serão cadastrados?");
		int tamanho_cadastro = sc.nextInt();

		for (int i = 0; i < tamanho_cadastro; i++) {

			System.out.println("Funcionário #" + i);

			System.out.println("Identificação do Funcionário:");
			Identificacao.add(sc.nextInt());

			String quebra_linha_2 = sc.nextLine();
			System.out.println("Nome do Funcionário:");
			Nome.add(sc.nextLine());

			System.out.println("Salário do Funcionário:");
			Salario.add(sc.nextDouble());

		}
		double aumento=0;
		System.out.println("Digite a Identificação do usuário a ter um aumento no salário:");
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
			System.out.println("Identificação não encontrada!");
		}

		System.out.println("---------------------");

		for (int i = 0; i < tamanho_cadastro; i++) {
			System.out.println("Funcionário #" + i);
			System.out.printf("Identificação: %d \n", Identificacao.get(i));
			System.out.printf("Nome do Funcionário: %s \n", Nome.get(i));
			if (Identificacao.get(i) == procura) {
				double new_salario=Salario.get(i)*aumento;
				System.out.printf("Salario do Funcionário: %.2f \n",new_salario+Salario.get(i));
			}else
				System.out.printf("Salario do Funcionário: %.2f \n",Salario.get(i));
		}

	}

}
