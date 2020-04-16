
// biblioteca para retirar dados do teclado

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// declara objeto scanner
		
		int codico_peça1,codigo_peça2;
		
		double numero_peça1,valor_peça1,numero_peça2,valor_peça2,pedido;
		
		System.out.println("código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1:");
		
		codico_peça1=sc.nextInt();
		
		numero_peça1=sc.nextDouble();
		
		valor_peça1=sc.nextDouble();
		
		System.out.println("\n código de uma peça 2, o número de peças 2, o valor unitário de cada peça 2:");
		
		codigo_peça2=sc.nextInt();
		
		numero_peça2=sc.nextDouble();
		
		valor_peça2=sc.nextDouble();
		
		pedido=(numero_peça1*valor_peça1)+(numero_peça2*valor_peça2);
		
		System.out.printf("\n VALOR A PAGAR:R$%.2f",pedido);
		
		sc.close();
	}
}