package entities;

public class circuferencia {
	public double raio;
	public static double PI=3.14159;
	
	public double calcula_comprimento(double raio) {
		return 2*PI*raio;
	}
	public double calcula_volume(double raio) {
		return 4*PI*raio;
	}
}
