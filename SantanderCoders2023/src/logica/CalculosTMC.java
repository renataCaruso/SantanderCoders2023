package logica;

// QUEST�O 1 -> AULA 12 -> MODULO 02 ALGORITMOS

public class CalculosTMC {
	public static void main(String[] args) {
		int t = 1;
		int m = 5;
		int c = 10;
		c = c * (1 + t);

		while (t < m) {
			t = t + 1;
			c = c * (1 + t);
		}

		System.out.println(c);
	}
}