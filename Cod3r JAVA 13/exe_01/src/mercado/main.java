package mercado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		produto p1 = new produto();
		// instanciação de p1 usando o objeto produto!
		p1.name="Notebook";
		p1.price=1999.99;
		p1.descount=0.20;
		// instanciação de p2 usando o objeto produto!
		var p2 = new produto();
		p2.name="TV";
		p2.price=2500.00;
		p2.descount=0.30;
		
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
