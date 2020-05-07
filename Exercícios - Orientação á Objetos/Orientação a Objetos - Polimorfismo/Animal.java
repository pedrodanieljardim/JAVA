package polimorfismo1;

public abstract class Animal {
	protected String name;
	protected double height;
	protected double weight;
	
	public Animal(String name,double height,double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
}
