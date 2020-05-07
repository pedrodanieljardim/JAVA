public class program {
	public static void main(String[] args) {
		String[] vector = new String[] {"Maria", "Bob", "Alex","Pedro","Martha","Matheus"};
		// laço for each é para ler o vetor todo, mesmo não sabendo aonde ele termina, e sem uso do vect.length
		// sintaxe é for(tipo_de_dado novo_nome: vetor_ser_lido){}
		for(String vetor:vector) {
			System.out.println(vetor);
		}
	}

}
