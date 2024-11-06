package java_poo.exercicios.aula06;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {

		Random random = new Random();
		int[][] matriz = new int[3][5];

		lerMatriz(matriz, random);
		imprimirMatriz(matriz);

		System.out.println("\nFor each:");
		for (int[] linha : matriz) {
			for (int n : linha) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

	public static void lerMatriz(int[][] matriz, Random random) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) { // aqui ele pega a quantidade de colunas que existem em cada
															// linha da matriz (??)
				matriz[i][j] = random.nextInt(16, 55);
			}
		}
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}
}
