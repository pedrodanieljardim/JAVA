package application;

import java.util.Scanner;

import entities.buy;
import entities.item;
import entities.product;

public class client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println(" SUPERMARKET TWO BROTHERS ");
		System.out.println("---------------------------");
		String name;
		System.out.println("What your name? ");
		name = sc.nextLine();
		
		buy b = new buy();
		item it = new item();
		product p = new product();
		
		b.registry();
		
	}
}
