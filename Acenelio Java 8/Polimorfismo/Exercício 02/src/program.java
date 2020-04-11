import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.produto;
import entities.produto_importado;
import entities.produto_usado;



public class program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de produtos a serem cadastrados:");
		int n = sc.nextInt();
		
		List <produto> lista = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Produto #"+i);
			
			System.out.println("Tipo de produto (U/C/I):");
			char c = sc.next().charAt(0);
			
			String quebra_linha = sc.nextLine();
			
			System.out.println("Nome do produto:");
			String nome = sc.nextLine();
			
			System.out.println("Digite o preço:");
			Double preco =sc.nextDouble();
			
			if(c=='u') {
				System.out.println("Data de Fabricação:");
				System.out.println("Dia:");
				int dia = sc.nextInt();
				System.out.println("Mês:");
				int mes = sc.nextInt();
				System.out.println("Ano:");
				int ano =sc.nextInt();
				produto product = new produto_usado(nome,preco,dia,mes,ano);
				lista.add(product);
			}
			if(c=='i') {
				System.out.println("Taxa de Alfândega:");
				double taxa =sc.nextDouble();
				produto product = new produto_importado(nome,preco,taxa);
				lista.add(product);
			}
			if(c=='c') {
				produto product= new produto(nome,preco);
				lista.add(product);
			}
		}
		
			System.out.println("LISTA DE PRODUTOS:");
			for(produto product :lista) {
				if(product.tipo() == "tipo usado") {
					System.out.println("Produto: "+product.getName()+" (USADO)");
					System.out.println("Preço: "+product.getPrice());
					System.out.println("Data de produção:"+product.toString());
				}
				if(product.tipo() == "tipo importado") {
					System.out.println("Produto:"+product.getName());
					System.out.println("Preço: "+ product.getPrice()+" (Taxa Alfadêgaria:"+product.toString()+")");
				}
				if(product.tipo()== "tipo comum") {
					System.out.println("Produto: "+product.getName());
					System.out.println("Preço: "+product.getPrice());
				}
				
			}
			sc.close();
			
		}
		
	}


