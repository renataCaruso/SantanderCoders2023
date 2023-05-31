package padrao;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int idade;
		int anoAtual = 2023;
		int anoNascimento;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira seu ano de Nascimento: ");
		anoNascimento = scanner.nextInt();
		int resultado;
		resultado = (anoNascimento - anoAtual);
		idade = (0 - resultado);
		System.out.println("Sua idade é: " + (idade));
		
		scanner.close();
	}

}
