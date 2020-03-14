import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.empregado;
import entities.hora_extra;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <empregado> Lista = new ArrayList<>();
		
		System.out.println("Digite o numero de empregados:");
		int numero_empregados =sc.nextInt();
		
		for(int i=0;i<numero_empregados;i++) {
			
			System.out.println("Empregado #"+i+1);
			System.out.println("Funcionário é Terceirizado?");
			char c = sc.next().charAt(0);
			String Quebra_linha = sc.nextLine();
			System.out.println("Nome do Funcionário:");
			String nome = sc.nextLine();
			System.out.println("Valor da Hora Trabalhada:");
			Double valor_hora = sc.nextDouble();
			System.out.println("Quantidade de Horas Trabalhadas:");
			Integer horas = sc.nextInt();
			
			if(c=='s') {
				System.out.println("Valor do custo adicional:");
				Double custo = sc.nextDouble();
				empregado emp = new hora_extra(nome,horas,valor_hora,custo);
				Lista.add(emp);
			}else {
				empregado emp = new empregado(nome,horas,valor_hora);
				Lista.add(emp);
			}
		}
		
		System.out.println("PAGAMENTOS:");
		for(empregado emp:Lista) {
			System.out.println("Empregado: "+emp.getNome());
			System.out.println("Salário:R$"+emp.salario());
		}
		
		sc.close();
	}

}
