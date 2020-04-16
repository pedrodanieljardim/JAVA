import java.util.Scanner;

//biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		double a,b,c,triangulo,trapezio,circulo,quadrado,retangulo;
		
		System.out.println("Valores de A,B e C:");
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		triangulo=(a*c)/2;
		trapezio=((a+b)*c)/2;
		circulo=3.14159*(c*c);
		quadrado=b*b;
		retangulo=a*b;

		System.out.printf("\ntriangulo=%.3f \n trapezio=%.3f \n circulo=%.3f \n quadrado=%.3f \n retangulo=%.3f",triangulo,trapezio,circulo,quadrado,retangulo);
		
		sc.close();
	}
}

