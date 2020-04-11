package Sistema_de_força;

public class Motor {
		public bomba_combustivel b = new bomba_combustivel();
		public valvulas v = new valvulas();
		public boolean estado_motor;
		
	public void estado_sistema_motor() {
		if(b.estado_bomba==true && v.estado_valvula==true) {
			estado_motor=true;
			System.out.println("Sistema do Motor: OK");
		}
		if(b.estado_bomba==false && v.estado_valvula==true) {
			estado_motor=false;
			System.out.println("Sistema do Motor: Problema");
			System.out.println("Erro na Bomba de Combustível");
		}
		if(b.estado_bomba==true && v.estado_valvula==false) {
			estado_motor=false;
			System.out.println("Sistema do Motor: Problema");
			System.out.println("Erro nas Válvulas de combustível");
		}		
	}
	
}
