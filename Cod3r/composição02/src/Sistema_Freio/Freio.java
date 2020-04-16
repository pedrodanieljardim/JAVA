package Sistema_Freio;

public class Freio {
	public boolean estado_freio = true;
	public void estado_f() {
		if(estado_freio==true) {
			System.out.println("Sistema de Freio: OK");
		}else {
			System.out.println("Erro! Problema no sistema de freio!");
		}
	}
}
