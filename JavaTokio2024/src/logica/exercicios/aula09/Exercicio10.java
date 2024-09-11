package logica.exercicios.aula09;
import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {
		int[][] matriz1 = new int[2][3];
		int[][] matriz2 = new int[2][3];
		
		int[][] matrizNova = new int[2][3];
		Random rand = new Random();
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				matriz1[i][j] = rand.nextInt(1, 10);
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				matriz2[i][j] = rand.nextInt(1, 10);
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				matrizNova[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("" + matriz1[i][j] +"| ");
			}
			System.out.println("\n");
		}
		
		System.out.println("+");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" " + matriz2[i][j] +"| ");
			}
			System.out.println("\n");
		}
		System.out.println("=");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" " + matrizNova[i][j] +"| ");
			}
			System.out.println("\n");
		}
	}

}