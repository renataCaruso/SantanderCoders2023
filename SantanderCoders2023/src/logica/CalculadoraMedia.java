package logica;

import java.util.Scanner;

// QUEST�O 4 -> AULA 6 -> MODULO 02 ALGORITMOS

public class CalculadoraMedia {
	public static void main(String[] args) {
		int x, i, t, e;
		double a;

		System.out.println("Digite um n�mero: ");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();

		i = 0;
		t = 0;

		while (i < x) {
			System.out.println("Digite um n�mero: ");
			e = scanner.nextInt();
			t += e;
			i++;
		}

		a = (double) t / x;

		System.out.println("i: " + i);
		System.out.println("a: " + a);

		scanner.close();
	}
}
