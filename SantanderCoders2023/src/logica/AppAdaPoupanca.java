package logica;

import java.util.Scanner;

public class AppAdaPoupanca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double valor, saldo = 1000, poupanca = 500;
		System.out.println("--- Mois�s, bem-vindo ao App Ada Poupan�a ---");
		while (i != 3) {
			System.out.print("Digite 1 para APLICAR, 2 para RESGATAR e 3 para SAIR: ");
			i = sc.nextInt();
			if (i == 1) {
				System.out.print("Valor da aplica��o: ");
				valor = sc.nextInt();
				if (valor > saldo) {
					System.out.println("Saldo de conta corrente insuficiente");
				} else {
					saldo -= valor;
					poupanca += valor;
					System.out.println("Aplica��o realizada com sucesso");
				}
			} else {
				if (i == 2) {
					System.out.print("Valor do resgate: ");
					valor = sc.nextInt();
					if (valor > poupanca) {
						System.out.println("Saldo de poupan�a insuficiente");
					} else {
						saldo += valor;
						poupanca -= valor;
						System.out.println("Resgate realizado com sucesso");
					}
				} else {
					System.out.println("At� logo!");
				}
			}
		}
		sc.close();
	} 
}