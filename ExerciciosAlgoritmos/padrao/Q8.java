package padrao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite as 10 palavras: ");
		
		String palavra;
		int contador = 0;
		while (contador < 10){
			palavra = scanner.nextLine();
			lista.add(palavra); 
			contador++;
		}
		
		System.out.println("Palavras digitadas: ");
		for (String p : lista) {
			System.out.println(p);
		}
		
		scanner.close();
	}

}
