public class Teste {
	public static void main(String[] args) {
		int [] n = { 4,8,16,32,64,128};
		int [] d = {2,0,4,8,0};
		
		for(int i = 0 ; i<n.length; i++) {
			try {
				System.out.println(n[i]+"/"+d[i]+" = "+n[i]/d[i]);
			}catch(java.lang.ArithmeticException e1) {
				System.out.println(" Erro ao divir por zero...");
			}catch(java.lang.ArrayIndexOutOfBoundsException e2) {
				System.out.println(" Posição do array inválida...");
			}
			
		}
	}
}
