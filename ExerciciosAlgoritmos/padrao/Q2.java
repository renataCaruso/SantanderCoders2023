package padrao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		List<String> listaItens = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os itens (digite 'fim' para encerrar a entrada):");
		
		String item;
		do {
			System.out.println("Item: ");
			item = scanner.nextLine();
			if (!item.equalsIgnoreCase("fim")) {
				listaItens.add(item);
			}
		} while (!item.equalsIgnoreCase("fim"));
		
		int tamanhoLista = listaItens.size();
		
		System.out.println("O tamanho da lista é: " + tamanhoLista);

		scanner.close();
	}
}
