package application;
import entities.circuferencia;
import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circuferencia c;
		c=new circuferencia();
		Scanner sc=new Scanner(System.in);
		
		double retorno_comprimento,retorno_volume;
		
		System.out.println("digite um valor para o raio:");
		c.raio=sc.nextDouble();
		
		retorno_comprimento=c.calcula_comprimento(c.raio);
		retorno_volume=c.calcula_volume(c.raio);
		
		System.out.printf("\n O valor de PI é de %.4f",c.PI);
		System.out.printf("\n O comprimento de uma circuferência com esse raio eh de %.4f",retorno_comprimento);
		System.out.printf("\n O volume de uma esfera com esse raio eh de %.4f",retorno_volume);
		
		sc.close();
	}
}
