public class Teste {
	public static void main(String[] args) {
		int [] n = {5,21,4,8,16,32,64,128};
		int [] d = {2,0,4,8,0};
		
		for(int i = 0 ; i<n.length; i++) {
			try {
				if(n[i]/d[i] != 0) {
					// lançar expcetion
					throw new Teste2(n[i],d[i]);
				}
				System.out.println(n[i]+"/"+d[i]+" = "+n[i]/d[i]);
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println(" Erro ao divir por zero...");
			}catch(Exception e) {
				System.out.println("Ocorreu um erro!");
				System.out.println(e.getMessage());
			}
		}
	}
}