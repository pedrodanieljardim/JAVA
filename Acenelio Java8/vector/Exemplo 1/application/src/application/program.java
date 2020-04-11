package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		
		int size = sc.nextInt();
		double[]vector= new double[size];
		
		int i;
		
		for(i=0;i<size;i++) {
			System.out.println("Digite a altura:");
			vector[i]= sc.nextDouble();
		}
		
		double counter=0;
		
		for(i=0;i<size;i++) {
			counter=vector[i]+counter;
		}
		
		double mean=0;
		
		mean=counter/size;
		
		System.out.printf("A média das alturas eh %.2f",mean);
		
		sc.close();
	}

}
