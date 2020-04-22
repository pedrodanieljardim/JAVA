
public class Teste2 extends Exception{
	private int num;
	private int den;
	
	public Teste2(int num,int den) {
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + " nao é inteiro";
	}
	
}