package logica.exercicios.aula09;
import java.util.Random;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][4];
		Random r = new Random();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				matriz[i][j] = r.nextInt(1, 7);
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" " + matriz[i][j] +"");
			}
			System.out.println("\n");
		}
	}
}