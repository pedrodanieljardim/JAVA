public class program {
	public static void main(String[] args) {
		String[] vector = new String[] {"Maria", "Bob", "Alex","Pedro","Martha","Matheus"};
		// la�o for each � para ler o vetor todo, mesmo n�o sabendo aonde ele termina, e sem uso do vect.length
		// sintaxe � for(tipo_de_dado novo_nome: vetor_ser_lido){}
		for(String vetor:vector) {
			System.out.println(vetor);
		}
	}

}
