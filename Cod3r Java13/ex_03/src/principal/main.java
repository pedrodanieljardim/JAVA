package principal;

import principal.produto;

public class main {

	public static void main(String[] args) {
		// instanciação de p1 usando o objeto produto!
		produto p1 = new produto("Notebook",1999.99,0.20);
		
		// instanciação de p2 usando o objeto produto!
		var p2 = new produto("TV",2500.00,0.30);
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		System.out.println(String.format("%.2f", p1.final_price()));
		System.out.println(String.format("%.2f", p2.final_price()));
		
	}

}
