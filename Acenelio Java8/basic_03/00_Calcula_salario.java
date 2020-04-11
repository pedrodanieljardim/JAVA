import java.util.Scanner;

// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		int numero_funcionario;
		
		double horas_trabalhadas,custo_hora,salario;
		
		System.out.println("o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora");
		
		numero_funcionario=sc.nextInt();
		
		horas_trabalhadas=sc.nextDouble();
		
		custo_hora=sc.nextDouble();
		
		salario=horas_trabalhadas*custo_hora;
		
		System.out.printf("\nnúmero:%d \n salário do funcionário:%.2f",numero_funcionario,salario);
		
		sc.close();
	}
}