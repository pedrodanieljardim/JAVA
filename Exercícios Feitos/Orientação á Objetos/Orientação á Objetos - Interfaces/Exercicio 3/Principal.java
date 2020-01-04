package interfaces1;

public class Principal {
	public static void main(String[] args) {
		
		Cilindro c1 = new Cilindro("Cilindro 1", "Vermelho", 5, 6, 7, 12);
		Circulo c2 = new Circulo("Circulo 2", "Azul", 6, 8,9);
		Cubo c3 = new Cubo("Cubo 3 ", "Azul", 7, 5, 6);
		Piramide p1 = new Piramide("Piramide 4", "Amarelo", 7, 8, 9, 12);
		Quadrado q2 = new Quadrado("Quadrado 5","Verde",8, 12,9);
		Triangulo t1 = new Triangulo("Triangulo 6", "Vermelho", 8, 6, 7);
		
		FiguraGeometrica [] f1 = new FiguraGeometrica[6];
		f1[0]= c1;
		f1[1] = c2;
		f1[2] = c3;
		f1[3] = p1;
		f1[4] = q2;
		f1[5] = t1;
		
		// downcasting dentro do laço for-each
		for(FiguraGeometrica figura: f1) {
			if(figura instanceof Cilindro) {
				Cilindro c1c = (Cilindro) figura;
				c1c.calculaVolume();
			}
			if(figura instanceof Circulo) {
				Circulo c2c = (Circulo) figura;
				c2c.calculaArea();
			}
			if(figura instanceof Cubo) {
				Cubo c3c = (Cubo) figura;
				c3c.calculaVolume();
			}
			if(figura instanceof Piramide) {
				Piramide p1c = (Piramide) figura;
				p1c.calculaVolume();
			}
			if(figura instanceof Quadrado) {
				Quadrado q1c = (Quadrado) figura;
				q1c.calculaArea();
			}
			if(figura instanceof Triangulo) {
				Triangulo t1c = (Triangulo) figura;
				t1c.calculaArea();
			}
			
		}
	}
}
