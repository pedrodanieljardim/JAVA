public class Teste {
	public static void main(String[] args) {
		int [] n = { 4,8,16,32,64,128};
		int [] d = {2,0,4,8,0};
		
		for(int i = 0 ; i<n.length; i++) {
			try {
				System.out.println(n[i]+"/"+d[i]+" = "+n[i]/d[i]);
			}catch(Exception e) {
				// exception genérica....
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
	}
}