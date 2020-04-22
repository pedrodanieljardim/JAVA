public class Teste {
	public static void main(String[] args) {
		try {
			double num = leNumero( );
			System.out.println("Voce digitou "+ num);
		}catch(Exception e) {
			System.out.println("Erro! entrada inválida...");
			e.printStackTrace();
		}
		
		
		
	}
	public static double leNumero( ) throws Exception{
		Scanner sc = new Scanner(System.in);
		double num  = sc.nextDouble();
		return num;
	}
}
