import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.pagador_imposto;
import entities.pessoa_fisica;
import entities.pessoa_juridica;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a Quantidade de Pagadores de Impostos a serem cadastrados:");
		int numero = sc.nextInt();
		
		List <pagador_imposto> lista = new ArrayList<>();
		
		for(int i=0;i<numero;i++) {
			System.out.println("Pagador de Imposto #"+i);
			System.out.println("Pagador pessoa jurídica (j) ou pessoa física(f)?");
			
			char c = sc.next().charAt(0);
			String quebra_linha = sc.nextLine();
			
			System.out.println("Digite o nome do pagador:");
			String nome = sc.nextLine();
			
			System.out.println("Declaração de Ganhos:");
			Double ganhos_anuais = sc.nextDouble();
			
			if(c=='j') {
				System.out.println("Quantos funcionários possuem a pessoa jurídica? ");
				Integer f = sc.nextInt();
				pagador_imposto p = new pessoa_juridica(nome,ganhos_anuais,f);
				lista.add(p);
			}
			if(c=='f') {
				System.out.println("Quantos reais foram gastos com saúde?");
				Double g = sc.nextDouble();
				pagador_imposto p = new pessoa_fisica(nome,ganhos_anuais,g);
				lista.add(p);
			}
		}
		
		System.out.println("Impostos a Serem pagos:");
		for(pagador_imposto p :lista) {
			System.out.println("Pagador:"+p.getNome());
			System.out.println("Valor a Ser Pago:R$"+p.imposto());
		}
		
		sc.close();
	}

}
