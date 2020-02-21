package entities;

public class produto_importado extends produto{
	private double taxa;
	
	public produto_importado() {
		
	}

	public produto_importado(String name, Double price,double taxa) {
		super(name, price);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public Double preco() {
		return price= price+(price*taxa);
	}
	
	public String tipo() {
		return "tipo importado";
	}

	@Override
	public String toString() {
		return "R$" + taxa ;
	}
	
}
