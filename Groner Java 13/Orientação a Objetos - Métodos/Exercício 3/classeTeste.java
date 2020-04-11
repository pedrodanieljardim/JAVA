
public class classeTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.d1.finalRating = 8;
		a1.d1.name = "SIN 110";
		a1.d2.finalRating = 7;
		a1.d2.name = "SIN 220";
		a1.d3.finalRating = 9;
		a1.d3.name = "SIN 251";
		
		a1.verifyApproval1();
		a1.verifyApproval2();
		a1.verifyApproval3();
		
		
	}
}
