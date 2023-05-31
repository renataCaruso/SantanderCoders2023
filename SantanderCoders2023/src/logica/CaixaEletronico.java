package logica;

import java.util.Scanner;

// AULA 9 -> MODULO 02 ALGORITMOS

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String opcao_selecionada;
		int valor = 0;
		int saldo = 500;
		boolean encerrar_programa;
		encerrar_programa = false;

		while (encerrar_programa == false) {
			Mostrar();
			opcao_selecionada = s.next();

			// CASO INT
//			try {
//				opcao_selecionada = Integer.parseInt(s.nextLine());
//				
//			} catch(NumberFormatException e) {
//				System.out.println("\nDIGITE UM NUMERO V�LIDO\n\n");
//				continue;
//			}

			if (opcao_selecionada.equals("a")) {
				System.out.println("Seu saldo �: " + saldo);
			} else if (opcao_selecionada.equals("b")) {
				System.out.println("Digite o valor a depositar: ");
				int valorDeposito;
				valorDeposito = s.nextInt();
				saldo = valorDeposito + saldo;
				System.out.println("Dep�sito Efetuado!");
			} else if (opcao_selecionada.equals("c")) {
				System.out.println("Digite o valor a retirar: ");
				valor = s.nextInt();
				if (valor > saldo) {
					System.out.println("Saque n�o permitido, saldo insuficiente");
				} else {
					saldo = saldo - valor;
					System.out.println("Saque efetuado");
				}
			} else if (opcao_selecionada.equals("d")) {
				encerrar_programa = true;
			} else {
				System.out.println("\nOp��o inv�lida, tente novamente\n");
			}
		}
	}

	public static void Mostrar() {
		System.out.println(" - Menu de opera��o - " + "\n [a] Mostrar Saldo" + "\n [b] Efetuar Dep�sito"
				+ "\n [c] Efetuar Saque" + "\n [d] Finalizar" + " - *** -");
	}

	public static String MostrarMenu() {
		String opcao_selecionada = null;
		Mostrar();
		System.out.println(opcao_selecionada);
		return MostrarMenu();
	}
	
}