package logica;

// QUEST�O 5 -> AULA 6 -> MODULO 02 ALGORITMOS

public class CalculadoraU {
	public static void main(String[] args) {
		int i, n;
		double[] v = new double[5];
		double[] u = new double[5];

		v[0] = 2.0;
		v[1] = 3.0;
		v[2] = 4.0;
		v[3] = 5.0;
		v[4] = 6.0;

		n = 5;

		for (i = 0; i < n; i++) {
			u[i] = v[i] * (i + 1);
		}

		System.out.println("u(2): " + u[1]);
		System.out.println("u(4): " + u[3]);
	}
}
