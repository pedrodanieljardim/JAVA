package Sistema_de_força;

public class bomba_combustivel {
	boolean estado_bomba = true;
	
	void verifica_bomba() {
		if(estado_bomba==true) {
			System.out.println("Bombas funcionando perfeitamente!");
		}else
			System.out.println("Problema na bomba!");
	}
}
