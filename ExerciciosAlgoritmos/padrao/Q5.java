package padrao;

import java.util.Collections;
import java.util.List;

public class Q5 {
	
	public static void main(String[] args) {

		// List.of() = um método estático da classe List 
		// introduzido no Java 9 que permite criar uma lista imutável 

		List<Integer> lista = List.of(5, 10, 3, 8, 2, 22, 4, 78, 11, 42);
		
		//método Collections.max() para encontrar o maior inteiro dentro de uma lista.
		Integer maiorInteiro = Collections.max(lista);
		System.out.println("O maior número da lista é: " + maiorInteiro);
		
	}

}
