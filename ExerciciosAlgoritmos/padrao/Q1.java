package padrao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();

			// VERIFICA SE O NÚMERO TERMINA COM 0 OU 5
			if ((numero % 10 == 0) || (numero % 10 == 5)) {

				// VERIFICA SE O NÚMERO É DIVISÍVEL POR 5
				if (numero % 5 == 0) {
					int numeroDivisivel = numero / 5;
					System.out.println("O número atende aos critérios.");
					System.out.println("E o resultado da divisão por 5 é: " + numeroDivisivel);
				}
			} else {
				System.out.println("O número não é divisível por 5.");
			}
			
			// NÃO RECEBER LETRAS, DOUBLE E FLOAT
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Certifique-se de digitar um número inteiro válido.");
		}

		scanner.close();

	}
}
