package Sistema_de_for�a;

public class valvulas {
	boolean estado_valvula = true;
	
	void verifica_valvula() {
		if(estado_valvula==true) {
			System.out.println("valvulas do motor funcionando perfeitamente!");
		}else
			System.out.println("Problema na v�lvula!");
	}
}