package polimorfismo1;

public class Ave extends Animal{
	protected String ecosystem;
	protected boolean flight;
	
	public Ave(String name, double height, double weight, String ecosystem, boolean flight) {
		super(name, height, weight);
		setEcosystem(ecosystem);
		setFlight(flight);
	}
	public String getEcosystem() {
		return ecosystem;
	}
	public void setEcosystem(String ecosystem) {
		this.ecosystem = ecosystem;
	}
	public boolean isFlight() {
		return flight;
	}
	public void setFlight(boolean flight) {
		this.flight = flight;
	}
	
	void showBird() {
		System.out.println("------------------------------");
		System.out.println("       Ave               ");
		System.out.println("Nome: "+this.name);
		System.out.println("Altura: "+this.height);
		System.out.println("Peso: "+this.weight);
		System.out.println("Ecossistema: "+this.ecosystem);
		if(this.flight == true) {
			System.out.println("Animal Voa: Sim");
		}else {
			System.out.println("Animal Voa: Não");
		}
		System.out.println("------------------------------");
	}
	
}
