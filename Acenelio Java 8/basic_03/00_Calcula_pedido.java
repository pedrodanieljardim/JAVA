
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		int codico_pe�a1,codigo_pe�a2;
		
		double numero_pe�a1,valor_pe�a1,numero_pe�a2,valor_pe�a2,pedido;
		
		System.out.println("c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1:");
		
		codico_pe�a1=sc.nextInt();
		
		numero_pe�a1=sc.nextDouble();
		
		valor_pe�a1=sc.nextDouble();
		
		System.out.println("\n c�digo de uma pe�a 2, o n�mero de pe�as 2, o valor unit�rio de cada pe�a 2:");
		
		codigo_pe�a2=sc.nextInt();
		
		numero_pe�a2=sc.nextDouble();
		
		valor_pe�a2=sc.nextDouble();
		
		pedido=(numero_pe�a1*valor_pe�a1)+(numero_pe�a2*valor_pe�a2);
		
		System.out.printf("\n VALOR A PAGAR:R$%.2f",pedido);
		
		sc.close();
	}
}