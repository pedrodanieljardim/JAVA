package entities;

public class product {
	private String name;
	private double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public product(){
		
	}
	public product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public product(String name) {
		this.name = name;
	}
	
	/* encapsular é colocar os atributos no modo private. Assim
	 *  permite que outras classes não podem acessar os atributos da classe product 
	 * para ler um atributo do tipo private, devemos usar a função get.. e para modificar seu valor,
	 * usamos um construtor com a função set..
	 */

	
	
}
