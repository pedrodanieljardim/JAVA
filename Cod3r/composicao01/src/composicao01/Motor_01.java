package composicao01;

public class Motor_01 {
	double inje��o = 1;
	boolean ligado = false;

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) inje��o * 3000;
		}
	}
}
