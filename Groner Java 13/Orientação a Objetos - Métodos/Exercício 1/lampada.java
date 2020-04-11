
public class Lampada {
	boolean powerisOn = false;
	
	void onPower() {
		powerisOn = true;
	}
	
	void offPower() {
		powerisOn = false;
	}
	
	void statePower() {
		if(this.powerisOn == true) {
			System.out.println("the lamp is on!");
		}else {
			System.out.println("the lamp is off!");
		}
	}
	

}
