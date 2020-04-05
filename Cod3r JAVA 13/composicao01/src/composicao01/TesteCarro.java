package composicao01;

public class TesteCarro {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.ligar();
		System.out.println(c1.esta_ligado());
		System.out.println(c1.motor.giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
	}

}
