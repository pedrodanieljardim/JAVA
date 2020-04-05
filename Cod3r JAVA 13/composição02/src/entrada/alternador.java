package entrada;

import Sistema_Freio.Freio;
import Sistema_de_força.Motor;
import Sistema_eletrico.Bateria;
import Transmissao.Transmissao;

public class alternador {
	public static void main(String[] args) {
		Motor m = new Motor();
		Bateria b = new Bateria();
		Transmissao t = new Transmissao();
		Freio f = new Freio();
		System.out.println("---------------------------");
		System.out.println("  MÓDULO DE VERIFICAÇÃO   ");
		System.out.println("---------------------------");
		System.out.println("ESTADO DOS PRINCIPAIS SISTEMAS:");
		m.estado_sistema_motor();
		b.estado_sistemaE();
		t.estado_st();
		f.estado_f();
		System.out.println("---------------------------");
		System.out.println("ESTADO FINAL");
		if (m.estado_motor == true && b.estado_bateria == true && t.estado_t==true && f.estado_freio==true) {
			System.out.println("Todos sistemas OK! Carro Pronto para Dar partida!");
			
		}
	}
}
