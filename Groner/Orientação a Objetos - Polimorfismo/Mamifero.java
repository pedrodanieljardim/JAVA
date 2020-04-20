package polimorfismo1;

public class Mamifero extends Animal{
	protected String ecosystem;
	protected boolean rational;
	
	public Mamifero(String name, double height, double weight, String ecosystem, boolean rational) {
		super(name, height, weight);
		setEcosystem(ecosystem);
		setRational(rational);
	}

	public String getEcosystem() {
		return ecosystem;
	}
	public void setEcosystem(String ecosystem) {
		this.ecosystem = ecosystem;
	}
	public boolean isRational() {
		return rational;
	}
	public void setRational(boolean rational) {
		this.rational = rational;
	}
	
	void showMammal() {
		System.out.println("------------------------------");
		System.out.println("       Mamífero               ");
		System.out.println("Nome: "+this.name);
		System.out.println("Altura: "+this.height);
		System.out.println("Peso: "+this.weight);
		System.out.println("Ecossistema: "+this.ecosystem);
		if(this.rational == true) {
			System.out.println("Racional: Sim");
		}else {
			System.out.println("Racional: Não");
		}
		System.out.println("------------------------------");
	}
	
}
