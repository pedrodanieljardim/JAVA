package application;

import entities.calcula_dolar;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		calcula_dolar c;
		c=new calcula_dolar();
	
		System.out.println("CONVERSOR DE DÓLAR");
		System.out.println("Quanto em reais deseja comprar em dólar?");
		c.dolar_comprado=sc.nextDouble();
		System.out.println("Qual é a Cotação atual do dólar:");
		c.cotacao_dia=sc.nextDouble();
		
		double calcula_imposto=c.imposto_calculado(c.cotacao_dia, c.dolar_comprado);
		
		double return_converted=c.conversao(c.cotacao_dia,c.dolar_comprado,calcula_imposto);
		
		System.out.printf("\nCotação atual do dolar: $%.2f",c.cotacao_dia);
		System.out.printf("\nValor em Reais comprado em dolar:R$%.2f",c.dolar_comprado);
		System.out.printf("\nImpostos imbutidos:%.2f",c.imposto);
		System.out.printf("\nValor Cobrado: %.2f",return_converted);
	
		sc.close();
	}

}
