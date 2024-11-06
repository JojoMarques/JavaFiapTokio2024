package java_poo.exercicios.aula06;

public class Vetores {

	public static void main(String[] args) {

		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);

		System.out.println("\nfor each:");
		for (int numero : x) {
			System.out.println(numero + "\t");
		}
	}

	public static void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i;
		}
	}

	public static void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + "\t");
		}
	}
}
