import java.util.Scanner;
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declara objeto scanner
		int x,y;
		
		System.out.println("digite o ponto x:");
		x=sc.nextInt();
		System.out.println("digite o ponto y:");
		y=sc.nextInt();
		
		while(x!=0 && y!=0) {
			if(x>0 && y>0) {
				System.out.println("a coordenada est� no primeiro quadrante.");
			}
			if(x>0 && y<0) {
				System.out.println("a coordenada est� no quarto quadrante.");
			}
			if(x<0 && y>0) {
				System.out.println("a coordenada est� no segundo quadrante.");
			}
			if(x<0 && y<0) {
				System.out.println("a coordenada est� no terceiro quadrante.");
			}
			System.out.println("digite o ponto x:");
			x=sc.nextInt();
			System.out.println("digite o ponto y:");
			y=sc.nextInt();
		}
		
		sc.close();
	}
}
