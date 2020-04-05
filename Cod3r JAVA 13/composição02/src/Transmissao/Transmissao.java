package Transmissao;

public class Transmissao {
	public boolean estado_t = true;
	public void estado_st() {
		if(estado_t==true) {
			System.out.println("Sistema de Transmissão: OK");
		}else {
			System.out.println("Erro. Falha na Transmissão!");
		}
	}
}
