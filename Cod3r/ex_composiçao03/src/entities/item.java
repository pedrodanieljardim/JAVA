package entities;

import java.util.Scanner;

public class item {
	Scanner sc = new Scanner(System.in);
	public double k = 0;
	product p = new product();
	public int quantity;
	public double l;

	public void quantity_product() {
		System.out.println("How many products will you buy?");
		quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			String quebra = sc.nextLine();
			System.out.println("What product name? ");
			p.name = sc.nextLine();
			System.out.println("What price of product? ");
			p.price = sc.nextDouble();
			k += p.price;
		}
		System.out.println("---------------------------");
		System.out.println("           RECEIPT         ");
		System.out.println("---------------------------");
		System.out.println("QUANTITY WITH PRODUCTS BUYED IN SUPERMARKET: " + quantity);
		System.out.println("MONEY SPENT IN THE STORE: $" + String.format("%.2f", k));
		System.out.println("THANK YOU AND ALWAYS COME BACK");
		System.out.println("---------------------------");
		sc.close();
	}

}
