import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program {

	public static void main(String[] args) {
		/*
		 * passos para iniciar uma lista: inclusão da biblioteca (java.util.List) para
		 * declaração de lista: tipo_lista <tipo_de_variavel> nome_da_lista e lista em
		 * java não aceita tipo primitivo e apenas wrapper class; Para instanciar uma
		 * lista é necessário uma classe e no caso a mais apropriada é o ArrayList (é a
		 * classe mais otimizada).
		 *
		 */
		List<Integer> lista = new ArrayList<>();
		System.out.println("---------------------");
		// comando para adicionar valores a lista .add
		lista.add(10);
		lista.add(60);
		lista.add(80);

		// podemos usar sobrecargas para adicionar valores de determinadas posições e
		// sem prejudicar a lista!
		// sintaxe .add(posição_da_lista,valor_desejado)
		lista.add(2, 100);

		// comando para remover item da lista no caso usando a posição como parametro!
		lista.remove(2);

		for (Integer x : lista) {
			System.out.println(x);
		}
		System.out.println("---------------------");

		// para ver o tamanho da lista : .size()
		System.out.println(lista.size());

		// LISTA COM STRING
		System.out.println("---------------------");

		// DECLARAÇÃO DE LISTA
		List<String> list = new ArrayList<>();
		// ADICIONA NOMES PARA UMA LISTA

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");

		// remove usando um predicado, todos nomes na lista iniciado com a letra M por
		// exemplo:
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		// index procura uma string dentro da lista e retorna a quantidade
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");

		// uma filtração na lista, aonde só permaneceriam apenas nomes começados com A!
		// no caso é necessário converter a lista para um tipo stream, aonde esse tipo
		// aceita expressões com o tipo lambda,
		// a função .filter que recebe um predicado, após a filtragem é necessário
		// converter de volta ao tipo list original,
		// usando a função collect!
		
		List<String> lista_filtrada = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : lista_filtrada) {
			System.out.println(x);
		}
		// procura o primeiro elemento com a letra J usando predicado caso encontre retorne a string e caso ao contrário retorna nulo.
		
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);

	}

}



