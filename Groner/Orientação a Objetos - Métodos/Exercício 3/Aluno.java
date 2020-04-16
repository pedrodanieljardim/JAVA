
public class Aluno {
	String name;
	int register;
	String courseName;
	
	Disciplina d1 = new Disciplina();
	Disciplina d2 = new Disciplina();
	Disciplina d3 = new Disciplina();
	
	public void verifyApproval1() {
		if(d1.finalRating>=7) {
			System.out.println("Aprovado na disciplina "+d1.name);
		}else{
			System.out.println("Reprovado na disciplina "+d1.name);
		}
	}
	public void verifyApproval2() {
		if(d2.finalRating>=7) {
			System.out.println("Aprovado na disciplina "+d2.name);
		}else{
			System.out.println("Reprovado na disciplina "+d2.name);
		}
	}
	public void verifyApproval3() {
		if(d3.finalRating>=7) {
			System.out.println("Aprovado na disciplina "+d3.name);
		}else{
			System.out.println("Reprovado na disciplina "+d3.name);
		}
	}
	
}
