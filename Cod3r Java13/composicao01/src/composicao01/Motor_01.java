package composicao01;

public class Motor_01 {
	double injeção = 1;
	boolean ligado = false;

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) injeção * 3000;
		}
	}
}
