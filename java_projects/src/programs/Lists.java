package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //Ou List<String> list = new ArrayList<String>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //Com esses parâmetros, o Marco passo a ocupar a posição 2 da lista

		System.out.println(list.size()); //Retorna o tamanho da lista
		System.out.println("------------------");

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		//list.remove("Anna"); //Esta classe utiliza o método de comparação para achar
		//o item da lista referenciado e assim fazer a remoção

		list.removeIf(x -> x.charAt(0) == 'M'); // Aqui estamos utilizando uma função lambda, entretanto é chamada de Predicado, pois irá retornar verdadeiro ou falso. 
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco")); //Retornará -1, pois este item não existe na lista.
		System.out.println("------------------");
		
		List<String> result  = list.parallelStream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Tipo stream aceita operações com expressões lambda
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------");
		String name  = list.parallelStream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		// Função para achar o primeiro nome da lista.
		System.out.println(name);
		
	}

}
