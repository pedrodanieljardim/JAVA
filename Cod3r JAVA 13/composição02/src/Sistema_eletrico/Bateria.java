package Sistema_eletrico;

public class Bateria {
	public boolean estado_bateria=true;
	
	public void estado_sistemaE() {
		if(estado_bateria==true) {
			System.out.println("Sistema Elétrico: OK");
		}else {
			System.out.println("Erro. Falha na Bateria!");
		}
	}
	
}
