package composicao01;

public class Carro {
	Motor_01 motor = new Motor_01();
	void acelerar() {
		motor.injeção+=0.5;
	}
	void frear () {
		motor.injeção-=0.5;
	}
	void ligar () {
		motor.ligado=true;
	}
	void desligado () {
		motor.ligado=false;
	}
	boolean esta_ligado() {
		return motor.ligado;
	}
}
