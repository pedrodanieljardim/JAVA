import java.util.Scanner;
import entities.Product;

public class program {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor:");
		int size = sc.nextInt();
		
		Product[]vector=new Product[size];

		int i;
		String breaking_point="quebra de linha";
		
		for(i=0;i<size;i++) {
			breaking_point=sc.nextLine();
			
			System.out.println("Digite o nome do produto:");
			String name=sc.nextLine();
			System.out.println("Digite o preço do produto:");
			double price = sc.nextDouble();
			
			vector[i]= new Product(name,price);
		}
		
		double count=0;
		
		for(i=0;i<size;i++) {
			count=vector[i].getPrice()+count;
		}
		
		double mean = count/size;
		
		System.out.printf("o preço médio de todos produtos eh %.2f",mean);
		
		sc.close();
	}

}
