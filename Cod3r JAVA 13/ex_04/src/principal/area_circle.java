package principal;

public class area_circle {
	double raio;
	static double PI = 3.14;
	
	area_circle(){
		
	}
	
	area_circle(double raio_inicial){
		this.raio=raio_inicial;
		this.PI=3.14;
	}
	
	double area() {
		return Math.pow(raio, 2)*PI;
	}
}
