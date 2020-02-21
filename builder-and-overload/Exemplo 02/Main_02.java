package Application;

import entities.produto;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
				
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Cadastro de Produto \n");
				System.out.println("digite o nome do produto:");
				String nome=sc.nextLine();
				System.out.println("digite o preço do produto:");
				double preco=sc.nextDouble();
			
				// para usar o construtor, é necessário criar variáveis temporárias para servir de parâmetro para o construtor
				// e instânciação do produto ocorre após a declaração das variáveis tempórarias!
	
				produto p1=new produto(nome,preco);
				
				p1.calcula_estoque();
				
				System.out.println(p1);
				
				System.out.println("\n OPERADOR DE ENTRADA NO ESTOQUE\n");
				double entrada;
				System.out.println("\n Qual a quantidade a ser colocada no estoque?");
				entrada=sc.nextDouble();
				p1.entrada_produto(entrada);
				
				System.out.println(p1);
				
				System.out.println("\n OPERADOR DE SAIDA NO ESTOQUE \n");
				double saida;
				System.out.println("\n Qual a quantidade a ser retirada no estoque?");
				saida=sc.nextDouble();
				p1.saida_produto(saida);
				
				System.out.println(p1);
				
				sc.close();
			}
		}

