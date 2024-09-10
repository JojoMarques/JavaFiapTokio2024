package logica.exercicios.aula08;
import java.lang.Math;

public class Exercicio05 {

	public static void main(String[] args) {

		int min = 5;
		int max = 50;
		double num = 0;
		
		for(int i=0; i<max; i++) {
			num = min + Math.random() * (max - min);
		}
		System.out.println(num);
	}

}
